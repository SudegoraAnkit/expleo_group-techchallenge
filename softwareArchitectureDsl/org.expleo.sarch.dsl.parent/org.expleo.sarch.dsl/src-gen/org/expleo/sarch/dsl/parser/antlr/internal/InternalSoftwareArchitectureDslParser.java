package org.expleo.sarch.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.expleo.sarch.dsl.services.SoftwareArchitectureDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoftwareArchitectureDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Architecture'", "'{'", "'}'", "'interface'", "'component'", "'provides'", "'via'", "'requires'", "'String'", "'int'", "'boolean'", "'float'", "'double'", "'void'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSoftwareArchitectureDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoftwareArchitectureDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoftwareArchitectureDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSoftwareArchitectureDsl.g"; }



     	private SoftwareArchitectureDslGrammarAccess grammarAccess;

        public InternalSoftwareArchitectureDslParser(TokenStream input, SoftwareArchitectureDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Architecture";
       	}

       	@Override
       	protected SoftwareArchitectureDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArchitecture"
    // InternalSoftwareArchitectureDsl.g:65:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalSoftwareArchitectureDsl.g:65:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalSoftwareArchitectureDsl.g:66:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalSoftwareArchitectureDsl.g:72:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:78:2: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElement ) )* otherlv_4= '}' ) )
            // InternalSoftwareArchitectureDsl.g:79:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElement ) )* otherlv_4= '}' )
            {
            // InternalSoftwareArchitectureDsl.g:79:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElement ) )* otherlv_4= '}' )
            // InternalSoftwareArchitectureDsl.g:80:3: otherlv_0= 'Architecture' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            // InternalSoftwareArchitectureDsl.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSoftwareArchitectureDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSoftwareArchitectureDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalSoftwareArchitectureDsl.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArchitectureAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftwareArchitectureDsl.g:106:3: ( (lv_elements_3_0= ruleArchitectureElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:107:4: (lv_elements_3_0= ruleArchitectureElement )
            	    {
            	    // InternalSoftwareArchitectureDsl.g:107:4: (lv_elements_3_0= ruleArchitectureElement )
            	    // InternalSoftwareArchitectureDsl.g:108:5: lv_elements_3_0= ruleArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.expleo.sarch.dsl.SoftwareArchitectureDsl.ArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureElement"
    // InternalSoftwareArchitectureDsl.g:133:1: entryRuleArchitectureElement returns [EObject current=null] : iv_ruleArchitectureElement= ruleArchitectureElement EOF ;
    public final EObject entryRuleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElement = null;


        try {
            // InternalSoftwareArchitectureDsl.g:133:60: (iv_ruleArchitectureElement= ruleArchitectureElement EOF )
            // InternalSoftwareArchitectureDsl.g:134:2: iv_ruleArchitectureElement= ruleArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureElement=ruleArchitectureElement();

            state._fsp--;

             current =iv_ruleArchitectureElement; 
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
    // $ANTLR end "entryRuleArchitectureElement"


    // $ANTLR start "ruleArchitectureElement"
    // InternalSoftwareArchitectureDsl.g:140:1: ruleArchitectureElement returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) ;
    public final EObject ruleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:146:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) )
            // InternalSoftwareArchitectureDsl.g:147:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            {
            // InternalSoftwareArchitectureDsl.g:147:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSoftwareArchitectureDsl.g:148:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:157:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
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
    // $ANTLR end "ruleArchitectureElement"


    // $ANTLR start "entryRuleInterface"
    // InternalSoftwareArchitectureDsl.g:169:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalSoftwareArchitectureDsl.g:169:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalSoftwareArchitectureDsl.g:170:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalSoftwareArchitectureDsl.g:176:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:182:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // InternalSoftwareArchitectureDsl.g:183:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // InternalSoftwareArchitectureDsl.g:183:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            // InternalSoftwareArchitectureDsl.g:184:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalSoftwareArchitectureDsl.g:188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:189:4: (lv_name_1_0= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftwareArchitectureDsl.g:210:3: ( (lv_elements_3_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=19 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:211:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalSoftwareArchitectureDsl.g:211:4: (lv_elements_3_0= ruleElement )
            	    // InternalSoftwareArchitectureDsl.g:212:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.expleo.sarch.dsl.SoftwareArchitectureDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleElement"
    // InternalSoftwareArchitectureDsl.g:237:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSoftwareArchitectureDsl.g:237:48: (iv_ruleElement= ruleElement EOF )
            // InternalSoftwareArchitectureDsl.g:238:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSoftwareArchitectureDsl.g:244:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:250:2: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftwareArchitectureDsl.g:251:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftwareArchitectureDsl.g:251:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftwareArchitectureDsl.g:252:3: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSoftwareArchitectureDsl.g:252:3: ( (lv_type_0_0= ruleDataType ) )
            // InternalSoftwareArchitectureDsl.g:253:4: (lv_type_0_0= ruleDataType )
            {
            // InternalSoftwareArchitectureDsl.g:253:4: (lv_type_0_0= ruleDataType )
            // InternalSoftwareArchitectureDsl.g:254:5: lv_type_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getElementAccess().getTypeDataTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.expleo.sarch.dsl.SoftwareArchitectureDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftwareArchitectureDsl.g:271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:272:4: (lv_name_1_0= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleComponent"
    // InternalSoftwareArchitectureDsl.g:293:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSoftwareArchitectureDsl.g:293:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSoftwareArchitectureDsl.g:294:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSoftwareArchitectureDsl.g:300:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:306:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' ) )
            // InternalSoftwareArchitectureDsl.g:307:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' )
            {
            // InternalSoftwareArchitectureDsl.g:307:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' )
            // InternalSoftwareArchitectureDsl.g:308:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalSoftwareArchitectureDsl.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftwareArchitectureDsl.g:334:3: ( (lv_ports_3_0= rulePort ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:335:4: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalSoftwareArchitectureDsl.g:335:4: (lv_ports_3_0= rulePort )
            	    // InternalSoftwareArchitectureDsl.g:336:5: lv_ports_3_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_3_0,
            	    						"org.expleo.sarch.dsl.SoftwareArchitectureDsl.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // InternalSoftwareArchitectureDsl.g:361:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSoftwareArchitectureDsl.g:361:45: (iv_rulePort= rulePort EOF )
            // InternalSoftwareArchitectureDsl.g:362:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSoftwareArchitectureDsl.g:368:1: rulePort returns [EObject current=null] : (this_PPort_0= rulePPort | this_RPort_1= ruleRPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_PPort_0 = null;

        EObject this_RPort_1 = null;



        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:374:2: ( (this_PPort_0= rulePPort | this_RPort_1= ruleRPort ) )
            // InternalSoftwareArchitectureDsl.g:375:2: (this_PPort_0= rulePPort | this_RPort_1= ruleRPort )
            {
            // InternalSoftwareArchitectureDsl.g:375:2: (this_PPort_0= rulePPort | this_RPort_1= ruleRPort )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSoftwareArchitectureDsl.g:376:3: this_PPort_0= rulePPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getPPortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PPort_0=rulePPort();

                    state._fsp--;


                    			current = this_PPort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:385:3: this_RPort_1= ruleRPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getRPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RPort_1=ruleRPort();

                    state._fsp--;


                    			current = this_RPort_1;
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRulePPort"
    // InternalSoftwareArchitectureDsl.g:397:1: entryRulePPort returns [EObject current=null] : iv_rulePPort= rulePPort EOF ;
    public final EObject entryRulePPort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePPort = null;


        try {
            // InternalSoftwareArchitectureDsl.g:397:46: (iv_rulePPort= rulePPort EOF )
            // InternalSoftwareArchitectureDsl.g:398:2: iv_rulePPort= rulePPort EOF
            {
             newCompositeNode(grammarAccess.getPPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePPort=rulePPort();

            state._fsp--;

             current =iv_rulePPort; 
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
    // $ANTLR end "entryRulePPort"


    // $ANTLR start "rulePPort"
    // InternalSoftwareArchitectureDsl.g:404:1: rulePPort returns [EObject current=null] : (otherlv_0= 'provides' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:410:2: ( (otherlv_0= 'provides' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftwareArchitectureDsl.g:411:2: (otherlv_0= 'provides' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftwareArchitectureDsl.g:411:2: (otherlv_0= 'provides' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftwareArchitectureDsl.g:412:3: otherlv_0= 'provides' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPPortAccess().getProvidesKeyword_0());
            		
            // InternalSoftwareArchitectureDsl.g:416:3: ( (otherlv_1= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:417:4: (otherlv_1= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:417:4: (otherlv_1= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:418:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPPortRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPPortAccess().getViaKeyword_2());
            		
            // InternalSoftwareArchitectureDsl.g:433:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:434:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:434:4: (lv_name_3_0= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:435:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePPort"


    // $ANTLR start "entryRuleRPort"
    // InternalSoftwareArchitectureDsl.g:455:1: entryRuleRPort returns [EObject current=null] : iv_ruleRPort= ruleRPort EOF ;
    public final EObject entryRuleRPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPort = null;


        try {
            // InternalSoftwareArchitectureDsl.g:455:46: (iv_ruleRPort= ruleRPort EOF )
            // InternalSoftwareArchitectureDsl.g:456:2: iv_ruleRPort= ruleRPort EOF
            {
             newCompositeNode(grammarAccess.getRPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRPort=ruleRPort();

            state._fsp--;

             current =iv_ruleRPort; 
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
    // $ANTLR end "entryRuleRPort"


    // $ANTLR start "ruleRPort"
    // InternalSoftwareArchitectureDsl.g:462:1: ruleRPort returns [EObject current=null] : (otherlv_0= 'requires' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:468:2: ( (otherlv_0= 'requires' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftwareArchitectureDsl.g:469:2: (otherlv_0= 'requires' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftwareArchitectureDsl.g:469:2: (otherlv_0= 'requires' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftwareArchitectureDsl.g:470:3: otherlv_0= 'requires' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'via' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRPortAccess().getRequiresKeyword_0());
            		
            // InternalSoftwareArchitectureDsl.g:474:3: ( (otherlv_1= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:475:4: (otherlv_1= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:475:4: (otherlv_1= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:476:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRPortRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRPortAccess().getViaKeyword_2());
            		
            // InternalSoftwareArchitectureDsl.g:491:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:492:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:492:4: (lv_name_3_0= RULE_ID )
            // InternalSoftwareArchitectureDsl.g:493:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRPort"


    // $ANTLR start "ruleDataType"
    // InternalSoftwareArchitectureDsl.g:513:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'void' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSoftwareArchitectureDsl.g:519:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'void' ) ) )
            // InternalSoftwareArchitectureDsl.g:520:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'void' ) )
            {
            // InternalSoftwareArchitectureDsl.g:520:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'void' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
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
                    // InternalSoftwareArchitectureDsl.g:521:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSoftwareArchitectureDsl.g:521:3: (enumLiteral_0= 'String' )
                    // InternalSoftwareArchitectureDsl.g:522:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:529:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSoftwareArchitectureDsl.g:529:3: (enumLiteral_1= 'int' )
                    // InternalSoftwareArchitectureDsl.g:530:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getIntTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSoftwareArchitectureDsl.g:537:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalSoftwareArchitectureDsl.g:537:3: (enumLiteral_2= 'boolean' )
                    // InternalSoftwareArchitectureDsl.g:538:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBooleanTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBooleanTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSoftwareArchitectureDsl.g:545:3: (enumLiteral_3= 'float' )
                    {
                    // InternalSoftwareArchitectureDsl.g:545:3: (enumLiteral_3= 'float' )
                    // InternalSoftwareArchitectureDsl.g:546:4: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFloatTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getFloatTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSoftwareArchitectureDsl.g:553:3: (enumLiteral_4= 'double' )
                    {
                    // InternalSoftwareArchitectureDsl.g:553:3: (enumLiteral_4= 'double' )
                    // InternalSoftwareArchitectureDsl.g:554:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDoubleTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getDoubleTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSoftwareArchitectureDsl.g:561:3: (enumLiteral_5= 'void' )
                    {
                    // InternalSoftwareArchitectureDsl.g:561:3: (enumLiteral_5= 'void' )
                    // InternalSoftwareArchitectureDsl.g:562:4: enumLiteral_5= 'void'
                    {
                    enumLiteral_5=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVoidTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getVoidTypeEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001F82000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000052000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}