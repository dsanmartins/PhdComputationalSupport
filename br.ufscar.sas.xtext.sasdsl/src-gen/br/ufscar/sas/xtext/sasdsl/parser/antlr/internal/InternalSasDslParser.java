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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "'}'", "'Compositions'", "'Restrictions'", "'executor'", "'must-not-access-effector'", "';'", "'must-access-effector'", "'through-interface'", "'monitor'", "'must-not-access-sensor'", "'must-access-sensor'", "'analyzer'", "'must-not-access-monitor'", "'must-access-monitor'", "'must-not-access-planner'", "'must-access-planner'", "'must-not-access-executor'", "'must-access-executor'", "'must-not-access-knowledge'", "'must-access-knowledge'", "'planner'", "'managing'", "'must-not-access-managed'", "'must-access-managed'", "'sensor'", "'must-be-in-managed'", "'reference-input'", "'must-be-in-knowledge'", "'effector'", "'must-be-in-control-loop'", "'must-be-in-managing'", "'control-loop'", "'must-be-in-control-loop-manager'", "'control-loop-manager'", "'measured-output'", "'knowledge'", "'Managing'", "'Managed'", "'with-interface'", "','", "'ControlLoopManager'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'ReferenceInput'", "'MeasuredOutput'"
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
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_abstractions_2_0 = null;

        EObject lv_compositions_6_0 = null;

        EObject lv_restrictions_10_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' ) )
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' )
            {
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' )
            // InternalSasDsl.g:79:3: otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSasDsl.g:87:3: ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=49 && LA1_0<=50)||LA1_0==53||(LA1_0>=58 && LA1_0<=67)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstraction )
            	    {
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstraction )
            	    // InternalSasDsl.g:89:5: lv_abstractions_2_0= ruleDSLAbstraction
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDSLAbstractionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstractions_2_0=ruleDSLAbstraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractions",
            	    						lv_abstractions_2_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLAbstraction");
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

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureDefinitionAccess().getCompositionsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSasDsl.g:118:3: ( (lv_compositions_6_0= ruleDSLComposition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==21||LA2_0==24||LA2_0==33||LA2_0==37||LA2_0==39||LA2_0==41||LA2_0==44||(LA2_0>=46 && LA2_0<=48)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSasDsl.g:119:4: (lv_compositions_6_0= ruleDSLComposition )
            	    {
            	    // InternalSasDsl.g:119:4: (lv_compositions_6_0= ruleDSLComposition )
            	    // InternalSasDsl.g:120:5: lv_compositions_6_0= ruleDSLComposition
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositionsDSLCompositionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_compositions_6_0=ruleDSLComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compositions",
            	    						lv_compositions_6_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSasDsl.g:149:3: ( (lv_restrictions_10_0= ruleDSLRestriction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==21||LA3_0==24||(LA3_0>=33 && LA3_0<=34)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSasDsl.g:150:4: (lv_restrictions_10_0= ruleDSLRestriction )
            	    {
            	    // InternalSasDsl.g:150:4: (lv_restrictions_10_0= ruleDSLRestriction )
            	    // InternalSasDsl.g:151:5: lv_restrictions_10_0= ruleDSLRestriction
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getRestrictionsDSLRestrictionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_restrictions_10_0=ruleDSLRestriction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"restrictions",
            	    						lv_restrictions_10_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLRestriction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleDSLAbstraction"
    // InternalSasDsl.g:176:1: entryRuleDSLAbstraction returns [EObject current=null] : iv_ruleDSLAbstraction= ruleDSLAbstraction EOF ;
    public final EObject entryRuleDSLAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAbstraction = null;


        try {
            // InternalSasDsl.g:176:55: (iv_ruleDSLAbstraction= ruleDSLAbstraction EOF )
            // InternalSasDsl.g:177:2: iv_ruleDSLAbstraction= ruleDSLAbstraction EOF
            {
             newCompositeNode(grammarAccess.getDSLAbstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAbstraction=ruleDSLAbstraction();

            state._fsp--;

             current =iv_ruleDSLAbstraction; 
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
    // $ANTLR end "entryRuleDSLAbstraction"


    // $ANTLR start "ruleDSLAbstraction"
    // InternalSasDsl.g:183:1: ruleDSLAbstraction returns [EObject current=null] : (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLReferenceInput_11= ruleDSLReferenceInput | this_DSLMeasuredOutput_12= ruleDSLMeasuredOutput ) ;
    public final EObject ruleDSLAbstraction() throws RecognitionException {
        EObject current = null;

        EObject this_DSLManaging_0 = null;

        EObject this_DSLManaged_1 = null;

        EObject this_DSLControlLoopManager_2 = null;

        EObject this_DSLControlLoop_3 = null;

        EObject this_DSLMonitor_4 = null;

        EObject this_DSLAnalyzer_5 = null;

        EObject this_DSLPlanner_6 = null;

        EObject this_DSLExecutor_7 = null;

        EObject this_DSLKnowledge_8 = null;

        EObject this_DSLSensor_9 = null;

        EObject this_DSLEffector_10 = null;

        EObject this_DSLReferenceInput_11 = null;

        EObject this_DSLMeasuredOutput_12 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:189:2: ( (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLReferenceInput_11= ruleDSLReferenceInput | this_DSLMeasuredOutput_12= ruleDSLMeasuredOutput ) )
            // InternalSasDsl.g:190:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLReferenceInput_11= ruleDSLReferenceInput | this_DSLMeasuredOutput_12= ruleDSLMeasuredOutput )
            {
            // InternalSasDsl.g:190:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLReferenceInput_11= ruleDSLReferenceInput | this_DSLMeasuredOutput_12= ruleDSLMeasuredOutput )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case 50:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 58:
                {
                alt4=4;
                }
                break;
            case 59:
                {
                alt4=5;
                }
                break;
            case 60:
                {
                alt4=6;
                }
                break;
            case 61:
                {
                alt4=7;
                }
                break;
            case 62:
                {
                alt4=8;
                }
                break;
            case 63:
                {
                alt4=9;
                }
                break;
            case 64:
                {
                alt4=10;
                }
                break;
            case 65:
                {
                alt4=11;
                }
                break;
            case 66:
                {
                alt4=12;
                }
                break;
            case 67:
                {
                alt4=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:191:3: this_DSLManaging_0= ruleDSLManaging
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLManagingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaging_0=ruleDSLManaging();

                    state._fsp--;


                    			current = this_DSLManaging_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:200:3: this_DSLManaged_1= ruleDSLManaged
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLManagedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaged_1=ruleDSLManaged();

                    state._fsp--;


                    			current = this_DSLManaged_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:209:3: this_DSLControlLoopManager_2= ruleDSLControlLoopManager
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLControlLoopManagerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoopManager_2=ruleDSLControlLoopManager();

                    state._fsp--;


                    			current = this_DSLControlLoopManager_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:218:3: this_DSLControlLoop_3= ruleDSLControlLoop
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLControlLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoop_3=ruleDSLControlLoop();

                    state._fsp--;


                    			current = this_DSLControlLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:227:3: this_DSLMonitor_4= ruleDSLMonitor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLMonitorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitor_4=ruleDSLMonitor();

                    state._fsp--;


                    			current = this_DSLMonitor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:236:3: this_DSLAnalyzer_5= ruleDSLAnalyzer
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLAnalyzerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzer_5=ruleDSLAnalyzer();

                    state._fsp--;


                    			current = this_DSLAnalyzer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:245:3: this_DSLPlanner_6= ruleDSLPlanner
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLPlannerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlanner_6=ruleDSLPlanner();

                    state._fsp--;


                    			current = this_DSLPlanner_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:254:3: this_DSLExecutor_7= ruleDSLExecutor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLExecutorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutor_7=ruleDSLExecutor();

                    state._fsp--;


                    			current = this_DSLExecutor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:263:3: this_DSLKnowledge_8= ruleDSLKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLKnowledgeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLKnowledge_8=ruleDSLKnowledge();

                    state._fsp--;


                    			current = this_DSLKnowledge_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:272:3: this_DSLSensor_9= ruleDSLSensor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLSensorParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLSensor_9=ruleDSLSensor();

                    state._fsp--;


                    			current = this_DSLSensor_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:281:3: this_DSLEffector_10= ruleDSLEffector
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLEffectorParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLEffector_10=ruleDSLEffector();

                    state._fsp--;


                    			current = this_DSLEffector_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:290:3: this_DSLReferenceInput_11= ruleDSLReferenceInput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLReferenceInputParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLReferenceInput_11=ruleDSLReferenceInput();

                    state._fsp--;


                    			current = this_DSLReferenceInput_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:299:3: this_DSLMeasuredOutput_12= ruleDSLMeasuredOutput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLMeasuredOutputParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMeasuredOutput_12=ruleDSLMeasuredOutput();

                    state._fsp--;


                    			current = this_DSLMeasuredOutput_12;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDSLAbstraction"


    // $ANTLR start "entryRuleDSLComposition"
    // InternalSasDsl.g:311:1: entryRuleDSLComposition returns [EObject current=null] : iv_ruleDSLComposition= ruleDSLComposition EOF ;
    public final EObject entryRuleDSLComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLComposition = null;


        try {
            // InternalSasDsl.g:311:55: (iv_ruleDSLComposition= ruleDSLComposition EOF )
            // InternalSasDsl.g:312:2: iv_ruleDSLComposition= ruleDSLComposition EOF
            {
             newCompositeNode(grammarAccess.getDSLCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLComposition=ruleDSLComposition();

            state._fsp--;

             current =iv_ruleDSLComposition; 
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
    // $ANTLR end "entryRuleDSLComposition"


    // $ANTLR start "ruleDSLComposition"
    // InternalSasDsl.g:318:1: ruleDSLComposition returns [EObject current=null] : (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo ) ;
    public final EObject ruleDSLComposition() throws RecognitionException {
        EObject current = null;

        EObject this_DSLSensorBelongsTo_0 = null;

        EObject this_DSLReferenceInputBelongsTo_1 = null;

        EObject this_DSLEffectorBelongsTo_2 = null;

        EObject this_DSLMonitorBelongsTo1_3 = null;

        EObject this_DSLMonitorBelongsTo2_4 = null;

        EObject this_DSLAnalyzerBelongsTo1_5 = null;

        EObject this_DSLAnalyzerBelongsTo2_6 = null;

        EObject this_DSLPlannerBelongsTo1_7 = null;

        EObject this_DSLPlannerBelongsTo2_8 = null;

        EObject this_DSLExecutorBelongsTo1_9 = null;

        EObject this_DSLExecutorBelongsTo2_10 = null;

        EObject this_DSLClBelongsTo1_11 = null;

        EObject this_DSLClBelongsTo2_12 = null;

        EObject this_DSLClmBelongsTo_13 = null;

        EObject this_DSLMeasuredOuputBelongsTo_14 = null;

        EObject this_DSLKnowledgeBelongsTo_15 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:324:2: ( (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo ) )
            // InternalSasDsl.g:325:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo )
            {
            // InternalSasDsl.g:325:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo )
            int alt5=16;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSasDsl.g:326:3: this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLSensorBelongsToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLSensorBelongsTo_0=ruleDSLSensorBelongsTo();

                    state._fsp--;


                    			current = this_DSLSensorBelongsTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:335:3: this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLReferenceInputBelongsToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLReferenceInputBelongsTo_1=ruleDSLReferenceInputBelongsTo();

                    state._fsp--;


                    			current = this_DSLReferenceInputBelongsTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:344:3: this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLEffectorBelongsToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLEffectorBelongsTo_2=ruleDSLEffectorBelongsTo();

                    state._fsp--;


                    			current = this_DSLEffectorBelongsTo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:353:3: this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMonitorBelongsTo1ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitorBelongsTo1_3=ruleDSLMonitorBelongsTo1();

                    state._fsp--;


                    			current = this_DSLMonitorBelongsTo1_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:362:3: this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMonitorBelongsTo2ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitorBelongsTo2_4=ruleDSLMonitorBelongsTo2();

                    state._fsp--;


                    			current = this_DSLMonitorBelongsTo2_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:371:3: this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLAnalyzerBelongsTo1ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzerBelongsTo1_5=ruleDSLAnalyzerBelongsTo1();

                    state._fsp--;


                    			current = this_DSLAnalyzerBelongsTo1_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:380:3: this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLAnalyzerBelongsTo2ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzerBelongsTo2_6=ruleDSLAnalyzerBelongsTo2();

                    state._fsp--;


                    			current = this_DSLAnalyzerBelongsTo2_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:389:3: this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLPlannerBelongsTo1ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlannerBelongsTo1_7=ruleDSLPlannerBelongsTo1();

                    state._fsp--;


                    			current = this_DSLPlannerBelongsTo1_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:398:3: this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLPlannerBelongsTo2ParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlannerBelongsTo2_8=ruleDSLPlannerBelongsTo2();

                    state._fsp--;


                    			current = this_DSLPlannerBelongsTo2_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:407:3: this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLExecutorBelongsTo1ParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutorBelongsTo1_9=ruleDSLExecutorBelongsTo1();

                    state._fsp--;


                    			current = this_DSLExecutorBelongsTo1_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:416:3: this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLExecutorBelongsTo2ParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutorBelongsTo2_10=ruleDSLExecutorBelongsTo2();

                    state._fsp--;


                    			current = this_DSLExecutorBelongsTo2_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:425:3: this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClBelongsTo1ParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClBelongsTo1_11=ruleDSLClBelongsTo1();

                    state._fsp--;


                    			current = this_DSLClBelongsTo1_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:434:3: this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClBelongsTo2ParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClBelongsTo2_12=ruleDSLClBelongsTo2();

                    state._fsp--;


                    			current = this_DSLClBelongsTo2_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:443:3: this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClmBelongsToParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClmBelongsTo_13=ruleDSLClmBelongsTo();

                    state._fsp--;


                    			current = this_DSLClmBelongsTo_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:452:3: this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMeasuredOuputBelongsToParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMeasuredOuputBelongsTo_14=ruleDSLMeasuredOuputBelongsTo();

                    state._fsp--;


                    			current = this_DSLMeasuredOuputBelongsTo_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalSasDsl.g:461:3: this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLKnowledgeBelongsToParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLKnowledgeBelongsTo_15=ruleDSLKnowledgeBelongsTo();

                    state._fsp--;


                    			current = this_DSLKnowledgeBelongsTo_15;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDSLComposition"


    // $ANTLR start "entryRuleDSLRestriction"
    // InternalSasDsl.g:473:1: entryRuleDSLRestriction returns [EObject current=null] : iv_ruleDSLRestriction= ruleDSLRestriction EOF ;
    public final EObject entryRuleDSLRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestriction = null;


        try {
            // InternalSasDsl.g:473:55: (iv_ruleDSLRestriction= ruleDSLRestriction EOF )
            // InternalSasDsl.g:474:2: iv_ruleDSLRestriction= ruleDSLRestriction EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestriction=ruleDSLRestriction();

            state._fsp--;

             current =iv_ruleDSLRestriction; 
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
    // $ANTLR end "entryRuleDSLRestriction"


    // $ANTLR start "ruleDSLRestriction"
    // InternalSasDsl.g:480:1: ruleDSLRestriction returns [EObject current=null] : (this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge | this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged | this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor | this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector ) ;
    public final EObject ruleDSLRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_DSLRestrictionMonitor_0 = null;

        EObject this_DSLRestrictionPlanner_1 = null;

        EObject this_DSLRestrictionExecutor_2 = null;

        EObject this_DSLRestrictionKnowledge_3 = null;

        EObject this_DSLRestrictionManaged_4 = null;

        EObject this_DSLRestrictionSensor_5 = null;

        EObject this_DSLRestrictionEffector_6 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:486:2: ( (this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge | this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged | this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor | this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector ) )
            // InternalSasDsl.g:487:2: (this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge | this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged | this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor | this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector )
            {
            // InternalSasDsl.g:487:2: (this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge | this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged | this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor | this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:488:3: this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionMonitorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionMonitor_0=ruleDSLRestrictionMonitor();

                    state._fsp--;


                    			current = this_DSLRestrictionMonitor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:497:3: this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionPlannerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionPlanner_1=ruleDSLRestrictionPlanner();

                    state._fsp--;


                    			current = this_DSLRestrictionPlanner_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:506:3: this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionExecutorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionExecutor_2=ruleDSLRestrictionExecutor();

                    state._fsp--;


                    			current = this_DSLRestrictionExecutor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:515:3: this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionKnowledgeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionKnowledge_3=ruleDSLRestrictionKnowledge();

                    state._fsp--;


                    			current = this_DSLRestrictionKnowledge_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:524:3: this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionManagedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionManaged_4=ruleDSLRestrictionManaged();

                    state._fsp--;


                    			current = this_DSLRestrictionManaged_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:533:3: this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionSensorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionSensor_5=ruleDSLRestrictionSensor();

                    state._fsp--;


                    			current = this_DSLRestrictionSensor_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:542:3: this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionEffectorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionEffector_6=ruleDSLRestrictionEffector();

                    state._fsp--;


                    			current = this_DSLRestrictionEffector_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDSLRestriction"


    // $ANTLR start "entryRuleDSLRestrictionEffector"
    // InternalSasDsl.g:554:1: entryRuleDSLRestrictionEffector returns [EObject current=null] : iv_ruleDSLRestrictionEffector= ruleDSLRestrictionEffector EOF ;
    public final EObject entryRuleDSLRestrictionEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionEffector = null;


        try {
            // InternalSasDsl.g:554:63: (iv_ruleDSLRestrictionEffector= ruleDSLRestrictionEffector EOF )
            // InternalSasDsl.g:555:2: iv_ruleDSLRestrictionEffector= ruleDSLRestrictionEffector EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionEffectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionEffector=ruleDSLRestrictionEffector();

            state._fsp--;

             current =iv_ruleDSLRestrictionEffector; 
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
    // $ANTLR end "entryRuleDSLRestrictionEffector"


    // $ANTLR start "ruleDSLRestrictionEffector"
    // InternalSasDsl.g:561:1: ruleDSLRestrictionEffector returns [EObject current=null] : ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:567:2: ( ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:568:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:568:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==19) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==17) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:569:3: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:569:3: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:570:4: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-effector' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionEffectorAccess().getExecutorKeyword_0_0());
                    			
                    // InternalSasDsl.g:574:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:575:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:575:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:576:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionEffectorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionEffectorAccess().getTDSLExecutorCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionEffectorAccess().getMustNotAccessEffectorKeyword_0_2());
                    			
                    // InternalSasDsl.g:591:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:592:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:592:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:593:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionEffectorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionEffectorAccess().getEffectorDSLEffectorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionEffectorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:610:3: (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:610:3: (otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:611:4: otherlv_5= 'executor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-effector' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionEffectorAccess().getExecutorKeyword_1_0());
                    			
                    // InternalSasDsl.g:615:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:616:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:616:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:617:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionEffectorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionEffectorAccess().getTDSLExecutorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionEffectorAccess().getMustAccessEffectorKeyword_1_2());
                    			
                    // InternalSasDsl.g:632:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:633:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:633:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:634:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionEffectorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionEffectorAccess().getEffectorDSLEffectorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionEffectorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:649:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:650:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:650:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:651:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionEffectorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionEffectorAccess().getEffectorinterfaceEffectorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionEffectorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionEffector"


    // $ANTLR start "entryRuleDSLRestrictionSensor"
    // InternalSasDsl.g:671:1: entryRuleDSLRestrictionSensor returns [EObject current=null] : iv_ruleDSLRestrictionSensor= ruleDSLRestrictionSensor EOF ;
    public final EObject entryRuleDSLRestrictionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionSensor = null;


        try {
            // InternalSasDsl.g:671:61: (iv_ruleDSLRestrictionSensor= ruleDSLRestrictionSensor EOF )
            // InternalSasDsl.g:672:2: iv_ruleDSLRestrictionSensor= ruleDSLRestrictionSensor EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionSensor=ruleDSLRestrictionSensor();

            state._fsp--;

             current =iv_ruleDSLRestrictionSensor; 
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
    // $ANTLR end "entryRuleDSLRestrictionSensor"


    // $ANTLR start "ruleDSLRestrictionSensor"
    // InternalSasDsl.g:678:1: ruleDSLRestrictionSensor returns [EObject current=null] : ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:684:2: ( ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:685:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:685:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==22) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==23) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
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
                    // InternalSasDsl.g:686:3: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:686:3: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:687:4: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-sensor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionSensorAccess().getMonitorKeyword_0_0());
                    			
                    // InternalSasDsl.g:691:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:692:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:692:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:693:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionSensorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionSensorAccess().getTDSLMonitorCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionSensorAccess().getMustNotAccessSensorKeyword_0_2());
                    			
                    // InternalSasDsl.g:708:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:709:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:709:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:710:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionSensorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionSensorAccess().getSensorDSLSensorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionSensorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:727:3: (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:727:3: (otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:728:4: otherlv_5= 'monitor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-sensor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionSensorAccess().getMonitorKeyword_1_0());
                    			
                    // InternalSasDsl.g:732:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:733:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:733:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:734:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionSensorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionSensorAccess().getTDSLMonitorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionSensorAccess().getMustAccessSensorKeyword_1_2());
                    			
                    // InternalSasDsl.g:749:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:750:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:750:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:751:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionSensorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionSensorAccess().getSensorDSLSensorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionSensorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:766:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:767:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:767:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:768:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionSensorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionSensorAccess().getSensorinterfaceSensorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionSensorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionSensor"


    // $ANTLR start "entryRuleDSLRestrictionMonitor"
    // InternalSasDsl.g:788:1: entryRuleDSLRestrictionMonitor returns [EObject current=null] : iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF ;
    public final EObject entryRuleDSLRestrictionMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionMonitor = null;


        try {
            // InternalSasDsl.g:788:62: (iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF )
            // InternalSasDsl.g:789:2: iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionMonitor=ruleDSLRestrictionMonitor();

            state._fsp--;

             current =iv_ruleDSLRestrictionMonitor; 
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
    // $ANTLR end "entryRuleDSLRestrictionMonitor"


    // $ANTLR start "ruleDSLRestrictionMonitor"
    // InternalSasDsl.g:795:1: ruleDSLRestrictionMonitor returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:801:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:802:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:802:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==26) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==25) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:803:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:803:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:804:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionMonitorAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:808:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:809:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:809:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:810:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionMonitorAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionMonitorAccess().getMustNotAccessMonitorKeyword_0_2());
                    			
                    // InternalSasDsl.g:825:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:826:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:826:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:827:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorDSLMonitorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionMonitorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:844:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:844:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:845:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionMonitorAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:849:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:850:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:850:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:851:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionMonitorAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionMonitorAccess().getMustAccessMonitorKeyword_1_2());
                    			
                    // InternalSasDsl.g:866:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:867:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:867:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:868:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorDSLMonitorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionMonitorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:883:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:884:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:884:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:885:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorinterfaceMonitorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionMonitorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionMonitor"


    // $ANTLR start "entryRuleDSLRestrictionPlanner"
    // InternalSasDsl.g:905:1: entryRuleDSLRestrictionPlanner returns [EObject current=null] : iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF ;
    public final EObject entryRuleDSLRestrictionPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionPlanner = null;


        try {
            // InternalSasDsl.g:905:62: (iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF )
            // InternalSasDsl.g:906:2: iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionPlanner=ruleDSLRestrictionPlanner();

            state._fsp--;

             current =iv_ruleDSLRestrictionPlanner; 
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
    // $ANTLR end "entryRuleDSLRestrictionPlanner"


    // $ANTLR start "ruleDSLRestrictionPlanner"
    // InternalSasDsl.g:912:1: ruleDSLRestrictionPlanner returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:918:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:919:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:919:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==28) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==27) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

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
                    // InternalSasDsl.g:920:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:920:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:921:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionPlannerAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:925:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:926:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:926:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:927:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionPlannerAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionPlannerAccess().getMustNotAccessPlannerKeyword_0_2());
                    			
                    // InternalSasDsl.g:942:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:943:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:943:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:944:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerDSLPlannerCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionPlannerAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:961:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:961:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:962:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionPlannerAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:966:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:967:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:967:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:968:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionPlannerAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionPlannerAccess().getMustAccessPlannerKeyword_1_2());
                    			
                    // InternalSasDsl.g:983:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:984:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:984:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:985:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerDSLPlannerCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionPlannerAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1000:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1001:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1001:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1002:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerinterfacePlannerInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionPlannerAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionPlanner"


    // $ANTLR start "entryRuleDSLRestrictionExecutor"
    // InternalSasDsl.g:1022:1: entryRuleDSLRestrictionExecutor returns [EObject current=null] : iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF ;
    public final EObject entryRuleDSLRestrictionExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionExecutor = null;


        try {
            // InternalSasDsl.g:1022:63: (iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF )
            // InternalSasDsl.g:1023:2: iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionExecutor=ruleDSLRestrictionExecutor();

            state._fsp--;

             current =iv_ruleDSLRestrictionExecutor; 
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
    // $ANTLR end "entryRuleDSLRestrictionExecutor"


    // $ANTLR start "ruleDSLRestrictionExecutor"
    // InternalSasDsl.g:1029:1: ruleDSLRestrictionExecutor returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1035:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:1036:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:1036:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==30) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==29) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:1037:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1037:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1038:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionExecutorAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:1042:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1043:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1043:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1044:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionExecutorAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionExecutorAccess().getMustNotAccessExecutorKeyword_0_2());
                    			
                    // InternalSasDsl.g:1059:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1060:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1060:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1061:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorDSLExecutorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionExecutorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1078:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1078:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1079:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionExecutorAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:1083:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1084:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1084:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1085:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionExecutorAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionExecutorAccess().getMustAccessExecutorKeyword_1_2());
                    			
                    // InternalSasDsl.g:1100:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1101:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1101:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1102:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorDSLExecutorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionExecutorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1117:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1118:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1118:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1119:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorinterfaceExecutorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionExecutorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionExecutor"


    // $ANTLR start "entryRuleDSLRestrictionKnowledge"
    // InternalSasDsl.g:1139:1: entryRuleDSLRestrictionKnowledge returns [EObject current=null] : iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF ;
    public final EObject entryRuleDSLRestrictionKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionKnowledge = null;


        try {
            // InternalSasDsl.g:1139:64: (iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF )
            // InternalSasDsl.g:1140:2: iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionKnowledge=ruleDSLRestrictionKnowledge();

            state._fsp--;

             current =iv_ruleDSLRestrictionKnowledge; 
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
    // $ANTLR end "entryRuleDSLRestrictionKnowledge"


    // $ANTLR start "ruleDSLRestrictionKnowledge"
    // InternalSasDsl.g:1146:1: ruleDSLRestrictionKnowledge returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) ) ;
    public final EObject ruleDSLRestrictionKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1152:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) ) )
            // InternalSasDsl.g:1153:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) )
            {
            // InternalSasDsl.g:1153:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==31) ) {
                        alt12=1;
                    }
                    else if ( (LA12_3==32) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==33) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==RULE_ID) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==32) ) {
                        alt12=4;
                    }
                    else if ( (LA12_4==31) ) {
                        alt12=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSasDsl.g:1154:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1154:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1155:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionKnowledgeAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:1159:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1160:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1160:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1161:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustNotAccessKnowledgeKeyword_0_2());
                    			
                    // InternalSasDsl.g:1176:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1177:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1177:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1178:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1195:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1195:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1196:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionKnowledgeAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:1200:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1201:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1201:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1202:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustAccessKnowledgeKeyword_1_2());
                    			
                    // InternalSasDsl.g:1217:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1218:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1218:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1219:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionKnowledgeAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1234:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1235:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1235:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1236:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1253:3: (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // InternalSasDsl.g:1253:3: (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // InternalSasDsl.g:1254:4: otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getDSLRestrictionKnowledgeAccess().getPlannerKeyword_2_0());
                    			
                    // InternalSasDsl.g:1258:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSasDsl.g:1259:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSasDsl.g:1259:5: (otherlv_13= RULE_ID )
                    // InternalSasDsl.g:1260:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_13, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLPlannerCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustNotAccessKnowledgeKeyword_2_2());
                    			
                    // InternalSasDsl.g:1275:4: ( (otherlv_15= RULE_ID ) )
                    // InternalSasDsl.g:1276:5: (otherlv_15= RULE_ID )
                    {
                    // InternalSasDsl.g:1276:5: (otherlv_15= RULE_ID )
                    // InternalSasDsl.g:1277:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_15, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1294:3: (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:1294:3: (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:1295:4: otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRestrictionKnowledgeAccess().getPlannerKeyword_3_0());
                    			
                    // InternalSasDsl.g:1299:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSasDsl.g:1300:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSasDsl.g:1300:5: (otherlv_18= RULE_ID )
                    // InternalSasDsl.g:1301:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_18, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLPlannerCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustAccessKnowledgeKeyword_3_2());
                    			
                    // InternalSasDsl.g:1316:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1317:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1317:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1318:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRestrictionKnowledgeAccess().getThroughInterfaceKeyword_3_4());
                    			
                    // InternalSasDsl.g:1333:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1334:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1334:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1335:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_3_5_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_3_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionKnowledge"


    // $ANTLR start "entryRuleDSLRestrictionManaged"
    // InternalSasDsl.g:1355:1: entryRuleDSLRestrictionManaged returns [EObject current=null] : iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF ;
    public final EObject entryRuleDSLRestrictionManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionManaged = null;


        try {
            // InternalSasDsl.g:1355:62: (iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF )
            // InternalSasDsl.g:1356:2: iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionManagedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionManaged=ruleDSLRestrictionManaged();

            state._fsp--;

             current =iv_ruleDSLRestrictionManaged; 
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
    // $ANTLR end "entryRuleDSLRestrictionManaged"


    // $ANTLR start "ruleDSLRestrictionManaged"
    // InternalSasDsl.g:1362:1: ruleDSLRestrictionManaged returns [EObject current=null] : ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1368:2: ( ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:1369:2: ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:1369:2: ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==36) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==35) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSasDsl.g:1370:3: (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1370:3: (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1371:4: otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionManagedAccess().getManagingKeyword_0_0());
                    			
                    // InternalSasDsl.g:1375:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1376:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1376:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1377:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionManagedAccess().getTDSLManagingCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionManagedAccess().getMustNotAccessManagedKeyword_0_2());
                    			
                    // InternalSasDsl.g:1392:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1393:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1393:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1394:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionManagedAccess().getManagedDSLManagedCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionManagedAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1411:3: (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1411:3: (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1412:4: otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionManagedAccess().getManagingKeyword_1_0());
                    			
                    // InternalSasDsl.g:1416:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1417:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1417:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1418:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionManagedAccess().getTDSLManagingCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionManagedAccess().getMustAccessManagedKeyword_1_2());
                    			
                    // InternalSasDsl.g:1433:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1434:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1434:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1435:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionManagedAccess().getManagedDSLManagedCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionManagedAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1450:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1451:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1451:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1452:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionManagedAccess().getManagedinterfaceManagedInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionManagedAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionManaged"


    // $ANTLR start "entryRuleDSLSensorBelongsTo"
    // InternalSasDsl.g:1472:1: entryRuleDSLSensorBelongsTo returns [EObject current=null] : iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF ;
    public final EObject entryRuleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensorBelongsTo = null;


        try {
            // InternalSasDsl.g:1472:59: (iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF )
            // InternalSasDsl.g:1473:2: iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLSensorBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLSensorBelongsTo=ruleDSLSensorBelongsTo();

            state._fsp--;

             current =iv_ruleDSLSensorBelongsTo; 
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
    // $ANTLR end "entryRuleDSLSensorBelongsTo"


    // $ANTLR start "ruleDSLSensorBelongsTo"
    // InternalSasDsl.g:1479:1: ruleDSLSensorBelongsTo returns [EObject current=null] : (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1485:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1486:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1486:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1487:3: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorBelongsToAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:1491:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1492:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1492:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1493:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLSensorBelongsToAccess().getSensorDSLSensorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLSensorBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:1508:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1509:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1509:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1510:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLSensorBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLSensorBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLSensorBelongsTo"


    // $ANTLR start "entryRuleDSLReferenceInputBelongsTo"
    // InternalSasDsl.g:1529:1: entryRuleDSLReferenceInputBelongsTo returns [EObject current=null] : iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF ;
    public final EObject entryRuleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInputBelongsTo = null;


        try {
            // InternalSasDsl.g:1529:67: (iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF )
            // InternalSasDsl.g:1530:2: iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLReferenceInputBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLReferenceInputBelongsTo=ruleDSLReferenceInputBelongsTo();

            state._fsp--;

             current =iv_ruleDSLReferenceInputBelongsTo; 
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
    // $ANTLR end "entryRuleDSLReferenceInputBelongsTo"


    // $ANTLR start "ruleDSLReferenceInputBelongsTo"
    // InternalSasDsl.g:1536:1: ruleDSLReferenceInputBelongsTo returns [EObject current=null] : (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1542:2: ( (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1543:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1543:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1544:3: otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:1548:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1549:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1549:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1550:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceDSLReferenceInputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputBelongsToAccess().getMustBeInKnowledgeKeyword_2());
            		
            // InternalSasDsl.g:1565:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1566:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1566:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1567:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLReferenceInputBelongsToAccess().getKnowledgeDSLKnowledgeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLReferenceInputBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLReferenceInputBelongsTo"


    // $ANTLR start "entryRuleDSLEffectorBelongsTo"
    // InternalSasDsl.g:1586:1: entryRuleDSLEffectorBelongsTo returns [EObject current=null] : iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF ;
    public final EObject entryRuleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffectorBelongsTo = null;


        try {
            // InternalSasDsl.g:1586:61: (iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF )
            // InternalSasDsl.g:1587:2: iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLEffectorBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLEffectorBelongsTo=ruleDSLEffectorBelongsTo();

            state._fsp--;

             current =iv_ruleDSLEffectorBelongsTo; 
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
    // $ANTLR end "entryRuleDSLEffectorBelongsTo"


    // $ANTLR start "ruleDSLEffectorBelongsTo"
    // InternalSasDsl.g:1593:1: ruleDSLEffectorBelongsTo returns [EObject current=null] : (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1599:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1600:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1600:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1601:3: otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:1605:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1606:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1606:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1607:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorDSLEffectorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLEffectorBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:1622:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1623:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1623:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1624:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLEffectorBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLEffectorBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLEffectorBelongsTo"


    // $ANTLR start "entryRuleDSLMonitorBelongsTo1"
    // InternalSasDsl.g:1643:1: entryRuleDSLMonitorBelongsTo1 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1643:61: (iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF )
            // InternalSasDsl.g:1644:2: iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitorBelongsTo1=ruleDSLMonitorBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLMonitorBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLMonitorBelongsTo1"


    // $ANTLR start "ruleDSLMonitorBelongsTo1"
    // InternalSasDsl.g:1650:1: ruleDSLMonitorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1656:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1657:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1657:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1658:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1662:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1663:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1663:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1664:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1679:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1680:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1680:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1681:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMonitorBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMonitorBelongsTo1"


    // $ANTLR start "entryRuleDSLMonitorBelongsTo2"
    // InternalSasDsl.g:1700:1: entryRuleDSLMonitorBelongsTo2 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1700:61: (iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF )
            // InternalSasDsl.g:1701:2: iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitorBelongsTo2=ruleDSLMonitorBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLMonitorBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLMonitorBelongsTo2"


    // $ANTLR start "ruleDSLMonitorBelongsTo2"
    // InternalSasDsl.g:1707:1: ruleDSLMonitorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1713:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1714:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1714:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1715:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1719:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1720:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1720:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1721:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1736:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1737:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1737:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1738:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMonitorBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMonitorBelongsTo2"


    // $ANTLR start "entryRuleDSLAnalyzerBelongsTo1"
    // InternalSasDsl.g:1757:1: entryRuleDSLAnalyzerBelongsTo1 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1757:62: (iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF )
            // InternalSasDsl.g:1758:2: iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzerBelongsTo1=ruleDSLAnalyzerBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLAnalyzerBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLAnalyzerBelongsTo1"


    // $ANTLR start "ruleDSLAnalyzerBelongsTo1"
    // InternalSasDsl.g:1764:1: ruleDSLAnalyzerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1770:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1771:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1771:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1772:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1776:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1777:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1777:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1778:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1793:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1794:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1794:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1795:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLAnalyzerBelongsTo1"


    // $ANTLR start "entryRuleDSLAnalyzerBelongsTo2"
    // InternalSasDsl.g:1814:1: entryRuleDSLAnalyzerBelongsTo2 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1814:62: (iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF )
            // InternalSasDsl.g:1815:2: iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzerBelongsTo2=ruleDSLAnalyzerBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLAnalyzerBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLAnalyzerBelongsTo2"


    // $ANTLR start "ruleDSLAnalyzerBelongsTo2"
    // InternalSasDsl.g:1821:1: ruleDSLAnalyzerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1827:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1828:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1828:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1829:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1833:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1834:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1834:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1835:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1850:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1851:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1851:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1852:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLAnalyzerBelongsTo2"


    // $ANTLR start "entryRuleDSLPlannerBelongsTo1"
    // InternalSasDsl.g:1871:1: entryRuleDSLPlannerBelongsTo1 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1871:61: (iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF )
            // InternalSasDsl.g:1872:2: iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlannerBelongsTo1=ruleDSLPlannerBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLPlannerBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLPlannerBelongsTo1"


    // $ANTLR start "ruleDSLPlannerBelongsTo1"
    // InternalSasDsl.g:1878:1: ruleDSLPlannerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1884:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1885:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1885:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1886:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1890:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1891:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1891:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1892:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1907:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1908:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1908:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1909:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLPlannerBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLPlannerBelongsTo1"


    // $ANTLR start "entryRuleDSLPlannerBelongsTo2"
    // InternalSasDsl.g:1928:1: entryRuleDSLPlannerBelongsTo2 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1928:61: (iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF )
            // InternalSasDsl.g:1929:2: iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlannerBelongsTo2=ruleDSLPlannerBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLPlannerBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLPlannerBelongsTo2"


    // $ANTLR start "ruleDSLPlannerBelongsTo2"
    // InternalSasDsl.g:1935:1: ruleDSLPlannerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1941:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1942:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1942:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1943:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1947:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1948:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1948:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1949:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1964:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1965:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1965:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1966:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLPlannerBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLPlannerBelongsTo2"


    // $ANTLR start "entryRuleDSLExecutorBelongsTo1"
    // InternalSasDsl.g:1985:1: entryRuleDSLExecutorBelongsTo1 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1985:62: (iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF )
            // InternalSasDsl.g:1986:2: iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutorBelongsTo1=ruleDSLExecutorBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLExecutorBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLExecutorBelongsTo1"


    // $ANTLR start "ruleDSLExecutorBelongsTo1"
    // InternalSasDsl.g:1992:1: ruleDSLExecutorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1998:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1999:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1999:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2000:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2004:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2005:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2005:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2006:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:2021:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2022:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2022:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2023:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLExecutorBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLExecutorBelongsTo1"


    // $ANTLR start "entryRuleDSLExecutorBelongsTo2"
    // InternalSasDsl.g:2042:1: entryRuleDSLExecutorBelongsTo2 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:2042:62: (iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF )
            // InternalSasDsl.g:2043:2: iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutorBelongsTo2=ruleDSLExecutorBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLExecutorBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLExecutorBelongsTo2"


    // $ANTLR start "ruleDSLExecutorBelongsTo2"
    // InternalSasDsl.g:2049:1: ruleDSLExecutorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2055:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2056:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2056:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2057:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2061:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2062:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2062:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2063:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2078:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2079:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2079:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2080:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLExecutorBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLExecutorBelongsTo2"


    // $ANTLR start "entryRuleDSLClBelongsTo1"
    // InternalSasDsl.g:2099:1: entryRuleDSLClBelongsTo1 returns [EObject current=null] : iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF ;
    public final EObject entryRuleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo1 = null;


        try {
            // InternalSasDsl.g:2099:56: (iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF )
            // InternalSasDsl.g:2100:2: iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLClBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClBelongsTo1=ruleDSLClBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLClBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLClBelongsTo1"


    // $ANTLR start "ruleDSLClBelongsTo1"
    // InternalSasDsl.g:2106:1: ruleDSLClBelongsTo1 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2112:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2113:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2113:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2114:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo1Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2118:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2119:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2119:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2120:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo1Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo1Access().getMustBeInControlLoopManagerKeyword_2());
            		
            // InternalSasDsl.g:2135:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2136:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2136:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2137:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo1Access().getClmDSLControlLoopManagerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClBelongsTo1"


    // $ANTLR start "entryRuleDSLClBelongsTo2"
    // InternalSasDsl.g:2156:1: entryRuleDSLClBelongsTo2 returns [EObject current=null] : iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF ;
    public final EObject entryRuleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo2 = null;


        try {
            // InternalSasDsl.g:2156:56: (iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF )
            // InternalSasDsl.g:2157:2: iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLClBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClBelongsTo2=ruleDSLClBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLClBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLClBelongsTo2"


    // $ANTLR start "ruleDSLClBelongsTo2"
    // InternalSasDsl.g:2163:1: ruleDSLClBelongsTo2 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2169:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2170:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2170:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2171:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo2Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2175:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2176:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2176:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2177:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo2Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2192:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2193:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2193:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2194:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClBelongsTo2"


    // $ANTLR start "entryRuleDSLClmBelongsTo"
    // InternalSasDsl.g:2213:1: entryRuleDSLClmBelongsTo returns [EObject current=null] : iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF ;
    public final EObject entryRuleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClmBelongsTo = null;


        try {
            // InternalSasDsl.g:2213:56: (iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF )
            // InternalSasDsl.g:2214:2: iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLClmBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClmBelongsTo=ruleDSLClmBelongsTo();

            state._fsp--;

             current =iv_ruleDSLClmBelongsTo; 
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
    // $ANTLR end "entryRuleDSLClmBelongsTo"


    // $ANTLR start "ruleDSLClmBelongsTo"
    // InternalSasDsl.g:2220:1: ruleDSLClmBelongsTo returns [EObject current=null] : (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2226:2: ( (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2227:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2227:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2228:3: otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClmBelongsToAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2232:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2233:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2233:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2234:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClmBelongsToAccess().getClDSLControlLoopManagerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClmBelongsToAccess().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2249:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2250:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2250:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2251:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClmBelongsToAccess().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClmBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClmBelongsTo"


    // $ANTLR start "entryRuleDSLMeasuredOuputBelongsTo"
    // InternalSasDsl.g:2270:1: entryRuleDSLMeasuredOuputBelongsTo returns [EObject current=null] : iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF ;
    public final EObject entryRuleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOuputBelongsTo = null;


        try {
            // InternalSasDsl.g:2270:66: (iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF )
            // InternalSasDsl.g:2271:2: iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLMeasuredOuputBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMeasuredOuputBelongsTo=ruleDSLMeasuredOuputBelongsTo();

            state._fsp--;

             current =iv_ruleDSLMeasuredOuputBelongsTo; 
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
    // $ANTLR end "entryRuleDSLMeasuredOuputBelongsTo"


    // $ANTLR start "ruleDSLMeasuredOuputBelongsTo"
    // InternalSasDsl.g:2277:1: ruleDSLMeasuredOuputBelongsTo returns [EObject current=null] : (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2283:2: ( (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2284:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2284:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2285:3: otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:2289:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2290:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2290:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2291:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredDSLMeasuredOutputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:2306:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2307:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2307:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2308:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMeasuredOuputBelongsTo"


    // $ANTLR start "entryRuleDSLKnowledgeBelongsTo"
    // InternalSasDsl.g:2327:1: entryRuleDSLKnowledgeBelongsTo returns [EObject current=null] : iv_ruleDSLKnowledgeBelongsTo= ruleDSLKnowledgeBelongsTo EOF ;
    public final EObject entryRuleDSLKnowledgeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledgeBelongsTo = null;


        try {
            // InternalSasDsl.g:2327:62: (iv_ruleDSLKnowledgeBelongsTo= ruleDSLKnowledgeBelongsTo EOF )
            // InternalSasDsl.g:2328:2: iv_ruleDSLKnowledgeBelongsTo= ruleDSLKnowledgeBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLKnowledgeBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLKnowledgeBelongsTo=ruleDSLKnowledgeBelongsTo();

            state._fsp--;

             current =iv_ruleDSLKnowledgeBelongsTo; 
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
    // $ANTLR end "entryRuleDSLKnowledgeBelongsTo"


    // $ANTLR start "ruleDSLKnowledgeBelongsTo"
    // InternalSasDsl.g:2334:1: ruleDSLKnowledgeBelongsTo returns [EObject current=null] : (otherlv_0= 'knowledge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLKnowledgeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2340:2: ( (otherlv_0= 'knowledge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2341:2: (otherlv_0= 'knowledge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2341:2: (otherlv_0= 'knowledge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2342:3: otherlv_0= 'knowledge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeBelongsToAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:2346:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2347:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2347:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2348:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLKnowledgeBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLKnowledgeBelongsToAccess().getKnowledgeDSLKnowledgeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeBelongsToAccess().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2363:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2364:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2364:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2365:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLKnowledgeBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLKnowledgeBelongsToAccess().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLKnowledgeBelongsTo"


    // $ANTLR start "entryRuleDSLManaging"
    // InternalSasDsl.g:2384:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:2384:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:2385:2: iv_ruleDSLManaging= ruleDSLManaging EOF
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
    // InternalSasDsl.g:2391:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2397:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:2398:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:2398:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:2399:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:2403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2404:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLManagingAccess().getSemicolonKeyword_2());
            		

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
    // InternalSasDsl.g:2429:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:2429:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:2430:2: iv_ruleDSLManaged= ruleDSLManaged EOF
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
    // InternalSasDsl.g:2436:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_managedinterfaces_3_0 = null;

        EObject lv_managedinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2442:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2443:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2443:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2444:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:2448:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2449:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2449:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2450:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:2466:3: (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==51) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSasDsl.g:2467:4: otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2471:4: ( (lv_managedinterfaces_3_0= ruleManagedInterface ) )
                    // InternalSasDsl.g:2472:5: (lv_managedinterfaces_3_0= ruleManagedInterface )
                    {
                    // InternalSasDsl.g:2472:5: (lv_managedinterfaces_3_0= ruleManagedInterface )
                    // InternalSasDsl.g:2473:6: lv_managedinterfaces_3_0= ruleManagedInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLManagedAccess().getManagedinterfacesManagedInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_managedinterfaces_3_0=ruleManagedInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    						}
                    						add(
                    							current,
                    							"managedinterfaces",
                    							lv_managedinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2490:4: (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==52) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSasDsl.g:2491:5: otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLManagedAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2495:5: ( (lv_managedinterfaces_5_0= ruleManagedInterface ) )
                    	    // InternalSasDsl.g:2496:6: (lv_managedinterfaces_5_0= ruleManagedInterface )
                    	    {
                    	    // InternalSasDsl.g:2496:6: (lv_managedinterfaces_5_0= ruleManagedInterface )
                    	    // InternalSasDsl.g:2497:7: lv_managedinterfaces_5_0= ruleManagedInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLManagedAccess().getManagedinterfacesManagedInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_managedinterfaces_5_0=ruleManagedInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"managedinterfaces",
                    	    								lv_managedinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLManagedAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleDSLControlLoopManager"
    // InternalSasDsl.g:2524:1: entryRuleDSLControlLoopManager returns [EObject current=null] : iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF ;
    public final EObject entryRuleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoopManager = null;


        try {
            // InternalSasDsl.g:2524:62: (iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:2525:2: iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF
            {
             newCompositeNode(grammarAccess.getDSLControlLoopManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLControlLoopManager=ruleDSLControlLoopManager();

            state._fsp--;

             current =iv_ruleDSLControlLoopManager; 
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
    // $ANTLR end "entryRuleDSLControlLoopManager"


    // $ANTLR start "ruleDSLControlLoopManager"
    // InternalSasDsl.g:2531:1: ruleDSLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_clminterfaces_5_0 = null;

        EObject lv_clminterfaces_7_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2537:2: ( (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) )
            // InternalSasDsl.g:2538:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            {
            // InternalSasDsl.g:2538:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            // InternalSasDsl.g:2539:3: otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2543:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2544:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2544:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2545:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLControlLoopManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3());
            		
            pushFollow(FOLLOW_32);
            ruleDSLTypeCLM();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSasDsl.g:2572:3: (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSasDsl.g:2573:4: otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopManagerAccess().getWithInterfaceKeyword_4_0());
                    			
                    // InternalSasDsl.g:2577:4: ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) )
                    // InternalSasDsl.g:2578:5: (lv_clminterfaces_5_0= ruleControlLoopManagerInterface )
                    {
                    // InternalSasDsl.g:2578:5: (lv_clminterfaces_5_0= ruleControlLoopManagerInterface )
                    // InternalSasDsl.g:2579:6: lv_clminterfaces_5_0= ruleControlLoopManagerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getClminterfacesControlLoopManagerInterfaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_clminterfaces_5_0=ruleControlLoopManagerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    						}
                    						add(
                    							current,
                    							"clminterfaces",
                    							lv_clminterfaces_5_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2596:4: (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==52) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSasDsl.g:2597:5: otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopManagerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSasDsl.g:2601:5: ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) )
                    	    // InternalSasDsl.g:2602:6: (lv_clminterfaces_7_0= ruleControlLoopManagerInterface )
                    	    {
                    	    // InternalSasDsl.g:2602:6: (lv_clminterfaces_7_0= ruleControlLoopManagerInterface )
                    	    // InternalSasDsl.g:2603:7: lv_clminterfaces_7_0= ruleControlLoopManagerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getClminterfacesControlLoopManagerInterfaceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_clminterfaces_7_0=ruleControlLoopManagerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clminterfaces",
                    	    								lv_clminterfaces_7_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDSLControlLoopManagerAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleDSLControlLoopManager"


    // $ANTLR start "entryRuleDSLTypeCLM"
    // InternalSasDsl.g:2630:1: entryRuleDSLTypeCLM returns [String current=null] : iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF ;
    public final String entryRuleDSLTypeCLM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeCLM = null;


        try {
            // InternalSasDsl.g:2630:50: (iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:2631:2: iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF
            {
             newCompositeNode(grammarAccess.getDSLTypeCLMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLTypeCLM=ruleDSLTypeCLM();

            state._fsp--;

             current =iv_ruleDSLTypeCLM.getText(); 
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
    // $ANTLR end "entryRuleDSLTypeCLM"


    // $ANTLR start "ruleDSLTypeCLM"
    // InternalSasDsl.g:2637:1: ruleDSLTypeCLM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeCLM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2643:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:2644:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:2644:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt18=1;
                }
                break;
            case 56:
                {
                alt18=2;
                }
                break;
            case 57:
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
                    // InternalSasDsl.g:2645:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2651:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2657:3: kw= 'Independent'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getIndependentKeyword_2());
                    		

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
    // $ANTLR end "ruleDSLTypeCLM"


    // $ANTLR start "entryRuleDSLControlLoop"
    // InternalSasDsl.g:2666:1: entryRuleDSLControlLoop returns [EObject current=null] : iv_ruleDSLControlLoop= ruleDSLControlLoop EOF ;
    public final EObject entryRuleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoop = null;


        try {
            // InternalSasDsl.g:2666:55: (iv_ruleDSLControlLoop= ruleDSLControlLoop EOF )
            // InternalSasDsl.g:2667:2: iv_ruleDSLControlLoop= ruleDSLControlLoop EOF
            {
             newCompositeNode(grammarAccess.getDSLControlLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLControlLoop=ruleDSLControlLoop();

            state._fsp--;

             current =iv_ruleDSLControlLoop; 
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
    // $ANTLR end "entryRuleDSLControlLoop"


    // $ANTLR start "ruleDSLControlLoop"
    // InternalSasDsl.g:2673:1: ruleDSLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_clinterfaces_3_0 = null;

        EObject lv_clinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2679:2: ( (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2680:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2680:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2681:3: otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2686:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLControlLoopAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLControlLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2703:3: (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSasDsl.g:2704:4: otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2708:4: ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) )
                    // InternalSasDsl.g:2709:5: (lv_clinterfaces_3_0= ruleControlLoopInterface )
                    {
                    // InternalSasDsl.g:2709:5: (lv_clinterfaces_3_0= ruleControlLoopInterface )
                    // InternalSasDsl.g:2710:6: lv_clinterfaces_3_0= ruleControlLoopInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopAccess().getClinterfacesControlLoopInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_clinterfaces_3_0=ruleControlLoopInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    						}
                    						add(
                    							current,
                    							"clinterfaces",
                    							lv_clinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2727:4: (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==52) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSasDsl.g:2728:5: otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2732:5: ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) )
                    	    // InternalSasDsl.g:2733:6: (lv_clinterfaces_5_0= ruleControlLoopInterface )
                    	    {
                    	    // InternalSasDsl.g:2733:6: (lv_clinterfaces_5_0= ruleControlLoopInterface )
                    	    // InternalSasDsl.g:2734:7: lv_clinterfaces_5_0= ruleControlLoopInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopAccess().getClinterfacesControlLoopInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_clinterfaces_5_0=ruleControlLoopInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clinterfaces",
                    	    								lv_clinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLControlLoop"


    // $ANTLR start "entryRuleDSLMonitor"
    // InternalSasDsl.g:2761:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:2761:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:2762:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
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
    // InternalSasDsl.g:2768:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:2774:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2775:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2775:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2776:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:2780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2781:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:2798:3: (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSasDsl.g:2799:4: otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2803:4: ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) )
                    // InternalSasDsl.g:2804:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    {
                    // InternalSasDsl.g:2804:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    // InternalSasDsl.g:2805:6: lv_monitorinterfaces_3_0= ruleMonitorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:2822:4: (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==52) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSasDsl.g:2823:5: otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2827:5: ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    // InternalSasDsl.g:2828:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    {
                    	    // InternalSasDsl.g:2828:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    // InternalSasDsl.g:2829:7: lv_monitorinterfaces_5_0= ruleMonitorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:2856:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:2856:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:2857:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
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
    // InternalSasDsl.g:2863:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:2869:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2870:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2870:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2871:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:2875:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2876:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2876:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2877:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:2893:3: (otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSasDsl.g:2894:4: otherlv_2= 'with-interface' ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2898:4: ( (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface ) )
                    // InternalSasDsl.g:2899:5: (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface )
                    {
                    // InternalSasDsl.g:2899:5: (lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface )
                    // InternalSasDsl.g:2900:6: lv_anlyzerinterfaces_3_0= ruleAnalyzerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getAnlyzerinterfacesAnalyzerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:2917:4: (otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==52) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSasDsl.g:2918:5: otherlv_4= ',' ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2922:5: ( (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface ) )
                    	    // InternalSasDsl.g:2923:6: (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface )
                    	    {
                    	    // InternalSasDsl.g:2923:6: (lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface )
                    	    // InternalSasDsl.g:2924:7: lv_anlyzerinterfaces_5_0= ruleAnalyzerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getAnlyzerinterfacesAnalyzerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:2951:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:2951:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:2952:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
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
    // InternalSasDsl.g:2958:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:2964:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2965:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2965:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2966:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:2970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2971:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2972:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:2988:3: (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSasDsl.g:2989:4: otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2993:4: ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) )
                    // InternalSasDsl.g:2994:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    {
                    // InternalSasDsl.g:2994:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    // InternalSasDsl.g:2995:6: lv_plannerinterfaces_3_0= rulePlannerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:3012:4: (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==52) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSasDsl.g:3013:5: otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3017:5: ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    // InternalSasDsl.g:3018:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    {
                    	    // InternalSasDsl.g:3018:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    // InternalSasDsl.g:3019:7: lv_plannerinterfaces_5_0= rulePlannerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3046:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:3046:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:3047:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
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
    // InternalSasDsl.g:3053:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:3059:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3060:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3060:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3061:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:3065:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3066:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3066:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3067:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:3083:3: (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSasDsl.g:3084:4: otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3088:4: ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) )
                    // InternalSasDsl.g:3089:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    {
                    // InternalSasDsl.g:3089:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    // InternalSasDsl.g:3090:6: lv_executorinterfaces_3_0= ruleExecutorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:3107:4: (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==52) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSasDsl.g:3108:5: otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3112:5: ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    // InternalSasDsl.g:3113:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    {
                    	    // InternalSasDsl.g:3113:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    // InternalSasDsl.g:3114:7: lv_executorinterfaces_5_0= ruleExecutorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3141:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:3141:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:3142:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
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
    // InternalSasDsl.g:3148:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_knowledgeinterfaces_3_0 = null;

        EObject lv_knowledgeinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3154:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3155:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3155:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3156:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:3160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3161:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:3178:3: (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSasDsl.g:3179:4: otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3183:4: ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) )
                    // InternalSasDsl.g:3184:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    {
                    // InternalSasDsl.g:3184:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    // InternalSasDsl.g:3185:6: lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:3202:4: (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==52) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSasDsl.g:3203:5: otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3207:5: ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    // InternalSasDsl.g:3208:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    {
                    	    // InternalSasDsl.g:3208:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    // InternalSasDsl.g:3209:7: lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLKnowledgeAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:3236:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:3236:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:3237:2: iv_ruleDSLSensor= ruleDSLSensor EOF
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
    // InternalSasDsl.g:3243:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:3249:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3250:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3250:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3251:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:3255:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3256:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3256:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3257:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:3273:3: (otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSasDsl.g:3274:4: otherlv_2= 'with-interface' ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3278:4: ( (lv_sensorinterfaces_3_0= ruleSensorInterface ) )
                    // InternalSasDsl.g:3279:5: (lv_sensorinterfaces_3_0= ruleSensorInterface )
                    {
                    // InternalSasDsl.g:3279:5: (lv_sensorinterfaces_3_0= ruleSensorInterface )
                    // InternalSasDsl.g:3280:6: lv_sensorinterfaces_3_0= ruleSensorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLSensorAccess().getSensorinterfacesSensorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:3297:4: (otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==52) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSasDsl.g:3298:5: otherlv_4= ',' ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLSensorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3302:5: ( (lv_sensorinterfaces_5_0= ruleSensorInterface ) )
                    	    // InternalSasDsl.g:3303:6: (lv_sensorinterfaces_5_0= ruleSensorInterface )
                    	    {
                    	    // InternalSasDsl.g:3303:6: (lv_sensorinterfaces_5_0= ruleSensorInterface )
                    	    // InternalSasDsl.g:3304:7: lv_sensorinterfaces_5_0= ruleSensorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLSensorAccess().getSensorinterfacesSensorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3331:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:3331:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:3332:2: iv_ruleDSLEffector= ruleDSLEffector EOF
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
    // InternalSasDsl.g:3338:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:3344:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3345:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3345:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3346:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:3350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3351:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3352:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalSasDsl.g:3368:3: (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSasDsl.g:3369:4: otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3373:4: ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) )
                    // InternalSasDsl.g:3374:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    {
                    // InternalSasDsl.g:3374:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    // InternalSasDsl.g:3375:6: lv_effectorinterfaces_3_0= ruleEffectorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSasDsl.g:3392:4: (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==52) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSasDsl.g:3393:5: otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3397:5: ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    // InternalSasDsl.g:3398:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    {
                    	    // InternalSasDsl.g:3398:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    // InternalSasDsl.g:3399:7: lv_effectorinterfaces_5_0= ruleEffectorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3426:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:3426:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:3427:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
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
    // InternalSasDsl.g:3433:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3439:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3440:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3440:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3441:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:3445:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3446:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3446:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3447:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3471:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:3471:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:3472:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
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
    // InternalSasDsl.g:3478:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3484:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3485:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3485:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3486:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:3490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3491:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSasDsl.g:3516:1: entryRuleEffectorInterface returns [EObject current=null] : iv_ruleEffectorInterface= ruleEffectorInterface EOF ;
    public final EObject entryRuleEffectorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectorInterface = null;


        try {
            // InternalSasDsl.g:3516:58: (iv_ruleEffectorInterface= ruleEffectorInterface EOF )
            // InternalSasDsl.g:3517:2: iv_ruleEffectorInterface= ruleEffectorInterface EOF
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
    // InternalSasDsl.g:3523:1: ruleEffectorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEffectorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3529:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3530:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3530:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3531:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3531:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3532:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3551:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // InternalSasDsl.g:3551:56: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // InternalSasDsl.g:3552:2: iv_ruleSensorInterface= ruleSensorInterface EOF
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
    // InternalSasDsl.g:3558:1: ruleSensorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3564:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3565:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3565:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3566:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3566:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3567:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3586:1: entryRuleMonitorInterface returns [EObject current=null] : iv_ruleMonitorInterface= ruleMonitorInterface EOF ;
    public final EObject entryRuleMonitorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorInterface = null;


        try {
            // InternalSasDsl.g:3586:57: (iv_ruleMonitorInterface= ruleMonitorInterface EOF )
            // InternalSasDsl.g:3587:2: iv_ruleMonitorInterface= ruleMonitorInterface EOF
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
    // InternalSasDsl.g:3593:1: ruleMonitorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMonitorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3599:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3600:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3600:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3601:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3601:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3602:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3621:1: entryRuleAnalyzerInterface returns [EObject current=null] : iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF ;
    public final EObject entryRuleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerInterface = null;


        try {
            // InternalSasDsl.g:3621:58: (iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF )
            // InternalSasDsl.g:3622:2: iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF
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
    // InternalSasDsl.g:3628:1: ruleAnalyzerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3634:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3635:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3635:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3636:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3636:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3637:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3656:1: entryRulePlannerInterface returns [EObject current=null] : iv_rulePlannerInterface= rulePlannerInterface EOF ;
    public final EObject entryRulePlannerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannerInterface = null;


        try {
            // InternalSasDsl.g:3656:57: (iv_rulePlannerInterface= rulePlannerInterface EOF )
            // InternalSasDsl.g:3657:2: iv_rulePlannerInterface= rulePlannerInterface EOF
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
    // InternalSasDsl.g:3663:1: rulePlannerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePlannerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3669:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3670:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3670:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3671:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3671:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3672:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3691:1: entryRuleExecutorInterface returns [EObject current=null] : iv_ruleExecutorInterface= ruleExecutorInterface EOF ;
    public final EObject entryRuleExecutorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutorInterface = null;


        try {
            // InternalSasDsl.g:3691:58: (iv_ruleExecutorInterface= ruleExecutorInterface EOF )
            // InternalSasDsl.g:3692:2: iv_ruleExecutorInterface= ruleExecutorInterface EOF
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
    // InternalSasDsl.g:3698:1: ruleExecutorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExecutorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3704:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3705:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3705:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3706:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3706:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3707:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3726:1: entryRuleKnowledgeInterface returns [EObject current=null] : iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF ;
    public final EObject entryRuleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeInterface = null;


        try {
            // InternalSasDsl.g:3726:59: (iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF )
            // InternalSasDsl.g:3727:2: iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF
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
    // InternalSasDsl.g:3733:1: ruleKnowledgeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3739:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3740:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3740:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3741:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3741:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3742:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleControlLoopInterface"
    // InternalSasDsl.g:3761:1: entryRuleControlLoopInterface returns [EObject current=null] : iv_ruleControlLoopInterface= ruleControlLoopInterface EOF ;
    public final EObject entryRuleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopInterface = null;


        try {
            // InternalSasDsl.g:3761:61: (iv_ruleControlLoopInterface= ruleControlLoopInterface EOF )
            // InternalSasDsl.g:3762:2: iv_ruleControlLoopInterface= ruleControlLoopInterface EOF
            {
             newCompositeNode(grammarAccess.getControlLoopInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlLoopInterface=ruleControlLoopInterface();

            state._fsp--;

             current =iv_ruleControlLoopInterface; 
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
    // $ANTLR end "entryRuleControlLoopInterface"


    // $ANTLR start "ruleControlLoopInterface"
    // InternalSasDsl.g:3768:1: ruleControlLoopInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3774:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3775:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3775:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3776:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3776:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3777:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControlLoopInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControlLoopInterfaceRule());
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
    // $ANTLR end "ruleControlLoopInterface"


    // $ANTLR start "entryRuleControlLoopManagerInterface"
    // InternalSasDsl.g:3796:1: entryRuleControlLoopManagerInterface returns [EObject current=null] : iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF ;
    public final EObject entryRuleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopManagerInterface = null;


        try {
            // InternalSasDsl.g:3796:68: (iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF )
            // InternalSasDsl.g:3797:2: iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF
            {
             newCompositeNode(grammarAccess.getControlLoopManagerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlLoopManagerInterface=ruleControlLoopManagerInterface();

            state._fsp--;

             current =iv_ruleControlLoopManagerInterface; 
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
    // $ANTLR end "entryRuleControlLoopManagerInterface"


    // $ANTLR start "ruleControlLoopManagerInterface"
    // InternalSasDsl.g:3803:1: ruleControlLoopManagerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3809:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3810:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3810:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3811:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3811:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3812:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControlLoopManagerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControlLoopManagerInterfaceRule());
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
    // $ANTLR end "ruleControlLoopManagerInterface"


    // $ANTLR start "entryRuleManagedInterface"
    // InternalSasDsl.g:3831:1: entryRuleManagedInterface returns [EObject current=null] : iv_ruleManagedInterface= ruleManagedInterface EOF ;
    public final EObject entryRuleManagedInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedInterface = null;


        try {
            // InternalSasDsl.g:3831:57: (iv_ruleManagedInterface= ruleManagedInterface EOF )
            // InternalSasDsl.g:3832:2: iv_ruleManagedInterface= ruleManagedInterface EOF
            {
             newCompositeNode(grammarAccess.getManagedInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManagedInterface=ruleManagedInterface();

            state._fsp--;

             current =iv_ruleManagedInterface; 
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
    // $ANTLR end "entryRuleManagedInterface"


    // $ANTLR start "ruleManagedInterface"
    // InternalSasDsl.g:3838:1: ruleManagedInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleManagedInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3844:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3845:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3845:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3846:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3846:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3847:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getManagedInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getManagedInterfaceRule());
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
    // $ANTLR end "ruleManagedInterface"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\20\3\uffff\5\4\3\uffff\4\52\1\53\12\uffff";
    static final String dfa_3s = "\1\60\3\uffff\5\4\3\uffff\4\53\1\55\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\16\1\17\1\20\5\uffff\1\5\1\4\1\7\1\6\1\11\1\10\1\13\1\12\1\15\1\14";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\4\uffff\1\4\2\uffff\1\5\10\uffff\1\6\3\uffff\1\1\1\uffff\1\2\1\uffff\1\3\2\uffff\1\10\1\uffff\1\11\1\12\1\13",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\31\1\uffff\1\32",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "325:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLKnowledgeBelongsTo_15= ruleDSLKnowledgeBelongsTo )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\20\1\4\4\uffff\1\31\3\uffff";
    static final String dfa_9s = "\1\42\1\4\4\uffff\1\40\3\uffff";
    static final String dfa_10s = "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\1";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\4\uffff\1\4\2\uffff\1\1\10\uffff\1\2\1\3",
            "\1\6",
            "",
            "",
            "",
            "",
            "\2\11\2\10\2\7\2\2",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "487:2: (this_DSLRestrictionMonitor_0= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_1= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_2= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_3= ruleDSLRestrictionKnowledge | this_DSLRestrictionManaged_4= ruleDSLRestrictionManaged | this_DSLRestrictionSensor_5= ruleDSLRestrictionSensor | this_DSLRestrictionEffector_6= ruleDSLRestrictionEffector )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFC26000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFC26000000002000L,0x000000000000000FL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001D2A201212000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000601212000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0380000000000000L});

}