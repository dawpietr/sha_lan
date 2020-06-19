// Generated from ./Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShadowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LEWYNAW=3, PRAWYNAW=4, STALA=5, ZMIENNA=6, ALBO=7, DLA=8, 
		JESLI=9, IDZ=10, ZWROC=11, DOPOKI=12, FUNKCJA=13, BOOLEAN=14, NIC=15, 
		LNAWIAS=16, PNAWIAS=17, LKLAMROWY=18, PKLAMROWY=19, LKWADRAT=20, PKWADRAT=21, 
		CUDZYSLOW=22, SREDNIK=23, PRZECINEK=24, KROPKA=25, PRZYPISANIE=26, WIEKSZE=27, 
		MNIEJSZE=28, WYKRZYKNIK=29, PYTAJNIK=30, DWUKROPEK=31, POROWNANIE=32, 
		NIEROWNE=33, I=34, LUB=35, ZWIEKSZENIE=36, ZMNIEJSZENIE=37, ZNAK_MATEMATYCZNY=38, 
		BITI=39, BITLUB=40, MODULO=41, STRZALKA=42, PODWOJNYDWUKROPEK=43, ZNAKI=44, 
		LICZBY=45, BIALE_ZNAKI=46, KOMENTARZ=47, LINIA_KOMENTARZA=48;
	public static final int
		RULE_program = 0, RULE_komunikat = 1, RULE_exit = 2, RULE_wypisz = 3, 
		RULE_utworzenie_stalej = 4, RULE_utworzenie_zmiennej = 5, RULE_zmiana_zmiennej = 6, 
		RULE_wyrazenie = 7, RULE_zapytanie_jesli = 8, RULE_petla_dopoki = 9, RULE_petla_dla = 10, 
		RULE_deklaracja_funkcji = 11, RULE_wywolanie_funkcji = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "komunikat", "exit", "wypisz", "utworzenie_stalej", "utworzenie_zmiennej", 
			"zmiana_zmiennej", "wyrazenie", "zapytanie_jesli", "petla_dopoki", "petla_dla", 
			"deklaracja_funkcji", "wywolanie_funkcji"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'EXIT'", "'wypisz'", null, null, "'stala'", "'zmienna'", "'albo'", 
			"'dla'", "'jesli'", "'idz'", "'zwroc'", "'dopoki'", "'funkcja'", null, 
			"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", "';'", "','", 
			"'.'", "'='", "'>'", "'<'", "'!'", "'?'", "':'", "'=='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", null, "'&'", "'|'", "'%'", "'->'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LEWYNAW", "PRAWYNAW", "STALA", "ZMIENNA", "ALBO", 
			"DLA", "JESLI", "IDZ", "ZWROC", "DOPOKI", "FUNKCJA", "BOOLEAN", "NIC", 
			"LNAWIAS", "PNAWIAS", "LKLAMROWY", "PKLAMROWY", "LKWADRAT", "PKWADRAT", 
			"CUDZYSLOW", "SREDNIK", "PRZECINEK", "KROPKA", "PRZYPISANIE", "WIEKSZE", 
			"MNIEJSZE", "WYKRZYKNIK", "PYTAJNIK", "DWUKROPEK", "POROWNANIE", "NIEROWNE", 
			"I", "LUB", "ZWIEKSZENIE", "ZMNIEJSZENIE", "ZNAK_MATEMATYCZNY", "BITI", 
			"BITLUB", "MODULO", "STRZALKA", "PODWOJNYDWUKROPEK", "ZNAKI", "LICZBY", 
			"BIALE_ZNAKI", "KOMENTARZ", "LINIA_KOMENTARZA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Shadow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShadowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<KomunikatContext> komunikat() {
			return getRuleContexts(KomunikatContext.class);
		}
		public KomunikatContext komunikat(int i) {
			return getRuleContext(KomunikatContext.class,i);
		}
		public List<TerminalNode> SREDNIK() { return getTokens(ShadowParser.SREDNIK); }
		public TerminalNode SREDNIK(int i) {
			return getToken(ShadowParser.SREDNIK, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LEWYNAW) | (1L << STALA) | (1L << ZMIENNA) | (1L << DLA) | (1L << JESLI) | (1L << DOPOKI) | (1L << FUNKCJA) | (1L << ZNAK_MATEMATYCZNY) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(26);
				komunikat();
				setState(27);
				match(SREDNIK);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KomunikatContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Utworzenie_stalejContext utworzenie_stalej() {
			return getRuleContext(Utworzenie_stalejContext.class,0);
		}
		public Utworzenie_zmiennejContext utworzenie_zmiennej() {
			return getRuleContext(Utworzenie_zmiennejContext.class,0);
		}
		public Zmiana_zmiennejContext zmiana_zmiennej() {
			return getRuleContext(Zmiana_zmiennejContext.class,0);
		}
		public Zapytanie_jesliContext zapytanie_jesli() {
			return getRuleContext(Zapytanie_jesliContext.class,0);
		}
		public Petla_dopokiContext petla_dopoki() {
			return getRuleContext(Petla_dopokiContext.class,0);
		}
		public Petla_dlaContext petla_dla() {
			return getRuleContext(Petla_dlaContext.class,0);
		}
		public Deklaracja_funkcjiContext deklaracja_funkcji() {
			return getRuleContext(Deklaracja_funkcjiContext.class,0);
		}
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public WypiszContext wypisz() {
			return getRuleContext(WypiszContext.class,0);
		}
		public KomunikatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komunikat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterKomunikat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitKomunikat(this);
		}
	}

	public final KomunikatContext komunikat() throws RecognitionException {
		KomunikatContext _localctx = new KomunikatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_komunikat);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				wyrazenie(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				utworzenie_stalej();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				utworzenie_zmiennej();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				zmiana_zmiennej();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				zapytanie_jesli();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				petla_dopoki();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				petla_dla();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				deklaracja_funkcji();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(42);
				wywolanie_funkcji();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(43);
				exit();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(44);
				wypisz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WypiszContext extends ParserRuleContext {
		public Token lewa;
		public List<TerminalNode> ZNAKI() { return getTokens(ShadowParser.ZNAKI); }
		public TerminalNode ZNAKI(int i) {
			return getToken(ShadowParser.ZNAKI, i);
		}
		public List<TerminalNode> WYKRZYKNIK() { return getTokens(ShadowParser.WYKRZYKNIK); }
		public TerminalNode WYKRZYKNIK(int i) {
			return getToken(ShadowParser.WYKRZYKNIK, i);
		}
		public List<TerminalNode> CUDZYSLOW() { return getTokens(ShadowParser.CUDZYSLOW); }
		public TerminalNode CUDZYSLOW(int i) {
			return getToken(ShadowParser.CUDZYSLOW, i);
		}
		public List<TerminalNode> PRZECINEK() { return getTokens(ShadowParser.PRZECINEK); }
		public TerminalNode PRZECINEK(int i) {
			return getToken(ShadowParser.PRZECINEK, i);
		}
		public List<TerminalNode> KROPKA() { return getTokens(ShadowParser.KROPKA); }
		public TerminalNode KROPKA(int i) {
			return getToken(ShadowParser.KROPKA, i);
		}
		public List<TerminalNode> PYTAJNIK() { return getTokens(ShadowParser.PYTAJNIK); }
		public TerminalNode PYTAJNIK(int i) {
			return getToken(ShadowParser.PYTAJNIK, i);
		}
		public WypiszContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWypisz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWypisz(this);
		}
	}

	public final WypiszContext wypisz() throws RecognitionException {
		WypiszContext _localctx = new WypiszContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_wypisz);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					((WypiszContext)_localctx).lewa = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUDZYSLOW) | (1L << PRZECINEK) | (1L << KROPKA) | (1L << WYKRZYKNIK) | (1L << PYTAJNIK) | (1L << ZNAKI))) != 0)) ) {
						((WypiszContext)_localctx).lewa = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utworzenie_stalejContext extends ParserRuleContext {
		public Utworzenie_stalejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utworzenie_stalej; }
	 
		public Utworzenie_stalejContext() { }
		public void copyFrom(Utworzenie_stalejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UtworzeniestalejContext extends Utworzenie_stalejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode STALA() { return getToken(ShadowParser.STALA, 0); }
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public UtworzeniestalejContext(Utworzenie_stalejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterUtworzeniestalej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitUtworzeniestalej(this);
		}
	}

	public final Utworzenie_stalejContext utworzenie_stalej() throws RecognitionException {
		Utworzenie_stalejContext _localctx = new Utworzenie_stalejContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_utworzenie_stalej);
		try {
			_localctx = new UtworzeniestalejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(STALA);
			setState(57);
			((UtworzeniestalejContext)_localctx).lewa = wyrazenie(0);
			setState(58);
			match(PRZYPISANIE);
			setState(59);
			((UtworzeniestalejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utworzenie_zmiennejContext extends ParserRuleContext {
		public Utworzenie_zmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utworzenie_zmiennej; }
	 
		public Utworzenie_zmiennejContext() { }
		public void copyFrom(Utworzenie_zmiennejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UtworzeniezmiennejContext extends Utworzenie_zmiennejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode ZMIENNA() { return getToken(ShadowParser.ZMIENNA, 0); }
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public UtworzeniezmiennejContext(Utworzenie_zmiennejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterUtworzeniezmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitUtworzeniezmiennej(this);
		}
	}

	public final Utworzenie_zmiennejContext utworzenie_zmiennej() throws RecognitionException {
		Utworzenie_zmiennejContext _localctx = new Utworzenie_zmiennejContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_utworzenie_zmiennej);
		try {
			_localctx = new UtworzeniezmiennejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ZMIENNA);
			setState(62);
			((UtworzeniezmiennejContext)_localctx).lewa = wyrazenie(0);
			setState(63);
			match(PRZYPISANIE);
			setState(64);
			((UtworzeniezmiennejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zmiana_zmiennejContext extends ParserRuleContext {
		public Zmiana_zmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zmiana_zmiennej; }
	 
		public Zmiana_zmiennejContext() { }
		public void copyFrom(Zmiana_zmiennejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZmianazmiennejContext extends Zmiana_zmiennejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public ZmianazmiennejContext(Zmiana_zmiennejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterZmianazmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitZmianazmiennej(this);
		}
	}

	public final Zmiana_zmiennejContext zmiana_zmiennej() throws RecognitionException {
		Zmiana_zmiennejContext _localctx = new Zmiana_zmiennejContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zmiana_zmiennej);
		try {
			_localctx = new ZmianazmiennejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((ZmianazmiennejContext)_localctx).lewa = wyrazenie(0);
			setState(67);
			match(PRZYPISANIE);
			setState(68);
			((ZmianazmiennejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
	 
		public WyrazenieContext() { }
		public void copyFrom(WyrazenieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WyrazeniematematyczneContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode ZNAK_MATEMATYCZNY() { return getToken(ShadowParser.ZNAK_MATEMATYCZNY, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniematematyczneContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniematematyczne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniematematyczne(this);
		}
	}
	public static class WyrazeniezwiekszenieContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public TerminalNode ZWIEKSZENIE() { return getToken(ShadowParser.ZWIEKSZENIE, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazeniezwiekszenieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniezwiekszenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniezwiekszenie(this);
		}
	}
	public static class WyrazeniezmniejszenieContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public TerminalNode ZMNIEJSZENIE() { return getToken(ShadowParser.ZMNIEJSZENIE, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazeniezmniejszenieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniezmniejszenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniezmniejszenie(this);
		}
	}
	public static class WyrazeniefunkcjaContext extends WyrazenieContext {
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public WyrazeniefunkcjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniefunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniefunkcja(this);
		}
	}
	public static class KolejnedzialanieContext extends WyrazenieContext {
		public WyrazenieContext prawa;
		public TerminalNode ZNAK_MATEMATYCZNY() { return getToken(ShadowParser.ZNAK_MATEMATYCZNY, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public KolejnedzialanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterKolejnedzialanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitKolejnedzialanie(this);
		}
	}
	public static class WyrazenienawiasContext extends WyrazenieContext {
		public TerminalNode LEWYNAW() { return getToken(ShadowParser.LEWYNAW, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode PRAWYNAW() { return getToken(ShadowParser.PRAWYNAW, 0); }
		public WyrazenienawiasContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazenienawias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazenienawias(this);
		}
	}
	public static class WyrazenieznakoweContext extends WyrazenieContext {
		public TerminalNode ZNAKI() { return getToken(ShadowParser.ZNAKI, 0); }
		public WyrazenieznakoweContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazenieznakowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazenieznakowe(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_wyrazenie, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEWYNAW:
				{
				_localctx = new WyrazenienawiasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				match(LEWYNAW);
				setState(72);
				wyrazenie(0);
				setState(73);
				match(PRAWYNAW);
				}
				break;
			case FUNKCJA:
				{
				_localctx = new WyrazeniefunkcjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				wywolanie_funkcji();
				}
				break;
			case ZNAK_MATEMATYCZNY:
				{
				_localctx = new KolejnedzialanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ZNAK_MATEMATYCZNY);
				setState(77);
				((KolejnedzialanieContext)_localctx).prawa = wyrazenie(2);
				}
				break;
			case ZNAKI:
				{
				_localctx = new WyrazenieznakoweContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(ZNAKI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniematematyczneContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniematematyczneContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(81);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(82);
						match(ZNAK_MATEMATYCZNY);
						setState(83);
						((WyrazeniematematyczneContext)_localctx).prawa = wyrazenie(8);
						}
						break;
					case 2:
						{
						_localctx = new WyrazeniezwiekszenieContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniezwiekszenieContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(84);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(85);
						match(ZWIEKSZENIE);
						}
						break;
					case 3:
						{
						_localctx = new WyrazeniezmniejszenieContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniezmniejszenieContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(86);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(87);
						match(ZMNIEJSZENIE);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Zapytanie_jesliContext extends ParserRuleContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode JESLI() { return getToken(ShadowParser.JESLI, 0); }
		public TerminalNode LEWYNAW() { return getToken(ShadowParser.LEWYNAW, 0); }
		public TerminalNode PRAWYNAW() { return getToken(ShadowParser.PRAWYNAW, 0); }
		public TerminalNode ZNAKI() { return getToken(ShadowParser.ZNAKI, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode POROWNANIE() { return getToken(ShadowParser.POROWNANIE, 0); }
		public TerminalNode WIEKSZE() { return getToken(ShadowParser.WIEKSZE, 0); }
		public TerminalNode MNIEJSZE() { return getToken(ShadowParser.MNIEJSZE, 0); }
		public TerminalNode NIEROWNE() { return getToken(ShadowParser.NIEROWNE, 0); }
		public Zapytanie_jesliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapytanie_jesli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterZapytanie_jesli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitZapytanie_jesli(this);
		}
	}

	public final Zapytanie_jesliContext zapytanie_jesli() throws RecognitionException {
		Zapytanie_jesliContext _localctx = new Zapytanie_jesliContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_zapytanie_jesli);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(JESLI);
			setState(94);
			match(LEWYNAW);
			setState(95);
			((Zapytanie_jesliContext)_localctx).lewa = wyrazenie(0);
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WIEKSZE) | (1L << MNIEJSZE) | (1L << POROWNANIE) | (1L << NIEROWNE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			((Zapytanie_jesliContext)_localctx).prawa = wyrazenie(0);
			setState(98);
			match(PRAWYNAW);
			setState(99);
			match(ZNAKI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Petla_dopokiContext extends ParserRuleContext {
		public TerminalNode DOPOKI() { return getToken(ShadowParser.DOPOKI, 0); }
		public Petla_dopokiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petla_dopoki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterPetla_dopoki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitPetla_dopoki(this);
		}
	}

	public final Petla_dopokiContext petla_dopoki() throws RecognitionException {
		Petla_dopokiContext _localctx = new Petla_dopokiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_petla_dopoki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DOPOKI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Petla_dlaContext extends ParserRuleContext {
		public TerminalNode DLA() { return getToken(ShadowParser.DLA, 0); }
		public Petla_dlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petla_dla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterPetla_dla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitPetla_dla(this);
		}
	}

	public final Petla_dlaContext petla_dla() throws RecognitionException {
		Petla_dlaContext _localctx = new Petla_dlaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_petla_dla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DLA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deklaracja_funkcjiContext extends ParserRuleContext {
		public TerminalNode FUNKCJA() { return getToken(ShadowParser.FUNKCJA, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public TerminalNode LNAWIAS() { return getToken(ShadowParser.LNAWIAS, 0); }
		public TerminalNode PNAWIAS() { return getToken(ShadowParser.PNAWIAS, 0); }
		public List<KomunikatContext> komunikat() {
			return getRuleContexts(KomunikatContext.class);
		}
		public KomunikatContext komunikat(int i) {
			return getRuleContext(KomunikatContext.class,i);
		}
		public Deklaracja_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterDeklaracja_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitDeklaracja_funkcji(this);
		}
	}

	public final Deklaracja_funkcjiContext deklaracja_funkcji() throws RecognitionException {
		Deklaracja_funkcjiContext _localctx = new Deklaracja_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deklaracja_funkcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FUNKCJA);
			setState(106);
			wyrazenie(0);
			setState(107);
			match(PRZYPISANIE);
			setState(108);
			match(LNAWIAS);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LEWYNAW) | (1L << STALA) | (1L << ZMIENNA) | (1L << DLA) | (1L << JESLI) | (1L << DOPOKI) | (1L << FUNKCJA) | (1L << ZNAK_MATEMATYCZNY) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(109);
				komunikat();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(PNAWIAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wywolanie_funkcjiContext extends ParserRuleContext {
		public TerminalNode FUNKCJA() { return getToken(ShadowParser.FUNKCJA, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode LNAWIAS() { return getToken(ShadowParser.LNAWIAS, 0); }
		public TerminalNode PNAWIAS() { return getToken(ShadowParser.PNAWIAS, 0); }
		public Wywolanie_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wywolanie_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWywolanie_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWywolanie_funkcji(this);
		}
	}

	public final Wywolanie_funkcjiContext wywolanie_funkcji() throws RecognitionException {
		Wywolanie_funkcjiContext _localctx = new Wywolanie_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wywolanie_funkcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(FUNKCJA);
			setState(118);
			wyrazenie(0);
			setState(119);
			match(LNAWIAS);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEWYNAW) | (1L << FUNKCJA) | (1L << ZNAK_MATEMATYCZNY) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(120);
				wyrazenie(0);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(PNAWIAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\5\3\5"+
		"\7\5\66\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t[\n\t\f\t\16\t^\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3\16\3\16\3\16"+
		"\2\3\20\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\6\2\30\30\32\33\37 .."+
		"\4\2\35\36\"#\2\u0089\2!\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2"+
		"\n:\3\2\2\2\f?\3\2\2\2\16D\3\2\2\2\20Q\3\2\2\2\22_\3\2\2\2\24g\3\2\2\2"+
		"\26i\3\2\2\2\30k\3\2\2\2\32w\3\2\2\2\34\35\5\4\3\2\35\36\7\31\2\2\36 "+
		"\3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!"+
		"\3\2\2\2$\60\5\20\t\2%\60\5\n\6\2&\60\5\f\7\2\'\60\5\16\b\2(\60\5\22\n"+
		"\2)\60\5\24\13\2*\60\5\26\f\2+\60\5\30\r\2,\60\5\32\16\2-\60\5\6\4\2."+
		"\60\5\b\5\2/$\3\2\2\2/%\3\2\2\2/&\3\2\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2"+
		"\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62"+
		"\7\3\2\2\62\7\3\2\2\2\63\67\7\4\2\2\64\66\t\2\2\2\65\64\3\2\2\2\669\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2:;\7\7\2\2;<\5"+
		"\20\t\2<=\7\34\2\2=>\5\20\t\2>\13\3\2\2\2?@\7\b\2\2@A\5\20\t\2AB\7\34"+
		"\2\2BC\5\20\t\2C\r\3\2\2\2DE\5\20\t\2EF\7\34\2\2FG\5\20\t\2G\17\3\2\2"+
		"\2HI\b\t\1\2IJ\7\5\2\2JK\5\20\t\2KL\7\6\2\2LR\3\2\2\2MR\5\32\16\2NO\7"+
		"(\2\2OR\5\20\t\4PR\7.\2\2QH\3\2\2\2QM\3\2\2\2QN\3\2\2\2QP\3\2\2\2R\\\3"+
		"\2\2\2ST\f\t\2\2TU\7(\2\2U[\5\20\t\nVW\f\b\2\2W[\7&\2\2XY\f\7\2\2Y[\7"+
		"\'\2\2ZS\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"\21\3\2\2\2^\\\3\2\2\2_`\7\13\2\2`a\7\5\2\2ab\5\20\t\2bc\t\3\2\2cd\5\20"+
		"\t\2de\7\6\2\2ef\7.\2\2f\23\3\2\2\2gh\7\16\2\2h\25\3\2\2\2ij\7\n\2\2j"+
		"\27\3\2\2\2kl\7\17\2\2lm\5\20\t\2mn\7\34\2\2nr\7\22\2\2oq\5\4\3\2po\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\23\2\2v\31"+
		"\3\2\2\2wx\7\17\2\2xy\5\20\t\2y}\7\22\2\2z|\5\20\t\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\23"+
		"\2\2\u0081\33\3\2\2\2\n!/\67QZ\\r}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}