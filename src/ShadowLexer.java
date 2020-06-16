// Generated from ./Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShadowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STALA=1, ZMIENNA=2, ALBO=3, DLA=4, JESLI=5, IDZ=6, ZWROC=7, DOPOKI=8, 
		FUNKCJA=9, BOOLEAN=10, NIC=11, LNAWIAS=12, PNAWIAS=13, LKLAMROWY=14, PKLAMROWY=15, 
		LKWADRAT=16, PKWADRAT=17, CUDZYSLOW=18, SREDNIK=19, PRZECINEK=20, KROPKA=21, 
		PRZYPISANIE=22, WIEKSZE=23, MNIEJSZE=24, WYKRZYKNIK=25, PYTAJNIK=26, DWUKROPEK=27, 
		POROWNANIE=28, NIEROWNE=29, I=30, LUB=31, ZWIEKSZENIE=32, ZMNIEJSZENIE=33, 
		PLUS=34, MINUS=35, MNOZENIE=36, DZIELENIE=37, POTEGOWANIE=38, BITI=39, 
		BITLUB=40, MODULO=41, STRZALKA=42, PODWOJNYDWUKROPEK=43, ZNAKI=44, LICZBY=45, 
		BIALE_ZNAKI=46, KOMENTARZ=47, LINIA_KOMENTARZA=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STALA", "ZMIENNA", "ALBO", "DLA", "JESLI", "IDZ", "ZWROC", "DOPOKI", 
			"FUNKCJA", "BOOLEAN", "NIC", "LNAWIAS", "PNAWIAS", "LKLAMROWY", "PKLAMROWY", 
			"LKWADRAT", "PKWADRAT", "CUDZYSLOW", "SREDNIK", "PRZECINEK", "KROPKA", 
			"PRZYPISANIE", "WIEKSZE", "MNIEJSZE", "WYKRZYKNIK", "PYTAJNIK", "DWUKROPEK", 
			"POROWNANIE", "NIEROWNE", "I", "LUB", "ZWIEKSZENIE", "ZMNIEJSZENIE", 
			"PLUS", "MINUS", "MNOZENIE", "DZIELENIE", "POTEGOWANIE", "BITI", "BITLUB", 
			"MODULO", "STRZALKA", "PODWOJNYDWUKROPEK", "CYFRY", "ZNAKI", "LICZBY", 
			"BIALE_ZNAKI", "KOMENTARZ", "LINIA_KOMENTARZA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stala'", "'zmienna'", "'albo'", "'dla'", "'jesli'", "'idz'", 
			"'zwroc'", "'dopoki'", "'funkcja'", null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'\"'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'?'", "':'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'&'", "'|'", "'%'", "'->'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STALA", "ZMIENNA", "ALBO", "DLA", "JESLI", "IDZ", "ZWROC", "DOPOKI", 
			"FUNKCJA", "BOOLEAN", "NIC", "LNAWIAS", "PNAWIAS", "LKLAMROWY", "PKLAMROWY", 
			"LKWADRAT", "PKWADRAT", "CUDZYSLOW", "SREDNIK", "PRZECINEK", "KROPKA", 
			"PRZYPISANIE", "WIEKSZE", "MNIEJSZE", "WYKRZYKNIK", "PYTAJNIK", "DWUKROPEK", 
			"POROWNANIE", "NIEROWNE", "I", "LUB", "ZWIEKSZENIE", "ZMNIEJSZENIE", 
			"PLUS", "MINUS", "MNOZENIE", "DZIELENIE", "POTEGOWANIE", "BITI", "BITLUB", 
			"MODULO", "STRZALKA", "PODWOJNYDWUKROPEK", "ZNAKI", "LICZBY", "BIALE_ZNAKI", 
			"KOMENTARZ", "LINIA_KOMENTARZA"
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


	public ShadowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shadow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\6-\u00f7\n-\r-\16-\u00f8\3.\3"+
		".\3.\7.\u00fe\n.\f.\16.\u0101\13.\3/\6/\u0104\n/\r/\16/\u0105\3/\3/\6"+
		"/\u010a\n/\r/\16/\u010b\5/\u010e\n/\3\60\6\60\u0111\n\60\r\60\16\60\u0112"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u011b\n\61\f\61\16\61\u011e\13\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0129\n\62\f\62\16"+
		"\62\u012c\13\62\3\62\3\62\3\u011c\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2"+
		"[.]/_\60a\61c\62\3\2\b\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\4\2..\60\60\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5k\3\2\2\2\7s\3"+
		"\2\2\2\tx\3\2\2\2\13|\3\2\2\2\r\u0082\3\2\2\2\17\u0086\3\2\2\2\21\u008c"+
		"\3\2\2\2\23\u0093\3\2\2\2\25\u00a6\3\2\2\2\27\u00a8\3\2\2\2\31\u00ad\3"+
		"\2\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2\2\2!\u00b5\3\2\2"+
		"\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd\3\2\2\2+\u00bf"+
		"\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2"+
		"\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00d0\3\2\2\2=\u00d3"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d9\3\2\2\2C\u00dc\3\2\2\2E\u00df\3\2\2\2G"+
		"\u00e1\3\2\2\2I\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00e9\3\2"+
		"\2\2Q\u00eb\3\2\2\2S\u00ed\3\2\2\2U\u00ef\3\2\2\2W\u00f2\3\2\2\2Y\u00f6"+
		"\3\2\2\2[\u00fa\3\2\2\2]\u0103\3\2\2\2_\u0110\3\2\2\2a\u0116\3\2\2\2c"+
		"\u0124\3\2\2\2ef\7u\2\2fg\7v\2\2gh\7c\2\2hi\7n\2\2ij\7c\2\2j\4\3\2\2\2"+
		"kl\7|\2\2lm\7o\2\2mn\7k\2\2no\7g\2\2op\7p\2\2pq\7p\2\2qr\7c\2\2r\6\3\2"+
		"\2\2st\7c\2\2tu\7n\2\2uv\7d\2\2vw\7q\2\2w\b\3\2\2\2xy\7f\2\2yz\7n\2\2"+
		"z{\7c\2\2{\n\3\2\2\2|}\7l\2\2}~\7g\2\2~\177\7u\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7k\2\2\u0081\f\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7f\2\2\u0084"+
		"\u0085\7|\2\2\u0085\16\3\2\2\2\u0086\u0087\7|\2\2\u0087\u0088\7y\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a\u008b\7e\2\2\u008b\20\3\2\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7q\2\2\u008e\u008f\7r\2\2\u008f\u0090\7q\2\2"+
		"\u0090\u0091\7m\2\2\u0091\u0092\7k\2\2\u0092\22\3\2\2\2\u0093\u0094\7"+
		"h\2\2\u0094\u0095\7w\2\2\u0095\u0096\7p\2\2\u0096\u0097\7m\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7l\2\2\u0099\u009a\7c\2\2\u009a\24\3\2\2\2\u009b\u009c"+
		"\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7c\2\2\u009e\u009f\7y\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a7\7c\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a7\7|\2\2\u00a6\u009b"+
		"\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7n\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\7*\2\2\u00ae\32\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\34\3\2\2\2\u00b1"+
		"\u00b2\7}\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4 \3\2\2\2\u00b5"+
		"\u00b6\7]\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7$\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7.\2\2\u00be*\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0,\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\60\3\2\2\2\u00c5\u00c6"+
		"\7>\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7#\2\2\u00c8\64\3\2\2\2\u00c9\u00ca"+
		"\7A\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc8\3\2\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\u00cf\7?\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7(\2\2\u00d5>\3"+
		"\2\2\2\u00d6\u00d7\7~\2\2\u00d7\u00d8\7~\2\2\u00d8@\3\2\2\2\u00d9\u00da"+
		"\7-\2\2\u00da\u00db\7-\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\u00de"+
		"\7/\2\2\u00deD\3\2\2\2\u00df\u00e0\7-\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7"+
		"/\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7\61"+
		"\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7`\2\2\u00e8N\3\2\2\2\u00e9\u00ea\7(\2"+
		"\2\u00eaP\3\2\2\2\u00eb\u00ec\7~\2\2\u00ecR\3\2\2\2\u00ed\u00ee\7\'\2"+
		"\2\u00eeT\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7@\2\2\u00f1V\3\2\2\2"+
		"\u00f2\u00f3\7<\2\2\u00f3\u00f4\7<\2\2\u00f4X\3\2\2\2\u00f5\u00f7\t\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9Z\3\2\2\2\u00fa\u00ff\t\3\2\2\u00fb\u00fe\t\4\2\2"+
		"\u00fc\u00fe\5]/\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\\\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0104\5Y-\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010d\3\2\2\2\u0107\u0109"+
		"\t\5\2\2\u0108\u010a\5Y-\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e^\3\2\2\2\u010f\u0111\t\6\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\b\60\2\2\u0115`\3\2\2\2\u0116\u0117\7\61\2"+
		"\2\u0117\u0118\7,\2\2\u0118\u011c\3\2\2\2\u0119\u011b\13\2\2\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7,\2\2\u0120\u0121\7\61"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\61\3\2\u0123b\3\2\2\2\u0124\u0125"+
		"\7\61\2\2\u0125\u0126\7\61\2\2\u0126\u012a\3\2\2\2\u0127\u0129\n\7\2\2"+
		"\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\62\3\2"+
		"\u012ed\3\2\2\2\r\2\u00a6\u00f8\u00fd\u00ff\u0105\u010b\u010d\u0112\u011c"+
		"\u012a\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}