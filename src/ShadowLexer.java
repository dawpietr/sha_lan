// Generated from ./Shadow.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShadowLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, LEWYNAW = 3, PRAWYNAW = 4, STALA = 5, ZMIENNA = 6, ALBO = 7, DLA = 8,
            JESLI = 9, IDZ = 10, ZWROC = 11, DOPOKI = 12, FUNKCJA = 13, BOOLEAN = 14, NIC = 15,
            LNAWIAS = 16, PNAWIAS = 17, LKLAMROWY = 18, PKLAMROWY = 19, LKWADRAT = 20, PKWADRAT = 21,
            CUDZYSLOW = 22, SREDNIK = 23, PRZECINEK = 24, KROPKA = 25, PRZYPISANIE = 26, WIEKSZE = 27,
            MNIEJSZE = 28, WYKRZYKNIK = 29, PYTAJNIK = 30, DWUKROPEK = 31, POROWNANIE = 32,
            NIEROWNE = 33, I = 34, LUB = 35, ZWIEKSZENIE = 36, ZMNIEJSZENIE = 37, ZNAK_MATEMATYCZNY = 38,
            BITI = 39, BITLUB = 40, MODULO = 41, STRZALKA = 42, PODWOJNYDWUKROPEK = 43, ZNAKI = 44,
            LICZBY = 45, BIALE_ZNAKI = 46, KOMENTARZ = 47, LINIA_KOMENTARZA = 48;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0137\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3" +
                    "\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3" +
                    "\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17" +
                    "\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25" +
                    "\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34" +
                    "\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3" +
                    "#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3," +
                    "\3,\3-\3-\3.\3.\3.\7.\u0103\n.\f.\16.\u0106\13.\3/\3/\6/\u010a\n/\r/\16" +
                    "/\u010b\3/\3/\6/\u0110\n/\r/\16/\u0111\5/\u0114\n/\5/\u0116\n/\3\60\6" +
                    "\60\u0119\n\60\r\60\16\60\u011a\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0123" +
                    "\n\61\f\61\16\61\u0126\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3" +
                    "\62\7\62\u0131\n\62\f\62\16\62\u0134\13\62\3\62\3\62\3\u0124\2\63\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21" +
                    "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!" +
                    "A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/_\60a\61c\62\3\2\13\5\2**]]}}\5\2++_" +
                    "_\177\177\6\2,-//\61\61``\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\4\2..\60\60" +
                    "\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7" +
                    "\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2" +
                    "\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2" +
                    "\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2" +
                    "\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2" +
                    "\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2" +
                    "\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M" +
                    "\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2" +
                    "\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2\2" +
                    "\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\r{\3\2\2\2\17\u0083\3\2\2\2\21\u0088" +
                    "\3\2\2\2\23\u008c\3\2\2\2\25\u0092\3\2\2\2\27\u0096\3\2\2\2\31\u009c\3" +
                    "\2\2\2\33\u00a3\3\2\2\2\35\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00bd\3\2\2" +
                    "\2#\u00bf\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7" +
                    "\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2" +
                    "\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00d9" +
                    "\3\2\2\2?\u00db\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E\u00e3\3\2\2\2G" +
                    "\u00e6\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2\2\2M\u00ef\3\2\2\2O\u00f1\3\2" +
                    "\2\2Q\u00f3\3\2\2\2S\u00f5\3\2\2\2U\u00f7\3\2\2\2W\u00fa\3\2\2\2Y\u00fd" +
                    "\3\2\2\2[\u00ff\3\2\2\2]\u0115\3\2\2\2_\u0118\3\2\2\2a\u011e\3\2\2\2c" +
                    "\u012c\3\2\2\2ef\7G\2\2fg\7Z\2\2gh\7K\2\2hi\7V\2\2i\4\3\2\2\2jk\7y\2\2" +
                    "kl\7{\2\2lm\7r\2\2mn\7k\2\2no\7u\2\2op\7|\2\2p\6\3\2\2\2qr\t\2\2\2r\b" +
                    "\3\2\2\2st\t\3\2\2t\n\3\2\2\2uv\7u\2\2vw\7v\2\2wx\7c\2\2xy\7n\2\2yz\7" +
                    "c\2\2z\f\3\2\2\2{|\7|\2\2|}\7o\2\2}~\7k\2\2~\177\7g\2\2\177\u0080\7p\2" +
                    "\2\u0080\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082\16\3\2\2\2\u0083\u0084" +
                    "\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7d\2\2\u0086\u0087\7q\2\2\u0087" +
                    "\20\3\2\2\2\u0088\u0089\7f\2\2\u0089\u008a\7n\2\2\u008a\u008b\7c\2\2\u008b" +
                    "\22\3\2\2\2\u008c\u008d\7l\2\2\u008d\u008e\7g\2\2\u008e\u008f\7u\2\2\u008f" +
                    "\u0090\7n\2\2\u0090\u0091\7k\2\2\u0091\24\3\2\2\2\u0092\u0093\7k\2\2\u0093" +
                    "\u0094\7f\2\2\u0094\u0095\7|\2\2\u0095\26\3\2\2\2\u0096\u0097\7|\2\2\u0097" +
                    "\u0098\7y\2\2\u0098\u0099\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7e\2\2" +
                    "\u009b\30\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e\7q\2\2\u009e\u009f\7" +
                    "r\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7m\2\2\u00a1\u00a2\7k\2\2\u00a2\32" +
                    "\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7p\2\2\u00a6" +
                    "\u00a7\7m\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7l\2\2\u00a9\u00aa\7c\2\2" +
                    "\u00aa\34\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7" +
                    "c\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7f\2\2\u00b0\u00b7\7c\2\2\u00b1\u00b2" +
                    "\7h\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5" +
                    "\u00b7\7|\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\36\3\2\2\2" +
                    "\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc" +
                    "\7n\2\2\u00bc \3\2\2\2\u00bd\u00be\7*\2\2\u00be\"\3\2\2\2\u00bf\u00c0" +
                    "\7+\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7}\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7" +
                    "\177\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6*\3\2\2\2\u00c7\u00c8" +
                    "\7_\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7" +
                    "=\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\62\3\2\2\2\u00cf\u00d0" +
                    "\7\60\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\66\3\2\2\2\u00d3\u00d4" +
                    "\7@\2\2\u00d48\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7" +
                    "#\2\2\u00d8<\3\2\2\2\u00d9\u00da\7A\2\2\u00da>\3\2\2\2\u00db\u00dc\7<" +
                    "\2\2\u00dc@\3\2\2\2\u00dd\u00de\7?\2\2\u00de\u00df\7?\2\2\u00dfB\3\2\2" +
                    "\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7?\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7" +
                    "(\2\2\u00e4\u00e5\7(\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7\u00e8" +
                    "\7~\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\u00eb\7-\2\2\u00ebJ\3" +
                    "\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7/\2\2\u00eeL\3\2\2\2\u00ef\u00f0" +
                    "\t\4\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2P\3\2\2\2\u00f3\u00f4" +
                    "\7~\2\2\u00f4R\3\2\2\2\u00f5\u00f6\7\'\2\2\u00f6T\3\2\2\2\u00f7\u00f8" +
                    "\7/\2\2\u00f8\u00f9\7@\2\2\u00f9V\3\2\2\2\u00fa\u00fb\7<\2\2\u00fb\u00fc" +
                    "\7<\2\2\u00fcX\3\2\2\2\u00fd\u00fe\t\5\2\2\u00feZ\3\2\2\2\u00ff\u0104" +
                    "\t\6\2\2\u0100\u0103\t\7\2\2\u0101\u0103\5]/\2\u0102\u0100\3\2\2\2\u0102" +
                    "\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2" +
                    "\2\2\u0105\\\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0116\5Y-\2\u0108\u010a" +
                    "\5Y-\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b" +
                    "\u010c\3\2\2\2\u010c\u0113\3\2\2\2\u010d\u010f\t\b\2\2\u010e\u0110\5Y" +
                    "-\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111" +
                    "\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u0114\3\2" +
                    "\2\2\u0114\u0116\3\2\2\2\u0115\u0107\3\2\2\2\u0115\u0109\3\2\2\2\u0116" +
                    "^\3\2\2\2\u0117\u0119\t\t\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2" +
                    "\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d" +
                    "\b\60\2\2\u011d`\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120\7,\2\2\u0120" +
                    "\u0124\3\2\2\2\u0121\u0123\13\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3" +
                    "\2\2\2\u0124\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\3\2\2\2\u0126" +
                    "\u0124\3\2\2\2\u0127\u0128\7,\2\2\u0128\u0129\7\61\2\2\u0129\u012a\3\2" +
                    "\2\2\u012a\u012b\b\61\3\2\u012bb\3\2\2\2\u012c\u012d\7\61\2\2\u012d\u012e" +
                    "\7\61\2\2\u012e\u0132\3\2\2\2\u012f\u0131\n\n\2\2\u0130\u012f\3\2\2\2" +
                    "\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135" +
                    "\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\62\3\2\u0136d\3\2\2\2\r\2\u00b6" +
                    "\u0102\u0104\u010b\u0111\u0113\u0115\u011a\u0124\u0132\4\b\2\2\2\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public ShadowLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
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

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'EXIT'", "'wypisz'", null, null, "'stala'", "'zmienna'", "'albo'",
                "'dla'", "'jesli'", "'idz'", "'zwroc'", "'dopoki'", "'funkcja'", null,
                "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", "';'", "','",
                "'.'", "'='", "'>'", "'<'", "'!'", "'?'", "':'", "'=='", "'!='", "'&&'",
                "'||'", "'++'", "'--'", null, "'&'", "'|'", "'%'", "'->'", "'::'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
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
    public String getGrammarFileName() {
        return "Shadow.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}