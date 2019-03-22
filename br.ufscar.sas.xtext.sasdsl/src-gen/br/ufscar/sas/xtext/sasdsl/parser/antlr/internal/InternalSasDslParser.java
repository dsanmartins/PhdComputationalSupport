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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "','", "';'", "'}'", "'Compositions'", "'Restrictions'", "'Monitor'", "'Managing'", "'Managed'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : ( (lv_section_0_0= ruleSections ) )* ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_section_0_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( ( (lv_section_0_0= ruleSections ) )* )
            // InternalSasDsl.g:78:2: ( (lv_section_0_0= ruleSections ) )*
            {
            // InternalSasDsl.g:78:2: ( (lv_section_0_0= ruleSections ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:79:3: (lv_section_0_0= ruleSections )
            	    {
            	    // InternalSasDsl.g:79:3: (lv_section_0_0= ruleSections )
            	    // InternalSasDsl.g:80:4: lv_section_0_0= ruleSections
            	    {

            	    				newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getSectionSectionsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_section_0_0=ruleSections();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"section",
            	    					lv_section_0_0,
            	    					"br.ufscar.sas.xtext.sasdsl.SasDsl.Sections");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleSections"
    // InternalSasDsl.g:100:1: entryRuleSections returns [EObject current=null] : iv_ruleSections= ruleSections EOF ;
    public final EObject entryRuleSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSections = null;


        try {
            // InternalSasDsl.g:100:49: (iv_ruleSections= ruleSections EOF )
            // InternalSasDsl.g:101:2: iv_ruleSections= ruleSections EOF
            {
             newCompositeNode(grammarAccess.getSectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSections=ruleSections();

            state._fsp--;

             current =iv_ruleSections; 
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
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // InternalSasDsl.g:107:1: ruleSections returns [EObject current=null] : ( ( (lv_abstractions_0_0= ruleAbstractions ) ) ( (lv_compositions_1_0= ruleCompositions ) ) ( (lv_restrictions_2_0= ruleRestrictions ) ) ) ;
    public final EObject ruleSections() throws RecognitionException {
        EObject current = null;

        EObject lv_abstractions_0_0 = null;

        AntlrDatatypeRuleToken lv_compositions_1_0 = null;

        AntlrDatatypeRuleToken lv_restrictions_2_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:113:2: ( ( ( (lv_abstractions_0_0= ruleAbstractions ) ) ( (lv_compositions_1_0= ruleCompositions ) ) ( (lv_restrictions_2_0= ruleRestrictions ) ) ) )
            // InternalSasDsl.g:114:2: ( ( (lv_abstractions_0_0= ruleAbstractions ) ) ( (lv_compositions_1_0= ruleCompositions ) ) ( (lv_restrictions_2_0= ruleRestrictions ) ) )
            {
            // InternalSasDsl.g:114:2: ( ( (lv_abstractions_0_0= ruleAbstractions ) ) ( (lv_compositions_1_0= ruleCompositions ) ) ( (lv_restrictions_2_0= ruleRestrictions ) ) )
            // InternalSasDsl.g:115:3: ( (lv_abstractions_0_0= ruleAbstractions ) ) ( (lv_compositions_1_0= ruleCompositions ) ) ( (lv_restrictions_2_0= ruleRestrictions ) )
            {
            // InternalSasDsl.g:115:3: ( (lv_abstractions_0_0= ruleAbstractions ) )
            // InternalSasDsl.g:116:4: (lv_abstractions_0_0= ruleAbstractions )
            {
            // InternalSasDsl.g:116:4: (lv_abstractions_0_0= ruleAbstractions )
            // InternalSasDsl.g:117:5: lv_abstractions_0_0= ruleAbstractions
            {

            					newCompositeNode(grammarAccess.getSectionsAccess().getAbstractionsAbstractionsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_abstractions_0_0=ruleAbstractions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionsRule());
            					}
            					set(
            						current,
            						"abstractions",
            						lv_abstractions_0_0,
            						"br.ufscar.sas.xtext.sasdsl.SasDsl.Abstractions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSasDsl.g:134:3: ( (lv_compositions_1_0= ruleCompositions ) )
            // InternalSasDsl.g:135:4: (lv_compositions_1_0= ruleCompositions )
            {
            // InternalSasDsl.g:135:4: (lv_compositions_1_0= ruleCompositions )
            // InternalSasDsl.g:136:5: lv_compositions_1_0= ruleCompositions
            {

            					newCompositeNode(grammarAccess.getSectionsAccess().getCompositionsCompositionsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_compositions_1_0=ruleCompositions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionsRule());
            					}
            					set(
            						current,
            						"compositions",
            						lv_compositions_1_0,
            						"br.ufscar.sas.xtext.sasdsl.SasDsl.Compositions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSasDsl.g:153:3: ( (lv_restrictions_2_0= ruleRestrictions ) )
            // InternalSasDsl.g:154:4: (lv_restrictions_2_0= ruleRestrictions )
            {
            // InternalSasDsl.g:154:4: (lv_restrictions_2_0= ruleRestrictions )
            // InternalSasDsl.g:155:5: lv_restrictions_2_0= ruleRestrictions
            {

            					newCompositeNode(grammarAccess.getSectionsAccess().getRestrictionsRestrictionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_restrictions_2_0=ruleRestrictions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionsRule());
            					}
            					set(
            						current,
            						"restrictions",
            						lv_restrictions_2_0,
            						"br.ufscar.sas.xtext.sasdsl.SasDsl.Restrictions");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleAbstractions"
    // InternalSasDsl.g:176:1: entryRuleAbstractions returns [EObject current=null] : iv_ruleAbstractions= ruleAbstractions EOF ;
    public final EObject entryRuleAbstractions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractions = null;


        try {
            // InternalSasDsl.g:176:53: (iv_ruleAbstractions= ruleAbstractions EOF )
            // InternalSasDsl.g:177:2: iv_ruleAbstractions= ruleAbstractions EOF
            {
             newCompositeNode(grammarAccess.getAbstractionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractions=ruleAbstractions();

            state._fsp--;

             current =iv_ruleAbstractions; 
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
    // $ANTLR end "entryRuleAbstractions"


    // $ANTLR start "ruleAbstractions"
    // InternalSasDsl.g:183:1: ruleAbstractions returns [EObject current=null] : (otherlv_0= 'Abstractions' otherlv_1= '{' ruleAbstraction ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+ otherlv_7= '}' ) ;
    public final EObject ruleAbstractions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSasDsl.g:189:2: ( (otherlv_0= 'Abstractions' otherlv_1= '{' ruleAbstraction ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+ otherlv_7= '}' ) )
            // InternalSasDsl.g:190:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ruleAbstraction ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+ otherlv_7= '}' )
            {
            // InternalSasDsl.g:190:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ruleAbstraction ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+ otherlv_7= '}' )
            // InternalSasDsl.g:191:3: otherlv_0= 'Abstractions' otherlv_1= '{' ruleAbstraction ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractionsAccess().getAbstractionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractionsAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAbstractionsAccess().getAbstractionParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            ruleAbstraction();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSasDsl.g:206:3: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSasDsl.g:207:4: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )* otherlv_6= ';'
            	    {
            	    // InternalSasDsl.g:207:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalSasDsl.g:208:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:208:5: (lv_name_3_0= RULE_ID )
            	    // InternalSasDsl.g:209:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAbstractionsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:225:4: (otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:226:5: otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getAbstractionsAccess().getCommaKeyword_3_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:230:5: ( (lv_name_5_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:231:6: (lv_name_5_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:231:6: (lv_name_5_0= RULE_ID )
            	    	    // InternalSasDsl.g:232:7: lv_name_5_0= RULE_ID
            	    	    {
            	    	    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    	    							newLeafNode(lv_name_5_0, grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getAbstractionsRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_5_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAbstractionsAccess().getSemicolonKeyword_3_2());
            	    			

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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractionsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAbstractions"


    // $ANTLR start "entryRuleCompositions"
    // InternalSasDsl.g:262:1: entryRuleCompositions returns [String current=null] : iv_ruleCompositions= ruleCompositions EOF ;
    public final String entryRuleCompositions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositions = null;


        try {
            // InternalSasDsl.g:262:52: (iv_ruleCompositions= ruleCompositions EOF )
            // InternalSasDsl.g:263:2: iv_ruleCompositions= ruleCompositions EOF
            {
             newCompositeNode(grammarAccess.getCompositionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositions=ruleCompositions();

            state._fsp--;

             current =iv_ruleCompositions.getText(); 
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
    // $ANTLR end "entryRuleCompositions"


    // $ANTLR start "ruleCompositions"
    // InternalSasDsl.g:269:1: ruleCompositions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Compositions' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleCompositions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:275:2: ( (kw= 'Compositions' kw= '{' kw= '}' ) )
            // InternalSasDsl.g:276:2: (kw= 'Compositions' kw= '{' kw= '}' )
            {
            // InternalSasDsl.g:276:2: (kw= 'Compositions' kw= '{' kw= '}' )
            // InternalSasDsl.g:277:3: kw= 'Compositions' kw= '{' kw= '}'
            {
            kw=(Token)match(input,16,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCompositionsAccess().getCompositionsKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCompositionsAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCompositionsAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCompositions"


    // $ANTLR start "entryRuleRestrictions"
    // InternalSasDsl.g:296:1: entryRuleRestrictions returns [String current=null] : iv_ruleRestrictions= ruleRestrictions EOF ;
    public final String entryRuleRestrictions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestrictions = null;


        try {
            // InternalSasDsl.g:296:52: (iv_ruleRestrictions= ruleRestrictions EOF )
            // InternalSasDsl.g:297:2: iv_ruleRestrictions= ruleRestrictions EOF
            {
             newCompositeNode(grammarAccess.getRestrictionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestrictions=ruleRestrictions();

            state._fsp--;

             current =iv_ruleRestrictions.getText(); 
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
    // $ANTLR end "entryRuleRestrictions"


    // $ANTLR start "ruleRestrictions"
    // InternalSasDsl.g:303:1: ruleRestrictions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Restrictions' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleRestrictions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:309:2: ( (kw= 'Restrictions' kw= '{' kw= '}' ) )
            // InternalSasDsl.g:310:2: (kw= 'Restrictions' kw= '{' kw= '}' )
            {
            // InternalSasDsl.g:310:2: (kw= 'Restrictions' kw= '{' kw= '}' )
            // InternalSasDsl.g:311:3: kw= 'Restrictions' kw= '{' kw= '}'
            {
            kw=(Token)match(input,17,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRestrictionsAccess().getRestrictionsKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRestrictionsAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRestrictionsAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleRestrictions"


    // $ANTLR start "entryRuleAbstraction"
    // InternalSasDsl.g:330:1: entryRuleAbstraction returns [String current=null] : iv_ruleAbstraction= ruleAbstraction EOF ;
    public final String entryRuleAbstraction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstraction = null;


        try {
            // InternalSasDsl.g:330:51: (iv_ruleAbstraction= ruleAbstraction EOF )
            // InternalSasDsl.g:331:2: iv_ruleAbstraction= ruleAbstraction EOF
            {
             newCompositeNode(grammarAccess.getAbstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstraction=ruleAbstraction();

            state._fsp--;

             current =iv_ruleAbstraction.getText(); 
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
    // $ANTLR end "entryRuleAbstraction"


    // $ANTLR start "ruleAbstraction"
    // InternalSasDsl.g:337:1: ruleAbstraction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Monitor' | kw= 'Managing' | kw= 'Managed' ) ;
    public final AntlrDatatypeRuleToken ruleAbstraction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:343:2: ( (kw= 'Monitor' | kw= 'Managing' | kw= 'Managed' ) )
            // InternalSasDsl.g:344:2: (kw= 'Monitor' | kw= 'Managing' | kw= 'Managed' )
            {
            // InternalSasDsl.g:344:2: (kw= 'Monitor' | kw= 'Managing' | kw= 'Managed' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:345:3: kw= 'Monitor'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractionAccess().getMonitorKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:351:3: kw= 'Managing'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractionAccess().getManagingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:357:3: kw= 'Managed'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractionAccess().getManagedKeyword_2());
                    		

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
    // $ANTLR end "ruleAbstraction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});

}