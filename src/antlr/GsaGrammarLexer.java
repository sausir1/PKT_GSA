// Generated from C:/Users/Owner/IdeaProjects/Antlr4GSA\GsaGrammar.g4 by ANTLR 4.9.1

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
		CURLYBRACKET2=23, COMMA=24, RETURN=25, IF=26, ELIF=27, ELSE=28, FOR=29, 
		TO=30, UNTIL=31, ID=32, WS=33;
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
			"COMMA", "RETURN", "IF", "ELIF", "ELSE", "FOR", "TO", "UNTIL", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'int'", "'string'", "'bool'", "'char'", "'def'", null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'", "'=='", "'>'", "'<'", "'>='", 
			"'<='", "'('", "')'", "'{'", "'}'", "','", "'return'", "'if'", "'elif'", 
			"'else'", "'for'", "'to'", "'until'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "INT", "STRING", "BOOLEAN", "CHAR_T", "DEFINE", "NUM", 
			"STRG", "CHAR", "BOOL", "MULT", "DIV", "ADD", "SUBT", "EQ", "GT", "LT", 
			"EQGT", "EQLT", "PARANTESSES1", "PARANTESSES2", "CURLYBRACKET1", "CURLYBRACKET2", 
			"COMMA", "RETURN", "IF", "ELIF", "ELSE", "FOR", "TO", "UNTIL", "ID", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\bc\n\b\3"+
		"\b\3\b\7\bg\n\b\f\b\16\bj\13\b\5\bl\n\b\3\t\3\t\7\tp\n\t\f\t\16\ts\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0084\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00c7\n!\r!\16!\u00c8"+
		"\3\"\6\"\u00cc\n\"\r\"\16\"\u00cd\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\b\3\2\63"+
		";\3\2\62;\3\2$$\5\2\62;C\\c|\3\2))\5\2\13\f\17\17\"\"\2\u00d7\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7K\3"+
		"\2\2\2\tR\3\2\2\2\13W\3\2\2\2\r\\\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23v"+
		"\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3"+
		"\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2"+
		"%\u0094\3\2\2\2\'\u0097\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3"+
		"\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00ab\3\2\2"+
		"\2\67\u00ae\3\2\2\29\u00b3\3\2\2\2;\u00b8\3\2\2\2=\u00bc\3\2\2\2?\u00bf"+
		"\3\2\2\2A\u00c6\3\2\2\2C\u00cb\3\2\2\2EF\7?\2\2F\4\3\2\2\2GH\7k\2\2HI"+
		"\7p\2\2IJ\7v\2\2J\6\3\2\2\2KL\7u\2\2LM\7v\2\2MN\7t\2\2NO\7k\2\2OP\7p\2"+
		"\2PQ\7i\2\2Q\b\3\2\2\2RS\7d\2\2ST\7q\2\2TU\7q\2\2UV\7n\2\2V\n\3\2\2\2"+
		"WX\7e\2\2XY\7j\2\2YZ\7c\2\2Z[\7t\2\2[\f\3\2\2\2\\]\7f\2\2]^\7g\2\2^_\7"+
		"h\2\2_\16\3\2\2\2`l\7\62\2\2ac\7/\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dh"+
		"\t\2\2\2eg\t\3\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2j"+
		"h\3\2\2\2k`\3\2\2\2kb\3\2\2\2l\20\3\2\2\2mq\t\4\2\2np\t\5\2\2on\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\t\4\2\2u\22\3\2"+
		"\2\2vw\t\6\2\2wx\t\5\2\2xy\t\6\2\2y\24\3\2\2\2z{\7v\2\2{|\7t\2\2|}\7w"+
		"\2\2}\u0084\7g\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7u\2\2\u0082\u0084\7g\2\2\u0083z\3\2\2\2\u0083~\3\2\2\2\u0084\26"+
		"\3\2\2\2\u0085\u0086\7,\2\2\u0086\30\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7-\2\2\u008a\34\3\2\2\2\u008b\u008c\7/\2\2\u008c"+
		"\36\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7@\2\2\u0091\"\3\2\2\2\u0092\u0093\7>\2\2\u0093$\3\2\2\2\u0094"+
		"\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096&\3\2\2\2\u0097\u0098\7>\2\2\u0098"+
		"\u0099\7?\2\2\u0099(\3\2\2\2\u009a\u009b\7*\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\7+\2\2\u009d,\3\2\2\2\u009e\u009f\7}\2\2\u009f.\3\2\2\2\u00a0\u00a1\7"+
		"\177\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\62\3\2\2\2\u00a4\u00a5"+
		"\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b28\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7:\3\2\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb<\3\2\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7q\2\2\u00be>\3\2\2\2\u00bf\u00c0\7w\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4@\3\2\2\2\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9B\3\2\2\2\u00ca\u00cc"+
		"\t\7\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\"\2\2\u00d0D\3\2\2\2"+
		"\n\2bhkq\u0083\u00c8\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}