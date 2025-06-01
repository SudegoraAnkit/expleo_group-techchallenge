package org.expleo.sarch.dsl.ide.contentassist.antlr.internal;

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
import org.expleo.sarch.dsl.services.SoftwareArchitectureDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoftwareArchitectureDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'boolean'", "'float'", "'double'", "'void'", "'Architecture'", "'{'", "'}'", "'interface'", "'component'", "'provides'", "'via'", "'requires'"
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

    	public void setGrammarAccess(SoftwareArchitectureDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleArchitecture"
    // InternalSoftwareArchitectureDsl.g:53:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:54:1: ( ruleArchitecture EOF )
            // InternalSoftwareArchitectureDsl.g:55:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalSoftwareArchitectureDsl.g:62:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:66:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:67:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:67:2: ( ( rule__Architecture__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:68:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:69:3: ( rule__Architecture__Group__0 )
            // InternalSoftwareArchitectureDsl.g:69:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureElement"
    // InternalSoftwareArchitectureDsl.g:78:1: entryRuleArchitectureElement : ruleArchitectureElement EOF ;
    public final void entryRuleArchitectureElement() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:79:1: ( ruleArchitectureElement EOF )
            // InternalSoftwareArchitectureDsl.g:80:1: ruleArchitectureElement EOF
            {
             before(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureElementRule()); 
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
    // $ANTLR end "entryRuleArchitectureElement"


    // $ANTLR start "ruleArchitectureElement"
    // InternalSoftwareArchitectureDsl.g:87:1: ruleArchitectureElement : ( ( rule__ArchitectureElement__Alternatives ) ) ;
    public final void ruleArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:91:2: ( ( ( rule__ArchitectureElement__Alternatives ) ) )
            // InternalSoftwareArchitectureDsl.g:92:2: ( ( rule__ArchitectureElement__Alternatives ) )
            {
            // InternalSoftwareArchitectureDsl.g:92:2: ( ( rule__ArchitectureElement__Alternatives ) )
            // InternalSoftwareArchitectureDsl.g:93:3: ( rule__ArchitectureElement__Alternatives )
            {
             before(grammarAccess.getArchitectureElementAccess().getAlternatives()); 
            // InternalSoftwareArchitectureDsl.g:94:3: ( rule__ArchitectureElement__Alternatives )
            // InternalSoftwareArchitectureDsl.g:94:4: rule__ArchitectureElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitectureElement"


    // $ANTLR start "entryRuleInterface"
    // InternalSoftwareArchitectureDsl.g:103:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:104:1: ( ruleInterface EOF )
            // InternalSoftwareArchitectureDsl.g:105:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalSoftwareArchitectureDsl.g:112:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:116:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:117:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:117:2: ( ( rule__Interface__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:118:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:119:3: ( rule__Interface__Group__0 )
            // InternalSoftwareArchitectureDsl.g:119:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleElement"
    // InternalSoftwareArchitectureDsl.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:129:1: ( ruleElement EOF )
            // InternalSoftwareArchitectureDsl.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSoftwareArchitectureDsl.g:137:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:141:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:142:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:142:2: ( ( rule__Element__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:143:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:144:3: ( rule__Element__Group__0 )
            // InternalSoftwareArchitectureDsl.g:144:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleComponent"
    // InternalSoftwareArchitectureDsl.g:153:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:154:1: ( ruleComponent EOF )
            // InternalSoftwareArchitectureDsl.g:155:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSoftwareArchitectureDsl.g:162:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:166:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:167:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:167:2: ( ( rule__Component__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:168:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:169:3: ( rule__Component__Group__0 )
            // InternalSoftwareArchitectureDsl.g:169:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // InternalSoftwareArchitectureDsl.g:178:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:179:1: ( rulePort EOF )
            // InternalSoftwareArchitectureDsl.g:180:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSoftwareArchitectureDsl.g:187:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:191:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalSoftwareArchitectureDsl.g:192:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalSoftwareArchitectureDsl.g:192:2: ( ( rule__Port__Alternatives ) )
            // InternalSoftwareArchitectureDsl.g:193:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalSoftwareArchitectureDsl.g:194:3: ( rule__Port__Alternatives )
            // InternalSoftwareArchitectureDsl.g:194:4: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRulePPort"
    // InternalSoftwareArchitectureDsl.g:203:1: entryRulePPort : rulePPort EOF ;
    public final void entryRulePPort() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:204:1: ( rulePPort EOF )
            // InternalSoftwareArchitectureDsl.g:205:1: rulePPort EOF
            {
             before(grammarAccess.getPPortRule()); 
            pushFollow(FOLLOW_1);
            rulePPort();

            state._fsp--;

             after(grammarAccess.getPPortRule()); 
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
    // $ANTLR end "entryRulePPort"


    // $ANTLR start "rulePPort"
    // InternalSoftwareArchitectureDsl.g:212:1: rulePPort : ( ( rule__PPort__Group__0 ) ) ;
    public final void rulePPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:216:2: ( ( ( rule__PPort__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:217:2: ( ( rule__PPort__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:217:2: ( ( rule__PPort__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:218:3: ( rule__PPort__Group__0 )
            {
             before(grammarAccess.getPPortAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:219:3: ( rule__PPort__Group__0 )
            // InternalSoftwareArchitectureDsl.g:219:4: rule__PPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePPort"


    // $ANTLR start "entryRuleRPort"
    // InternalSoftwareArchitectureDsl.g:228:1: entryRuleRPort : ruleRPort EOF ;
    public final void entryRuleRPort() throws RecognitionException {
        try {
            // InternalSoftwareArchitectureDsl.g:229:1: ( ruleRPort EOF )
            // InternalSoftwareArchitectureDsl.g:230:1: ruleRPort EOF
            {
             before(grammarAccess.getRPortRule()); 
            pushFollow(FOLLOW_1);
            ruleRPort();

            state._fsp--;

             after(grammarAccess.getRPortRule()); 
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
    // $ANTLR end "entryRuleRPort"


    // $ANTLR start "ruleRPort"
    // InternalSoftwareArchitectureDsl.g:237:1: ruleRPort : ( ( rule__RPort__Group__0 ) ) ;
    public final void ruleRPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:241:2: ( ( ( rule__RPort__Group__0 ) ) )
            // InternalSoftwareArchitectureDsl.g:242:2: ( ( rule__RPort__Group__0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:242:2: ( ( rule__RPort__Group__0 ) )
            // InternalSoftwareArchitectureDsl.g:243:3: ( rule__RPort__Group__0 )
            {
             before(grammarAccess.getRPortAccess().getGroup()); 
            // InternalSoftwareArchitectureDsl.g:244:3: ( rule__RPort__Group__0 )
            // InternalSoftwareArchitectureDsl.g:244:4: rule__RPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRPort"


    // $ANTLR start "ruleDataType"
    // InternalSoftwareArchitectureDsl.g:253:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:257:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSoftwareArchitectureDsl.g:258:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSoftwareArchitectureDsl.g:258:2: ( ( rule__DataType__Alternatives ) )
            // InternalSoftwareArchitectureDsl.g:259:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSoftwareArchitectureDsl.g:260:3: ( rule__DataType__Alternatives )
            // InternalSoftwareArchitectureDsl.g:260:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__ArchitectureElement__Alternatives"
    // InternalSoftwareArchitectureDsl.g:268:1: rule__ArchitectureElement__Alternatives : ( ( ruleInterface ) | ( ruleComponent ) );
    public final void rule__ArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:272:1: ( ( ruleInterface ) | ( ruleComponent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSoftwareArchitectureDsl.g:273:2: ( ruleInterface )
                    {
                    // InternalSoftwareArchitectureDsl.g:273:2: ( ruleInterface )
                    // InternalSoftwareArchitectureDsl.g:274:3: ruleInterface
                    {
                     before(grammarAccess.getArchitectureElementAccess().getInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:279:2: ( ruleComponent )
                    {
                    // InternalSoftwareArchitectureDsl.g:279:2: ( ruleComponent )
                    // InternalSoftwareArchitectureDsl.g:280:3: ruleComponent
                    {
                     before(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__ArchitectureElement__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // InternalSoftwareArchitectureDsl.g:289:1: rule__Port__Alternatives : ( ( rulePPort ) | ( ruleRPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:293:1: ( ( rulePPort ) | ( ruleRPort ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSoftwareArchitectureDsl.g:294:2: ( rulePPort )
                    {
                    // InternalSoftwareArchitectureDsl.g:294:2: ( rulePPort )
                    // InternalSoftwareArchitectureDsl.g:295:3: rulePPort
                    {
                     before(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:300:2: ( ruleRPort )
                    {
                    // InternalSoftwareArchitectureDsl.g:300:2: ( ruleRPort )
                    // InternalSoftwareArchitectureDsl.g:301:3: ruleRPort
                    {
                     before(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); 

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
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSoftwareArchitectureDsl.g:310:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'void' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:314:1: ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'void' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSoftwareArchitectureDsl.g:315:2: ( ( 'String' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:315:2: ( ( 'String' ) )
                    // InternalSoftwareArchitectureDsl.g:316:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringTypeEnumLiteralDeclaration_0()); 
                    // InternalSoftwareArchitectureDsl.g:317:3: ( 'String' )
                    // InternalSoftwareArchitectureDsl.g:317:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftwareArchitectureDsl.g:321:2: ( ( 'int' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:321:2: ( ( 'int' ) )
                    // InternalSoftwareArchitectureDsl.g:322:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntTypeEnumLiteralDeclaration_1()); 
                    // InternalSoftwareArchitectureDsl.g:323:3: ( 'int' )
                    // InternalSoftwareArchitectureDsl.g:323:4: 'int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSoftwareArchitectureDsl.g:327:2: ( ( 'boolean' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:327:2: ( ( 'boolean' ) )
                    // InternalSoftwareArchitectureDsl.g:328:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanTypeEnumLiteralDeclaration_2()); 
                    // InternalSoftwareArchitectureDsl.g:329:3: ( 'boolean' )
                    // InternalSoftwareArchitectureDsl.g:329:4: 'boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBooleanTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSoftwareArchitectureDsl.g:333:2: ( ( 'float' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:333:2: ( ( 'float' ) )
                    // InternalSoftwareArchitectureDsl.g:334:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFloatTypeEnumLiteralDeclaration_3()); 
                    // InternalSoftwareArchitectureDsl.g:335:3: ( 'float' )
                    // InternalSoftwareArchitectureDsl.g:335:4: 'float'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFloatTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSoftwareArchitectureDsl.g:339:2: ( ( 'double' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:339:2: ( ( 'double' ) )
                    // InternalSoftwareArchitectureDsl.g:340:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDoubleTypeEnumLiteralDeclaration_4()); 
                    // InternalSoftwareArchitectureDsl.g:341:3: ( 'double' )
                    // InternalSoftwareArchitectureDsl.g:341:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDoubleTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSoftwareArchitectureDsl.g:345:2: ( ( 'void' ) )
                    {
                    // InternalSoftwareArchitectureDsl.g:345:2: ( ( 'void' ) )
                    // InternalSoftwareArchitectureDsl.g:346:3: ( 'void' )
                    {
                     before(grammarAccess.getDataTypeAccess().getVoidTypeEnumLiteralDeclaration_5()); 
                    // InternalSoftwareArchitectureDsl.g:347:3: ( 'void' )
                    // InternalSoftwareArchitectureDsl.g:347:4: 'void'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getVoidTypeEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalSoftwareArchitectureDsl.g:355:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:359:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalSoftwareArchitectureDsl.g:360:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:367:1: rule__Architecture__Group__0__Impl : ( 'Architecture' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:371:1: ( ( 'Architecture' ) )
            // InternalSoftwareArchitectureDsl.g:372:1: ( 'Architecture' )
            {
            // InternalSoftwareArchitectureDsl.g:372:1: ( 'Architecture' )
            // InternalSoftwareArchitectureDsl.g:373:2: 'Architecture'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalSoftwareArchitectureDsl.g:382:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:386:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalSoftwareArchitectureDsl.g:387:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:394:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:398:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:399:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:399:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:400:2: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:401:2: ( rule__Architecture__NameAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:401:3: rule__Architecture__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalSoftwareArchitectureDsl.g:409:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:413:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalSoftwareArchitectureDsl.g:414:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalSoftwareArchitectureDsl.g:421:1: rule__Architecture__Group__2__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:425:1: ( ( '{' ) )
            // InternalSoftwareArchitectureDsl.g:426:1: ( '{' )
            {
            // InternalSoftwareArchitectureDsl.g:426:1: ( '{' )
            // InternalSoftwareArchitectureDsl.g:427:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalSoftwareArchitectureDsl.g:436:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:440:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalSoftwareArchitectureDsl.g:441:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // InternalSoftwareArchitectureDsl.g:448:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__ElementsAssignment_3 )* ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:452:1: ( ( ( rule__Architecture__ElementsAssignment_3 )* ) )
            // InternalSoftwareArchitectureDsl.g:453:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            {
            // InternalSoftwareArchitectureDsl.g:453:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            // InternalSoftwareArchitectureDsl.g:454:2: ( rule__Architecture__ElementsAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_3()); 
            // InternalSoftwareArchitectureDsl.g:455:2: ( rule__Architecture__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:455:3: rule__Architecture__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Architecture__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Architecture__Group__4"
    // InternalSoftwareArchitectureDsl.g:463:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:467:1: ( rule__Architecture__Group__4__Impl )
            // InternalSoftwareArchitectureDsl.g:468:2: rule__Architecture__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__4"


    // $ANTLR start "rule__Architecture__Group__4__Impl"
    // InternalSoftwareArchitectureDsl.g:474:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:478:1: ( ( '}' ) )
            // InternalSoftwareArchitectureDsl.g:479:1: ( '}' )
            {
            // InternalSoftwareArchitectureDsl.g:479:1: ( '}' )
            // InternalSoftwareArchitectureDsl.g:480:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalSoftwareArchitectureDsl.g:490:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:494:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalSoftwareArchitectureDsl.g:495:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:502:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:506:1: ( ( 'interface' ) )
            // InternalSoftwareArchitectureDsl.g:507:1: ( 'interface' )
            {
            // InternalSoftwareArchitectureDsl.g:507:1: ( 'interface' )
            // InternalSoftwareArchitectureDsl.g:508:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalSoftwareArchitectureDsl.g:517:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:521:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalSoftwareArchitectureDsl.g:522:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:529:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:533:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:534:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:534:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:535:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:536:2: ( rule__Interface__NameAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:536:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalSoftwareArchitectureDsl.g:544:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:548:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalSoftwareArchitectureDsl.g:549:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalSoftwareArchitectureDsl.g:556:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:560:1: ( ( '{' ) )
            // InternalSoftwareArchitectureDsl.g:561:1: ( '{' )
            {
            // InternalSoftwareArchitectureDsl.g:561:1: ( '{' )
            // InternalSoftwareArchitectureDsl.g:562:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalSoftwareArchitectureDsl.g:571:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:575:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalSoftwareArchitectureDsl.g:576:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalSoftwareArchitectureDsl.g:583:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__ElementsAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:587:1: ( ( ( rule__Interface__ElementsAssignment_3 )* ) )
            // InternalSoftwareArchitectureDsl.g:588:1: ( ( rule__Interface__ElementsAssignment_3 )* )
            {
            // InternalSoftwareArchitectureDsl.g:588:1: ( ( rule__Interface__ElementsAssignment_3 )* )
            // InternalSoftwareArchitectureDsl.g:589:2: ( rule__Interface__ElementsAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getElementsAssignment_3()); 
            // InternalSoftwareArchitectureDsl.g:590:2: ( rule__Interface__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:590:3: rule__Interface__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Interface__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalSoftwareArchitectureDsl.g:598:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:602:1: ( rule__Interface__Group__4__Impl )
            // InternalSoftwareArchitectureDsl.g:603:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalSoftwareArchitectureDsl.g:609:1: rule__Interface__Group__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:613:1: ( ( '}' ) )
            // InternalSoftwareArchitectureDsl.g:614:1: ( '}' )
            {
            // InternalSoftwareArchitectureDsl.g:614:1: ( '}' )
            // InternalSoftwareArchitectureDsl.g:615:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalSoftwareArchitectureDsl.g:625:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:629:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalSoftwareArchitectureDsl.g:630:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:637:1: rule__Element__Group__0__Impl : ( ( rule__Element__TypeAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:641:1: ( ( ( rule__Element__TypeAssignment_0 ) ) )
            // InternalSoftwareArchitectureDsl.g:642:1: ( ( rule__Element__TypeAssignment_0 ) )
            {
            // InternalSoftwareArchitectureDsl.g:642:1: ( ( rule__Element__TypeAssignment_0 ) )
            // InternalSoftwareArchitectureDsl.g:643:2: ( rule__Element__TypeAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getTypeAssignment_0()); 
            // InternalSoftwareArchitectureDsl.g:644:2: ( rule__Element__TypeAssignment_0 )
            // InternalSoftwareArchitectureDsl.g:644:3: rule__Element__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalSoftwareArchitectureDsl.g:652:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:656:1: ( rule__Element__Group__1__Impl )
            // InternalSoftwareArchitectureDsl.g:657:2: rule__Element__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:663:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:667:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:668:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:668:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:669:2: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:670:2: ( rule__Element__NameAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:670:3: rule__Element__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalSoftwareArchitectureDsl.g:679:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:683:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalSoftwareArchitectureDsl.g:684:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:691:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:695:1: ( ( 'component' ) )
            // InternalSoftwareArchitectureDsl.g:696:1: ( 'component' )
            {
            // InternalSoftwareArchitectureDsl.g:696:1: ( 'component' )
            // InternalSoftwareArchitectureDsl.g:697:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalSoftwareArchitectureDsl.g:706:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:710:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalSoftwareArchitectureDsl.g:711:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:718:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:722:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:723:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:723:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:724:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:725:2: ( rule__Component__NameAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:725:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalSoftwareArchitectureDsl.g:733:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:737:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalSoftwareArchitectureDsl.g:738:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalSoftwareArchitectureDsl.g:745:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:749:1: ( ( '{' ) )
            // InternalSoftwareArchitectureDsl.g:750:1: ( '{' )
            {
            // InternalSoftwareArchitectureDsl.g:750:1: ( '{' )
            // InternalSoftwareArchitectureDsl.g:751:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalSoftwareArchitectureDsl.g:760:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:764:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalSoftwareArchitectureDsl.g:765:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalSoftwareArchitectureDsl.g:772:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:776:1: ( ( ( rule__Component__PortsAssignment_3 )* ) )
            // InternalSoftwareArchitectureDsl.g:777:1: ( ( rule__Component__PortsAssignment_3 )* )
            {
            // InternalSoftwareArchitectureDsl.g:777:1: ( ( rule__Component__PortsAssignment_3 )* )
            // InternalSoftwareArchitectureDsl.g:778:2: ( rule__Component__PortsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // InternalSoftwareArchitectureDsl.g:779:2: ( rule__Component__PortsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSoftwareArchitectureDsl.g:779:3: rule__Component__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPortsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalSoftwareArchitectureDsl.g:787:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:791:1: ( rule__Component__Group__4__Impl )
            // InternalSoftwareArchitectureDsl.g:792:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalSoftwareArchitectureDsl.g:798:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:802:1: ( ( '}' ) )
            // InternalSoftwareArchitectureDsl.g:803:1: ( '}' )
            {
            // InternalSoftwareArchitectureDsl.g:803:1: ( '}' )
            // InternalSoftwareArchitectureDsl.g:804:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__PPort__Group__0"
    // InternalSoftwareArchitectureDsl.g:814:1: rule__PPort__Group__0 : rule__PPort__Group__0__Impl rule__PPort__Group__1 ;
    public final void rule__PPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:818:1: ( rule__PPort__Group__0__Impl rule__PPort__Group__1 )
            // InternalSoftwareArchitectureDsl.g:819:2: rule__PPort__Group__0__Impl rule__PPort__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__0"


    // $ANTLR start "rule__PPort__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:826:1: rule__PPort__Group__0__Impl : ( 'provides' ) ;
    public final void rule__PPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:830:1: ( ( 'provides' ) )
            // InternalSoftwareArchitectureDsl.g:831:1: ( 'provides' )
            {
            // InternalSoftwareArchitectureDsl.g:831:1: ( 'provides' )
            // InternalSoftwareArchitectureDsl.g:832:2: 'provides'
            {
             before(grammarAccess.getPPortAccess().getProvidesKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPPortAccess().getProvidesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__0__Impl"


    // $ANTLR start "rule__PPort__Group__1"
    // InternalSoftwareArchitectureDsl.g:841:1: rule__PPort__Group__1 : rule__PPort__Group__1__Impl rule__PPort__Group__2 ;
    public final void rule__PPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:845:1: ( rule__PPort__Group__1__Impl rule__PPort__Group__2 )
            // InternalSoftwareArchitectureDsl.g:846:2: rule__PPort__Group__1__Impl rule__PPort__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__1"


    // $ANTLR start "rule__PPort__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:853:1: rule__PPort__Group__1__Impl : ( ( rule__PPort__InterfaceAssignment_1 ) ) ;
    public final void rule__PPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:857:1: ( ( ( rule__PPort__InterfaceAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:858:1: ( ( rule__PPort__InterfaceAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:858:1: ( ( rule__PPort__InterfaceAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:859:2: ( rule__PPort__InterfaceAssignment_1 )
            {
             before(grammarAccess.getPPortAccess().getInterfaceAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:860:2: ( rule__PPort__InterfaceAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:860:3: rule__PPort__InterfaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PPort__InterfaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getInterfaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__1__Impl"


    // $ANTLR start "rule__PPort__Group__2"
    // InternalSoftwareArchitectureDsl.g:868:1: rule__PPort__Group__2 : rule__PPort__Group__2__Impl rule__PPort__Group__3 ;
    public final void rule__PPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:872:1: ( rule__PPort__Group__2__Impl rule__PPort__Group__3 )
            // InternalSoftwareArchitectureDsl.g:873:2: rule__PPort__Group__2__Impl rule__PPort__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__PPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__2"


    // $ANTLR start "rule__PPort__Group__2__Impl"
    // InternalSoftwareArchitectureDsl.g:880:1: rule__PPort__Group__2__Impl : ( 'via' ) ;
    public final void rule__PPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:884:1: ( ( 'via' ) )
            // InternalSoftwareArchitectureDsl.g:885:1: ( 'via' )
            {
            // InternalSoftwareArchitectureDsl.g:885:1: ( 'via' )
            // InternalSoftwareArchitectureDsl.g:886:2: 'via'
            {
             before(grammarAccess.getPPortAccess().getViaKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPPortAccess().getViaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__2__Impl"


    // $ANTLR start "rule__PPort__Group__3"
    // InternalSoftwareArchitectureDsl.g:895:1: rule__PPort__Group__3 : rule__PPort__Group__3__Impl ;
    public final void rule__PPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:899:1: ( rule__PPort__Group__3__Impl )
            // InternalSoftwareArchitectureDsl.g:900:2: rule__PPort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PPort__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__3"


    // $ANTLR start "rule__PPort__Group__3__Impl"
    // InternalSoftwareArchitectureDsl.g:906:1: rule__PPort__Group__3__Impl : ( ( rule__PPort__NameAssignment_3 ) ) ;
    public final void rule__PPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:910:1: ( ( ( rule__PPort__NameAssignment_3 ) ) )
            // InternalSoftwareArchitectureDsl.g:911:1: ( ( rule__PPort__NameAssignment_3 ) )
            {
            // InternalSoftwareArchitectureDsl.g:911:1: ( ( rule__PPort__NameAssignment_3 ) )
            // InternalSoftwareArchitectureDsl.g:912:2: ( rule__PPort__NameAssignment_3 )
            {
             before(grammarAccess.getPPortAccess().getNameAssignment_3()); 
            // InternalSoftwareArchitectureDsl.g:913:2: ( rule__PPort__NameAssignment_3 )
            // InternalSoftwareArchitectureDsl.g:913:3: rule__PPort__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__Group__3__Impl"


    // $ANTLR start "rule__RPort__Group__0"
    // InternalSoftwareArchitectureDsl.g:922:1: rule__RPort__Group__0 : rule__RPort__Group__0__Impl rule__RPort__Group__1 ;
    public final void rule__RPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:926:1: ( rule__RPort__Group__0__Impl rule__RPort__Group__1 )
            // InternalSoftwareArchitectureDsl.g:927:2: rule__RPort__Group__0__Impl rule__RPort__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__0"


    // $ANTLR start "rule__RPort__Group__0__Impl"
    // InternalSoftwareArchitectureDsl.g:934:1: rule__RPort__Group__0__Impl : ( 'requires' ) ;
    public final void rule__RPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:938:1: ( ( 'requires' ) )
            // InternalSoftwareArchitectureDsl.g:939:1: ( 'requires' )
            {
            // InternalSoftwareArchitectureDsl.g:939:1: ( 'requires' )
            // InternalSoftwareArchitectureDsl.g:940:2: 'requires'
            {
             before(grammarAccess.getRPortAccess().getRequiresKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRPortAccess().getRequiresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__0__Impl"


    // $ANTLR start "rule__RPort__Group__1"
    // InternalSoftwareArchitectureDsl.g:949:1: rule__RPort__Group__1 : rule__RPort__Group__1__Impl rule__RPort__Group__2 ;
    public final void rule__RPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:953:1: ( rule__RPort__Group__1__Impl rule__RPort__Group__2 )
            // InternalSoftwareArchitectureDsl.g:954:2: rule__RPort__Group__1__Impl rule__RPort__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__1"


    // $ANTLR start "rule__RPort__Group__1__Impl"
    // InternalSoftwareArchitectureDsl.g:961:1: rule__RPort__Group__1__Impl : ( ( rule__RPort__InterfaceAssignment_1 ) ) ;
    public final void rule__RPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:965:1: ( ( ( rule__RPort__InterfaceAssignment_1 ) ) )
            // InternalSoftwareArchitectureDsl.g:966:1: ( ( rule__RPort__InterfaceAssignment_1 ) )
            {
            // InternalSoftwareArchitectureDsl.g:966:1: ( ( rule__RPort__InterfaceAssignment_1 ) )
            // InternalSoftwareArchitectureDsl.g:967:2: ( rule__RPort__InterfaceAssignment_1 )
            {
             before(grammarAccess.getRPortAccess().getInterfaceAssignment_1()); 
            // InternalSoftwareArchitectureDsl.g:968:2: ( rule__RPort__InterfaceAssignment_1 )
            // InternalSoftwareArchitectureDsl.g:968:3: rule__RPort__InterfaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RPort__InterfaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getInterfaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__1__Impl"


    // $ANTLR start "rule__RPort__Group__2"
    // InternalSoftwareArchitectureDsl.g:976:1: rule__RPort__Group__2 : rule__RPort__Group__2__Impl rule__RPort__Group__3 ;
    public final void rule__RPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:980:1: ( rule__RPort__Group__2__Impl rule__RPort__Group__3 )
            // InternalSoftwareArchitectureDsl.g:981:2: rule__RPort__Group__2__Impl rule__RPort__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__2"


    // $ANTLR start "rule__RPort__Group__2__Impl"
    // InternalSoftwareArchitectureDsl.g:988:1: rule__RPort__Group__2__Impl : ( 'via' ) ;
    public final void rule__RPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:992:1: ( ( 'via' ) )
            // InternalSoftwareArchitectureDsl.g:993:1: ( 'via' )
            {
            // InternalSoftwareArchitectureDsl.g:993:1: ( 'via' )
            // InternalSoftwareArchitectureDsl.g:994:2: 'via'
            {
             before(grammarAccess.getRPortAccess().getViaKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRPortAccess().getViaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__2__Impl"


    // $ANTLR start "rule__RPort__Group__3"
    // InternalSoftwareArchitectureDsl.g:1003:1: rule__RPort__Group__3 : rule__RPort__Group__3__Impl ;
    public final void rule__RPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1007:1: ( rule__RPort__Group__3__Impl )
            // InternalSoftwareArchitectureDsl.g:1008:2: rule__RPort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RPort__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__3"


    // $ANTLR start "rule__RPort__Group__3__Impl"
    // InternalSoftwareArchitectureDsl.g:1014:1: rule__RPort__Group__3__Impl : ( ( rule__RPort__NameAssignment_3 ) ) ;
    public final void rule__RPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1018:1: ( ( ( rule__RPort__NameAssignment_3 ) ) )
            // InternalSoftwareArchitectureDsl.g:1019:1: ( ( rule__RPort__NameAssignment_3 ) )
            {
            // InternalSoftwareArchitectureDsl.g:1019:1: ( ( rule__RPort__NameAssignment_3 ) )
            // InternalSoftwareArchitectureDsl.g:1020:2: ( rule__RPort__NameAssignment_3 )
            {
             before(grammarAccess.getRPortAccess().getNameAssignment_3()); 
            // InternalSoftwareArchitectureDsl.g:1021:2: ( rule__RPort__NameAssignment_3 )
            // InternalSoftwareArchitectureDsl.g:1021:3: rule__RPort__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__Group__3__Impl"


    // $ANTLR start "rule__Architecture__NameAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1030:1: rule__Architecture__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1034:1: ( ( RULE_STRING ) )
            // InternalSoftwareArchitectureDsl.g:1035:2: ( RULE_STRING )
            {
            // InternalSoftwareArchitectureDsl.g:1035:2: ( RULE_STRING )
            // InternalSoftwareArchitectureDsl.g:1036:3: RULE_STRING
            {
             before(grammarAccess.getArchitectureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__NameAssignment_1"


    // $ANTLR start "rule__Architecture__ElementsAssignment_3"
    // InternalSoftwareArchitectureDsl.g:1045:1: rule__Architecture__ElementsAssignment_3 : ( ruleArchitectureElement ) ;
    public final void rule__Architecture__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1049:1: ( ( ruleArchitectureElement ) )
            // InternalSoftwareArchitectureDsl.g:1050:2: ( ruleArchitectureElement )
            {
            // InternalSoftwareArchitectureDsl.g:1050:2: ( ruleArchitectureElement )
            // InternalSoftwareArchitectureDsl.g:1051:3: ruleArchitectureElement
            {
             before(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__ElementsAssignment_3"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1060:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1064:1: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1065:2: ( RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:1065:2: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1066:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__ElementsAssignment_3"
    // InternalSoftwareArchitectureDsl.g:1075:1: rule__Interface__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Interface__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1079:1: ( ( ruleElement ) )
            // InternalSoftwareArchitectureDsl.g:1080:2: ( ruleElement )
            {
            // InternalSoftwareArchitectureDsl.g:1080:2: ( ruleElement )
            // InternalSoftwareArchitectureDsl.g:1081:3: ruleElement
            {
             before(grammarAccess.getInterfaceAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getElementsElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ElementsAssignment_3"


    // $ANTLR start "rule__Element__TypeAssignment_0"
    // InternalSoftwareArchitectureDsl.g:1090:1: rule__Element__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Element__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1094:1: ( ( ruleDataType ) )
            // InternalSoftwareArchitectureDsl.g:1095:2: ( ruleDataType )
            {
            // InternalSoftwareArchitectureDsl.g:1095:2: ( ruleDataType )
            // InternalSoftwareArchitectureDsl.g:1096:3: ruleDataType
            {
             before(grammarAccess.getElementAccess().getTypeDataTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getElementAccess().getTypeDataTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypeAssignment_0"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1105:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1109:1: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1110:2: ( RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:1110:2: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1111:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1120:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1124:1: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1125:2: ( RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:1125:2: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1126:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__PortsAssignment_3"
    // InternalSoftwareArchitectureDsl.g:1135:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1139:1: ( ( rulePort ) )
            // InternalSoftwareArchitectureDsl.g:1140:2: ( rulePort )
            {
            // InternalSoftwareArchitectureDsl.g:1140:2: ( rulePort )
            // InternalSoftwareArchitectureDsl.g:1141:3: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PortsAssignment_3"


    // $ANTLR start "rule__PPort__InterfaceAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1150:1: rule__PPort__InterfaceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PPort__InterfaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1154:1: ( ( ( RULE_ID ) ) )
            // InternalSoftwareArchitectureDsl.g:1155:2: ( ( RULE_ID ) )
            {
            // InternalSoftwareArchitectureDsl.g:1155:2: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1156:3: ( RULE_ID )
            {
             before(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_1_0()); 
            // InternalSoftwareArchitectureDsl.g:1157:3: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1158:4: RULE_ID
            {
             before(grammarAccess.getPPortAccess().getInterfaceInterfaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPPortAccess().getInterfaceInterfaceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__InterfaceAssignment_1"


    // $ANTLR start "rule__PPort__NameAssignment_3"
    // InternalSoftwareArchitectureDsl.g:1169:1: rule__PPort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1173:1: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1174:2: ( RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:1174:2: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1175:3: RULE_ID
            {
             before(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PPort__NameAssignment_3"


    // $ANTLR start "rule__RPort__InterfaceAssignment_1"
    // InternalSoftwareArchitectureDsl.g:1184:1: rule__RPort__InterfaceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RPort__InterfaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1188:1: ( ( ( RULE_ID ) ) )
            // InternalSoftwareArchitectureDsl.g:1189:2: ( ( RULE_ID ) )
            {
            // InternalSoftwareArchitectureDsl.g:1189:2: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1190:3: ( RULE_ID )
            {
             before(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_1_0()); 
            // InternalSoftwareArchitectureDsl.g:1191:3: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1192:4: RULE_ID
            {
             before(grammarAccess.getRPortAccess().getInterfaceInterfaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRPortAccess().getInterfaceInterfaceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__InterfaceAssignment_1"


    // $ANTLR start "rule__RPort__NameAssignment_3"
    // InternalSoftwareArchitectureDsl.g:1203:1: rule__RPort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoftwareArchitectureDsl.g:1207:1: ( ( RULE_ID ) )
            // InternalSoftwareArchitectureDsl.g:1208:2: ( RULE_ID )
            {
            // InternalSoftwareArchitectureDsl.g:1208:2: ( RULE_ID )
            // InternalSoftwareArchitectureDsl.g:1209:3: RULE_ID
            {
             before(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RPort__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000009F800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});

}