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
		T__0=1, T__1=2, LEWYNAW=3, PRAWYNAW=4, STALA=5, ZMIENNA=6, ALBO=7, DLA=8, 
		JESLI=9, IDZ=10, ZWROC=11, DOPOKI=12, FUNKCJA=13, BOOLEAN=14, NIC=15, 
		LNAWIAS=16, PNAWIAS=17, LKLAMROWY=18, PKLAMROWY=19, LKWADRAT=20, PKWADRAT=21, 
		CUDZYSLOW=22, SREDNIK=23, PRZECINEK=24, KROPKA=25, PRZYPISANIE=26, WIEKSZE=27, 
		MNIEJSZE=28, WYKRZYKNIK=29, PYTAJNIK=30, DWUKROPEK=31, POROWNANIE=32, 
		NIEROWNE=33, I=34, LUB=35, ZWIEKSZENIE=36, ZMNIEJSZENIE=37, ZNAK_MATEMATYCZNY=38, 
		BITI=39, BITLUB=40, MODULO=41, STRZALKA=42, PODWOJNYDWUKROPEK=43, ZNAKI=44, 
		LICZBY=45, BIALE_ZNAKI=46, KOMENTARZ=47, LINIA_KOMENTARZA=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LEWYNAW", "PRAWYNAW", "STALA", "ZMIENNA", "ALBO", "DLA", 
			"JESLI", "IDZ", "ZWROC", "DOPOKI", "FUNKCJA", "BOOLEAN", "NIC", "LNAWIAS", 
			"PNAWIAS", "LKLAMROWY", "PKLAMROWY", "LKWADRAT", "PKWADRAT", "CUDZYSLOW", 
			"SREDNIK", "PRZECINEK", "KROPKA", "PRZYPISANIE", "WIEKSZE", "MNIEJSZE", 
			"WYKRZYKNIK", "PYTAJNIK", "DWUKROPEK", "POROWNANIE", "NIEROWNE", "I", 
			"LUB", "ZWIEKSZENIE", "ZMNIEJSZENIE", "ZNAK_MATEMATYCZNY", "BITI", "BITLUB", 
			"MODULO", "STRZALKA", "PODWOJNYDWUKROPEK", "CYFRA", "ZNAKI", "LICZBY", 
			"BIALE_ZNAKI", "KOMENTARZ", "LINIA_KOMENTARZA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00bb\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\7.\u0107\n.\f.\16.\u010a\13.\3/\3/"+
		"\6/\u010e\n/\r/\16/\u010f\3/\3/\6/\u0114\n/\r/\16/\u0115\5/\u0118\n/\5"+
		"/\u011a\n/\3\60\6\60\u011d\n\60\r\60\16\60\u011e\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\7\61\u0127\n\61\f\61\16\61\u012a\13\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\7\62\u0135\n\62\f\62\16\62\u0138\13\62\3\62\3"+
		"\62\3\u0128\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/_\60a\61c\62\3\2"+
		"\t\6\2,-//\61\61``\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\4\2..\60\60\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\2\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2\2\7q\3\2\2"+
		"\2\tu\3\2\2\2\13y\3\2\2\2\r\177\3\2\2\2\17\u0087\3\2\2\2\21\u008c\3\2"+
		"\2\2\23\u0090\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2"+
		"\2\33\u00a7\3\2\2\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00c1\3\2\2\2#"+
		"\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3"+
		"\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2"+
		"\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00dd"+
		"\3\2\2\2?\u00df\3\2\2\2A\u00e1\3\2\2\2C\u00e4\3\2\2\2E\u00e7\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00ed\3\2\2\2K\u00f0\3\2\2\2M\u00f3\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00f7\3\2\2\2S\u00f9\3\2\2\2U\u00fb\3\2\2\2W\u00fe\3\2\2\2Y\u0101"+
		"\3\2\2\2[\u0103\3\2\2\2]\u0119\3\2\2\2_\u011c\3\2\2\2a\u0122\3\2\2\2c"+
		"\u0130\3\2\2\2ef\7G\2\2fg\7Z\2\2gh\7K\2\2hi\7V\2\2i\4\3\2\2\2jk\7y\2\2"+
		"kl\7{\2\2lm\7r\2\2mn\7k\2\2no\7u\2\2op\7|\2\2p\6\3\2\2\2qr\7*\2\2rs\7"+
		"]\2\2st\7}\2\2t\b\3\2\2\2uv\7+\2\2vw\7\177\2\2wx\7_\2\2x\n\3\2\2\2yz\7"+
		"u\2\2z{\7v\2\2{|\7c\2\2|}\7n\2\2}~\7c\2\2~\f\3\2\2\2\177\u0080\7|\2\2"+
		"\u0080\u0081\7o\2\2\u0081\u0082\7k\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7p\2\2\u0085\u0086\7c\2\2\u0086\16\3\2\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b"+
		"\20\3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7l\2\2\u0091\u0092\7g\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7k\2\2\u0095\24\3\2\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7f\2\2\u0098\u0099\7|\2\2\u0099\26\3\2\2\2\u009a\u009b\7|\2\2\u009b"+
		"\u009c\7y\2\2\u009c\u009d\7t\2\2\u009d\u009e\7q\2\2\u009e\u009f\7e\2\2"+
		"\u009f\30\3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7"+
		"r\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7m\2\2\u00a5\u00a6\7k\2\2\u00a6\32"+
		"\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7m\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7l\2\2\u00ad\u00ae\7c\2\2"+
		"\u00ae\34\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7"+
		"c\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7f\2\2\u00b4\u00bb\7c\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00bb\7|\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\36\3\2\2\2"+
		"\u00bc\u00bd\7p\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\7+\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7"+
		"\177\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\7_\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7"+
		"=\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\62\3\2\2\2\u00d3\u00d4"+
		"\7\60\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\66\3\2\2\2\u00d7\u00d8"+
		"\7@\2\2\u00d88\3\2\2\2\u00d9\u00da\7>\2\2\u00da:\3\2\2\2\u00db\u00dc\7"+
		"#\2\2\u00dc<\3\2\2\2\u00dd\u00de\7A\2\2\u00de>\3\2\2\2\u00df\u00e0\7<"+
		"\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3\7?\2\2\u00e3B\3\2\2"+
		"\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7?\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7"+
		"(\2\2\u00e8\u00e9\7(\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec"+
		"\7~\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7-\2\2\u00ee\u00ef\7-\2\2\u00efJ\3"+
		"\2\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\7/\2\2\u00f2L\3\2\2\2\u00f3\u00f4"+
		"\t\2\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6P\3\2\2\2\u00f7\u00f8"+
		"\7~\2\2\u00f8R\3\2\2\2\u00f9\u00fa\7\'\2\2\u00faT\3\2\2\2\u00fb\u00fc"+
		"\7/\2\2\u00fc\u00fd\7@\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff\u0100"+
		"\7<\2\2\u0100X\3\2\2\2\u0101\u0102\t\3\2\2\u0102Z\3\2\2\2\u0103\u0108"+
		"\t\4\2\2\u0104\u0107\t\5\2\2\u0105\u0107\5]/\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\\\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u011a\5Y-\2\u010c\u010e"+
		"\5Y-\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0117\3\2\2\2\u0111\u0113\t\6\2\2\u0112\u0114\5Y"+
		"-\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u010d\3\2\2\2\u011a"+
		"^\3\2\2\2\u011b\u011d\t\7\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\b\60\2\2\u0121`\3\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7,\2\2\u0124"+
		"\u0128\3\2\2\2\u0125\u0127\13\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\7\61\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\b\61\3\2\u012fb\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132"+
		"\7\61\2\2\u0132\u0136\3\2\2\2\u0133\u0135\n\b\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\b\62\3\2\u013ad\3\2\2\2\r\2\u00ba"+
		"\u0106\u0108\u010f\u0115\u0117\u0119\u011e\u0128\u0136\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}