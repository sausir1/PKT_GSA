// Generated from D:/untitled/PKT_GSA\GsaGrammar.g4 by ANTLR 4.9.1

package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GsaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, INT=2, STRING=3, BOOLEAN=4, CHAR_T=5, DEFINE=6, NUM=7, STRG=8, 
		CHAR=9, BOOL=10, MULT=11, DIV=12, ADD=13, SUBT=14, EQ=15, GT=16, LT=17, 
		EQGT=18, EQLT=19, PARANTESSES1=20, PARANTESSES2=21, CURLYBRACKET1=22, 
		CURLYBRACKET2=23, SQUAREBRACKET1=24, SQUAREBRACKET2=25, SCOL=26, COMMA=27, 
		RETURN=28, IF=29, ELIF=30, ELSE=31, FOR=32, TO=33, UNTIL=34, ID=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "INT", "STRING", "BOOLEAN", "CHAR_T", "DEFINE", "NUM", "STRG", 
			"CHAR", "BOOL", "MULT", "DIV", "ADD", "SUBT", "EQ", "GT", "LT", "EQGT", 
			"EQLT", "PARANTESSES1", "PARANTESSES2", "CURLYBRACKET1", "CURLYBRACKET2", 
			"SQUAREBRACKET1", "SQUAREBRACKET2", "SCOL", "COMMA", "RETURN", "IF", 
			"ELIF", "ELSE", "FOR", "TO", "UNTIL", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'int'", "'string'", "'bool'", "'char'", "'def'", null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'", "'=='", "'>'", "'<'", "'>='", 
			"'<='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'return'", 
			"'if'", "'elif'", "'else'", "'for'", "'to'", "'until'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "INT", "STRING", "BOOLEAN", "CHAR_T", "DEFINE", "NUM", 
			"STRG", "CHAR", "BOOL", "MULT", "DIV", "ADD", "SUBT", "EQ", "GT", "LT", 
			"EQGT", "EQLT", "PARANTESSES1", "PARANTESSES2", "CURLYBRACKET1", "CURLYBRACKET2", 
			"SQUAREBRACKET1", "SQUAREBRACKET2", "SCOL", "COMMA", "RETURN", "IF", 
			"ELIF", "ELSE", "FOR", "TO", "UNTIL", "ID", "WS"
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


	public GsaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GsaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\5\bi\n\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5\br\n\b\3\t\3\t\7\tv"+
		"\n\t\f\t\16\ty\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\6$\u00d3\n$\r$\16$\u00d4\3%\6%\u00d8\n%\r%\16%\u00d9\3%\3%\2\2&\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&\3\2\b\3\2\63;\3\2\62;\3\2$$\5\2\62;C\\c|\3\2))\5\2\13\f\17"+
		"\17\"\"\2\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7Q\3\2\2\2\tX\3\2\2"+
		"\2\13]\3\2\2\2\rb\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23|\3\2\2\2\25\u0089"+
		"\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0091\3"+
		"\2\2\2\37\u0093\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'"+
		"\u009d\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2"+
		"\2\2\61\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2"+
		"\29\u00b0\3\2\2\2;\u00b7\3\2\2\2=\u00ba\3\2\2\2?\u00bf\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c8\3\2\2\2E\u00cb\3\2\2\2G\u00d2\3\2\2\2I\u00d7\3\2\2\2K"+
		"L\7?\2\2L\4\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2P\6\3\2\2\2QR\7u\2\2RS\7"+
		"v\2\2ST\7t\2\2TU\7k\2\2UV\7p\2\2VW\7i\2\2W\b\3\2\2\2XY\7d\2\2YZ\7q\2\2"+
		"Z[\7q\2\2[\\\7n\2\2\\\n\3\2\2\2]^\7e\2\2^_\7j\2\2_`\7c\2\2`a\7t\2\2a\f"+
		"\3\2\2\2bc\7f\2\2cd\7g\2\2de\7h\2\2e\16\3\2\2\2fr\7\62\2\2gi\7/\2\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jn\t\2\2\2km\t\3\2\2lk\3\2\2\2mp\3\2\2\2n"+
		"l\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qf\3\2\2\2qh\3\2\2\2r\20\3\2\2"+
		"\2sw\t\4\2\2tv\t\5\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2"+
		"\2yw\3\2\2\2z{\t\4\2\2{\22\3\2\2\2|}\t\6\2\2}~\t\5\2\2~\177\t\6\2\2\177"+
		"\24\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u008a\7g\2\2\u0084\u0085\7h\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2"+
		"\u0087\u0088\7u\2\2\u0088\u008a\7g\2\2\u0089\u0080\3\2\2\2\u0089\u0084"+
		"\3\2\2\2\u008a\26\3\2\2\2\u008b\u008c\7,\2\2\u008c\30\3\2\2\2\u008d\u008e"+
		"\7\61\2\2\u008e\32\3\2\2\2\u008f\u0090\7-\2\2\u0090\34\3\2\2\2\u0091\u0092"+
		"\7/\2\2\u0092\36\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095 "+
		"\3\2\2\2\u0096\u0097\7@\2\2\u0097\"\3\2\2\2\u0098\u0099\7>\2\2\u0099$"+
		"\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c&\3\2\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u009f\7?\2\2\u009f(\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1*\3"+
		"\2\2\2\u00a2\u00a3\7+\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5.\3\2"+
		"\2\2\u00a6\u00a7\7\177\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9\62"+
		"\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7=\2\2\u00ad"+
		"\66\3\2\2\2\u00ae\u00af\7.\2\2\u00af8\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7p\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2"+
		"\2\u00b9<\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7"+
		"k\2\2\u00bd\u00be\7h\2\2\u00be>\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7B\3\2\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7q\2\2\u00caD\3\2\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"F\3\2\2\2\u00d1\u00d3\t\5\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5H\3\2\2\2\u00d6\u00d8\t"+
		"\7\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b%\2\2\u00dcJ\3\2\2\2\n"+
		"\2hnqw\u0089\u00d4\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}