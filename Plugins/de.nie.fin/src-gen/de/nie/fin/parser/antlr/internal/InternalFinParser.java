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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_TAG", "RULE_MONAT", "RULE_ID", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'Konto'", "'{'", "'KtoNr'", "'Blz'", "'Bank'", "'Verwendung'", "'Inhaber'", "'}'", "'Buchungsintervall'", "'Zum'", "'der Monate'", "','", "'Kategorie'", "'Buchung'", "'Betrag'", "'Empf\\u00E4nger'", "'von'", "'Intervall'", "'Stra\\u00DFe'", "'PLZ'", "'Ort'", "'Bemerkung'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=9;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_DECIMAL=10;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TAG=6;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_MONAT=7;
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
    public static final int T__59=59;
    public static final int RULE_INT=4;
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
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;

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

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFinModelFile123); if (state.failed) return current;
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

                if ( (LA2_0==16) ) {
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

                if ( (LA3_0==17||(LA3_0>=25 && LA3_0<=26)||(LA3_0>=29 && LA3_0<=30)||LA3_0==32) ) {
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
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport273); if (state.failed) return current;
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
            case 17:
                {
                alt4=1;
                }
                break;
            case 26:
            case 30:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 29:
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
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleKonto577); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleKonto610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getKontoAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleKonto622); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleKonto656); if (state.failed) return current;
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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleKonto690); if (state.failed) return current;
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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleKonto724); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleKonto758); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleKonto792); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBuchungsintervall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:420:1: entryRuleBuchungsintervall returns [EObject current=null] : iv_ruleBuchungsintervall= ruleBuchungsintervall EOF ;
    public final EObject entryRuleBuchungsintervall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuchungsintervall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:421:2: (iv_ruleBuchungsintervall= ruleBuchungsintervall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:422:2: iv_ruleBuchungsintervall= ruleBuchungsintervall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuchungsintervallRule()); 
            }
            pushFollow(FOLLOW_ruleBuchungsintervall_in_entryRuleBuchungsintervall828);
            iv_ruleBuchungsintervall=ruleBuchungsintervall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuchungsintervall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuchungsintervall838); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:429:1: ruleBuchungsintervall returns [EObject current=null] : (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_intervall_3_0= ruleIntervall ) ) otherlv_4= '}' ) ;
    public final EObject ruleBuchungsintervall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_intervall_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:432:28: ( (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_intervall_3_0= ruleIntervall ) ) otherlv_4= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:433:1: (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_intervall_3_0= ruleIntervall ) ) otherlv_4= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:433:1: (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_intervall_3_0= ruleIntervall ) ) otherlv_4= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:433:3: otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_intervall_3_0= ruleIntervall ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBuchungsintervall875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBuchungsintervallAccess().getBuchungsintervallKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:437:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:438:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:438:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:439:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungsintervallAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBuchungsintervall896);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBuchungsintervall908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBuchungsintervallAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:459:1: ( (lv_intervall_3_0= ruleIntervall ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:460:1: (lv_intervall_3_0= ruleIntervall )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:460:1: (lv_intervall_3_0= ruleIntervall )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:461:3: lv_intervall_3_0= ruleIntervall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungsintervallAccess().getIntervallIntervallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIntervall_in_ruleBuchungsintervall929);
            lv_intervall_3_0=ruleIntervall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuchungsintervallRule());
              	        }
                     		set(
                     			current, 
                     			"intervall",
                      		lv_intervall_3_0, 
                      		"Intervall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleBuchungsintervall941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBuchungsintervallAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleIntervall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:489:1: entryRuleIntervall returns [EObject current=null] : iv_ruleIntervall= ruleIntervall EOF ;
    public final EObject entryRuleIntervall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:490:2: (iv_ruleIntervall= ruleIntervall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:491:2: iv_ruleIntervall= ruleIntervall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntervallRule()); 
            }
            pushFollow(FOLLOW_ruleIntervall_in_entryRuleIntervall977);
            iv_ruleIntervall=ruleIntervall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntervall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntervall987); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntervall"


    // $ANTLR start "ruleIntervall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:498:1: ruleIntervall returns [EObject current=null] : (otherlv_0= 'Zum' ( (lv_tag_1_0= RULE_TAG ) ) otherlv_2= 'der Monate' ( (lv_monate_3_0= RULE_MONAT ) ) (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )* ) ;
    public final EObject ruleIntervall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tag_1_0=null;
        Token otherlv_2=null;
        Token lv_monate_3_0=null;
        Token otherlv_4=null;
        Token lv_monate_5_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:501:28: ( (otherlv_0= 'Zum' ( (lv_tag_1_0= RULE_TAG ) ) otherlv_2= 'der Monate' ( (lv_monate_3_0= RULE_MONAT ) ) (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:502:1: (otherlv_0= 'Zum' ( (lv_tag_1_0= RULE_TAG ) ) otherlv_2= 'der Monate' ( (lv_monate_3_0= RULE_MONAT ) ) (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:502:1: (otherlv_0= 'Zum' ( (lv_tag_1_0= RULE_TAG ) ) otherlv_2= 'der Monate' ( (lv_monate_3_0= RULE_MONAT ) ) (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:502:3: otherlv_0= 'Zum' ( (lv_tag_1_0= RULE_TAG ) ) otherlv_2= 'der Monate' ( (lv_monate_3_0= RULE_MONAT ) ) (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleIntervall1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntervallAccess().getZumKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:506:1: ( (lv_tag_1_0= RULE_TAG ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:507:1: (lv_tag_1_0= RULE_TAG )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:507:1: (lv_tag_1_0= RULE_TAG )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:508:3: lv_tag_1_0= RULE_TAG
            {
            lv_tag_1_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleIntervall1041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_tag_1_0, grammarAccess.getIntervallAccess().getTagTAGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntervallRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"tag",
                      		lv_tag_1_0, 
                      		"TAG");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleIntervall1058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIntervallAccess().getDerMonateKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:528:1: ( (lv_monate_3_0= RULE_MONAT ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:529:1: (lv_monate_3_0= RULE_MONAT )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:529:1: (lv_monate_3_0= RULE_MONAT )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:530:3: lv_monate_3_0= RULE_MONAT
            {
            lv_monate_3_0=(Token)match(input,RULE_MONAT,FOLLOW_RULE_MONAT_in_ruleIntervall1075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_monate_3_0, grammarAccess.getIntervallAccess().getMonateMONATTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntervallRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"monate",
                      		lv_monate_3_0, 
                      		"MONAT");
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:546:2: (otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:546:4: otherlv_4= ',' ( (lv_monate_5_0= RULE_MONAT ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleIntervall1093); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getIntervallAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:550:1: ( (lv_monate_5_0= RULE_MONAT ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:551:1: (lv_monate_5_0= RULE_MONAT )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:551:1: (lv_monate_5_0= RULE_MONAT )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:552:3: lv_monate_5_0= RULE_MONAT
            	    {
            	    lv_monate_5_0=(Token)match(input,RULE_MONAT,FOLLOW_RULE_MONAT_in_ruleIntervall1110); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_monate_5_0, grammarAccess.getIntervallAccess().getMonateMONATTerminalRuleCall_4_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getIntervallRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"monate",
            	              		lv_monate_5_0, 
            	              		"MONAT");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleIntervall"


    // $ANTLR start "entryRuleKategorie"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:576:1: entryRuleKategorie returns [EObject current=null] : iv_ruleKategorie= ruleKategorie EOF ;
    public final EObject entryRuleKategorie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKategorie = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:577:2: (iv_ruleKategorie= ruleKategorie EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:578:2: iv_ruleKategorie= ruleKategorie EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKategorieRule()); 
            }
            pushFollow(FOLLOW_ruleKategorie_in_entryRuleKategorie1153);
            iv_ruleKategorie=ruleKategorie();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKategorie; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKategorie1163); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:585:1: ruleKategorie returns [EObject current=null] : (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleKategorie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_beschreibung_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:588:28: ( (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:589:1: (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:589:1: (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:589:3: otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleKategorie1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKategorieAccess().getKategorieKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:593:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:594:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:594:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:595:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKategorieAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleKategorie1221);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:611:2: (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:611:4: otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleKategorie1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKategorieAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:615:1: ( (lv_beschreibung_3_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:616:1: (lv_beschreibung_3_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:616:1: (lv_beschreibung_3_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:617:3: lv_beschreibung_3_0= RULE_STRING
                    {
                    lv_beschreibung_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKategorie1251); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleKategorie1268); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:645:1: entryRuleBuchung returns [EObject current=null] : iv_ruleBuchung= ruleBuchung EOF ;
    public final EObject entryRuleBuchung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuchung = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:646:2: (iv_ruleBuchung= ruleBuchung EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:647:2: iv_ruleBuchung= ruleBuchung EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuchungRule()); 
            }
            pushFollow(FOLLOW_ruleBuchung_in_entryRuleBuchung1306);
            iv_ruleBuchung=ruleBuchung();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuchung; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuchung1316); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:654:1: ruleBuchung returns [EObject current=null] : ( (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) ) | (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject this_Intervall_13 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:657:28: ( ( (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) ) | (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:1: ( (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) ) | (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:1: ( (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) ) | (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:2: (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:2: (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:4: otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleBuchung1354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBuchungAccess().getBuchungKeyword_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:662:1: ( (lv_name_1_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:663:1: (lv_name_1_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:663:1: (lv_name_1_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:664:3: lv_name_1_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBuchungAccess().getNameValidIDParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleBuchung1375);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBuchung1387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBuchungAccess().getLeftCurlyBracketKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleBuchung1399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBuchungAccess().getKontoKeyword_0_3());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:688:1: ( (otherlv_4= RULE_ID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:689:1: (otherlv_4= RULE_ID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:689:1: (otherlv_4= RULE_ID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:690:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBuchungRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung1419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getBuchungAccess().getKontoKontoCrossReference_0_4_0()); 
                      	
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleBuchung1431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBuchungAccess().getBetragKeyword_0_5());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:705:1: ( (lv_betrag_6_0= RULE_INT ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:706:1: (lv_betrag_6_0= RULE_INT )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:706:1: (lv_betrag_6_0= RULE_INT )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:707:3: lv_betrag_6_0= RULE_INT
                    {
                    lv_betrag_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBuchung1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_betrag_6_0, grammarAccess.getBuchungAccess().getBetragINTTerminalRuleCall_0_6_0()); 
                      		
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:723:2: ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==32) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==33) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:723:3: (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:723:3: (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:723:5: otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) )
                            {
                            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleBuchung1467); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getBuchungAccess().getEmpfängerKeyword_0_7_0_0());
                                  
                            }
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:727:1: ( (otherlv_8= RULE_ID ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:728:1: (otherlv_8= RULE_ID )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:728:1: (otherlv_8= RULE_ID )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:729:3: otherlv_8= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getBuchungRule());
                              	        }
                                      
                            }
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung1487); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_8, grammarAccess.getBuchungAccess().getEmpfaengerEmpfaengerCrossReference_0_7_0_1_0()); 
                              	
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:741:6: (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:741:6: (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:741:8: otherlv_9= 'von' ( (otherlv_10= RULE_ID ) )
                            {
                            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleBuchung1507); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getBuchungAccess().getVonKeyword_0_7_1_0());
                                  
                            }
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:745:1: ( (otherlv_10= RULE_ID ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:746:1: (otherlv_10= RULE_ID )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:746:1: (otherlv_10= RULE_ID )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:747:3: otherlv_10= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getBuchungRule());
                              	        }
                                      
                            }
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung1527); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_10, grammarAccess.getBuchungAccess().getVonEmpfaengerCrossReference_0_7_1_1_0()); 
                              	
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleBuchung1541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBuchungAccess().getIntervallKeyword_0_8());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:762:1: ( (otherlv_12= RULE_ID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:763:1: (otherlv_12= RULE_ID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:763:1: (otherlv_12= RULE_ID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:764:3: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBuchungRule());
                      	        }
                              
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung1561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_12, grammarAccess.getBuchungAccess().getIntervallBuchungsintervallCrossReference_0_9_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:776:6: (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:776:6: (this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:777:5: this_Intervall_13= ruleIntervall otherlv_14= 'Kategorie' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuchungAccess().getIntervallParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntervall_in_ruleBuchung1591);
                    this_Intervall_13=ruleIntervall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Intervall_13; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleBuchung1602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBuchungAccess().getKategorieKeyword_1_1());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:789:1: ( (otherlv_15= RULE_ID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:790:1: (otherlv_15= RULE_ID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:790:1: (otherlv_15= RULE_ID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:791:3: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBuchungRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung1622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_15, grammarAccess.getBuchungAccess().getKategorieKategorieCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleBuchung1634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBuchungAccess().getRightCurlyBracketKeyword_1_3());
                          
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
    // $ANTLR end "ruleBuchung"


    // $ANTLR start "entryRuleEmpfaenger"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:814:1: entryRuleEmpfaenger returns [EObject current=null] : iv_ruleEmpfaenger= ruleEmpfaenger EOF ;
    public final EObject entryRuleEmpfaenger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpfaenger = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:815:2: (iv_ruleEmpfaenger= ruleEmpfaenger EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:816:2: iv_ruleEmpfaenger= ruleEmpfaenger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmpfaengerRule()); 
            }
            pushFollow(FOLLOW_ruleEmpfaenger_in_entryRuleEmpfaenger1671);
            iv_ruleEmpfaenger=ruleEmpfaenger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmpfaenger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmpfaenger1681); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:823:1: ruleEmpfaenger returns [EObject current=null] : (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:826:28: ( (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:827:1: (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:827:1: (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:827:3: otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEmpfaenger1718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmpfaengerAccess().getEmpfängerKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:831:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:832:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:832:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:833:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmpfaengerAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleEmpfaenger1739);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:849:2: (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:849:4: otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEmpfaenger1752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmpfaengerAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleEmpfaenger1764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmpfaengerAccess().getStraEKeyword_2_1());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:857:1: ( (lv_strasse_4_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:858:1: (lv_strasse_4_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:858:1: (lv_strasse_4_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:859:3: lv_strasse_4_0= RULE_STRING
                    {
                    lv_strasse_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger1781); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleEmpfaenger1798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmpfaengerAccess().getPLZKeyword_2_3());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:879:1: ( (lv_plz_6_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:880:1: (lv_plz_6_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:880:1: (lv_plz_6_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:881:3: lv_plz_6_0= RULE_STRING
                    {
                    lv_plz_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger1815); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleEmpfaenger1832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmpfaengerAccess().getOrtKeyword_2_5());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:901:1: ( (lv_ort_8_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:902:1: (lv_ort_8_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:902:1: (lv_ort_8_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:903:3: lv_ort_8_0= RULE_STRING
                    {
                    lv_ort_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger1849); if (state.failed) return current;
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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleEmpfaenger1866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEmpfaengerAccess().getBemerkungKeyword_2_7());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:923:1: ( (lv_bemerkung_10_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:924:1: (lv_bemerkung_10_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:924:1: (lv_bemerkung_10_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:925:3: lv_bemerkung_10_0= RULE_STRING
                    {
                    lv_bemerkung_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger1883); if (state.failed) return current;
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

                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleEmpfaenger1900); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:953:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:954:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:955:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1938);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1948); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:962:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:965:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:967:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1994);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:983:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:984:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:985:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2028);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2038); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:992:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:995:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_INT && LA11_1<=RULE_STRING)||(LA11_1>=RULE_ID && LA11_1<=RULE_DECIMAL)||LA11_1==18||LA11_1==24||LA11_1==28||(LA11_1>=40 && LA11_1<=69)||(LA11_1>=71 && LA11_1<=95)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==39) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=RULE_HEX && LA11_0<=RULE_DECIMAL)||LA11_0==18||LA11_0==49||(LA11_0>=56 && LA11_0<=57)||LA11_0==62||LA11_0==67||LA11_0==69||LA11_0==73||LA11_0==75||(LA11_0>=79 && LA11_0<=81)||LA11_0==84||(LA11_0>=86 && LA11_0<=93)) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:996:3: ()
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:997:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1002:2: ( ( ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:1: ( ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:1: ( ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1004:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2096);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2112);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1025:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1026:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1026:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1027:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2132);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1044:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1044:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1045:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2162);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==40) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalFin()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1058:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1058:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1058:7: ()
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1059:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1064:2: ( ( ruleOpMultiAssign ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1065:1: ( ruleOpMultiAssign )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1065:1: ( ruleOpMultiAssign )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1066:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2215);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1079:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1080:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1080:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1081:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2238);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1105:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1106:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1107:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2278);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2289); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1114:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1117:28: (kw= '=' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1119:2: kw= '='
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleOpSingleAssign2326); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1132:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1133:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1134:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2366);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2377); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1141:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1144:28: (kw= '+=' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1146:2: kw= '+='
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMultiAssign2414); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1159:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1160:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1161:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2453);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2463); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1168:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1171:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1172:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1172:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1173:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2510);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalFin()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1186:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1186:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1186:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1187:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1192:2: ( ( ruleOpOr ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1193:1: ( ruleOpOr )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1193:1: ( ruleOpOr )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1194:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2563);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1207:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1208:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1208:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1209:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2586);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1233:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1234:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1235:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2625);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2636); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1242:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1245:28: (kw= '||' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1247:2: kw= '||'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOr2673); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1260:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1261:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1262:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2712);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2722); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1269:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1272:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1273:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1273:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1274:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2769);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalFin()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1287:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1287:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1287:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1288:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1293:2: ( ( ruleOpAnd ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1294:1: ( ruleOpAnd )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1294:1: ( ruleOpAnd )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1295:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2822);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1308:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1309:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1309:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1310:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2845);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1334:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1335:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1336:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2884);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2895); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1343:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1346:28: (kw= '&&' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1348:2: kw= '&&'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAnd2932); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1361:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1362:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1363:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2971);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2981); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1370:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1373:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1374:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1374:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1375:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3028);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalFin()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==44) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalFin()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1388:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1388:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1388:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1389:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1394:2: ( ( ruleOpEquality ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1395:1: ( ruleOpEquality )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1395:1: ( ruleOpEquality )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1396:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3081);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1409:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1410:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1410:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1411:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3104);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1435:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1436:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1437:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3143);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3154); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1444:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1447:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1448:1: (kw= '==' | kw= '!=' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1448:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            else if ( (LA15_0==44) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1449:2: kw= '=='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpEquality3192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1456:2: kw= '!='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpEquality3211); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1469:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1470:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1471:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3251);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3261); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1478:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1481:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1482:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1482:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1483:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3308);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalFin()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 47:
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1493:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1493:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1493:6: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1494:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXRelationalExpression3344); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1503:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1504:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1504:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1505:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3367);
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1527:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1527:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1527:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1528:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1533:2: ( ( ruleOpCompare ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1534:1: ( ruleOpCompare )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1534:1: ( ruleOpCompare )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1535:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3428);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1548:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1549:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1549:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1550:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3451);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1574:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1575:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1576:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3491);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3502); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1583:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1586:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1587:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1587:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt17=1;
                }
                break;
            case 47:
                {
                alt17=2;
                }
                break;
            case 48:
                {
                alt17=3;
                }
                break;
            case 49:
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1588:2: kw= '>='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpCompare3540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1595:2: kw= '<='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpCompare3559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1602:2: kw= '>'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpCompare3578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1609:2: kw= '<'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpCompare3597); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1622:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1623:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1624:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3637);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3647); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1631:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1634:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1635:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1635:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1636:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3694);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1649:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1649:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1649:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1650:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1655:2: ( ( ruleOpOther ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1656:1: ( ruleOpOther )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1656:1: ( ruleOpOther )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1657:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3747);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1670:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1671:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1671:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1672:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3770);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1696:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1697:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1698:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3809);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3820); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1705:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1708:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1709:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1709:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt21=1;
                }
                break;
            case 51:
                {
                alt21=2;
                }
                break;
            case 52:
                {
                alt21=3;
                }
                break;
            case 48:
                {
                alt21=4;
                }
                break;
            case 49:
                {
                alt21=5;
                }
                break;
            case 53:
                {
                alt21=6;
                }
                break;
            case 54:
                {
                alt21=7;
                }
                break;
            case 55:
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1710:2: kw= '->'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpOther3858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1717:2: kw= '..'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpOther3877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1724:2: kw= '=>'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOpOther3896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1730:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1730:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1731:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOther3916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==48) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==EOF||(LA19_1>=RULE_INT && LA19_1<=RULE_STRING)||(LA19_1>=RULE_ID && LA19_1<=RULE_DECIMAL)||LA19_1==18||LA19_1==49||(LA19_1>=56 && LA19_1<=57)||LA19_1==62||LA19_1==67||LA19_1==69||LA19_1==73||LA19_1==75||(LA19_1>=79 && LA19_1<=81)||LA19_1==84||(LA19_1>=86 && LA19_1<=93)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==48) && (synpred8_InternalFin())) {
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
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1740:5: (kw= '>' kw= '>' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1741:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOther3947); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOther3960); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1754:2: kw= '>'
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOther3981); if (state.failed) return current;
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1760:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1760:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpOther4003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==49) ) {
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
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1770:5: (kw= '<' kw= '<' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1771:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleOpOther4034); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleOpOther4047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1784:2: kw= '<'
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleOpOther4068); if (state.failed) return current;
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1791:2: kw= '<>'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOpOther4089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1798:2: kw= '?:'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOpOther4108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1805:2: kw= '<=>'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOpOther4127); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1818:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1819:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1820:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4167);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4177); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1827:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1830:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1831:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1831:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1832:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4224);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalFin()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==57) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalFin()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1845:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1845:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1845:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1851:2: ( ( ruleOpAdd ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1852:1: ( ruleOpAdd )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1852:1: ( ruleOpAdd )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1853:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4277);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1866:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1867:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1867:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1868:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4300);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1892:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1893:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1894:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4339);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4350); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1901:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1904:28: ( (kw= '+' | kw= '-' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1905:1: (kw= '+' | kw= '-' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1905:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            else if ( (LA23_0==57) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1906:2: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOpAdd4388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1913:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOpAdd4407); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1926:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1927:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1928:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4447);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4457); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1935:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1938:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1939:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1939:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1940:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4504);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 58:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 61:
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1953:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1953:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1953:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1954:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1959:2: ( ( ruleOpMulti ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1960:1: ( ruleOpMulti )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1960:1: ( ruleOpMulti )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1961:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4557);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1974:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1975:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1975:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1976:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4580);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2000:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2001:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2002:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4619);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4630); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2009:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2012:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2013:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2013:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt25=1;
                }
                break;
            case 59:
                {
                alt25=2;
                }
                break;
            case 60:
                {
                alt25=3;
                }
                break;
            case 61:
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2014:2: kw= '*'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOpMulti4668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2021:2: kw= '**'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOpMulti4687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2028:2: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOpMulti4706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2035:2: kw= '%'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOpMulti4725); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2048:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2049:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2050:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4765);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4775); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2057:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2060:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=56 && LA26_0<=57)||LA26_0==62) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||(LA26_0>=RULE_ID && LA26_0<=RULE_DECIMAL)||LA26_0==18||LA26_0==49||LA26_0==67||LA26_0==69||LA26_0==73||LA26_0==75||(LA26_0>=79 && LA26_0<=81)||LA26_0==84||(LA26_0>=86 && LA26_0<=93)) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:3: ()
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2062:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2067:2: ( ( ruleOpUnary ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2068:1: ( ruleOpUnary )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2068:1: ( ruleOpUnary )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2069:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4833);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2082:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2083:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2083:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2084:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4854);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2102:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4883);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2118:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2119:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2120:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4919);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4930); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2127:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2130:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2131:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2131:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt27=1;
                }
                break;
            case 57:
                {
                alt27=2;
                }
                break;
            case 56:
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2132:2: kw= '!'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOpUnary4968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2139:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOpUnary4987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2146:2: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOpUnary5006); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2159:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2160:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2161:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5046);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5056); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2168:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2171:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2172:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2172:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2173:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5103);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==63) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalFin()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2183:5: ( () otherlv_2= 'as' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2183:6: () otherlv_2= 'as'
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2183:6: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2184:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXCastedExpression5138); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2193:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2194:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2194:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2195:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5161);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2219:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2220:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2221:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5199);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5209); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2228:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2231:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2232:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2232:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2233:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5256);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 64:
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
                case 65:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred14_InternalFin()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 66:
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2247:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2247:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2247:26: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2248:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXMemberFeatureCall5305); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2257:1: ( ( ruleValidID ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2258:1: ( ruleValidID )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2258:1: ( ruleValidID )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2259:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5328);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5344);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2280:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2281:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2281:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2282:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5366);
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2315:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2315:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2315:8: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2316:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2321:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 64:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 66:
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
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2321:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleXMemberFeatureCall5452); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2326:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2326:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2327:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2327:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2328:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,65,FOLLOW_65_in_ruleXMemberFeatureCall5476); if (state.failed) return current;
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
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2342:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2342:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2343:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2343:1: (lv_spreading_9_0= '*.' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2344:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,66,FOLLOW_66_in_ruleXMemberFeatureCall5513); if (state.failed) return current;
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2357:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==49) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2357:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5542); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2361:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2362:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2362:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2363:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5563);
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

            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2379:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==28) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2379:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall5576); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2383:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2384:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2384:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2385:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5597);
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

            	            otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5611); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2405:3: ( ( ruleValidID ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2406:1: ( ruleValidID )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2406:1: ( ruleValidID )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2407:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5636);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2420:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2420:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2420:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2420:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2427:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2428:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,67,FOLLOW_67_in_ruleXMemberFeatureCall5670); if (state.failed) return current;
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

            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2458:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2459:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5755);
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
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2476:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2476:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2476:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2476:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2477:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2477:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2478:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5783);
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

            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2494:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==28) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2494:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall5796); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2498:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2499:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2499:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2500:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5817);
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

            	            otherlv_21=(Token)match(input,68,FOLLOW_68_in_ruleXMemberFeatureCall5834); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2523:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2524:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5869);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2548:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2549:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2550:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5909);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5919); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2557:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2560:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2561:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2561:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2562:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5966);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2572:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5993);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2582:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6020);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2592:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6047);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2602:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6074);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2612:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6101);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2622:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6128);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2632:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6155);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2642:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6182);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2652:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6209);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2662:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6236);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2672:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6263);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2682:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6290);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2698:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2699:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2700:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6325);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6335); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2707:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2710:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) && (synpred18_InternalFin())) {
                alt38=1;
            }
            else if ( ((LA38_0>=87 && LA38_0<=88)) ) {
                alt38=2;
            }
            else if ( (LA38_0==RULE_INT||(LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=3;
            }
            else if ( (LA38_0==89) ) {
                alt38=4;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=5;
            }
            else if ( (LA38_0==90) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6395);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2724:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6423);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2734:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6450);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2744:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6477);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2754:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6504);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2764:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6531);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2780:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2781:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2782:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6566);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6576); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2789:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2792:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2795:5: ( () otherlv_1= '[' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2795:6: () otherlv_1= '['
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2795:6: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2796:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXClosure6636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==52||LA40_0==67) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2821:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2821:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2822:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6709);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2838:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==28) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2838:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXClosure6722); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2842:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2843:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2843:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2844:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6743);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2860:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2861:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2861:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2862:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,70,FOLLOW_70_in_ruleXClosure6765); if (state.failed) return current;
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2875:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2876:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2876:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2877:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6802);
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

            otherlv_7=(Token)match(input,71,FOLLOW_71_in_ruleXClosure6814); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2905:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2906:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2907:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6850);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6860); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2914:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2917:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2918:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2918:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2918:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2918:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2924:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||(LA43_0>=RULE_ID && LA43_0<=RULE_DECIMAL)||LA43_0==18||LA43_0==49||(LA43_0>=56 && LA43_0<=57)||LA43_0==62||LA43_0==67||LA43_0==69||LA43_0==73||LA43_0==75||(LA43_0>=79 && LA43_0<=84)||(LA43_0>=86 && LA43_0<=93)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2924:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2924:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2925:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2925:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2926:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6916);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2942:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==72) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2942:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleXExpressionInClosure6929); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2954:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2955:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2956:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6969);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6979); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2963:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2966:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2967:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2967:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2967:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2967:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2967:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2983:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2983:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2983:7: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2989:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==52||LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2989:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2989:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2990:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2990:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2991:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7087);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3007:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==28) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3007:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXShortClosure7100); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3011:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3012:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3012:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3013:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7121);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3029:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3030:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3030:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3031:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,70,FOLLOW_70_in_ruleXShortClosure7143); if (state.failed) return current;
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3044:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3045:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3045:1: (lv_expression_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3046:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7179);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3070:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3071:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3072:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7215);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7225); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3079:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3082:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3083:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3083:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3083:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleXParenthesizedExpression7262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7284);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleXParenthesizedExpression7295); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3108:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3109:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3110:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7331);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7341); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3117:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3120:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3121:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3121:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3121:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3121:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3122:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXIfExpression7387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXIfExpression7399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3135:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3136:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3136:1: (lv_if_3_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3137:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7420);
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

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXIfExpression7432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3157:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3158:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3158:1: (lv_then_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3159:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7453);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==74) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalFin()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXIfExpression7474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3180:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3181:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3181:1: (lv_else_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3182:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7496);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3206:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3207:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3208:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7534);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7544); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3215:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3218:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3219:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3219:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3219:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3219:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3220:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXSwitchExpression7590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_STRING)||(LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==18||LA48_0==49||(LA48_0>=56 && LA48_0<=57)||LA48_0==62||LA48_0==69||LA48_0==73||LA48_0==75||(LA48_0>=79 && LA48_0<=81)||LA48_0==84||(LA48_0>=86 && LA48_0<=93)) ) {
                alt48=1;
            }
            else if ( (LA48_0==67) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==76) && (synpred24_InternalFin())) {
                        alt48=2;
                    }
                    else if ( ((LA48_3>=39 && LA48_3<=61)||(LA48_3>=63 && LA48_3<=69)||LA48_3==85) ) {
                        alt48=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_INT && LA48_2<=RULE_STRING)||(LA48_2>=RULE_HEX && LA48_2<=RULE_DECIMAL)||LA48_2==18||LA48_2==49||(LA48_2>=56 && LA48_2<=57)||LA48_2==62||LA48_2==67||LA48_2==69||LA48_2==73||LA48_2==75||(LA48_2>=79 && LA48_2<=81)||LA48_2==84||(LA48_2>=86 && LA48_2<=93)) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==76) && (synpred23_InternalFin())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3234:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3234:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3234:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3235:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3235:1: (lv_localVarName_2_0= ruleValidID )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3236:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7633);
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

                            otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleXSwitchExpression7645); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3256:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3257:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3257:1: (lv_switch_4_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3258:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7669);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3281:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3281:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_67_in_ruleXSwitchExpression7713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3285:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3286:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3286:1: (lv_localVarName_6_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3287:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7734);
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

                    otherlv_7=(Token)match(input,76,FOLLOW_76_in_ruleXSwitchExpression7746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3307:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3308:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3308:1: (lv_switch_8_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3309:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7769);
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

                    otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleXSwitchExpression7781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression7795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3333:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==52||LA49_0==67||LA49_0==76||LA49_0==78) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3334:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3334:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3335:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7816);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3351:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3351:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_77_in_ruleXSwitchExpression7830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,76,FOLLOW_76_in_ruleXSwitchExpression7842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3359:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3360:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3360:1: (lv_default_14_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3361:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7863);
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

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression7877); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3389:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3390:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3391:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7913);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7923); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3398:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3401:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3402:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3402:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3402:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3402:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==52||LA51_0==67) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3403:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3403:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3404:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7969);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3420:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3420:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXCasePart7983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3424:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3425:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3425:1: (lv_case_2_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3426:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8004);
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

            otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleXCasePart8018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3446:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3447:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3447:1: (lv_then_4_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3448:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8039);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3472:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3473:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3474:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8075);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8085); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3481:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3484:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3485:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3485:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3485:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3485:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3486:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleXForLoopExpression8131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXForLoopExpression8143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3500:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3500:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3501:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8164);
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

            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXForLoopExpression8176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3521:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3522:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3522:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3523:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8197);
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

            otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleXForLoopExpression8209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3543:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3544:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3544:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8230);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3569:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3570:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3571:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8266);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8276); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3578:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3581:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3582:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3582:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3582:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3582:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3583:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleXWhileExpression8322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXWhileExpression8334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3596:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3597:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3597:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3598:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8355);
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

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXWhileExpression8367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3618:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3619:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3619:1: (lv_body_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3620:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8388);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3644:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3645:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3646:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8424);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8434); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3653:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3656:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3657:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3657:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3657:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3657:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3658:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleXDoWhileExpression8480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3667:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3668:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3668:1: (lv_body_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3669:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8501);
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

            otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleXDoWhileExpression8513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleXDoWhileExpression8525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3693:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3694:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3694:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3695:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8546);
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

            otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleXDoWhileExpression8558); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3723:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3724:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3725:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8594);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8604); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3732:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3735:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3736:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3736:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3736:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3736:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3737:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression8650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3746:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_STRING)||(LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==18||LA54_0==49||(LA54_0>=56 && LA54_0<=57)||LA54_0==62||LA54_0==67||LA54_0==69||LA54_0==73||LA54_0==75||(LA54_0>=79 && LA54_0<=84)||(LA54_0>=86 && LA54_0<=93)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3746:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3746:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3747:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3747:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3748:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8672);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3764:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==72) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3764:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleXBlockExpression8685); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXBlockExpression8701); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3780:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3781:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3782:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8737);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8747); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3789:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3792:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3793:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3793:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=82 && LA55_0<=83)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_INT && LA55_0<=RULE_STRING)||(LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL)||LA55_0==18||LA55_0==49||(LA55_0>=56 && LA55_0<=57)||LA55_0==62||LA55_0==67||LA55_0==69||LA55_0==73||LA55_0==75||(LA55_0>=79 && LA55_0<=81)||LA55_0==84||(LA55_0>=86 && LA55_0<=93)) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3794:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8794);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3804:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8821);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3820:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3821:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3822:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8856);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8866); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3829:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3832:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3833:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3833:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3833:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3833:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3839:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==82) ) {
                alt56=1;
            }
            else if ( (LA56_0==83) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3839:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3839:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3840:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3840:1: (lv_writeable_1_0= 'var' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3841:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,82,FOLLOW_82_in_ruleXVariableDeclaration8919); if (state.failed) return current;
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3855:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleXVariableDeclaration8950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
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
            else if ( (LA57_0==67) && (synpred25_InternalFin())) {
                alt57=1;
            }
            else if ( (LA57_0==52) && (synpred25_InternalFin())) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3867:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3867:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3867:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3868:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3868:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3869:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8998);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3885:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3886:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3886:1: (lv_name_4_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3887:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9019);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3904:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3904:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3905:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3905:1: (lv_name_5_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3906:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9048);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3922:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3922:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXVariableDeclaration9062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3926:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:1: (lv_right_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3928:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9083);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3952:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3953:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3954:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9121);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9131); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3961:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3964:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3965:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3965:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3965:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3965:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==49||LA59_1==64||LA59_1==69) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==52||LA59_0==67) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3966:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3966:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3967:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9177);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3983:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3984:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3984:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3985:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9199);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4009:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4010:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4011:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9235);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9245); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4018:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4021:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4022:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4022:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4022:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4022:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4023:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4023:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4024:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9291);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4040:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4041:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4041:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4042:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9312);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4066:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4067:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4068:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9348);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9358); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4075:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4078:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4079:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4079:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4079:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4079:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4080:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4085:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==85) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4086:1: ( ruleStaticQualifier )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4086:1: ( ruleStaticQualifier )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4087:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9415);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4100:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4100:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall9429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4104:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4105:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4105:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4106:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9450);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4122:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==28) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4122:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall9463); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4126:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4127:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4127:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4128:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9484);
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

                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall9498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4148:3: ( ( ruleIdOrSuper ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4149:1: ( ruleIdOrSuper )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4149:1: ( ruleIdOrSuper )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4150:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9523);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4163:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4163:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4163:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4163:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4170:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4171:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,67,FOLLOW_67_in_ruleXFeatureCall9557); if (state.failed) return current;
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4201:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4202:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9642);
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
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4219:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4219:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4219:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4219:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4220:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4220:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4221:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9670);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4237:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==28) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4237:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall9683); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4241:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4242:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4242:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4243:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9704);
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

                    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleXFeatureCall9721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4266:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4267:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9756);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4291:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4292:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4293:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9794);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9805); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4300:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4303:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4304:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4304:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==84) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4305:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9852);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4317:2: kw= 'super'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleIdOrSuper9876); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4330:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4331:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4332:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9917);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9928); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4339:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4342:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4343:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4343:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==85) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4344:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9975);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,85,FOLLOW_85_in_ruleStaticQualifier9993); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4368:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4369:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4370:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10034);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10044); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4377:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4380:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4381:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4381:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4381:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4381:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleXConstructorCall10090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4391:1: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4392:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4392:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4393:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10113);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall10134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4411:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4412:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4412:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4413:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10156);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4429:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==28) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4429:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall10169); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4434:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4434:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4435:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10190);
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

                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall10204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleXConstructorCall10227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4477:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4478:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10300);
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
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4495:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4495:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4495:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4495:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4496:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4496:1: (lv_arguments_10_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4497:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10328);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4513:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==28) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4513:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall10341); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4517:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4518:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4518:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4519:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10362);
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

                    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall10379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4542:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4543:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10414);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4567:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4568:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4569:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10451);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10461); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4576:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4579:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4580:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4580:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4580:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4580:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4581:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4586:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==87) ) {
                alt75=1;
            }
            else if ( (LA75_0==88) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4586:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleXBooleanLiteral10508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4591:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4591:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4592:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4592:1: (lv_isTrue_2_0= 'true' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4593:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,88,FOLLOW_88_in_ruleXBooleanLiteral10532); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4614:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4615:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4616:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10582);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10592); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4623:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4626:28: ( ( () otherlv_1= 'null' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4627:1: ( () otherlv_1= 'null' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4627:1: ( () otherlv_1= 'null' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4627:2: () otherlv_1= 'null'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4627:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4628:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleXNullLiteral10638); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4645:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4646:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4647:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10674);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10684); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4654:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4657:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4658:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4658:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4658:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4658:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4664:2: ( (lv_value_1_0= ruleNumber ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4665:1: (lv_value_1_0= ruleNumber )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4665:1: (lv_value_1_0= ruleNumber )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4666:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10739);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4690:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4691:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4692:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10775);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10785); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4699:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4702:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4703:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4703:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4703:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4703:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4704:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4709:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4710:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4710:1: (lv_value_1_0= RULE_STRING )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4711:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10836); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4735:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4736:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4737:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10877);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10887); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4744:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4747:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4748:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4748:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4748:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4748:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4749:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleXTypeLiteral10933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral10945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4762:1: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4763:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4763:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4764:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10968);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral10980); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4789:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4790:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4791:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11016);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11026); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4798:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4801:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4802:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4802:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4802:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4802:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleXThrowExpression11072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4812:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4813:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4813:1: (lv_expression_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4814:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11093);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4838:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4839:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4840:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11129);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11139); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4847:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4850:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4851:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4851:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4851:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4851:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4852:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleXReturnExpression11185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4861:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4861:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4866:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4867:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11216);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4891:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4892:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4893:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11253);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11263); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4900:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4903:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4904:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4904:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4904:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4904:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4905:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleXTryCatchFinallyExpression11309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4914:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4915:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4915:1: (lv_expression_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4916:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11330);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==95) ) {
                alt79=1;
            }
            else if ( (LA79_0==94) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==95) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred34_InternalFin()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4934:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4935:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11360);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==94) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred35_InternalFin()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,94,FOLLOW_94_in_ruleXTryCatchFinallyExpression11382); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4956:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4957:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4957:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4958:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11404);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4975:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4975:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4975:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,94,FOLLOW_94_in_ruleXTryCatchFinallyExpression11426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4979:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4980:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4980:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4981:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11447);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5005:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5006:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5007:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11485);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11495); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5014:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5017:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleXCatchClause11540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXCatchClause11553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5027:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5028:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5028:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5029:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11574);
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

            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleXCatchClause11586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5049:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5050:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5050:1: (lv_expression_4_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5051:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11607);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5075:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5076:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5077:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11644);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11655); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5084:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5087:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5088:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5088:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5089:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11702);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5099:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==64) ) {
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5099:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5099:2: ( ( '.' )=>kw= '.' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5099:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleQualifiedName11730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11753);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5126:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5130:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5131:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11807);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11818); if (state.failed) return current;

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5141:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5145:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5146:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5146:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5146:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5154:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5154:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5154:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5154:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5154:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11890); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5162:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11916); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5169:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==64) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==RULE_INT||LA83_1==RULE_DECIMAL) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5170:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,64,FOLLOW_64_in_ruleNumber11936); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5175:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5175:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11952); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5183:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11978); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5201:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5203:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12031);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference12041); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5210:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5213:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5214:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5214:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==52||LA86_0==67) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5214:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5214:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5215:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12089);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==69) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==71) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalFin()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5226:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5226:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5226:6: ()
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5227:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleJvmTypeReference12127); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleJvmTypeReference12139); if (state.failed) return current;
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5242:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12171);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5258:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5259:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5260:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12206);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12216); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5267:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5270:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5271:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5271:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5271:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5271:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==67) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5271:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleXFunctionTypeRef12254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5275:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==52||LA88_0==67) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5275:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5275:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5276:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5276:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5277:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12276);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5293:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==28) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5293:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef12289); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5297:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5298:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5298:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5299:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12310);
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

                    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXFunctionTypeRef12326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleXFunctionTypeRef12340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5323:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5324:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5324:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5325:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12361);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5349:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5350:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5351:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12397);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12407); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5358:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5361:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5362:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5362:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5362:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5362:2: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5363:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5363:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5364:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12455);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleJvmParameterizedTypeReference12476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5382:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5383:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5383:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5384:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12498);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5400:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==28) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5400:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference12511); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5404:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5405:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5405:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5406:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12532);
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

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleJvmParameterizedTypeReference12546); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5434:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5435:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5436:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12584);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12594); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5443:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5446:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5447:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5447:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==52||LA92_0==67) ) {
                alt92=1;
            }
            else if ( (LA92_0==96) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5448:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12641);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5458:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12668);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5474:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5475:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5476:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12703);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12713); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5483:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5486:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5487:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5487:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5487:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5487:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleJvmWildcardTypeReference12759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5497:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==97) ) {
                alt93=1;
            }
            else if ( (LA93_0==84) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5497:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5497:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5498:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5498:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5499:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12781);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5516:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5516:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5517:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5517:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5518:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12808);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5542:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5543:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5544:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12846);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12856); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5551:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5554:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5555:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5555:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5555:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleJvmUpperBound12893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5559:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5560:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5560:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5561:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12914);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5585:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5586:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5587:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12950);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12960); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5594:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5597:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5598:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5598:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5598:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleJvmUpperBoundAnded12997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5602:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5603:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5603:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5604:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13018);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5628:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5629:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5630:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13054);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound13064); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5637:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5640:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5641:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5641:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5641:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleJvmLowerBound13101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5645:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5646:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5646:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13122);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5673:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5674:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5675:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13161);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13172); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5682:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5685:28: (this_ID_0= RULE_ID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5686:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID13211); if (state.failed) return current;
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1053:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1054:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1054:2: ( ( ruleOpMultiAssign ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1055:1: ( ruleOpMultiAssign )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1055:1: ( ruleOpMultiAssign )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1056:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFin2183);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:4: ( () ( ( ruleOpOr ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:5: () ( ( ruleOpOr ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1181:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1182:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1182:2: ( ( ruleOpOr ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1183:1: ( ruleOpOr )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1183:1: ( ruleOpOr )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1184:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFin2531);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:5: () ( ( ruleOpAnd ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1282:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1283:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1283:2: ( ( ruleOpAnd ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1284:1: ( ruleOpAnd )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1284:1: ( ruleOpAnd )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1285:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFin2790);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:5: () ( ( ruleOpEquality ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1383:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1384:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1384:2: ( ( ruleOpEquality ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1385:1: ( ruleOpEquality )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1385:1: ( ruleOpEquality )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1386:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFin3049);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:4: ( ( () 'instanceof' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:5: ( () 'instanceof' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:5: ( () 'instanceof' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:6: () 'instanceof'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1491:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1492:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred5_InternalFin3325); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFin

    // $ANTLR start synpred6_InternalFin
    public final void synpred6_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:10: () ( ( ruleOpCompare ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1522:10: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1523:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1523:2: ( ( ruleOpCompare ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1524:1: ( ruleOpCompare )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1524:1: ( ruleOpCompare )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1525:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFin3396);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:4: ( () ( ( ruleOpOther ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:5: () ( ( ruleOpOther ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1645:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1645:2: ( ( ruleOpOther ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1646:1: ( ruleOpOther )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1646:1: ( ruleOpOther )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1647:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFin3715);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:3: ( ( '>' '>' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:4: ( '>' '>' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1736:4: ( '>' '>' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1737:2: '>' '>'
        {
        match(input,48,FOLLOW_48_in_synpred8_InternalFin3931); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred8_InternalFin3936); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalFin

    // $ANTLR start synpred9_InternalFin
    public final void synpred9_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:3: ( ( '<' '<' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:4: ( '<' '<' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1766:4: ( '<' '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1767:2: '<' '<'
        {
        match(input,49,FOLLOW_49_in_synpred9_InternalFin4018); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred9_InternalFin4023); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalFin

    // $ANTLR start synpred10_InternalFin
    public final void synpred10_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:5: () ( ( ruleOpAdd ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1840:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1841:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1841:2: ( ( ruleOpAdd ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1842:1: ( ruleOpAdd )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1842:1: ( ruleOpAdd )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1843:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalFin4245);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:5: () ( ( ruleOpMulti ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1948:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1949:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1949:2: ( ( ruleOpMulti ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1950:1: ( ruleOpMulti )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1950:1: ( ruleOpMulti )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1951:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalFin4525);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:3: ( ( () 'as' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:4: ( () 'as' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:4: ( () 'as' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:5: () 'as'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2181:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2182:1: 
        {
        }

        match(input,63,FOLLOW_63_in_synpred12_InternalFin5119); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalFin

    // $ANTLR start synpred13_InternalFin
    public final void synpred13_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2241:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2242:1: 
        {
        }

        match(input,64,FOLLOW_64_in_synpred13_InternalFin5273); if (state.failed) return ;
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2243:1: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2244:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2244:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2245:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalFin5282);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalFin5288);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFin

    // $ANTLR start synpred14_InternalFin
    public final void synpred14_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2299:10: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2300:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2300:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 64:
            {
            alt94=1;
            }
            break;
        case 65:
            {
            alt94=2;
            }
            break;
        case 66:
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
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2300:4: '.'
                {
                match(input,64,FOLLOW_64_in_synpred14_InternalFin5391); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2302:6: ( ( '?.' ) )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2302:6: ( ( '?.' ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2303:1: ( '?.' )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2303:1: ( '?.' )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2304:2: '?.'
                {
                match(input,65,FOLLOW_65_in_synpred14_InternalFin5405); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2309:6: ( ( '*.' ) )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2309:6: ( ( '*.' ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2310:1: ( '*.' )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2310:1: ( '*.' )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2311:2: '*.'
                {
                match(input,66,FOLLOW_66_in_synpred14_InternalFin5425); if (state.failed) return ;

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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2420:4: ( ( '(' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2421:1: ( '(' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2421:1: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2422:2: '('
        {
        match(input,67,FOLLOW_67_in_synpred15_InternalFin5652); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalFin

    // $ANTLR start synpred16_InternalFin
    public final void synpred16_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==52||LA96_0==67) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2443:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2443:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2444:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin5704);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2446:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==28) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2446:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,28,FOLLOW_28_in_synpred16_InternalFin5711); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2447:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2448:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2448:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2449:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin5718);
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

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2452:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2452:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2453:2: '|'
        {
        match(input,70,FOLLOW_70_in_synpred16_InternalFin5732); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalFin

    // $ANTLR start synpred17_InternalFin
    public final void synpred17_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2520:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2521:1: 
        {
        }

        match(input,69,FOLLOW_69_in_synpred17_InternalFin5852); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalFin

    // $ANTLR start synpred18_InternalFin
    public final void synpred18_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:3: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:4: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:4: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:5: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2712:1: 
        {
        }

        match(input,69,FOLLOW_69_in_synpred18_InternalFin6376); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalFin

    // $ANTLR start synpred20_InternalFin
    public final void synpred20_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==52||LA98_0==67) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2805:7: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2806:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2806:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2807:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin6655);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2809:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==28) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2809:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,28,FOLLOW_28_in_synpred20_InternalFin6662); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2810:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2811:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2811:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2812:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin6669);
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

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2814:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2815:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2815:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2816:2: '|'
        {
        match(input,70,FOLLOW_70_in_synpred20_InternalFin6683); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalFin

    // $ANTLR start synpred22_InternalFin
    public final void synpred22_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:4: ( 'else' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:6: 'else'
        {
        match(input,74,FOLLOW_74_in_synpred22_InternalFin7466); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFin

    // $ANTLR start synpred23_InternalFin
    public final void synpred23_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:5: ( ( ( ruleValidID ) ) ':' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:6: ( ( ruleValidID ) ) ':'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3229:6: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3230:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3230:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3231:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalFin7608);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,76,FOLLOW_76_in_synpred23_InternalFin7614); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalFin

    // $ANTLR start synpred24_InternalFin
    public final void synpred24_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3275:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,67,FOLLOW_67_in_synpred24_InternalFin7690); if (state.failed) return ;
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3276:1: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3277:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3277:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3278:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalFin7697);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,76,FOLLOW_76_in_synpred24_InternalFin7703); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalFin

    // $ANTLR start synpred25_InternalFin
    public final void synpred25_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3859:6: ( ( ruleJvmTypeReference ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3860:1: ( ruleJvmTypeReference )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3860:1: ( ruleJvmTypeReference )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3861:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalFin8968);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3863:2: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3864:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3864:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3865:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalFin8977);
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
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4163:4: ( ( '(' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4164:1: ( '(' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4164:1: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4165:2: '('
        {
        match(input,67,FOLLOW_67_in_synpred26_InternalFin9539); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalFin

    // $ANTLR start synpred27_InternalFin
    public final void synpred27_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4184:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4185:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4185:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==52||LA102_0==67) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4185:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4185:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4186:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4186:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4187:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin9591);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4189:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==28) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4189:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,28,FOLLOW_28_in_synpred27_InternalFin9598); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4190:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4191:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4191:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4192:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin9605);
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

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4194:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4195:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4195:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4196:2: '|'
        {
        match(input,70,FOLLOW_70_in_synpred27_InternalFin9619); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalFin

    // $ANTLR start synpred28_InternalFin
    public final void synpred28_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4263:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4264:1: 
        {
        }

        match(input,69,FOLLOW_69_in_synpred28_InternalFin9739); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalFin

    // $ANTLR start synpred29_InternalFin
    public final void synpred29_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:4: ( '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4406:6: '<'
        {
        match(input,49,FOLLOW_49_in_synpred29_InternalFin10126); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalFin

    // $ANTLR start synpred30_InternalFin
    public final void synpred30_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:5: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:7: '('
        {
        match(input,67,FOLLOW_67_in_synpred30_InternalFin10219); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFin

    // $ANTLR start synpred31_InternalFin
    public final void synpred31_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==52||LA104_0==67) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4462:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4462:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4463:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin10249);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4465:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==28) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4465:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,28,FOLLOW_28_in_synpred31_InternalFin10256); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4466:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4467:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4467:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4468:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin10263);
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

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4470:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4471:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4471:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4472:2: '|'
        {
        match(input,70,FOLLOW_70_in_synpred31_InternalFin10277); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalFin

    // $ANTLR start synpred32_InternalFin
    public final void synpred32_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4539:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4540:1: 
        {
        }

        match(input,69,FOLLOW_69_in_synpred32_InternalFin10397); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalFin

    // $ANTLR start synpred33_InternalFin
    public final void synpred33_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4861:2: ( ( ruleXExpression ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4862:1: ( ruleXExpression )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4862:1: ( ruleXExpression )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4863:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalFin11199);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalFin

    // $ANTLR start synpred34_InternalFin
    public final void synpred34_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:5: ( 'catch' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4932:7: 'catch'
        {
        match(input,95,FOLLOW_95_in_synpred34_InternalFin11344); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalFin

    // $ANTLR start synpred35_InternalFin
    public final void synpred35_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:5: ( 'finally' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4951:7: 'finally'
        {
        match(input,94,FOLLOW_94_in_synpred35_InternalFin11374); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalFin

    // $ANTLR start synpred37_InternalFin
    public final void synpred37_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5099:3: ( '.' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5100:2: '.'
        {
        match(input,64,FOLLOW_64_in_synpred37_InternalFin11721); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalFin

    // $ANTLR start synpred38_InternalFin
    public final void synpred38_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:2: ( ( () '[' ']' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:3: ( () '[' ']' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:3: ( () '[' ']' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:4: () '[' ']'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5223:4: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5224:1: 
        {
        }

        match(input,69,FOLLOW_69_in_synpred38_InternalFin12104); if (state.failed) return ;
        match(input,71,FOLLOW_71_in_synpred38_InternalFin12108); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalFin

    // $ANTLR start synpred39_InternalFin
    public final void synpred39_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:4: ( '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5377:6: '<'
        {
        match(input,49,FOLLOW_49_in_synpred39_InternalFin12468); if (state.failed) return ;

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
        "\1\137\1\uffff\10\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\1\1\2\1\5\1\7\1\0\1\6\1\3\1\4\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\1\2\uffff\3\1\7\uffff\1\1\5\uffff\1\1\3\uffff\1\1\13\uffff"+
            "\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\16\1\1\uffff\16\1\1"+
            "\uffff\12\1",
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
            return "()* loopback of 1644:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
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
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
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
        "\1\137\1\0\77\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\33\2\1\1\2\2\1\uffff\16\2\1\uffff\12\2",
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
            return "2420:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
        "\1\135\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\5\2\uffff\1\1\2\5\7\uffff\1\5\36\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "2441:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA33_0==67) ) {s = 2;}

                        else if ( (LA33_0==52) && (synpred16_InternalFin())) {s = 3;}

                        else if ( (LA33_0==70) && (synpred16_InternalFin())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||(LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)||LA33_0==18||LA33_0==49||(LA33_0>=56 && LA33_0<=57)||LA33_0==62||LA33_0==69||LA33_0==73||LA33_0==75||(LA33_0>=79 && LA33_0<=81)||LA33_0==84||(LA33_0>=86 && LA33_0<=93)) ) {s = 5;}

                        else if ( (LA33_0==68) ) {s = 29;}

                         
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
        "\1\137\1\0\77\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\35\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "2520:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
        "\1\135\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\5\2\uffff\1\4\2\5\7\uffff\1\2\36\uffff\1\4\21\uffff\1\15"+
            "\1\uffff\1\5\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2"+
            "\uffff\1\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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
            return "2561:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\135\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\5\2\uffff\1\1\2\5\7\uffff\1\5\36\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
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
            return "2805:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA41_0==67) ) {s = 2;}

                        else if ( (LA41_0==52) && (synpred20_InternalFin())) {s = 3;}

                        else if ( (LA41_0==70) && (synpred20_InternalFin())) {s = 4;}

                        else if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||(LA41_0>=RULE_HEX && LA41_0<=RULE_DECIMAL)||LA41_0==18||LA41_0==49||(LA41_0>=56 && LA41_0<=57)||LA41_0==62||LA41_0==69||LA41_0==71||LA41_0==73||LA41_0==75||(LA41_0>=79 && LA41_0<=84)||(LA41_0>=86 && LA41_0<=93)) ) {s = 5;}

                         
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
        "\1\137\1\0\77\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA65_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\33\2\1\1\2\2\1\uffff\16\2\1\uffff\12\2",
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
            return "4163:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
        "\1\135\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\5\2\uffff\1\1\2\5\7\uffff\1\5\36\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "4184:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA64_0==67) ) {s = 2;}

                        else if ( (LA64_0==52) && (synpred27_InternalFin())) {s = 3;}

                        else if ( (LA64_0==70) && (synpred27_InternalFin())) {s = 4;}

                        else if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||(LA64_0>=RULE_HEX && LA64_0<=RULE_DECIMAL)||LA64_0==18||LA64_0==49||(LA64_0>=56 && LA64_0<=57)||LA64_0==62||LA64_0==69||LA64_0==73||LA64_0==75||(LA64_0>=79 && LA64_0<=81)||LA64_0==84||(LA64_0>=86 && LA64_0<=93)) ) {s = 5;}

                        else if ( (LA64_0==68) ) {s = 29;}

                         
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
        "\1\137\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\35\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "4263:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
        "\1\137\1\0\77\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA70_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\11\2\1\1\24\2\1\uffff\16\2\1\uffff\12\2",
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
            return "4406:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
        "\1\137\1\0\77\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA73_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\33\2\1\1\2\2\1\uffff\16\2\1\uffff\12\2",
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
            return "4455:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
        "\1\135\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\2\uffff\1\1\2\5\7\uffff\1\5\36\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "4460:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA72_0==67) ) {s = 2;}

                        else if ( (LA72_0==52) && (synpred31_InternalFin())) {s = 3;}

                        else if ( (LA72_0==70) && (synpred31_InternalFin())) {s = 4;}

                        else if ( ((LA72_0>=RULE_INT && LA72_0<=RULE_STRING)||(LA72_0>=RULE_HEX && LA72_0<=RULE_DECIMAL)||LA72_0==18||LA72_0==49||(LA72_0>=56 && LA72_0<=57)||LA72_0==62||LA72_0==69||LA72_0==73||LA72_0==75||(LA72_0>=79 && LA72_0<=81)||LA72_0==84||(LA72_0>=86 && LA72_0<=93)) ) {s = 5;}

                        else if ( (LA72_0==68) ) {s = 29;}

                         
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
        "\1\137\1\0\77\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA74_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\35\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "4539:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
        "\1\137\32\0\46\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\46\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\16\1\21\2\uffff\1\1\1\15\1\17\7\uffff\1\6\5\uffff\1\33\3"+
            "\uffff\1\33\13\uffff\11\33\1\10\6\33\1\4\1\3\4\33\1\2\4\33\1"+
            "\32\1\33\1\12\1\uffff\2\33\1\23\1\33\1\7\3\33\1\24\1\25\1\26"+
            "\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2"+
            "\33",
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
            return "4861:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
        "\1\137\1\0\77\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA91_transitionS = {
            "\2\2\2\uffff\3\2\7\uffff\1\2\5\uffff\1\2\3\uffff\1\2\13\uffff"+
            "\11\2\1\1\24\2\1\uffff\16\2\1\uffff\12\2",
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
            return "5377:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
    public static final BitSet FOLLOW_15_in_ruleFinModelFile123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFinModelFile144 = new BitSet(new long[]{0x0000000166030002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFinModelFile167 = new BitSet(new long[]{0x0000000166030002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleFinModelFile189 = new BitSet(new long[]{0x0000000166020002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport273 = new BitSet(new long[]{0x0000000000000100L});
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
    public static final BitSet FOLLOW_17_in_ruleKonto577 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleKonto598 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKonto610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKonto622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKonto639 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKonto656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKonto673 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKonto690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto707 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKonto724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto741 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleKonto758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto775 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKonto792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchungsintervall_in_entryRuleBuchungsintervall828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuchungsintervall838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBuchungsintervall875 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBuchungsintervall896 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBuchungsintervall908 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleIntervall_in_ruleBuchungsintervall929 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBuchungsintervall941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntervall_in_entryRuleIntervall977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntervall987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIntervall1024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleIntervall1041 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIntervall1058 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_MONAT_in_ruleIntervall1075 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleIntervall1093 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_MONAT_in_ruleIntervall1110 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleKategorie_in_entryRuleKategorie1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKategorie1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKategorie1200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleKategorie1221 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleKategorie1234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKategorie1251 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKategorie1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchung_in_entryRuleBuchung1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuchung1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBuchung1354 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBuchung1375 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBuchung1387 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBuchung1399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung1419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuchung1431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBuchung1448 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleBuchung1467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung1487 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_ruleBuchung1507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung1527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBuchung1541 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntervall_in_ruleBuchung1591 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBuchung1602 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung1622 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBuchung1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpfaenger_in_entryRuleEmpfaenger1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmpfaenger1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEmpfaenger1718 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleEmpfaenger1739 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleEmpfaenger1752 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEmpfaenger1764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger1781 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEmpfaenger1798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger1815 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEmpfaenger1832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger1849 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEmpfaenger1866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger1883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEmpfaenger1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2096 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2112 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2162 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2215 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpSingleAssign2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMultiAssign2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2510 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2563 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2586 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOr2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2769 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2822 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2845 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAnd2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3028 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3081 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3104 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpEquality3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpEquality3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3308 = new BitSet(new long[]{0x0003E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXRelationalExpression3344 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3367 = new BitSet(new long[]{0x0003E00000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3428 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3451 = new BitSet(new long[]{0x0003E00000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpCompare3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpCompare3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpCompare3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpCompare3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3694 = new BitSet(new long[]{0x00FF000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3747 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3770 = new BitSet(new long[]{0x00FF000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpOther3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpOther3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpOther3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpOther3916 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleOpOther3947 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleOpOther3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpOther3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpOther4003 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleOpOther4034 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleOpOther4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpOther4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOpOther4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOpOther4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOpOther4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4224 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4277 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4300 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpAdd4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpAdd4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4504 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4557 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4580 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOpMulti4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOpMulti4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOpMulti4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOpMulti4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4833 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOpUnary4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpUnary4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpUnary5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5103 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXCastedExpression5138 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5161 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleXMemberFeatureCall5305 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5328 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5344 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleXMemberFeatureCall5452 = new BitSet(new long[]{0x0002000000000100L});
    public static final BitSet FOLLOW_65_in_ruleXMemberFeatureCall5476 = new BitSet(new long[]{0x0002000000000100L});
    public static final BitSet FOLLOW_66_in_ruleXMemberFeatureCall5513 = new BitSet(new long[]{0x0002000000000100L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5542 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5563 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall5576 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5597 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5636 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002FL});
    public static final BitSet FOLLOW_67_in_ruleXMemberFeatureCall5670 = new BitSet(new long[]{0x4312000000040730L,0x000000003FD38A78L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5783 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall5796 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5817 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXMemberFeatureCall5834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXClosure6636 = new BitSet(new long[]{0x4312000000040730L,0x000000003FDF8AE8L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6709 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_ruleXClosure6722 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6743 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXClosure6765 = new BitSet(new long[]{0x4302000000040730L,0x000000003FDF8AA8L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXClosure6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6916 = new BitSet(new long[]{0x4302000000040732L,0x000000003FDF8B28L});
    public static final BitSet FOLLOW_72_in_ruleXExpressionInClosure6929 = new BitSet(new long[]{0x4302000000040732L,0x000000003FDF8A28L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7087 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_ruleXShortClosure7100 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7121 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXShortClosure7143 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXParenthesizedExpression7262 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXParenthesizedExpression7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXIfExpression7387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXIfExpression7399 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXIfExpression7432 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXIfExpression7474 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXSwitchExpression7590 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXSwitchExpression7645 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7669 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_67_in_ruleXSwitchExpression7713 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXSwitchExpression7746 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression7781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression7795 = new BitSet(new long[]{0x0010000000000100L,0x0000000000005008L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7816 = new BitSet(new long[]{0x0010000001000100L,0x0000000000007008L});
    public static final BitSet FOLLOW_77_in_ruleXSwitchExpression7830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXSwitchExpression7842 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7863 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_78_in_ruleXCasePart7983 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXCasePart8018 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXForLoopExpression8131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXForLoopExpression8143 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXForLoopExpression8176 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXForLoopExpression8209 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXWhileExpression8322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXWhileExpression8334 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXWhileExpression8367 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXDoWhileExpression8480 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleXDoWhileExpression8513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXDoWhileExpression8525 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXDoWhileExpression8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression8650 = new BitSet(new long[]{0x4302000001040730L,0x000000003FDF8A28L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8672 = new BitSet(new long[]{0x4302000001040730L,0x000000003FDF8B28L});
    public static final BitSet FOLLOW_72_in_ruleXBlockExpression8685 = new BitSet(new long[]{0x4302000001040730L,0x000000003FDF8A28L});
    public static final BitSet FOLLOW_24_in_ruleXBlockExpression8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXVariableDeclaration8919 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_83_in_ruleXVariableDeclaration8950 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8998 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9019 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9048 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXVariableDeclaration9062 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9177 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9415 = new BitSet(new long[]{0x0002000000000100L,0x0000000000100000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall9429 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9450 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall9463 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9484 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall9498 = new BitSet(new long[]{0x0002000000000100L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_67_in_ruleXFeatureCall9557 = new BitSet(new long[]{0x4312000000040730L,0x000000003FD38A78L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9670 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall9683 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9704 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXFeatureCall9721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleIdOrSuper9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleStaticQualifier9993 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleXConstructorCall10090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10113 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall10134 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10156 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall10169 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10190 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall10204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_67_in_ruleXConstructorCall10227 = new BitSet(new long[]{0x4312000000040730L,0x000000003FD38A78L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10328 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall10341 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10362 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall10379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleXBooleanLiteral10508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleXBooleanLiteral10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleXNullLiteral10638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleXTypeLiteral10933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral10945 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleXThrowExpression11072 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleXReturnExpression11185 = new BitSet(new long[]{0x4302000000040732L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleXTryCatchFinallyExpression11309 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11330 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11360 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_94_in_ruleXTryCatchFinallyExpression11382 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleXTryCatchFinallyExpression11426 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleXCatchClause11540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXCatchClause11553 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXCatchClause11586 = new BitSet(new long[]{0x4302000000040730L,0x000000003FD38A28L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQualifiedName11730 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleNumber11936 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleJvmTypeReference12127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleJvmTypeReference12139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXFunctionTypeRef12254 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12276 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef12289 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12310 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXFunctionTypeRef12326 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXFunctionTypeRef12340 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12455 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmParameterizedTypeReference12476 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12498 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference12511 = new BitSet(new long[]{0x0010000000000100L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12532 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmParameterizedTypeReference12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleJvmWildcardTypeReference12759 = new BitSet(new long[]{0x0000000000000002L,0x0000000200100000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleJvmUpperBound12893 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleJvmUpperBoundAnded12997 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleJvmLowerBound13101 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID13211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFin2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFin2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFin2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFin3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred5_InternalFin3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFin3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFin3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred8_InternalFin3931 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred8_InternalFin3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred9_InternalFin4018 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred9_InternalFin4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalFin4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalFin4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred12_InternalFin5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred13_InternalFin5273 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalFin5282 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalFin5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred14_InternalFin5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_synpred14_InternalFin5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred14_InternalFin5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred15_InternalFin5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin5704 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_synpred16_InternalFin5711 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin5718 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred16_InternalFin5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred17_InternalFin5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred18_InternalFin6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin6655 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_synpred20_InternalFin6662 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin6669 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred20_InternalFin6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred22_InternalFin7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalFin7608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_synpred23_InternalFin7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred24_InternalFin7690 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalFin7697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_synpred24_InternalFin7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalFin8968 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalFin8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred26_InternalFin9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin9591 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_synpred27_InternalFin9598 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin9605 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred27_InternalFin9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred28_InternalFin9739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred29_InternalFin10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred30_InternalFin10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin10249 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_synpred31_InternalFin10256 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin10263 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred31_InternalFin10277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred32_InternalFin10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalFin11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_synpred34_InternalFin11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_synpred35_InternalFin11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred37_InternalFin11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred38_InternalFin12104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_synpred38_InternalFin12108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred39_InternalFin12468 = new BitSet(new long[]{0x0000000000000002L});

}