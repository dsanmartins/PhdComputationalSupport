package br.ufscar.sas.xtext.sasdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSasDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Architecture'", "'{'", "'}'", "'Rules'", "'controller'", "'monitor'", "'analyzer'", "'planner'", "'executor'", "'sensor'", "'must-not-access-monitor'", "';'", "'must-access-monitor'", "'through'", "'must-not-access-analyzer'", "'must-access-analyzer'", "'must-not-access-planner'", "'must-access-planner'", "'must-not-access-executor'", "'must-access-executor'", "'must-not-access-sensor'", "'must-access-sensor'", "'must-not-access-knowledge'", "'must-access-knowledge'", "'must-not-access-effector'", "'must-access-effector'", "'must-sense'", "'must-not-sense'", "'must-use'", "'must-not-use'", "'Managing'", "'Managed'", "'ManagerController'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'Controller'", "'with-interface'", "','", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'ReferenceInput'", "'MeasuredOutput'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalSasDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSasDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSasDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSasDsl.g"; }



     	private SasDslGrammarAccess grammarAccess;

        public InternalSasDslParser(TokenStream input, SasDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArchitectureDefinition";
       	}

       	@Override
       	protected SasDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArchitectureDefinition"
    // InternalSasDsl.g:64:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // InternalSasDsl.g:64:63: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // InternalSasDsl.g:65:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
             newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;

             current =iv_ruleArchitectureDefinition; 
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
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managing_3_0= ruleDSLManaging ) )+ ( (lv_managed_4_0= ruleDSLManaged ) )+ otherlv_5= '}' otherlv_6= 'Rules' otherlv_7= '{' ( (lv_rules_8_0= ruleDSLRules ) )* otherlv_9= '}' ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_managing_3_0 = null;

        EObject lv_managed_4_0 = null;

        EObject lv_rules_8_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managing_3_0= ruleDSLManaging ) )+ ( (lv_managed_4_0= ruleDSLManaged ) )+ otherlv_5= '}' otherlv_6= 'Rules' otherlv_7= '{' ( (lv_rules_8_0= ruleDSLRules ) )* otherlv_9= '}' ) )
            // InternalSasDsl.g:78:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managing_3_0= ruleDSLManaging ) )+ ( (lv_managed_4_0= ruleDSLManaged ) )+ otherlv_5= '}' otherlv_6= 'Rules' otherlv_7= '{' ( (lv_rules_8_0= ruleDSLRules ) )* otherlv_9= '}' )
            {
            // InternalSasDsl.g:78:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managing_3_0= ruleDSLManaging ) )+ ( (lv_managed_4_0= ruleDSLManaged ) )+ otherlv_5= '}' otherlv_6= 'Rules' otherlv_7= '{' ( (lv_rules_8_0= ruleDSLRules ) )* otherlv_9= '}' )
            // InternalSasDsl.g:79:3: otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managing_3_0= ruleDSLManaging ) )+ ( (lv_managed_4_0= ruleDSLManaged ) )+ otherlv_5= '}' otherlv_6= 'Rules' otherlv_7= '{' ( (lv_rules_8_0= ruleDSLRules ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureDefinitionAccess().getArchitectureKeyword_0());
            		
            // InternalSasDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArchitectureDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSasDsl.g:105:3: ( (lv_managing_3_0= ruleDSLManaging ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:106:4: (lv_managing_3_0= ruleDSLManaging )
            	    {
            	    // InternalSasDsl.g:106:4: (lv_managing_3_0= ruleDSLManaging )
            	    // InternalSasDsl.g:107:5: lv_managing_3_0= ruleDSLManaging
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getManagingDSLManagingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_managing_3_0=ruleDSLManaging();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"managing",
            	    						lv_managing_3_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLManaging");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSasDsl.g:124:3: ( (lv_managed_4_0= ruleDSLManaged ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSasDsl.g:125:4: (lv_managed_4_0= ruleDSLManaged )
            	    {
            	    // InternalSasDsl.g:125:4: (lv_managed_4_0= ruleDSLManaged )
            	    // InternalSasDsl.g:126:5: lv_managed_4_0= ruleDSLManaged
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getManagedDSLManagedParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_managed_4_0=ruleDSLManaged();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"managed",
            	    						lv_managed_4_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLManaged");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getArchitectureDefinitionAccess().getRulesKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalSasDsl.g:155:3: ( (lv_rules_8_0= ruleDSLRules ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSasDsl.g:156:4: (lv_rules_8_0= ruleDSLRules )
            	    {
            	    // InternalSasDsl.g:156:4: (lv_rules_8_0= ruleDSLRules )
            	    // InternalSasDsl.g:157:5: lv_rules_8_0= ruleDSLRules
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getRulesDSLRulesParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_rules_8_0=ruleDSLRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_8_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleDSLRules"
    // InternalSasDsl.g:182:1: entryRuleDSLRules returns [EObject current=null] : iv_ruleDSLRules= ruleDSLRules EOF ;
    public final EObject entryRuleDSLRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRules = null;


        try {
            // InternalSasDsl.g:182:49: (iv_ruleDSLRules= ruleDSLRules EOF )
            // InternalSasDsl.g:183:2: iv_ruleDSLRules= ruleDSLRules EOF
            {
             newCompositeNode(grammarAccess.getDSLRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRules=ruleDSLRules();

            state._fsp--;

             current =iv_ruleDSLRules; 
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
    // $ANTLR end "entryRuleDSLRules"


    // $ANTLR start "ruleDSLRules"
    // InternalSasDsl.g:189:1: ruleDSLRules returns [EObject current=null] : ( (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController ) | (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor ) | (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer ) | (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner ) | (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor ) | (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO ) | (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI ) ) ;
    public final EObject ruleDSLRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_DSLRuleController_1 = null;

        EObject this_DSLRuleMonitor_3 = null;

        EObject this_DSLRuleAnalyzer_5 = null;

        EObject this_DSLRulePlanner_7 = null;

        EObject this_DSLRuleExecutor_9 = null;

        EObject this_DSLRuleMO_11 = null;

        EObject this_DSLRuleRI_13 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:195:2: ( ( (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController ) | (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor ) | (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer ) | (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner ) | (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor ) | (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO ) | (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI ) ) )
            // InternalSasDsl.g:196:2: ( (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController ) | (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor ) | (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer ) | (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner ) | (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor ) | (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO ) | (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI ) )
            {
            // InternalSasDsl.g:196:2: ( (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController ) | (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor ) | (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer ) | (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner ) | (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor ) | (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO ) | (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:197:3: (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController )
                    {
                    // InternalSasDsl.g:197:3: (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController )
                    // InternalSasDsl.g:198:4: otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRulesAccess().getControllerKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleControllerParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleController_1=ruleDSLRuleController();

                    state._fsp--;


                    				current = this_DSLRuleController_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:212:3: (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor )
                    {
                    // InternalSasDsl.g:212:3: (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor )
                    // InternalSasDsl.g:213:4: otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRulesAccess().getMonitorKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleMonitorParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleMonitor_3=ruleDSLRuleMonitor();

                    state._fsp--;


                    				current = this_DSLRuleMonitor_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:227:3: (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer )
                    {
                    // InternalSasDsl.g:227:3: (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer )
                    // InternalSasDsl.g:228:4: otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRulesAccess().getAnalyzerKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleAnalyzerParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleAnalyzer_5=ruleDSLRuleAnalyzer();

                    state._fsp--;


                    				current = this_DSLRuleAnalyzer_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:242:3: (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner )
                    {
                    // InternalSasDsl.g:242:3: (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner )
                    // InternalSasDsl.g:243:4: otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDSLRulesAccess().getPlannerKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRulePlannerParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRulePlanner_7=ruleDSLRulePlanner();

                    state._fsp--;


                    				current = this_DSLRulePlanner_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:257:3: (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor )
                    {
                    // InternalSasDsl.g:257:3: (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor )
                    // InternalSasDsl.g:258:4: otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDSLRulesAccess().getExecutorKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleExecutorParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleExecutor_9=ruleDSLRuleExecutor();

                    state._fsp--;


                    				current = this_DSLRuleExecutor_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:272:3: (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO )
                    {
                    // InternalSasDsl.g:272:3: (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO )
                    // InternalSasDsl.g:273:4: otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDSLRulesAccess().getSensorKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleMOParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleMO_11=ruleDSLRuleMO();

                    state._fsp--;


                    				current = this_DSLRuleMO_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:287:3: (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI )
                    {
                    // InternalSasDsl.g:287:3: (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI )
                    // InternalSasDsl.g:288:4: otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getDSLRulesAccess().getAnalyzerKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getDSLRulesAccess().getDSLRuleRIParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DSLRuleRI_13=ruleDSLRuleRI();

                    state._fsp--;


                    				current = this_DSLRuleRI_13;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleDSLRules"


    // $ANTLR start "entryRuleDSLRuleController"
    // InternalSasDsl.g:305:1: entryRuleDSLRuleController returns [EObject current=null] : iv_ruleDSLRuleController= ruleDSLRuleController EOF ;
    public final EObject entryRuleDSLRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleController = null;


        try {
            // InternalSasDsl.g:305:58: (iv_ruleDSLRuleController= ruleDSLRuleController EOF )
            // InternalSasDsl.g:306:2: iv_ruleDSLRuleController= ruleDSLRuleController EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleController=ruleDSLRuleController();

            state._fsp--;

             current =iv_ruleDSLRuleController; 
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
    // $ANTLR end "entryRuleDSLRuleController"


    // $ANTLR start "ruleDSLRuleController"
    // InternalSasDsl.g:312:1: ruleDSLRuleController returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) | ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) | ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' ) ) ;
    public final EObject ruleDSLRuleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;


        	enterRule();

        try {
            // InternalSasDsl.g:318:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) | ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) | ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' ) ) )
            // InternalSasDsl.g:319:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) | ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) | ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' ) )
            {
            // InternalSasDsl.g:319:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) | ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) | ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSasDsl.g:320:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:320:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:321:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:321:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:322:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:322:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:323:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleControllerAccess().getMustNotAccessMonitorKeyword_0_1());
                    			
                    // InternalSasDsl.g:338:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:339:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:339:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:340:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleControllerAccess().getMonitorDSLMonitorCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:357:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    {
                    // InternalSasDsl.g:357:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    // InternalSasDsl.g:358:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';'
                    {
                    // InternalSasDsl.g:358:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:359:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:359:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:360:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleControllerAccess().getMustAccessMonitorKeyword_1_1());
                    			
                    // InternalSasDsl.g:375:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:376:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:376:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:377:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleControllerAccess().getMonitorDSLMonitorCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleControllerAccess().getThroughKeyword_1_3());
                    			
                    // InternalSasDsl.g:392:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:393:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:393:5: ( ruleFQN )
                    // InternalSasDsl.g:394:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleControllerAccess().getMonitorinterfaceMonitorInterfaceCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:414:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalSasDsl.g:414:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    // InternalSasDsl.g:415:4: ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalSasDsl.g:415:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:416:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:416:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:417:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRuleControllerAccess().getMustNotAccessAnalyzerKeyword_2_1());
                    			
                    // InternalSasDsl.g:432:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSasDsl.g:433:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSasDsl.g:433:5: (otherlv_12= RULE_ID )
                    // InternalSasDsl.g:434:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getDSLRuleControllerAccess().getAnalyzerDSLAnalyzerCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:451:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    {
                    // InternalSasDsl.g:451:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    // InternalSasDsl.g:452:4: ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';'
                    {
                    // InternalSasDsl.g:452:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:453:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:453:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:454:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRuleControllerAccess().getMustAccessAnalyzerKeyword_3_1());
                    			
                    // InternalSasDsl.g:469:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:470:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:470:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:471:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRuleControllerAccess().getAnalyzerDSLAnalyzerCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRuleControllerAccess().getThroughKeyword_3_3());
                    			
                    // InternalSasDsl.g:486:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:487:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:487:5: ( ruleFQN )
                    // InternalSasDsl.g:488:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleControllerAccess().getAnalyzerinterfaceAnalyzerInterfaceCrossReference_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:508:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:508:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:509:4: ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    // InternalSasDsl.g:509:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:510:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:510:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:511:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRuleControllerAccess().getMustNotAccessPlannerKeyword_4_1());
                    			
                    // InternalSasDsl.g:526:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:527:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:527:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:528:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRuleControllerAccess().getPlannerDSLPlannerCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:545:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    {
                    // InternalSasDsl.g:545:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    // InternalSasDsl.g:546:4: ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';'
                    {
                    // InternalSasDsl.g:546:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSasDsl.g:547:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSasDsl.g:547:5: (otherlv_24= RULE_ID )
                    // InternalSasDsl.g:548:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_24, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_5_0_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getDSLRuleControllerAccess().getMustAccessPlannerKeyword_5_1());
                    			
                    // InternalSasDsl.g:563:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSasDsl.g:564:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSasDsl.g:564:5: (otherlv_26= RULE_ID )
                    // InternalSasDsl.g:565:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_26, grammarAccess.getDSLRuleControllerAccess().getPlannerDSLPlannerCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDSLRuleControllerAccess().getThroughKeyword_5_3());
                    			
                    // InternalSasDsl.g:580:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:581:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:581:5: ( ruleFQN )
                    // InternalSasDsl.g:582:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleControllerAccess().getPlannerinterfacePlannerInterfaceCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_5_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:602:3: ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' )
                    {
                    // InternalSasDsl.g:602:3: ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' )
                    // InternalSasDsl.g:603:4: ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';'
                    {
                    // InternalSasDsl.g:603:4: ( (otherlv_30= RULE_ID ) )
                    // InternalSasDsl.g:604:5: (otherlv_30= RULE_ID )
                    {
                    // InternalSasDsl.g:604:5: (otherlv_30= RULE_ID )
                    // InternalSasDsl.g:605:6: otherlv_30= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_30, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_6_0_0());
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getDSLRuleControllerAccess().getMustNotAccessExecutorKeyword_6_1());
                    			
                    // InternalSasDsl.g:620:4: ( (otherlv_32= RULE_ID ) )
                    // InternalSasDsl.g:621:5: (otherlv_32= RULE_ID )
                    {
                    // InternalSasDsl.g:621:5: (otherlv_32= RULE_ID )
                    // InternalSasDsl.g:622:6: otherlv_32= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_32, grammarAccess.getDSLRuleControllerAccess().getExecutorDSLExecutorCrossReference_6_2_0());
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:639:3: ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' )
                    {
                    // InternalSasDsl.g:639:3: ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' )
                    // InternalSasDsl.g:640:4: ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';'
                    {
                    // InternalSasDsl.g:640:4: ( (otherlv_34= RULE_ID ) )
                    // InternalSasDsl.g:641:5: (otherlv_34= RULE_ID )
                    {
                    // InternalSasDsl.g:641:5: (otherlv_34= RULE_ID )
                    // InternalSasDsl.g:642:6: otherlv_34= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_34, grammarAccess.getDSLRuleControllerAccess().getControllerDSLControllerCrossReference_7_0_0());
                    					

                    }


                    }

                    otherlv_35=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getDSLRuleControllerAccess().getMustAccessExecutorKeyword_7_1());
                    			
                    // InternalSasDsl.g:657:4: ( (otherlv_36= RULE_ID ) )
                    // InternalSasDsl.g:658:5: (otherlv_36= RULE_ID )
                    {
                    // InternalSasDsl.g:658:5: (otherlv_36= RULE_ID )
                    // InternalSasDsl.g:659:6: otherlv_36= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					
                    otherlv_36=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_36, grammarAccess.getDSLRuleControllerAccess().getExecutorDSLExecutorCrossReference_7_2_0());
                    					

                    }


                    }

                    otherlv_37=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_37, grammarAccess.getDSLRuleControllerAccess().getThroughKeyword_7_3());
                    			
                    // InternalSasDsl.g:674:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:675:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:675:5: ( ruleFQN )
                    // InternalSasDsl.g:676:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleControllerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleControllerAccess().getExecutorinterfaceExecutorInterfaceCrossReference_7_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_39=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_39, grammarAccess.getDSLRuleControllerAccess().getSemicolonKeyword_7_5());
                    			

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
    // $ANTLR end "ruleDSLRuleController"


    // $ANTLR start "entryRuleDSLRuleMonitor"
    // InternalSasDsl.g:699:1: entryRuleDSLRuleMonitor returns [EObject current=null] : iv_ruleDSLRuleMonitor= ruleDSLRuleMonitor EOF ;
    public final EObject entryRuleDSLRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleMonitor = null;


        try {
            // InternalSasDsl.g:699:55: (iv_ruleDSLRuleMonitor= ruleDSLRuleMonitor EOF )
            // InternalSasDsl.g:700:2: iv_ruleDSLRuleMonitor= ruleDSLRuleMonitor EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleMonitor=ruleDSLRuleMonitor();

            state._fsp--;

             current =iv_ruleDSLRuleMonitor; 
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
    // $ANTLR end "entryRuleDSLRuleMonitor"


    // $ANTLR start "ruleDSLRuleMonitor"
    // InternalSasDsl.g:706:1: ruleDSLRuleMonitor returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) ;
    public final EObject ruleDSLRuleMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;


        	enterRule();

        try {
            // InternalSasDsl.g:712:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) )
            // InternalSasDsl.g:713:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            {
            // InternalSasDsl.g:713:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt6=3;
                    }
                    break;
                case 25:
                    {
                    alt6=5;
                    }
                    break;
                case 32:
                    {
                    alt6=2;
                    }
                    break;
                case 34:
                    {
                    alt6=4;
                    }
                    break;
                case 31:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    alt6=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:714:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:714:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:715:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-sensor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:715:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:716:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:716:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:717:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleMonitorAccess().getMustNotAccessSensorKeyword_0_1());
                    			
                    // InternalSasDsl.g:732:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:733:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:733:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:734:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleMonitorAccess().getSensorDSLSensorCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:751:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    {
                    // InternalSasDsl.g:751:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    // InternalSasDsl.g:752:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';'
                    {
                    // InternalSasDsl.g:752:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:753:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:753:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:754:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleMonitorAccess().getMustAccessSensorKeyword_1_1());
                    			
                    // InternalSasDsl.g:769:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:770:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:770:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:771:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleMonitorAccess().getSensorDSLSensorCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleMonitorAccess().getThroughKeyword_1_3());
                    			
                    // InternalSasDsl.g:786:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:787:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:787:5: ( ruleFQN )
                    // InternalSasDsl.g:788:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleMonitorAccess().getSensorinterfaceSensorInterfaceCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:808:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalSasDsl.g:808:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    // InternalSasDsl.g:809:4: ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-knowledge' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalSasDsl.g:809:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:810:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:810:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:811:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRuleMonitorAccess().getMustNotAccessKnowledgeKeyword_2_1());
                    			
                    // InternalSasDsl.g:826:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSasDsl.g:827:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSasDsl.g:827:5: (otherlv_12= RULE_ID )
                    // InternalSasDsl.g:828:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getDSLRuleMonitorAccess().getKnowledgeDSLKnowledgeCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:845:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    {
                    // InternalSasDsl.g:845:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    // InternalSasDsl.g:846:4: ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-knowledge' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';'
                    {
                    // InternalSasDsl.g:846:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:847:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:847:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:848:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRuleMonitorAccess().getMustAccessKnowledgeKeyword_3_1());
                    			
                    // InternalSasDsl.g:863:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:864:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:864:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:865:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRuleMonitorAccess().getKnowledgeDSLKnowledgeCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRuleMonitorAccess().getThroughKeyword_3_3());
                    			
                    // InternalSasDsl.g:880:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:881:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:881:5: ( ruleFQN )
                    // InternalSasDsl.g:882:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleMonitorAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:902:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:902:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:903:4: ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-analyzer' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    // InternalSasDsl.g:903:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:904:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:904:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:905:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRuleMonitorAccess().getMustNotAccessAnalyzerKeyword_4_1());
                    			
                    // InternalSasDsl.g:920:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:921:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:921:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:922:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRuleMonitorAccess().getAnalyzerDSLAnalyzerCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:939:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    {
                    // InternalSasDsl.g:939:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    // InternalSasDsl.g:940:4: ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-analyzer' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';'
                    {
                    // InternalSasDsl.g:940:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSasDsl.g:941:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSasDsl.g:941:5: (otherlv_24= RULE_ID )
                    // InternalSasDsl.g:942:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_24, grammarAccess.getDSLRuleMonitorAccess().getMonitorDSLMonitorCrossReference_5_0_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getDSLRuleMonitorAccess().getMustAccessAnalyzerKeyword_5_1());
                    			
                    // InternalSasDsl.g:957:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSasDsl.g:958:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSasDsl.g:958:5: (otherlv_26= RULE_ID )
                    // InternalSasDsl.g:959:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_26, grammarAccess.getDSLRuleMonitorAccess().getAnalyzerDSLAnalyzerCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDSLRuleMonitorAccess().getThroughKeyword_5_3());
                    			
                    // InternalSasDsl.g:974:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:975:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:975:5: ( ruleFQN )
                    // InternalSasDsl.g:976:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMonitorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleMonitorAccess().getAnalyzerinterfaceAnalyzerInterfaceCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRuleMonitorAccess().getSemicolonKeyword_5_5());
                    			

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
    // $ANTLR end "ruleDSLRuleMonitor"


    // $ANTLR start "entryRuleDSLRuleAnalyzer"
    // InternalSasDsl.g:999:1: entryRuleDSLRuleAnalyzer returns [EObject current=null] : iv_ruleDSLRuleAnalyzer= ruleDSLRuleAnalyzer EOF ;
    public final EObject entryRuleDSLRuleAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleAnalyzer = null;


        try {
            // InternalSasDsl.g:999:56: (iv_ruleDSLRuleAnalyzer= ruleDSLRuleAnalyzer EOF )
            // InternalSasDsl.g:1000:2: iv_ruleDSLRuleAnalyzer= ruleDSLRuleAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleAnalyzer=ruleDSLRuleAnalyzer();

            state._fsp--;

             current =iv_ruleDSLRuleAnalyzer; 
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
    // $ANTLR end "entryRuleDSLRuleAnalyzer"


    // $ANTLR start "ruleDSLRuleAnalyzer"
    // InternalSasDsl.g:1006:1: ruleDSLRuleAnalyzer returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) ;
    public final EObject ruleDSLRuleAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1012:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) )
            // InternalSasDsl.g:1013:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            {
            // InternalSasDsl.g:1013:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt7=4;
                    }
                    break;
                case 33:
                    {
                    alt7=1;
                    }
                    break;
                case 28:
                    {
                    alt7=6;
                    }
                    break;
                case 21:
                    {
                    alt7=3;
                    }
                    break;
                case 27:
                    {
                    alt7=5;
                    }
                    break;
                case 34:
                    {
                    alt7=2;
                    }
                    break;
                default:
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
                    // InternalSasDsl.g:1014:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:1014:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:1015:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:1015:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:1016:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:1016:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:1017:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleAnalyzerAccess().getMustNotAccessKnowledgeKeyword_0_1());
                    			
                    // InternalSasDsl.g:1032:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:1033:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:1033:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:1034:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeDSLKnowledgeCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1051:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    {
                    // InternalSasDsl.g:1051:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    // InternalSasDsl.g:1052:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';'
                    {
                    // InternalSasDsl.g:1052:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:1053:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:1053:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:1054:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleAnalyzerAccess().getMustAccessKnowledgeKeyword_1_1());
                    			
                    // InternalSasDsl.g:1069:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1070:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1070:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1071:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeDSLKnowledgeCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleAnalyzerAccess().getThroughKeyword_1_3());
                    			
                    // InternalSasDsl.g:1086:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1087:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1087:5: ( ruleFQN )
                    // InternalSasDsl.g:1088:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1108:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalSasDsl.g:1108:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    // InternalSasDsl.g:1109:4: ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-monitor' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalSasDsl.g:1109:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1110:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1110:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1111:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRuleAnalyzerAccess().getMustNotAccessMonitorKeyword_2_1());
                    			
                    // InternalSasDsl.g:1126:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSasDsl.g:1127:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSasDsl.g:1127:5: (otherlv_12= RULE_ID )
                    // InternalSasDsl.g:1128:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getDSLRuleAnalyzerAccess().getMonitorDSLMonitorCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1145:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    {
                    // InternalSasDsl.g:1145:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    // InternalSasDsl.g:1146:4: ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-monitor' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';'
                    {
                    // InternalSasDsl.g:1146:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:1147:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:1147:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:1148:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRuleAnalyzerAccess().getMustAccessMonitorKeyword_3_1());
                    			
                    // InternalSasDsl.g:1163:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:1164:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:1164:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:1165:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeDSLMonitorCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRuleAnalyzerAccess().getThroughKeyword_3_3());
                    			
                    // InternalSasDsl.g:1180:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1181:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1181:5: ( ruleFQN )
                    // InternalSasDsl.g:1182:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleAnalyzerAccess().getMonitorinterfaceMonitorInterfaceCrossReference_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1202:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:1202:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:1203:4: ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    // InternalSasDsl.g:1203:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1204:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1204:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1205:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRuleAnalyzerAccess().getMustNotAccessPlannerKeyword_4_1());
                    			
                    // InternalSasDsl.g:1220:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1221:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1221:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1222:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRuleAnalyzerAccess().getPlannerDSLPlannerCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:1239:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    {
                    // InternalSasDsl.g:1239:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    // InternalSasDsl.g:1240:4: ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';'
                    {
                    // InternalSasDsl.g:1240:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSasDsl.g:1241:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSasDsl.g:1241:5: (otherlv_24= RULE_ID )
                    // InternalSasDsl.g:1242:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_24, grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerDSLAnalyzerCrossReference_5_0_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getDSLRuleAnalyzerAccess().getMustAccessPlannerKeyword_5_1());
                    			
                    // InternalSasDsl.g:1257:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSasDsl.g:1258:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSasDsl.g:1258:5: (otherlv_26= RULE_ID )
                    // InternalSasDsl.g:1259:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_26, grammarAccess.getDSLRuleAnalyzerAccess().getPlannerDSLPlannerCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDSLRuleAnalyzerAccess().getThroughKeyword_5_3());
                    			
                    // InternalSasDsl.g:1274:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1275:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1275:5: ( ruleFQN )
                    // InternalSasDsl.g:1276:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleAnalyzerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleAnalyzerAccess().getPlannerinterfacePlannerInterfaceCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRuleAnalyzerAccess().getSemicolonKeyword_5_5());
                    			

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
    // $ANTLR end "ruleDSLRuleAnalyzer"


    // $ANTLR start "entryRuleDSLRulePlanner"
    // InternalSasDsl.g:1299:1: entryRuleDSLRulePlanner returns [EObject current=null] : iv_ruleDSLRulePlanner= ruleDSLRulePlanner EOF ;
    public final EObject entryRuleDSLRulePlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRulePlanner = null;


        try {
            // InternalSasDsl.g:1299:55: (iv_ruleDSLRulePlanner= ruleDSLRulePlanner EOF )
            // InternalSasDsl.g:1300:2: iv_ruleDSLRulePlanner= ruleDSLRulePlanner EOF
            {
             newCompositeNode(grammarAccess.getDSLRulePlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRulePlanner=ruleDSLRulePlanner();

            state._fsp--;

             current =iv_ruleDSLRulePlanner; 
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
    // $ANTLR end "entryRuleDSLRulePlanner"


    // $ANTLR start "ruleDSLRulePlanner"
    // InternalSasDsl.g:1306:1: ruleDSLRulePlanner returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) ;
    public final EObject ruleDSLRulePlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1312:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) )
            // InternalSasDsl.g:1313:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            {
            // InternalSasDsl.g:1313:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt8=2;
                    }
                    break;
                case 26:
                    {
                    alt8=4;
                    }
                    break;
                case 33:
                    {
                    alt8=1;
                    }
                    break;
                case 30:
                    {
                    alt8=6;
                    }
                    break;
                case 25:
                    {
                    alt8=3;
                    }
                    break;
                case 29:
                    {
                    alt8=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSasDsl.g:1314:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:1314:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:1315:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-knowledge' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:1315:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:1316:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:1316:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:1317:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRulePlannerAccess().getMustNotAccessKnowledgeKeyword_0_1());
                    			
                    // InternalSasDsl.g:1332:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:1333:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:1333:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:1334:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRulePlannerAccess().getKnowledgeDSLKnowledgeCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1351:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    {
                    // InternalSasDsl.g:1351:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    // InternalSasDsl.g:1352:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-knowledge' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';'
                    {
                    // InternalSasDsl.g:1352:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:1353:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:1353:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:1354:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRulePlannerAccess().getMustAccessKnowledgeKeyword_1_1());
                    			
                    // InternalSasDsl.g:1369:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1370:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1370:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1371:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRulePlannerAccess().getKnowledgeDSLKnowledgeCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRulePlannerAccess().getThroughKeyword_1_3());
                    			
                    // InternalSasDsl.g:1386:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1387:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1387:5: ( ruleFQN )
                    // InternalSasDsl.g:1388:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRulePlannerAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1408:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalSasDsl.g:1408:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    // InternalSasDsl.g:1409:4: ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalSasDsl.g:1409:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1410:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1410:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1411:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRulePlannerAccess().getMustNotAccessAnalyzerKeyword_2_1());
                    			
                    // InternalSasDsl.g:1426:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSasDsl.g:1427:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSasDsl.g:1427:5: (otherlv_12= RULE_ID )
                    // InternalSasDsl.g:1428:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getDSLRulePlannerAccess().getAnalyzerDSLAnalyzerCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1445:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    {
                    // InternalSasDsl.g:1445:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    // InternalSasDsl.g:1446:4: ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';'
                    {
                    // InternalSasDsl.g:1446:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:1447:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:1447:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:1448:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRulePlannerAccess().getMustAccessAnalyzerKeyword_3_1());
                    			
                    // InternalSasDsl.g:1463:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:1464:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:1464:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:1465:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRulePlannerAccess().getAnalyzerDSLAnalyzerCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRulePlannerAccess().getThroughKeyword_3_3());
                    			
                    // InternalSasDsl.g:1480:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1481:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1481:5: ( ruleFQN )
                    // InternalSasDsl.g:1482:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRulePlannerAccess().getAnalyzerinterfaceAnalyzerInterfaceCrossReference_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1502:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:1502:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:1503:4: ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-executor' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    // InternalSasDsl.g:1503:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1504:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1504:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1505:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRulePlannerAccess().getMustNotAccessExecutorKeyword_4_1());
                    			
                    // InternalSasDsl.g:1520:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1521:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1521:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1522:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRulePlannerAccess().getExecutorDSLExecutorCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:1539:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    {
                    // InternalSasDsl.g:1539:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    // InternalSasDsl.g:1540:4: ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-executor' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';'
                    {
                    // InternalSasDsl.g:1540:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSasDsl.g:1541:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSasDsl.g:1541:5: (otherlv_24= RULE_ID )
                    // InternalSasDsl.g:1542:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_24, grammarAccess.getDSLRulePlannerAccess().getPlannerDSLPlannerCrossReference_5_0_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getDSLRulePlannerAccess().getMustAccessExecutorKeyword_5_1());
                    			
                    // InternalSasDsl.g:1557:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSasDsl.g:1558:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSasDsl.g:1558:5: (otherlv_26= RULE_ID )
                    // InternalSasDsl.g:1559:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_26, grammarAccess.getDSLRulePlannerAccess().getExecutorDSLExecutorCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDSLRulePlannerAccess().getThroughKeyword_5_3());
                    			
                    // InternalSasDsl.g:1574:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1575:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1575:5: ( ruleFQN )
                    // InternalSasDsl.g:1576:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRulePlannerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRulePlannerAccess().getExecutorinterfaceExecutorInterfaceCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRulePlannerAccess().getSemicolonKeyword_5_5());
                    			

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
    // $ANTLR end "ruleDSLRulePlanner"


    // $ANTLR start "entryRuleDSLRuleExecutor"
    // InternalSasDsl.g:1599:1: entryRuleDSLRuleExecutor returns [EObject current=null] : iv_ruleDSLRuleExecutor= ruleDSLRuleExecutor EOF ;
    public final EObject entryRuleDSLRuleExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleExecutor = null;


        try {
            // InternalSasDsl.g:1599:56: (iv_ruleDSLRuleExecutor= ruleDSLRuleExecutor EOF )
            // InternalSasDsl.g:1600:2: iv_ruleDSLRuleExecutor= ruleDSLRuleExecutor EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleExecutor=ruleDSLRuleExecutor();

            state._fsp--;

             current =iv_ruleDSLRuleExecutor; 
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
    // $ANTLR end "entryRuleDSLRuleExecutor"


    // $ANTLR start "ruleDSLRuleExecutor"
    // InternalSasDsl.g:1606:1: ruleDSLRuleExecutor returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) ;
    public final EObject ruleDSLRuleExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1612:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) ) )
            // InternalSasDsl.g:1613:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            {
            // InternalSasDsl.g:1613:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt9=3;
                    }
                    break;
                case 33:
                    {
                    alt9=5;
                    }
                    break;
                case 36:
                    {
                    alt9=2;
                    }
                    break;
                case 28:
                    {
                    alt9=4;
                    }
                    break;
                case 35:
                    {
                    alt9=1;
                    }
                    break;
                case 34:
                    {
                    alt9=6;
                    }
                    break;
                default:
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
                    // InternalSasDsl.g:1614:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:1614:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:1615:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-effector' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:1615:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:1616:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:1616:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:1617:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleExecutorAccess().getMustNotAccessEffectorKeyword_0_1());
                    			
                    // InternalSasDsl.g:1632:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:1633:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:1633:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:1634:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleExecutorAccess().getEffectorDSLEffectorCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1651:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    {
                    // InternalSasDsl.g:1651:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' )
                    // InternalSasDsl.g:1652:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';'
                    {
                    // InternalSasDsl.g:1652:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:1653:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:1653:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:1654:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleExecutorAccess().getMustAccessEffectorKeyword_1_1());
                    			
                    // InternalSasDsl.g:1669:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1670:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1670:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1671:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleExecutorAccess().getEffectorDSLEffectorCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleExecutorAccess().getThroughKeyword_1_3());
                    			
                    // InternalSasDsl.g:1686:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1687:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1687:5: ( ruleFQN )
                    // InternalSasDsl.g:1688:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleExecutorAccess().getEffectorinterfaceEffectorInterfaceCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1708:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalSasDsl.g:1708:3: ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' )
                    // InternalSasDsl.g:1709:4: ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-planner' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalSasDsl.g:1709:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1710:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1710:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1711:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRuleExecutorAccess().getMustNotAccessPlannerKeyword_2_1());
                    			
                    // InternalSasDsl.g:1726:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSasDsl.g:1727:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSasDsl.g:1727:5: (otherlv_12= RULE_ID )
                    // InternalSasDsl.g:1728:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getDSLRuleExecutorAccess().getPlannerDSLPlannerCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1745:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    {
                    // InternalSasDsl.g:1745:3: ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' )
                    // InternalSasDsl.g:1746:4: ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-planner' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';'
                    {
                    // InternalSasDsl.g:1746:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:1747:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:1747:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:1748:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRuleExecutorAccess().getMustAccessPlannerKeyword_3_1());
                    			
                    // InternalSasDsl.g:1763:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:1764:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:1764:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:1765:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRuleExecutorAccess().getPlannerDSLPlannerCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRuleExecutorAccess().getThroughKeyword_3_3());
                    			
                    // InternalSasDsl.g:1780:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1781:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1781:5: ( ruleFQN )
                    // InternalSasDsl.g:1782:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleExecutorAccess().getPlannerinterfacePlannerInterfaceCrossReference_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1802:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:1802:3: ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:1803:4: ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-knowledge' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    // InternalSasDsl.g:1803:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1804:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1804:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1805:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRuleExecutorAccess().getMustNotAccessKnowledgeKeyword_4_1());
                    			
                    // InternalSasDsl.g:1820:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1821:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1821:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1822:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRuleExecutorAccess().getKnowledgeDSLKnowledgeCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:1839:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    {
                    // InternalSasDsl.g:1839:3: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' )
                    // InternalSasDsl.g:1840:4: ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-knowledge' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';'
                    {
                    // InternalSasDsl.g:1840:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSasDsl.g:1841:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSasDsl.g:1841:5: (otherlv_24= RULE_ID )
                    // InternalSasDsl.g:1842:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_24, grammarAccess.getDSLRuleExecutorAccess().getExecutorDSLExecutorCrossReference_5_0_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getDSLRuleExecutorAccess().getMustAccessKnowledgeKeyword_5_1());
                    			
                    // InternalSasDsl.g:1857:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSasDsl.g:1858:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSasDsl.g:1858:5: (otherlv_26= RULE_ID )
                    // InternalSasDsl.g:1859:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_26, grammarAccess.getDSLRuleExecutorAccess().getKnowledgeDSLKnowledgeCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDSLRuleExecutorAccess().getThroughKeyword_5_3());
                    			
                    // InternalSasDsl.g:1874:4: ( ( ruleFQN ) )
                    // InternalSasDsl.g:1875:5: ( ruleFQN )
                    {
                    // InternalSasDsl.g:1875:5: ( ruleFQN )
                    // InternalSasDsl.g:1876:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleExecutorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDSLRuleExecutorAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRuleExecutorAccess().getSemicolonKeyword_5_5());
                    			

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
    // $ANTLR end "ruleDSLRuleExecutor"


    // $ANTLR start "entryRuleDSLRuleMO"
    // InternalSasDsl.g:1899:1: entryRuleDSLRuleMO returns [EObject current=null] : iv_ruleDSLRuleMO= ruleDSLRuleMO EOF ;
    public final EObject entryRuleDSLRuleMO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleMO = null;


        try {
            // InternalSasDsl.g:1899:50: (iv_ruleDSLRuleMO= ruleDSLRuleMO EOF )
            // InternalSasDsl.g:1900:2: iv_ruleDSLRuleMO= ruleDSLRuleMO EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleMORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleMO=ruleDSLRuleMO();

            state._fsp--;

             current =iv_ruleDSLRuleMO; 
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
    // $ANTLR end "entryRuleDSLRuleMO"


    // $ANTLR start "ruleDSLRuleMO"
    // InternalSasDsl.g:1906:1: ruleDSLRuleMO returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleDSLRuleMO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1912:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            // InternalSasDsl.g:1913:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            {
            // InternalSasDsl.g:1913:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==37) ) {
                    alt10=1;
                }
                else if ( (LA10_1==38) ) {
                    alt10=2;
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
                    // InternalSasDsl.g:1914:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:1914:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:1915:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-sense' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:1915:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:1916:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:1916:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:1917:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMORule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleMOAccess().getSensorDSLSensorCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleMOAccess().getMustSenseKeyword_0_1());
                    			
                    // InternalSasDsl.g:1932:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:1933:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:1933:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:1934:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMORule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleMOAccess().getMeasuredDSLMeasuredOutputCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleMOAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1951:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    {
                    // InternalSasDsl.g:1951:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    // InternalSasDsl.g:1952:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-sense' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
                    {
                    // InternalSasDsl.g:1952:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:1953:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:1953:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:1954:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMORule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleMOAccess().getSensorDSLSensorCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleMOAccess().getMustNotSenseKeyword_1_1());
                    			
                    // InternalSasDsl.g:1969:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1970:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1970:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1971:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleMORule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleMOAccess().getMeasuredDSLMeasuredOutputCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleMOAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "ruleDSLRuleMO"


    // $ANTLR start "entryRuleDSLRuleRI"
    // InternalSasDsl.g:1991:1: entryRuleDSLRuleRI returns [EObject current=null] : iv_ruleDSLRuleRI= ruleDSLRuleRI EOF ;
    public final EObject entryRuleDSLRuleRI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRuleRI = null;


        try {
            // InternalSasDsl.g:1991:50: (iv_ruleDSLRuleRI= ruleDSLRuleRI EOF )
            // InternalSasDsl.g:1992:2: iv_ruleDSLRuleRI= ruleDSLRuleRI EOF
            {
             newCompositeNode(grammarAccess.getDSLRuleRIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRuleRI=ruleDSLRuleRI();

            state._fsp--;

             current =iv_ruleDSLRuleRI; 
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
    // $ANTLR end "entryRuleDSLRuleRI"


    // $ANTLR start "ruleDSLRuleRI"
    // InternalSasDsl.g:1998:1: ruleDSLRuleRI returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleDSLRuleRI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2004:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            // InternalSasDsl.g:2005:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            {
            // InternalSasDsl.g:2005:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==39) ) {
                    alt11=1;
                }
                else if ( (LA11_1==40) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSasDsl.g:2006:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalSasDsl.g:2006:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
                    // InternalSasDsl.g:2007:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-use' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalSasDsl.g:2007:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSasDsl.g:2008:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2008:5: (otherlv_0= RULE_ID )
                    // InternalSasDsl.g:2009:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleRIRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_0, grammarAccess.getDSLRuleRIAccess().getAnalyzerDSLAnalyzerCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDSLRuleRIAccess().getMustUseKeyword_0_1());
                    			
                    // InternalSasDsl.g:2024:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSasDsl.g:2025:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSasDsl.g:2025:5: (otherlv_2= RULE_ID )
                    // InternalSasDsl.g:2026:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleRIRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getDSLRuleRIAccess().getReferenceDSLReferenceInputCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDSLRuleRIAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2043:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    {
                    // InternalSasDsl.g:2043:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    // InternalSasDsl.g:2044:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-not-use' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
                    {
                    // InternalSasDsl.g:2044:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:2045:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:2045:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:2046:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleRIRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRuleRIAccess().getAnalyzerDSLAnalyzerCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRuleRIAccess().getMustNotUseKeyword_1_1());
                    			
                    // InternalSasDsl.g:2061:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:2062:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:2062:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:2063:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRuleRIRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRuleRIAccess().getReferenceDSLReferenceInputCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRuleRIAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "ruleDSLRuleRI"


    // $ANTLR start "entryRuleDSLManaging"
    // InternalSasDsl.g:2083:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:2083:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:2084:2: iv_ruleDSLManaging= ruleDSLManaging EOF
            {
             newCompositeNode(grammarAccess.getDSLManagingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLManaging=ruleDSLManaging();

            state._fsp--;

             current =iv_ruleDSLManaging; 
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
    // $ANTLR end "entryRuleDSLManaging"


    // $ANTLR start "ruleDSLManaging"
    // InternalSasDsl.g:2090:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managerController_3_0= ruleDSLManagerController ) )* ( (lv_controller_4_0= ruleDSLController ) )+ otherlv_5= '}' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_managerController_3_0 = null;

        EObject lv_controller_4_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2096:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managerController_3_0= ruleDSLManagerController ) )* ( (lv_controller_4_0= ruleDSLController ) )+ otherlv_5= '}' ) )
            // InternalSasDsl.g:2097:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managerController_3_0= ruleDSLManagerController ) )* ( (lv_controller_4_0= ruleDSLController ) )+ otherlv_5= '}' )
            {
            // InternalSasDsl.g:2097:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managerController_3_0= ruleDSLManagerController ) )* ( (lv_controller_4_0= ruleDSLController ) )+ otherlv_5= '}' )
            // InternalSasDsl.g:2098:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_managerController_3_0= ruleDSLManagerController ) )* ( (lv_controller_4_0= ruleDSLController ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:2102:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2103:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2103:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2104:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLManagingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLManagingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLManagingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSasDsl.g:2124:3: ( (lv_managerController_3_0= ruleDSLManagerController ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSasDsl.g:2125:4: (lv_managerController_3_0= ruleDSLManagerController )
            	    {
            	    // InternalSasDsl.g:2125:4: (lv_managerController_3_0= ruleDSLManagerController )
            	    // InternalSasDsl.g:2126:5: lv_managerController_3_0= ruleDSLManagerController
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagingAccess().getManagerControllerDSLManagerControllerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_managerController_3_0=ruleDSLManagerController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"managerController",
            	    						lv_managerController_3_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLManagerController");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSasDsl.g:2143:3: ( (lv_controller_4_0= ruleDSLController ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSasDsl.g:2144:4: (lv_controller_4_0= ruleDSLController )
            	    {
            	    // InternalSasDsl.g:2144:4: (lv_controller_4_0= ruleDSLController )
            	    // InternalSasDsl.g:2145:5: lv_controller_4_0= ruleDSLController
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagingAccess().getControllerDSLControllerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_controller_4_0=ruleDSLController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"controller",
            	    						lv_controller_4_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLController");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDSLManagingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDSLManaging"


    // $ANTLR start "entryRuleDSLManaged"
    // InternalSasDsl.g:2170:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:2170:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:2171:2: iv_ruleDSLManaged= ruleDSLManaged EOF
            {
             newCompositeNode(grammarAccess.getDSLManagedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLManaged=ruleDSLManaged();

            state._fsp--;

             current =iv_ruleDSLManaged; 
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
    // $ANTLR end "entryRuleDSLManaged"


    // $ANTLR start "ruleDSLManaged"
    // InternalSasDsl.g:2177:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleDSLSensor ) )+ ( (lv_effector_4_0= ruleDSLEffector ) )+ ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+ otherlv_6= '}' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_sensor_3_0 = null;

        EObject lv_effector_4_0 = null;

        EObject lv_measuredOutput_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2183:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleDSLSensor ) )+ ( (lv_effector_4_0= ruleDSLEffector ) )+ ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+ otherlv_6= '}' ) )
            // InternalSasDsl.g:2184:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleDSLSensor ) )+ ( (lv_effector_4_0= ruleDSLEffector ) )+ ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+ otherlv_6= '}' )
            {
            // InternalSasDsl.g:2184:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleDSLSensor ) )+ ( (lv_effector_4_0= ruleDSLEffector ) )+ ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+ otherlv_6= '}' )
            // InternalSasDsl.g:2185:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleDSLSensor ) )+ ( (lv_effector_4_0= ruleDSLEffector ) )+ ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:2189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2190:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLManagedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLManagedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSasDsl.g:2211:3: ( (lv_sensor_3_0= ruleDSLSensor ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==56) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSasDsl.g:2212:4: (lv_sensor_3_0= ruleDSLSensor )
            	    {
            	    // InternalSasDsl.g:2212:4: (lv_sensor_3_0= ruleDSLSensor )
            	    // InternalSasDsl.g:2213:5: lv_sensor_3_0= ruleDSLSensor
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagedAccess().getSensorDSLSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_sensor_3_0=ruleDSLSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensor",
            	    						lv_sensor_3_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLSensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalSasDsl.g:2230:3: ( (lv_effector_4_0= ruleDSLEffector ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==57) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSasDsl.g:2231:4: (lv_effector_4_0= ruleDSLEffector )
            	    {
            	    // InternalSasDsl.g:2231:4: (lv_effector_4_0= ruleDSLEffector )
            	    // InternalSasDsl.g:2232:5: lv_effector_4_0= ruleDSLEffector
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagedAccess().getEffectorDSLEffectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_effector_4_0=ruleDSLEffector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effector",
            	    						lv_effector_4_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLEffector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalSasDsl.g:2249:3: ( (lv_measuredOutput_5_0= ruleDSLMeasuredOutput ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==59) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSasDsl.g:2250:4: (lv_measuredOutput_5_0= ruleDSLMeasuredOutput )
            	    {
            	    // InternalSasDsl.g:2250:4: (lv_measuredOutput_5_0= ruleDSLMeasuredOutput )
            	    // InternalSasDsl.g:2251:5: lv_measuredOutput_5_0= ruleDSLMeasuredOutput
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagedAccess().getMeasuredOutputDSLMeasuredOutputParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_measuredOutput_5_0=ruleDSLMeasuredOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"measuredOutput",
            	    						lv_measuredOutput_5_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLMeasuredOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLManagedAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDSLManaged"


    // $ANTLR start "entryRuleDSLManagerController"
    // InternalSasDsl.g:2276:1: entryRuleDSLManagerController returns [EObject current=null] : iv_ruleDSLManagerController= ruleDSLManagerController EOF ;
    public final EObject entryRuleDSLManagerController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManagerController = null;


        try {
            // InternalSasDsl.g:2276:61: (iv_ruleDSLManagerController= ruleDSLManagerController EOF )
            // InternalSasDsl.g:2277:2: iv_ruleDSLManagerController= ruleDSLManagerController EOF
            {
             newCompositeNode(grammarAccess.getDSLManagerControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLManagerController=ruleDSLManagerController();

            state._fsp--;

             current =iv_ruleDSLManagerController; 
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
    // $ANTLR end "entryRuleDSLManagerController"


    // $ANTLR start "ruleDSLManagerController"
    // InternalSasDsl.g:2283:1: ruleDSLManagerController returns [EObject current=null] : (otherlv_0= 'ManagerController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeMC otherlv_4= '{' ( (lv_controller_5_0= ruleDSLController ) )+ otherlv_6= '}' ) ;
    public final EObject ruleDSLManagerController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_controller_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2289:2: ( (otherlv_0= 'ManagerController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeMC otherlv_4= '{' ( (lv_controller_5_0= ruleDSLController ) )+ otherlv_6= '}' ) )
            // InternalSasDsl.g:2290:2: (otherlv_0= 'ManagerController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeMC otherlv_4= '{' ( (lv_controller_5_0= ruleDSLController ) )+ otherlv_6= '}' )
            {
            // InternalSasDsl.g:2290:2: (otherlv_0= 'ManagerController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeMC otherlv_4= '{' ( (lv_controller_5_0= ruleDSLController ) )+ otherlv_6= '}' )
            // InternalSasDsl.g:2291:3: otherlv_0= 'ManagerController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeMC otherlv_4= '{' ( (lv_controller_5_0= ruleDSLController ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagerControllerAccess().getManagerControllerKeyword_0());
            		
            // InternalSasDsl.g:2295:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2296:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2296:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2297:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLManagerControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLManagerControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLManagerControllerAccess().getTypeOfKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDSLManagerControllerAccess().getDSLTypeMCParserRuleCall_3());
            		
            pushFollow(FOLLOW_4);
            ruleDSLTypeMC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLManagerControllerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSasDsl.g:2328:3: ( (lv_controller_5_0= ruleDSLController ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSasDsl.g:2329:4: (lv_controller_5_0= ruleDSLController )
            	    {
            	    // InternalSasDsl.g:2329:4: (lv_controller_5_0= ruleDSLController )
            	    // InternalSasDsl.g:2330:5: lv_controller_5_0= ruleDSLController
            	    {

            	    					newCompositeNode(grammarAccess.getDSLManagerControllerAccess().getControllerDSLControllerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_controller_5_0=ruleDSLController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLManagerControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"controller",
            	    						lv_controller_5_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLController");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLManagerControllerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDSLManagerController"


    // $ANTLR start "entryRuleDSLTypeMC"
    // InternalSasDsl.g:2355:1: entryRuleDSLTypeMC returns [String current=null] : iv_ruleDSLTypeMC= ruleDSLTypeMC EOF ;
    public final String entryRuleDSLTypeMC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeMC = null;


        try {
            // InternalSasDsl.g:2355:49: (iv_ruleDSLTypeMC= ruleDSLTypeMC EOF )
            // InternalSasDsl.g:2356:2: iv_ruleDSLTypeMC= ruleDSLTypeMC EOF
            {
             newCompositeNode(grammarAccess.getDSLTypeMCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLTypeMC=ruleDSLTypeMC();

            state._fsp--;

             current =iv_ruleDSLTypeMC.getText(); 
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
    // $ANTLR end "entryRuleDSLTypeMC"


    // $ANTLR start "ruleDSLTypeMC"
    // InternalSasDsl.g:2362:1: ruleDSLTypeMC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeMC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2368:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:2369:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:2369:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSasDsl.g:2370:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeMCAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2376:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeMCAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2382:3: kw= 'Independent'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeMCAccess().getIndependentKeyword_2());
                    		

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
    // $ANTLR end "ruleDSLTypeMC"


    // $ANTLR start "entryRuleDSLController"
    // InternalSasDsl.g:2391:1: entryRuleDSLController returns [EObject current=null] : iv_ruleDSLController= ruleDSLController EOF ;
    public final EObject entryRuleDSLController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLController = null;


        try {
            // InternalSasDsl.g:2391:54: (iv_ruleDSLController= ruleDSLController EOF )
            // InternalSasDsl.g:2392:2: iv_ruleDSLController= ruleDSLController EOF
            {
             newCompositeNode(grammarAccess.getDSLControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLController=ruleDSLController();

            state._fsp--;

             current =iv_ruleDSLController; 
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
    // $ANTLR end "entryRuleDSLController"


    // $ANTLR start "ruleDSLController"
    // InternalSasDsl.g:2398:1: ruleDSLController returns [EObject current=null] : (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )? otherlv_6= '{' ( (lv_monitor_7_0= ruleDSLMonitor ) )+ ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+ ( (lv_planner_9_0= ruleDSLPlanner ) )+ ( (lv_executor_10_0= ruleDSLExecutor ) )+ ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+ otherlv_12= '}' ) ;
    public final EObject ruleDSLController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        EObject lv_controllerinterfaces_3_0 = null;

        EObject lv_controllerinterfaces_5_0 = null;

        EObject lv_monitor_7_0 = null;

        EObject lv_analyzer_8_0 = null;

        EObject lv_planner_9_0 = null;

        EObject lv_executor_10_0 = null;

        EObject lv_knowledge_11_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2404:2: ( (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )? otherlv_6= '{' ( (lv_monitor_7_0= ruleDSLMonitor ) )+ ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+ ( (lv_planner_9_0= ruleDSLPlanner ) )+ ( (lv_executor_10_0= ruleDSLExecutor ) )+ ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+ otherlv_12= '}' ) )
            // InternalSasDsl.g:2405:2: (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )? otherlv_6= '{' ( (lv_monitor_7_0= ruleDSLMonitor ) )+ ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+ ( (lv_planner_9_0= ruleDSLPlanner ) )+ ( (lv_executor_10_0= ruleDSLExecutor ) )+ ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+ otherlv_12= '}' )
            {
            // InternalSasDsl.g:2405:2: (otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )? otherlv_6= '{' ( (lv_monitor_7_0= ruleDSLMonitor ) )+ ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+ ( (lv_planner_9_0= ruleDSLPlanner ) )+ ( (lv_executor_10_0= ruleDSLExecutor ) )+ ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+ otherlv_12= '}' )
            // InternalSasDsl.g:2406:3: otherlv_0= 'Controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )? otherlv_6= '{' ( (lv_monitor_7_0= ruleDSLMonitor ) )+ ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+ ( (lv_planner_9_0= ruleDSLPlanner ) )+ ( (lv_executor_10_0= ruleDSLExecutor ) )+ ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControllerAccess().getControllerKeyword_0());
            		
            // InternalSasDsl.g:2410:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2411:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2411:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2412:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2428:3: (otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSasDsl.g:2429:4: otherlv_2= 'with-interface' ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) ) (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControllerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2433:4: ( (lv_controllerinterfaces_3_0= ruleControllerInterface ) )
                    // InternalSasDsl.g:2434:5: (lv_controllerinterfaces_3_0= ruleControllerInterface )
                    {
                    // InternalSasDsl.g:2434:5: (lv_controllerinterfaces_3_0= ruleControllerInterface )
                    // InternalSasDsl.g:2435:6: lv_controllerinterfaces_3_0= ruleControllerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControllerAccess().getControllerinterfacesControllerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_controllerinterfaces_3_0=ruleControllerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControllerRule());
                    						}
                    						add(
                    							current,
                    							"controllerinterfaces",
                    							lv_controllerinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControllerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2452:4: (otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==50) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSasDsl.g:2453:5: otherlv_4= ',' ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLControllerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2457:5: ( (lv_controllerinterfaces_5_0= ruleControllerInterface ) )
                    	    // InternalSasDsl.g:2458:6: (lv_controllerinterfaces_5_0= ruleControllerInterface )
                    	    {
                    	    // InternalSasDsl.g:2458:6: (lv_controllerinterfaces_5_0= ruleControllerInterface )
                    	    // InternalSasDsl.g:2459:7: lv_controllerinterfaces_5_0= ruleControllerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControllerAccess().getControllerinterfacesControllerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_controllerinterfaces_5_0=ruleControllerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControllerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controllerinterfaces",
                    	    								lv_controllerinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControllerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLControllerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSasDsl.g:2482:3: ( (lv_monitor_7_0= ruleDSLMonitor ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==51) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSasDsl.g:2483:4: (lv_monitor_7_0= ruleDSLMonitor )
            	    {
            	    // InternalSasDsl.g:2483:4: (lv_monitor_7_0= ruleDSLMonitor )
            	    // InternalSasDsl.g:2484:5: lv_monitor_7_0= ruleDSLMonitor
            	    {

            	    					newCompositeNode(grammarAccess.getDSLControllerAccess().getMonitorDSLMonitorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_monitor_7_0=ruleDSLMonitor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"monitor",
            	    						lv_monitor_7_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLMonitor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalSasDsl.g:2501:3: ( (lv_analyzer_8_0= ruleDSLAnalyzer ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==52) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSasDsl.g:2502:4: (lv_analyzer_8_0= ruleDSLAnalyzer )
            	    {
            	    // InternalSasDsl.g:2502:4: (lv_analyzer_8_0= ruleDSLAnalyzer )
            	    // InternalSasDsl.g:2503:5: lv_analyzer_8_0= ruleDSLAnalyzer
            	    {

            	    					newCompositeNode(grammarAccess.getDSLControllerAccess().getAnalyzerDSLAnalyzerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_analyzer_8_0=ruleDSLAnalyzer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"analyzer",
            	    						lv_analyzer_8_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLAnalyzer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalSasDsl.g:2520:3: ( (lv_planner_9_0= ruleDSLPlanner ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSasDsl.g:2521:4: (lv_planner_9_0= ruleDSLPlanner )
            	    {
            	    // InternalSasDsl.g:2521:4: (lv_planner_9_0= ruleDSLPlanner )
            	    // InternalSasDsl.g:2522:5: lv_planner_9_0= ruleDSLPlanner
            	    {

            	    					newCompositeNode(grammarAccess.getDSLControllerAccess().getPlannerDSLPlannerParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_planner_9_0=ruleDSLPlanner();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"planner",
            	    						lv_planner_9_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLPlanner");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalSasDsl.g:2539:3: ( (lv_executor_10_0= ruleDSLExecutor ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSasDsl.g:2540:4: (lv_executor_10_0= ruleDSLExecutor )
            	    {
            	    // InternalSasDsl.g:2540:4: (lv_executor_10_0= ruleDSLExecutor )
            	    // InternalSasDsl.g:2541:5: lv_executor_10_0= ruleDSLExecutor
            	    {

            	    					newCompositeNode(grammarAccess.getDSLControllerAccess().getExecutorDSLExecutorParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_executor_10_0=ruleDSLExecutor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"executor",
            	    						lv_executor_10_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLExecutor");
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

            // InternalSasDsl.g:2558:3: ( (lv_knowledge_11_0= ruleDSLKnowledge ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSasDsl.g:2559:4: (lv_knowledge_11_0= ruleDSLKnowledge )
            	    {
            	    // InternalSasDsl.g:2559:4: (lv_knowledge_11_0= ruleDSLKnowledge )
            	    // InternalSasDsl.g:2560:5: lv_knowledge_11_0= ruleDSLKnowledge
            	    {

            	    					newCompositeNode(grammarAccess.getDSLControllerAccess().getKnowledgeDSLKnowledgeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_knowledge_11_0=ruleDSLKnowledge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"knowledge",
            	    						lv_knowledge_11_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLKnowledge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDSLControllerAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDSLController"


    // $ANTLR start "entryRuleDSLMonitor"
    // InternalSasDsl.g:2585:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:2585:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:2586:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitor=ruleDSLMonitor();

            state._fsp--;

             current =iv_ruleDSLMonitor; 
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
    // $ANTLR end "entryRuleDSLMonitor"


    // $ANTLR start "ruleDSLMonitor"
    // InternalSasDsl.g:2592:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_monitorinterfaces_3_0 = null;

        EObject lv_monitorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2598:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2599:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2599:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2600:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:2604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2605:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2606:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLMonitorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2622:3: (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSasDsl.g:2623:4: otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2627:4: ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) )
                    // InternalSasDsl.g:2628:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    {
                    // InternalSasDsl.g:2628:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    // InternalSasDsl.g:2629:6: lv_monitorinterfaces_3_0= ruleMonitorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_monitorinterfaces_3_0=ruleMonitorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    						}
                    						add(
                    							current,
                    							"monitorinterfaces",
                    							lv_monitorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2646:4: (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==50) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSasDsl.g:2647:5: otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2651:5: ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    // InternalSasDsl.g:2652:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    {
                    	    // InternalSasDsl.g:2652:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    // InternalSasDsl.g:2653:7: lv_monitorinterfaces_5_0= ruleMonitorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_monitorinterfaces_5_0=ruleMonitorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"monitorinterfaces",
                    	    								lv_monitorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLMonitorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLMonitor"


    // $ANTLR start "entryRuleDSLAnalyzer"
    // InternalSasDsl.g:2680:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:2680:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:2681:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzer=ruleDSLAnalyzer();

            state._fsp--;

             current =iv_ruleDSLAnalyzer; 
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
    // $ANTLR end "entryRuleDSLAnalyzer"


    // $ANTLR start "ruleDSLAnalyzer"
    // InternalSasDsl.g:2687:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_anlyzerinterfaces_3_0 = null;

        EObject lv_anlyzerinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2693:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2694:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2694:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2695:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:2699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2700:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2701:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLAnalyzerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2717:3: (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSasDsl.g:2718:4: otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2722:4: ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) )
                    // InternalSasDsl.g:2723:5: (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface )
                    {
                    // InternalSasDsl.g:2723:5: (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface )
                    // InternalSasDsl.g:2724:6: lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getAnlyzerinterfacesAnalyzerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_anlyzerinterfaces_3_0=ruleAnalyzerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLAnalyzerRule());
                    						}
                    						add(
                    							current,
                    							"anlyzerinterfaces",
                    							lv_anlyzerinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.AnalyzerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2741:4: (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==50) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSasDsl.g:2742:5: otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2746:5: ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) )
                    	    // InternalSasDsl.g:2747:6: (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface )
                    	    {
                    	    // InternalSasDsl.g:2747:6: (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface )
                    	    // InternalSasDsl.g:2748:7: lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getAnlyzerinterfacesAnalyzerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_anlyzerinterfaces_5_0=ruleAnalyzerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLAnalyzerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"anlyzerinterfaces",
                    	    								lv_anlyzerinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.AnalyzerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLAnalyzer"


    // $ANTLR start "entryRuleDSLPlanner"
    // InternalSasDsl.g:2775:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:2775:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:2776:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlanner=ruleDSLPlanner();

            state._fsp--;

             current =iv_ruleDSLPlanner; 
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
    // $ANTLR end "entryRuleDSLPlanner"


    // $ANTLR start "ruleDSLPlanner"
    // InternalSasDsl.g:2782:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_plannerinterfaces_3_0 = null;

        EObject lv_plannerinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2788:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2789:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2789:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2790:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:2794:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2795:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2795:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2796:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLPlannerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2812:3: (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSasDsl.g:2813:4: otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2817:4: ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) )
                    // InternalSasDsl.g:2818:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    {
                    // InternalSasDsl.g:2818:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    // InternalSasDsl.g:2819:6: lv_plannerinterfaces_3_0= rulePlannerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_plannerinterfaces_3_0=rulePlannerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    						}
                    						add(
                    							current,
                    							"plannerinterfaces",
                    							lv_plannerinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2836:4: (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==50) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSasDsl.g:2837:5: otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2841:5: ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    // InternalSasDsl.g:2842:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    {
                    	    // InternalSasDsl.g:2842:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    // InternalSasDsl.g:2843:7: lv_plannerinterfaces_5_0= rulePlannerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_plannerinterfaces_5_0=rulePlannerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"plannerinterfaces",
                    	    								lv_plannerinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLPlannerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLPlanner"


    // $ANTLR start "entryRuleDSLExecutor"
    // InternalSasDsl.g:2870:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:2870:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:2871:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutor=ruleDSLExecutor();

            state._fsp--;

             current =iv_ruleDSLExecutor; 
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
    // $ANTLR end "entryRuleDSLExecutor"


    // $ANTLR start "ruleDSLExecutor"
    // InternalSasDsl.g:2877:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_executorinterfaces_3_0 = null;

        EObject lv_executorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2883:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2884:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2884:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2885:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2890:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLExecutorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2907:3: (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSasDsl.g:2908:4: otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2912:4: ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) )
                    // InternalSasDsl.g:2913:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    {
                    // InternalSasDsl.g:2913:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    // InternalSasDsl.g:2914:6: lv_executorinterfaces_3_0= ruleExecutorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_executorinterfaces_3_0=ruleExecutorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    						}
                    						add(
                    							current,
                    							"executorinterfaces",
                    							lv_executorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2931:4: (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==50) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSasDsl.g:2932:5: otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2936:5: ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    // InternalSasDsl.g:2937:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    {
                    	    // InternalSasDsl.g:2937:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    // InternalSasDsl.g:2938:7: lv_executorinterfaces_5_0= ruleExecutorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_executorinterfaces_5_0=ruleExecutorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"executorinterfaces",
                    	    								lv_executorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLExecutorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLExecutor"


    // $ANTLR start "entryRuleDSLKnowledge"
    // InternalSasDsl.g:2965:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:2965:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:2966:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDSLKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLKnowledge=ruleDSLKnowledge();

            state._fsp--;

             current =iv_ruleDSLKnowledge; 
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
    // $ANTLR end "entryRuleDSLKnowledge"


    // $ANTLR start "ruleDSLKnowledge"
    // InternalSasDsl.g:2972:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= '{' ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+ otherlv_8= '}' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_knowledgeinterfaces_3_0 = null;

        EObject lv_knowledgeinterfaces_5_0 = null;

        EObject lv_referenceInput_7_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2978:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= '{' ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+ otherlv_8= '}' ) )
            // InternalSasDsl.g:2979:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= '{' ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+ otherlv_8= '}' )
            {
            // InternalSasDsl.g:2979:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= '{' ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+ otherlv_8= '}' )
            // InternalSasDsl.g:2980:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= '{' ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:2984:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2985:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2985:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2986:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLKnowledgeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLKnowledgeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3002:3: (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSasDsl.g:3003:4: otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3007:4: ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) )
                    // InternalSasDsl.g:3008:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    {
                    // InternalSasDsl.g:3008:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    // InternalSasDsl.g:3009:6: lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_knowledgeinterfaces_3_0=ruleKnowledgeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    						}
                    						add(
                    							current,
                    							"knowledgeinterfaces",
                    							lv_knowledgeinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3026:4: (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==50) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSasDsl.g:3027:5: otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3031:5: ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    // InternalSasDsl.g:3032:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    {
                    	    // InternalSasDsl.g:3032:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    // InternalSasDsl.g:3033:7: lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_knowledgeinterfaces_5_0=ruleKnowledgeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"knowledgeinterfaces",
                    	    								lv_knowledgeinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLKnowledgeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSasDsl.g:3056:3: ( (lv_referenceInput_7_0= ruleDSLReferenceInput ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSasDsl.g:3057:4: (lv_referenceInput_7_0= ruleDSLReferenceInput )
            	    {
            	    // InternalSasDsl.g:3057:4: (lv_referenceInput_7_0= ruleDSLReferenceInput )
            	    // InternalSasDsl.g:3058:5: lv_referenceInput_7_0= ruleDSLReferenceInput
            	    {

            	    					newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getReferenceInputDSLReferenceInputParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_referenceInput_7_0=ruleDSLReferenceInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"referenceInput",
            	    						lv_referenceInput_7_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLReferenceInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDSLKnowledgeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDSLKnowledge"


    // $ANTLR start "entryRuleDSLSensor"
    // InternalSasDsl.g:3083:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:3083:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:3084:2: iv_ruleDSLSensor= ruleDSLSensor EOF
            {
             newCompositeNode(grammarAccess.getDSLSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLSensor=ruleDSLSensor();

            state._fsp--;

             current =iv_ruleDSLSensor; 
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
    // $ANTLR end "entryRuleDSLSensor"


    // $ANTLR start "ruleDSLSensor"
    // InternalSasDsl.g:3090:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sensorinterfaces_3_0 = null;

        EObject lv_sensorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3096:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3097:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3097:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3098:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:3102:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3103:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3103:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3104:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3120:3: (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSasDsl.g:3121:4: otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3125:4: ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) )
                    // InternalSasDsl.g:3126:5: (lv_sensorinterfaces_3_0= ruleSensorInterface )
                    {
                    // InternalSasDsl.g:3126:5: (lv_sensorinterfaces_3_0= ruleSensorInterface )
                    // InternalSasDsl.g:3127:6: lv_sensorinterfaces_3_0= ruleSensorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLSensorAccess().getSensorinterfacesSensorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_sensorinterfaces_3_0=ruleSensorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLSensorRule());
                    						}
                    						add(
                    							current,
                    							"sensorinterfaces",
                    							lv_sensorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.SensorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3144:4: (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==50) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalSasDsl.g:3145:5: otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLSensorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3149:5: ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) )
                    	    // InternalSasDsl.g:3150:6: (lv_sensorinterfaces_5_0= ruleSensorInterface )
                    	    {
                    	    // InternalSasDsl.g:3150:6: (lv_sensorinterfaces_5_0= ruleSensorInterface )
                    	    // InternalSasDsl.g:3151:7: lv_sensorinterfaces_5_0= ruleSensorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLSensorAccess().getSensorinterfacesSensorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_sensorinterfaces_5_0=ruleSensorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensorinterfaces",
                    	    								lv_sensorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.SensorInterface");
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
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLSensorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLSensor"


    // $ANTLR start "entryRuleDSLEffector"
    // InternalSasDsl.g:3178:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:3178:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:3179:2: iv_ruleDSLEffector= ruleDSLEffector EOF
            {
             newCompositeNode(grammarAccess.getDSLEffectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLEffector=ruleDSLEffector();

            state._fsp--;

             current =iv_ruleDSLEffector; 
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
    // $ANTLR end "entryRuleDSLEffector"


    // $ANTLR start "ruleDSLEffector"
    // InternalSasDsl.g:3185:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_effectorinterfaces_3_0 = null;

        EObject lv_effectorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3191:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3192:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3192:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3193:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:3197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3198:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLEffectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3215:3: (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSasDsl.g:3216:4: otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3220:4: ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) )
                    // InternalSasDsl.g:3221:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    {
                    // InternalSasDsl.g:3221:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    // InternalSasDsl.g:3222:6: lv_effectorinterfaces_3_0= ruleEffectorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_effectorinterfaces_3_0=ruleEffectorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    						}
                    						add(
                    							current,
                    							"effectorinterfaces",
                    							lv_effectorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3239:4: (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==50) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSasDsl.g:3240:5: otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3244:5: ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    // InternalSasDsl.g:3245:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    {
                    	    // InternalSasDsl.g:3245:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    // InternalSasDsl.g:3246:7: lv_effectorinterfaces_5_0= ruleEffectorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_effectorinterfaces_5_0=ruleEffectorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectorinterfaces",
                    	    								lv_effectorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
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
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLEffectorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLEffector"


    // $ANTLR start "entryRuleDSLReferenceInput"
    // InternalSasDsl.g:3273:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:3273:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:3274:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
            {
             newCompositeNode(grammarAccess.getDSLReferenceInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLReferenceInput=ruleDSLReferenceInput();

            state._fsp--;

             current =iv_ruleDSLReferenceInput; 
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
    // $ANTLR end "entryRuleDSLReferenceInput"


    // $ANTLR start "ruleDSLReferenceInput"
    // InternalSasDsl.g:3280:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3286:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3287:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3287:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3288:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:3292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3293:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3294:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLReferenceInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDSLReferenceInput"


    // $ANTLR start "entryRuleDSLMeasuredOutput"
    // InternalSasDsl.g:3318:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:3318:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:3319:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
            {
             newCompositeNode(grammarAccess.getDSLMeasuredOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMeasuredOutput=ruleDSLMeasuredOutput();

            state._fsp--;

             current =iv_ruleDSLMeasuredOutput; 
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
    // $ANTLR end "entryRuleDSLMeasuredOutput"


    // $ANTLR start "ruleDSLMeasuredOutput"
    // InternalSasDsl.g:3325:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3331:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3332:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3332:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3333:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:3337:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3338:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3338:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3339:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDSLMeasuredOutput"


    // $ANTLR start "entryRuleEffectorInterface"
    // InternalSasDsl.g:3363:1: entryRuleEffectorInterface returns [EObject current=null] : iv_ruleEffectorInterface= ruleEffectorInterface EOF ;
    public final EObject entryRuleEffectorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectorInterface = null;


        try {
            // InternalSasDsl.g:3363:58: (iv_ruleEffectorInterface= ruleEffectorInterface EOF )
            // InternalSasDsl.g:3364:2: iv_ruleEffectorInterface= ruleEffectorInterface EOF
            {
             newCompositeNode(grammarAccess.getEffectorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectorInterface=ruleEffectorInterface();

            state._fsp--;

             current =iv_ruleEffectorInterface; 
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
    // $ANTLR end "entryRuleEffectorInterface"


    // $ANTLR start "ruleEffectorInterface"
    // InternalSasDsl.g:3370:1: ruleEffectorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEffectorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3376:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3377:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3377:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3378:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3378:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3379:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEffectorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEffectorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEffectorInterface"


    // $ANTLR start "entryRuleSensorInterface"
    // InternalSasDsl.g:3398:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // InternalSasDsl.g:3398:56: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // InternalSasDsl.g:3399:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
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
    // $ANTLR end "entryRuleSensorInterface"


    // $ANTLR start "ruleSensorInterface"
    // InternalSasDsl.g:3405:1: ruleSensorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3411:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3412:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3412:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3413:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3413:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3414:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSensorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSensorInterface"


    // $ANTLR start "entryRuleMonitorInterface"
    // InternalSasDsl.g:3433:1: entryRuleMonitorInterface returns [EObject current=null] : iv_ruleMonitorInterface= ruleMonitorInterface EOF ;
    public final EObject entryRuleMonitorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorInterface = null;


        try {
            // InternalSasDsl.g:3433:57: (iv_ruleMonitorInterface= ruleMonitorInterface EOF )
            // InternalSasDsl.g:3434:2: iv_ruleMonitorInterface= ruleMonitorInterface EOF
            {
             newCompositeNode(grammarAccess.getMonitorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorInterface=ruleMonitorInterface();

            state._fsp--;

             current =iv_ruleMonitorInterface; 
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
    // $ANTLR end "entryRuleMonitorInterface"


    // $ANTLR start "ruleMonitorInterface"
    // InternalSasDsl.g:3440:1: ruleMonitorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMonitorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3446:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3447:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3447:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3448:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3448:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3449:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMonitorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonitorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleMonitorInterface"


    // $ANTLR start "entryRuleAnalyzerInterface"
    // InternalSasDsl.g:3468:1: entryRuleAnalyzerInterface returns [EObject current=null] : iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF ;
    public final EObject entryRuleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerInterface = null;


        try {
            // InternalSasDsl.g:3468:58: (iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF )
            // InternalSasDsl.g:3469:2: iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF
            {
             newCompositeNode(grammarAccess.getAnalyzerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzerInterface=ruleAnalyzerInterface();

            state._fsp--;

             current =iv_ruleAnalyzerInterface; 
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
    // $ANTLR end "entryRuleAnalyzerInterface"


    // $ANTLR start "ruleAnalyzerInterface"
    // InternalSasDsl.g:3475:1: ruleAnalyzerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3481:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3482:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3482:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3483:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3483:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3484:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnalyzerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAnalyzerInterface"


    // $ANTLR start "entryRulePlannerInterface"
    // InternalSasDsl.g:3503:1: entryRulePlannerInterface returns [EObject current=null] : iv_rulePlannerInterface= rulePlannerInterface EOF ;
    public final EObject entryRulePlannerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannerInterface = null;


        try {
            // InternalSasDsl.g:3503:57: (iv_rulePlannerInterface= rulePlannerInterface EOF )
            // InternalSasDsl.g:3504:2: iv_rulePlannerInterface= rulePlannerInterface EOF
            {
             newCompositeNode(grammarAccess.getPlannerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlannerInterface=rulePlannerInterface();

            state._fsp--;

             current =iv_rulePlannerInterface; 
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
    // $ANTLR end "entryRulePlannerInterface"


    // $ANTLR start "rulePlannerInterface"
    // InternalSasDsl.g:3510:1: rulePlannerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePlannerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3516:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3517:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3517:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3518:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3518:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3519:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPlannerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPlannerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePlannerInterface"


    // $ANTLR start "entryRuleExecutorInterface"
    // InternalSasDsl.g:3538:1: entryRuleExecutorInterface returns [EObject current=null] : iv_ruleExecutorInterface= ruleExecutorInterface EOF ;
    public final EObject entryRuleExecutorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutorInterface = null;


        try {
            // InternalSasDsl.g:3538:58: (iv_ruleExecutorInterface= ruleExecutorInterface EOF )
            // InternalSasDsl.g:3539:2: iv_ruleExecutorInterface= ruleExecutorInterface EOF
            {
             newCompositeNode(grammarAccess.getExecutorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutorInterface=ruleExecutorInterface();

            state._fsp--;

             current =iv_ruleExecutorInterface; 
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
    // $ANTLR end "entryRuleExecutorInterface"


    // $ANTLR start "ruleExecutorInterface"
    // InternalSasDsl.g:3545:1: ruleExecutorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExecutorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3551:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3552:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3552:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3553:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3553:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3554:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExecutorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExecutorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleExecutorInterface"


    // $ANTLR start "entryRuleKnowledgeInterface"
    // InternalSasDsl.g:3573:1: entryRuleKnowledgeInterface returns [EObject current=null] : iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF ;
    public final EObject entryRuleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeInterface = null;


        try {
            // InternalSasDsl.g:3573:59: (iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF )
            // InternalSasDsl.g:3574:2: iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeInterface=ruleKnowledgeInterface();

            state._fsp--;

             current =iv_ruleKnowledgeInterface; 
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
    // $ANTLR end "entryRuleKnowledgeInterface"


    // $ANTLR start "ruleKnowledgeInterface"
    // InternalSasDsl.g:3580:1: ruleKnowledgeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3586:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3587:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3587:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3588:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3588:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3589:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getKnowledgeInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKnowledgeInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleKnowledgeInterface"


    // $ANTLR start "entryRuleControllerInterface"
    // InternalSasDsl.g:3608:1: entryRuleControllerInterface returns [EObject current=null] : iv_ruleControllerInterface= ruleControllerInterface EOF ;
    public final EObject entryRuleControllerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerInterface = null;


        try {
            // InternalSasDsl.g:3608:60: (iv_ruleControllerInterface= ruleControllerInterface EOF )
            // InternalSasDsl.g:3609:2: iv_ruleControllerInterface= ruleControllerInterface EOF
            {
             newCompositeNode(grammarAccess.getControllerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControllerInterface=ruleControllerInterface();

            state._fsp--;

             current =iv_ruleControllerInterface; 
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
    // $ANTLR end "entryRuleControllerInterface"


    // $ANTLR start "ruleControllerInterface"
    // InternalSasDsl.g:3615:1: ruleControllerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControllerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3621:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3622:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3622:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3623:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3623:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3624:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControllerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControllerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleControllerInterface"


    // $ANTLR start "entryRuleFQN"
    // InternalSasDsl.g:3643:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSasDsl.g:3643:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSasDsl.g:3644:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalSasDsl.g:3650:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3656:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSasDsl.g:3657:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSasDsl.g:3657:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSasDsl.g:3658:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSasDsl.g:3665:3: (kw= '.' this_ID_2= RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSasDsl.g:3666:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleFQN"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\2\uffff\1\4\3\uffff\1\25\2\uffff";
    static final String dfa_3s = "\1\24\2\uffff\1\4\3\uffff\1\50\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\3\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "",
            "",
            "\1\7",
            "",
            "",
            "",
            "\1\10\1\uffff\1\10\3\uffff\2\10\4\uffff\2\10\4\uffff\2\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "196:2: ( (otherlv_0= 'controller' this_DSLRuleController_1= ruleDSLRuleController ) | (otherlv_2= 'monitor' this_DSLRuleMonitor_3= ruleDSLRuleMonitor ) | (otherlv_4= 'analyzer' this_DSLRuleAnalyzer_5= ruleDSLRuleAnalyzer ) | (otherlv_6= 'planner' this_DSLRulePlanner_7= ruleDSLRulePlanner ) | (otherlv_8= 'executor' this_DSLRuleExecutor_9= ruleDSLRuleExecutor ) | (otherlv_10= 'sensor' this_DSLRuleMO_11= ruleDSLRuleMO ) | (otherlv_12= 'analyzer' this_DSLRuleRI_13= ruleDSLRuleRI ) )";
        }
    }
    static final String dfa_7s = "\1\4\1\25\10\uffff";
    static final String dfa_8s = "\1\4\1\36\10\uffff";
    static final String dfa_9s = "\2\uffff\1\7\1\2\1\4\1\6\1\1\1\3\1\10\1\5";
    static final String[] dfa_10s = {
            "\1\1",
            "\1\6\1\uffff\1\3\1\uffff\1\7\1\4\1\11\1\5\1\2\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "319:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'must-not-access-monitor' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= 'must-access-monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'through' ( ( ruleFQN ) ) otherlv_9= ';' ) | ( ( (otherlv_10= RULE_ID ) ) otherlv_11= 'must-not-access-analyzer' ( (otherlv_12= RULE_ID ) ) otherlv_13= ';' ) | ( ( (otherlv_14= RULE_ID ) ) otherlv_15= 'must-access-analyzer' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'through' ( ( ruleFQN ) ) otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) otherlv_21= 'must-not-access-planner' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) otherlv_25= 'must-access-planner' ( (otherlv_26= RULE_ID ) ) otherlv_27= 'through' ( ( ruleFQN ) ) otherlv_29= ';' ) | ( ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-not-access-executor' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) | ( ( (otherlv_34= RULE_ID ) ) otherlv_35= 'must-access-executor' ( (otherlv_36= RULE_ID ) ) otherlv_37= 'through' ( ( ruleFQN ) ) otherlv_39= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001080000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000001000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000002L});

}