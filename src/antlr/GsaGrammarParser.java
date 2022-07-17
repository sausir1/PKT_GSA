// Generated from D:/untitled/PKT_GSA\GsaGrammar.g4 by ANTLR 4.9.1

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GsaGrammarParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_array_init = 2, RULE_array_elem = 3, 
		RULE_expr = 4, RULE_statement = 5, RULE_conditionalStatement = 6, RULE_ifStmt = 7, 
		RULE_elifStmt = 8, RULE_elseStmt = 9, RULE_ifBody = 10, RULE_conditionBlock = 11, 
		RULE_iterationStatement = 12, RULE_blockStatement = 13, RULE_block = 14, 
		RULE_methodArgs = 15, RULE_methodArg = 16, RULE_args = 17, RULE_argumentList = 18, 
		RULE_argument = 19, RULE_method = 20, RULE_returnStatement = 21, RULE_methodInvocation = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "array_init", "array_elem", "expr", "statement", "conditionalStatement", 
			"ifStmt", "elifStmt", "elseStmt", "ifBody", "conditionBlock", "iterationStatement", 
			"blockStatement", "block", "methodArgs", "methodArg", "args", "argumentList", 
			"argument", "method", "returnStatement", "methodInvocation"
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

	@Override
	public String getGrammarFileName() { return "GsaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GsaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(GsaGrammarParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodInvocationContext> methodInvocation() {
			return getRuleContexts(MethodInvocationContext.class);
		}
		public MethodInvocationContext methodInvocation(int i) {
			return getRuleContext(MethodInvocationContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					decl();
					}
					break;
				case 2:
					{
					setState(47);
					expr(0);
					}
					break;
				case 3:
					{
					setState(48);
					statement();
					}
					break;
				case 4:
					{
					setState(49);
					methodInvocation();
					}
					break;
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0) );
			setState(54);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDeclarationContext extends DeclContext {
		public TerminalNode INT() { return getToken(GsaGrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDeclarationContext extends DeclContext {
		public TerminalNode STRING() { return getToken(GsaGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public TerminalNode STRG() { return getToken(GsaGrammarParser.STRG, 0); }
		public StringDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodDeclarationContext extends DeclContext {
		public TerminalNode DEFINE() { return getToken(GsaGrammarParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharDeclarationContext extends DeclContext {
		public TerminalNode CHAR_T() { return getToken(GsaGrammarParser.CHAR_T, 0); }
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public TerminalNode CHAR() { return getToken(GsaGrammarParser.CHAR, 0); }
		public CharDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterCharDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitCharDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitCharDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArrayDeclarationContext extends DeclContext {
		public List<TerminalNode> INT() { return getTokens(GsaGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GsaGrammarParser.INT, i);
		}
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode SQUAREBRACKET1() { return getToken(GsaGrammarParser.SQUAREBRACKET1, 0); }
		public TerminalNode SQUAREBRACKET2() { return getToken(GsaGrammarParser.SQUAREBRACKET2, 0); }
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public IntArrayDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIntArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIntArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIntArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolDeclarationContext extends DeclContext {
		public TerminalNode BOOLEAN() { return getToken(GsaGrammarParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public TerminalNode BOOL() { return getToken(GsaGrammarParser.BOOL, 0); }
		public BoolDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(INT);
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(STRING);
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				match(STRG);
				}
				break;
			case 3:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(BOOLEAN);
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(67);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new CharDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(CHAR_T);
				setState(69);
				match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				match(CHAR);
				}
				break;
			case 5:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(DEFINE);
				setState(73);
				match(ID);
				setState(74);
				method();
				}
				break;
			case 6:
				_localctx = new IntArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(INT);
				setState(76);
				match(ID);
				setState(77);
				match(SQUAREBRACKET1);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(78);
					match(INT);
					}
				}

				setState(81);
				match(SQUAREBRACKET2);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(82);
					match(ASSIGN);
					setState(83);
					match(CURLYBRACKET1);
					setState(84);
					array_init();
					setState(85);
					match(CURLYBRACKET2);
					}
				}

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

	public static class Array_initContext extends ParserRuleContext {
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
	 
		public Array_initContext() { }
		public void copyFrom(Array_initContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntArrayContext extends Array_initContext {
		public List<TerminalNode> NUM() { return getTokens(GsaGrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GsaGrammarParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GsaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GsaGrammarParser.COMMA, i);
		}
		public IntArrayContext(Array_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIntArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIntArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array_init);
		try {
			int _alt;
			_localctx = new IntArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NUM);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(COMMA);
					setState(93);
					match(NUM);
					}
					} 
				}
				setState(98);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode SQUAREBRACKET1() { return getToken(GsaGrammarParser.SQUAREBRACKET1, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUAREBRACKET2() { return getToken(GsaGrammarParser.SQUAREBRACKET2, 0); }
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterArray_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitArray_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitArray_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(SQUAREBRACKET1);
			setState(101);
			expr(0);
			setState(102);
			match(SQUAREBRACKET2);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GsaGrammarParser.MULT, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GsaGrammarParser.ADD, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRG() { return getToken(GsaGrammarParser.STRG, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallArrayMemberContext extends ExprContext {
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public CallArrayMemberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterCallArrayMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitCallArrayMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitCallArrayMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends ExprContext {
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GsaGrammarParser.ASSIGN, 0); }
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GsaGrammarParser.EQ, 0); }
		public EqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(GsaGrammarParser.LT, 0); }
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUBT() { return getToken(GsaGrammarParser.SUBT, 0); }
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GsaGrammarParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(GsaGrammarParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(GsaGrammarParser.GT, 0); }
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(GsaGrammarParser.CHAR, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(GsaGrammarParser.DIV, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsOrLessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQLT() { return getToken(GsaGrammarParser.EQLT, 0); }
		public EqualsOrLessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterEqualsOrLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitEqualsOrLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitEqualsOrLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsOrGreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQGT() { return getToken(GsaGrammarParser.EQGT, 0); }
		public EqualsOrGreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterEqualsOrGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitEqualsOrGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitEqualsOrGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(NUM);
				}
				break;
			case 3:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(STRG);
				}
				break;
			case 4:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(CHAR);
				}
				break;
			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(BOOL);
				}
				break;
			case 6:
				{
				_localctx = new CallArrayMemberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				array_elem();
				}
				break;
			case 7:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				array_init();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(115);
						match(MULT);
						setState(116);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(118);
						match(DIV);
						setState(119);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(121);
						match(ADD);
						setState(122);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(124);
						match(SUBT);
						setState(125);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						match(EQ);
						setState(128);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(130);
						match(GT);
						setState(131);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(133);
						match(LT);
						setState(134);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new EqualsOrGreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						match(EQGT);
						setState(137);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new EqualsOrLessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						match(EQLT);
						setState(140);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new AssignmentContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(ASSIGN);
						setState(143);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionContext extends StatementContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ConditionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IterationContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				conditionalStatement();
				}
				break;
			case FOR:
				_localctx = new IterationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				iterationStatement();
				}
				break;
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	 
		public ConditionalStatementContext() { }
		public void copyFrom(ConditionalStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OnlyIfStatementContext extends ConditionalStatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public OnlyIfStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterOnlyIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitOnlyIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitOnlyIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElifStatementContext extends ConditionalStatementContext {
		public ElifStmtContext elifStmt() {
			return getRuleContext(ElifStmtContext.class,0);
		}
		public List<IfStmtContext> ifStmt() {
			return getRuleContexts(IfStmtContext.class);
		}
		public IfStmtContext ifStmt(int i) {
			return getRuleContext(IfStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElifStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIfElifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIfElifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIfElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends ConditionalStatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseStatementContext(ConditionalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalStatement);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new OnlyIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				ifStmt();
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				ifStmt();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(156);
					elseStmt();
					}
				}

				}
				break;
			case 3:
				_localctx = new IfElifStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					ifStmt();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
				setState(164);
				elifStmt();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(165);
					elseStmt();
					}
				}

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

	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(GsaGrammarParser.IF, 0); }
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfStatementContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IF);
			setState(171);
			conditionBlock();
			setState(172);
			ifBody();
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

	public static class ElifStmtContext extends ParserRuleContext {
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	 
		public ElifStmtContext() { }
		public void copyFrom(ElifStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElifStatementContext extends ElifStmtContext {
		public TerminalNode ELIF() { return getToken(GsaGrammarParser.ELIF, 0); }
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElifStatementContext(ElifStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterElifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitElifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elifStmt);
		try {
			_localctx = new ElifStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ELIF);
			setState(175);
			match(PARANTESSES1);
			setState(176);
			expr(0);
			setState(177);
			match(PARANTESSES2);
			setState(178);
			match(CURLYBRACKET1);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case STRG:
			case CHAR:
			case BOOL:
			case ID:
				{
				setState(179);
				expr(0);
				}
				break;
			case RETURN:
			case IF:
			case FOR:
				{
				setState(180);
				statement();
				}
				break;
			case CURLYBRACKET2:
				break;
			default:
				break;
			}
			setState(183);
			match(CURLYBRACKET2);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	 
		public ElseStmtContext() { }
		public void copyFrom(ElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatementContext extends ElseStmtContext {
		public TerminalNode ELSE() { return getToken(GsaGrammarParser.ELSE, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseStatementContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseStmt);
		try {
			_localctx = new ElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ELSE);
			setState(186);
			ifBody();
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

	public static class IfBodyContext extends ParserRuleContext {
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
	 
		public IfBodyContext() { }
		public void copyFrom(IfBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionBodyContext extends IfBodyContext {
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ConditionBodyContext(IfBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterConditionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitConditionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifBody);
		int _la;
		try {
			_localctx = new ConditionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CURLYBRACKET1);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case STRG:
				case CHAR:
				case BOOL:
				case ID:
					{
					setState(189);
					expr(0);
					}
					break;
				case RETURN:
				case IF:
				case FOR:
					{
					setState(190);
					statement();
					}
					break;
				case INT:
				case STRING:
				case BOOLEAN:
				case CHAR_T:
				case DEFINE:
					{
					setState(191);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(CURLYBRACKET2);
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

	public static class ConditionBlockContext extends ParserRuleContext {
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(PARANTESSES1);
			setState(200);
			expr(0);
			setState(201);
			match(PARANTESSES2);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForUntilStatementContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(GsaGrammarParser.FOR, 0); }
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public TerminalNode UNTIL() { return getToken(GsaGrammarParser.UNTIL, 0); }
		public TerminalNode NUM() { return getToken(GsaGrammarParser.NUM, 0); }
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public ForUntilStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterForUntilStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitForUntilStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitForUntilStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForToStatementContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(GsaGrammarParser.FOR, 0); }
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public List<TerminalNode> NUM() { return getTokens(GsaGrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GsaGrammarParser.NUM, i);
		}
		public TerminalNode TO() { return getToken(GsaGrammarParser.TO, 0); }
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public ForToStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterForToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitForToStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitForToStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iterationStatement);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ForToStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(FOR);
				setState(204);
				match(PARANTESSES1);
				setState(205);
				match(NUM);
				setState(206);
				match(TO);
				setState(207);
				match(NUM);
				setState(208);
				match(PARANTESSES2);
				setState(209);
				match(CURLYBRACKET1);
				setState(210);
				blockStatement();
				setState(211);
				match(CURLYBRACKET2);
				}
				break;
			case 2:
				_localctx = new ForUntilStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(FOR);
				setState(214);
				match(PARANTESSES1);
				setState(215);
				match(UNTIL);
				setState(216);
				match(NUM);
				setState(217);
				match(PARANTESSES2);
				setState(218);
				match(CURLYBRACKET1);
				setState(219);
				blockStatement();
				setState(220);
				match(CURLYBRACKET2);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocalStatementContext extends BlockStatementContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodInvocationContext> methodInvocation() {
			return getRuleContexts(MethodInvocationContext.class);
		}
		public MethodInvocationContext methodInvocation(int i) {
			return getRuleContext(MethodInvocationContext.class,i);
		}
		public LocalStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterLocalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitLocalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitLocalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockStatement);
		try {
			int _alt;
			_localctx = new LocalStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(224);
						expr(0);
						}
						break;
					case 2:
						{
						setState(225);
						decl();
						}
						break;
					case 3:
						{
						setState(226);
						statement();
						}
						break;
					case 4:
						{
						setState(227);
						methodInvocation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocalStatementsContext extends BlockContext {
		public TerminalNode CURLYBRACKET1() { return getToken(GsaGrammarParser.CURLYBRACKET1, 0); }
		public TerminalNode CURLYBRACKET2() { return getToken(GsaGrammarParser.CURLYBRACKET2, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public LocalStatementsContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterLocalStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitLocalStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitLocalStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			_localctx = new LocalStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CURLYBRACKET1);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(233);
				blockStatement();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(CURLYBRACKET2);
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

	public static class MethodArgsContext extends ParserRuleContext {
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
	 
		public MethodArgsContext() { }
		public void copyFrom(MethodArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodArgumentsContext extends MethodArgsContext {
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MethodArgumentsContext(MethodArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodArgs);
		int _la;
		try {
			_localctx = new MethodArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PARANTESSES1);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(242);
				args();
				}
			}

			setState(245);
			match(PARANTESSES2);
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

	public static class MethodArgContext extends ParserRuleContext {
		public MethodArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArg; }
	 
		public MethodArgContext() { }
		public void copyFrom(MethodArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterContext extends MethodArgContext {
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode INT() { return getToken(GsaGrammarParser.INT, 0); }
		public TerminalNode STRING() { return getToken(GsaGrammarParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(GsaGrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(GsaGrammarParser.CHAR, 0); }
		public ParameterContext(MethodArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgContext methodArg() throws RecognitionException {
		MethodArgContext _localctx = new MethodArgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodArg);
		int _la;
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
			match(ID);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgContext extends ArgsContext {
		public MethodArgContext methodArg() {
			return getRuleContext(MethodArgContext.class,0);
		}
		public SingleArgContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitSingleArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitSingleArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleArgsContext extends ArgsContext {
		public List<MethodArgContext> methodArg() {
			return getRuleContexts(MethodArgContext.class);
		}
		public MethodArgContext methodArg(int i) {
			return getRuleContext(MethodArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GsaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GsaGrammarParser.COMMA, i);
		}
		public MultipleArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMultipleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMultipleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMultipleArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		try {
			int _alt;
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new SingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				methodArg();
				}
				break;
			case 2:
				_localctx = new MultipleArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251);
						methodArg();
						setState(252);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(256); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(258);
				methodArg();
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgumentContext extends ArgumentListContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public SingleArgumentContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterSingleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitSingleArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitSingleArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleArgumentsContext extends ArgumentListContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GsaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GsaGrammarParser.COMMA, i);
		}
		public MultipleArgumentsContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMultipleArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMultipleArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMultipleArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentList);
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new SingleArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				argument();
				}
				break;
			case 2:
				_localctx = new MultipleArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(263);
						argument();
						setState(264);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(268); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(270);
				argument();
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				expr(0);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDefinitionContext extends MethodContext {
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDefinitionContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method);
		try {
			_localctx = new MethodDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			methodArgs();
			setState(279);
			block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpressionContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(GsaGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExpressionContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			_localctx = new ReturnExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RETURN);
			setState(282);
			expr(0);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
	 
		public MethodInvocationContext() { }
		public void copyFrom(MethodInvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCallContext extends MethodInvocationContext {
		public TerminalNode ID() { return getToken(GsaGrammarParser.ID, 0); }
		public TerminalNode PARANTESSES1() { return getToken(GsaGrammarParser.PARANTESSES1, 0); }
		public TerminalNode PARANTESSES2() { return getToken(GsaGrammarParser.PARANTESSES2, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public MethodCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GsaGrammarListener ) ((GsaGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GsaGrammarVisitor ) return ((GsaGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodInvocation);
		int _la;
		try {
			_localctx = new MethodCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
			setState(285);
			match(PARANTESSES1);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(286);
				argumentList();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(PARANTESSES2);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\5\3\\\n\3\3\4\3\4\3\4\7\4a\n\4\f\4\16"+
		"\4d\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n\6\f\6\16"+
		"\6\u0096\13\6\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\5\b\u00a0\n\b\3\b"+
		"\6\b\u00a3\n\b\r\b\16\b\u00a4\3\b\3\b\5\b\u00a9\n\b\5\b\u00ab\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\17\3\17\3\17"+
		"\3\17\6\17\u00e7\n\17\r\17\16\17\u00e8\3\20\3\20\7\20\u00ed\n\20\f\20"+
		"\16\20\u00f0\13\20\3\20\3\20\3\21\3\21\5\21\u00f6\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u0101\n\23\r\23\16\23\u0102\3\23\3"+
		"\23\5\23\u0107\n\23\3\24\3\24\3\24\3\24\6\24\u010d\n\24\r\24\16\24\u010e"+
		"\3\24\3\24\5\24\u0113\n\24\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u0122\n\30\f\30\16\30\u0125\13\30\3"+
		"\30\3\30\3\30\2\3\n\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\2\3\4\2\4\5\13\f\2\u0146\2\64\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\be\3\2\2"+
		"\2\nr\3\2\2\2\f\u009a\3\2\2\2\16\u00aa\3\2\2\2\20\u00ac\3\2\2\2\22\u00b0"+
		"\3\2\2\2\24\u00bb\3\2\2\2\26\u00be\3\2\2\2\30\u00c9\3\2\2\2\32\u00e0\3"+
		"\2\2\2\34\u00e6\3\2\2\2\36\u00ea\3\2\2\2 \u00f3\3\2\2\2\"\u00f9\3\2\2"+
		"\2$\u0106\3\2\2\2&\u0112\3\2\2\2(\u0116\3\2\2\2*\u0118\3\2\2\2,\u011b"+
		"\3\2\2\2.\u011e\3\2\2\2\60\65\5\4\3\2\61\65\5\n\6\2\62\65\5\f\7\2\63\65"+
		"\5.\30\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\2\2\39\3\3\2\2\2"+
		":;\7\4\2\2;<\7%\2\2<=\7\3\2\2=\\\5\n\6\2>?\7\5\2\2?@\7%\2\2@A\7\3\2\2"+
		"A\\\7\n\2\2BC\7\6\2\2CD\7%\2\2DE\7\3\2\2E\\\7\f\2\2FG\7\7\2\2GH\7%\2\2"+
		"HI\7\3\2\2I\\\7\13\2\2JK\7\b\2\2KL\7%\2\2L\\\5*\26\2MN\7\4\2\2NO\7%\2"+
		"\2OQ\7\32\2\2PR\7\4\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SY\7\33\2\2TU\7\3"+
		"\2\2UV\7\30\2\2VW\5\6\4\2WX\7\31\2\2XZ\3\2\2\2YT\3\2\2\2YZ\3\2\2\2Z\\"+
		"\3\2\2\2[:\3\2\2\2[>\3\2\2\2[B\3\2\2\2[F\3\2\2\2[J\3\2\2\2[M\3\2\2\2\\"+
		"\5\3\2\2\2]b\7\t\2\2^_\7\35\2\2_a\7\t\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2c\7\3\2\2\2db\3\2\2\2ef\7%\2\2fg\7\32\2\2gh\5\n\6\2hi\7\33"+
		"\2\2i\t\3\2\2\2jk\b\6\1\2ks\7%\2\2ls\7\t\2\2ms\7\n\2\2ns\7\13\2\2os\7"+
		"\f\2\2ps\5\b\5\2qs\5\6\4\2rj\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3"+
		"\2\2\2rp\3\2\2\2rq\3\2\2\2s\u0094\3\2\2\2tu\f\23\2\2uv\7\r\2\2v\u0093"+
		"\5\n\6\24wx\f\22\2\2xy\7\16\2\2y\u0093\5\n\6\23z{\f\21\2\2{|\7\17\2\2"+
		"|\u0093\5\n\6\22}~\f\20\2\2~\177\7\20\2\2\177\u0093\5\n\6\21\u0080\u0081"+
		"\f\n\2\2\u0081\u0082\7\21\2\2\u0082\u0093\5\n\6\13\u0083\u0084\f\t\2\2"+
		"\u0084\u0085\7\22\2\2\u0085\u0093\5\n\6\n\u0086\u0087\f\b\2\2\u0087\u0088"+
		"\7\23\2\2\u0088\u0093\5\n\6\t\u0089\u008a\f\7\2\2\u008a\u008b\7\24\2\2"+
		"\u008b\u0093\5\n\6\b\u008c\u008d\f\6\2\2\u008d\u008e\7\25\2\2\u008e\u0093"+
		"\5\n\6\7\u008f\u0090\f\5\2\2\u0090\u0091\7\3\2\2\u0091\u0093\5\n\6\6\u0092"+
		"t\3\2\2\2\u0092w\3\2\2\2\u0092z\3\2\2\2\u0092}\3\2\2\2\u0092\u0080\3\2"+
		"\2\2\u0092\u0083\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u0089\3\2\2\2\u0092"+
		"\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\13\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b"+
		"\5\16\b\2\u0098\u009b\5\32\16\2\u0099\u009b\5,\27\2\u009a\u0097\3\2\2"+
		"\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\r\3\2\2\2\u009c\u00ab"+
		"\5\20\t\2\u009d\u009f\5\20\t\2\u009e\u00a0\5\24\13\2\u009f\u009e\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u00ab\3\2\2\2\u00a1\u00a3\5\20\t\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a9\5\24\13\2\u00a8"+
		"\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u009c\3\2"+
		"\2\2\u00aa\u009d\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad"+
		"\7\37\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\5\26\f\2\u00af\21\3\2\2\2\u00b0"+
		"\u00b1\7 \2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7\27"+
		"\2\2\u00b4\u00b7\7\30\2\2\u00b5\u00b8\5\n\6\2\u00b6\u00b8\5\f\7\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\31\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd"+
		"\5\26\f\2\u00bd\25\3\2\2\2\u00be\u00c4\7\30\2\2\u00bf\u00c3\5\n\6\2\u00c0"+
		"\u00c3\5\f\7\2\u00c1\u00c3\5\4\3\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\31"+
		"\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc"+
		"\7\27\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7\26\2\2\u00cf"+
		"\u00d0\7\t\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\7\27"+
		"\2\2\u00d3\u00d4\7\30\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\7\31\2\2\u00d6"+
		"\u00e1\3\2\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\7"+
		"$\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\7\30\2\2\u00dd"+
		"\u00de\5\34\17\2\u00de\u00df\7\31\2\2\u00df\u00e1\3\2\2\2\u00e0\u00cd"+
		"\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e7\5\n\6\2\u00e3"+
		"\u00e7\5\4\3\2\u00e4\u00e7\5\f\7\2\u00e5\u00e7\5.\30\2\u00e6\u00e2\3\2"+
		"\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\35\3\2\2"+
		"\2\u00ea\u00ee\7\30\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\31\2\2\u00f2\37\3\2\2\2\u00f3\u00f5"+
		"\7\26\2\2\u00f4\u00f6\5$\23\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\27\2\2\u00f8!\3\2\2\2\u00f9\u00fa\t"+
		"\2\2\2\u00fa\u00fb\7%\2\2\u00fb#\3\2\2\2\u00fc\u0107\5\"\22\2\u00fd\u00fe"+
		"\5\"\22\2\u00fe\u00ff\7\35\2\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\5\"\22\2\u0105\u0107\3\2\2\2\u0106\u00fc\3\2\2\2"+
		"\u0106\u0100\3\2\2\2\u0107%\3\2\2\2\u0108\u0113\5(\25\2\u0109\u010a\5"+
		"(\25\2\u010a\u010b\7\35\2\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\5(\25\2\u0111\u0113\3\2\2\2\u0112\u0108\3\2\2\2\u0112"+
		"\u010c\3\2\2\2\u0113\'\3\2\2\2\u0114\u0117\7%\2\2\u0115\u0117\5\n\6\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117)\3\2\2\2\u0118\u0119\5"+
		" \21\2\u0119\u011a\5\36\20\2\u011a+\3\2\2\2\u011b\u011c\7\36\2\2\u011c"+
		"\u011d\5\n\6\2\u011d-\3\2\2\2\u011e\u011f\7%\2\2\u011f\u0123\7\26\2\2"+
		"\u0120\u0122\5&\24\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0127\7\27\2\2\u0127/\3\2\2\2\36\64\66QY[br\u0092\u0094\u009a\u009f\u00a4"+
		"\u00a8\u00aa\u00b7\u00c2\u00c4\u00e0\u00e6\u00e8\u00ee\u00f5\u0102\u0106"+
		"\u010e\u0112\u0116\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}