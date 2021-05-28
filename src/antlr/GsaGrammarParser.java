// Generated from C:/Users/Owner/IdeaProjects/Antlr4GSA\GsaGrammar.g4 by ANTLR 4.9.1

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		CURLYBRACKET2=23, COMMA=24, RETURN=25, IF=26, ELIF=27, ELSE=28, FOR=29, 
		TO=30, UNTIL=31, ID=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_expr = 2, RULE_statement = 3, RULE_conditionalStatement = 4, 
		RULE_ifStmt = 5, RULE_elifStmt = 6, RULE_elseStmt = 7, RULE_ifBody = 8, 
		RULE_conditionBlock = 9, RULE_iterationStatement = 10, RULE_blockStatement = 11, 
		RULE_block = 12, RULE_methodArgs = 13, RULE_methodArg = 14, RULE_args = 15, 
		RULE_argumentList = 16, RULE_argument = 17, RULE_method = 18, RULE_returnStatement = 19, 
		RULE_methodInvocation = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "expr", "statement", "conditionalStatement", "ifStmt", 
			"elifStmt", "elseStmt", "ifBody", "conditionBlock", "iterationStatement", 
			"blockStatement", "block", "methodArgs", "methodArg", "args", "argumentList", 
			"argument", "method", "returnStatement", "methodInvocation"
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
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					decl();
					}
					break;
				case 2:
					{
					setState(43);
					expr(0);
					}
					break;
				case 3:
					{
					setState(44);
					statement();
					}
					break;
				case 4:
					{
					setState(45);
					methodInvocation();
					}
					break;
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0) );
			setState(50);
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
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(INT);
				setState(53);
				match(ID);
				setState(54);
				match(ASSIGN);
				setState(55);
				expr(0);
				}
				break;
			case STRING:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(STRING);
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				match(STRG);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(BOOLEAN);
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				match(BOOL);
				}
				break;
			case CHAR_T:
				_localctx = new CharDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(CHAR_T);
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(67);
				match(CHAR);
				}
				break;
			case DEFINE:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(DEFINE);
				setState(69);
				match(ID);
				setState(70);
				method();
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(NUM);
				}
				break;
			case STRG:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(STRG);
				}
				break;
			case CHAR:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(CHAR);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(82);
						match(MULT);
						setState(83);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(85);
						match(DIV);
						setState(86);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(88);
						match(ADD);
						setState(89);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
						match(SUBT);
						setState(92);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						match(EQ);
						setState(95);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						match(GT);
						setState(98);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(LT);
						setState(101);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new EqualsOrGreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(EQGT);
						setState(104);
						expr(4);
						}
						break;
					case 9:
						{
						_localctx = new EqualsOrLessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(106);
						match(EQLT);
						setState(107);
						expr(3);
						}
						break;
					case 10:
						{
						_localctx = new AssignmentContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(109);
						match(ASSIGN);
						setState(110);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				conditionalStatement();
				}
				break;
			case FOR:
				_localctx = new IterationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				iterationStatement();
				}
				break;
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		enterRule(_localctx, 8, RULE_conditionalStatement);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new OnlyIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				ifStmt();
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				ifStmt();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(123);
					elseStmt();
					}
				}

				}
				break;
			case 3:
				_localctx = new IfElifStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					ifStmt();
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
				setState(131);
				elifStmt();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(132);
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
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IF);
			setState(138);
			conditionBlock();
			setState(139);
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
		enterRule(_localctx, 12, RULE_elifStmt);
		try {
			_localctx = new ElifStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ELIF);
			setState(142);
			match(PARANTESSES1);
			setState(143);
			expr(0);
			setState(144);
			match(PARANTESSES2);
			setState(145);
			match(CURLYBRACKET1);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case STRG:
			case CHAR:
			case BOOL:
			case ID:
				{
				setState(146);
				expr(0);
				}
				break;
			case RETURN:
			case IF:
			case FOR:
				{
				setState(147);
				statement();
				}
				break;
			case CURLYBRACKET2:
				break;
			default:
				break;
			}
			setState(150);
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
		enterRule(_localctx, 14, RULE_elseStmt);
		try {
			_localctx = new ElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ELSE);
			setState(153);
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
		enterRule(_localctx, 16, RULE_ifBody);
		int _la;
		try {
			_localctx = new ConditionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CURLYBRACKET1);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case STRG:
				case CHAR:
				case BOOL:
				case ID:
					{
					setState(156);
					expr(0);
					}
					break;
				case RETURN:
				case IF:
				case FOR:
					{
					setState(157);
					statement();
					}
					break;
				case INT:
				case STRING:
				case BOOLEAN:
				case CHAR_T:
				case DEFINE:
					{
					setState(158);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
		enterRule(_localctx, 18, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(PARANTESSES1);
			setState(167);
			expr(0);
			setState(168);
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
		enterRule(_localctx, 20, RULE_iterationStatement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ForToStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(FOR);
				setState(171);
				match(PARANTESSES1);
				setState(172);
				match(NUM);
				setState(173);
				match(TO);
				setState(174);
				match(NUM);
				setState(175);
				match(PARANTESSES2);
				setState(176);
				match(CURLYBRACKET1);
				setState(177);
				blockStatement();
				setState(178);
				match(CURLYBRACKET2);
				}
				break;
			case 2:
				_localctx = new ForUntilStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FOR);
				setState(181);
				match(PARANTESSES1);
				setState(182);
				match(UNTIL);
				setState(183);
				match(NUM);
				setState(184);
				match(PARANTESSES2);
				setState(185);
				match(CURLYBRACKET1);
				setState(186);
				blockStatement();
				setState(187);
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
		enterRule(_localctx, 22, RULE_blockStatement);
		try {
			int _alt;
			_localctx = new LocalStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(191);
						expr(0);
						}
						break;
					case 2:
						{
						setState(192);
						decl();
						}
						break;
					case 3:
						{
						setState(193);
						statement();
						}
						break;
					case 4:
						{
						setState(194);
						methodInvocation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			_localctx = new LocalStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CURLYBRACKET1);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << CHAR_T) | (1L << DEFINE) | (1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(200);
				blockStatement();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
		enterRule(_localctx, 26, RULE_methodArgs);
		int _la;
		try {
			_localctx = new MethodArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(PARANTESSES1);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(209);
				args();
				}
			}

			setState(212);
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
		enterRule(_localctx, 28, RULE_methodArg);
		int _la;
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
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
		enterRule(_localctx, 30, RULE_args);
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				methodArg();
				}
				break;
			case 2:
				_localctx = new MultipleArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(218);
						methodArg();
						setState(219);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(225);
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
		enterRule(_localctx, 32, RULE_argumentList);
		try {
			int _alt;
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SingleArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				argument();
				}
				break;
			case 2:
				_localctx = new MultipleArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(230);
						argument();
						setState(231);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(235); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(237);
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
		enterRule(_localctx, 34, RULE_argument);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 36, RULE_method);
		try {
			_localctx = new MethodDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			methodArgs();
			setState(246);
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
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			_localctx = new ReturnExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(RETURN);
			setState(249);
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
		enterRule(_localctx, 40, RULE_methodInvocation);
		int _la;
		try {
			_localctx = new MethodCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(PARANTESSES1);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRG) | (1L << CHAR) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(253);
				argumentList();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\6\2\61\n\2\r"+
		"\2\16\2\62\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4"+
		"\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\5\6\177\n\6\3\6\6\6\u0082\n\6\r\6\16"+
		"\6\u0083\3\6\3\6\5\6\u0088\n\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7"+
		"\n\u00a2\n\n\f\n\16\n\u00a5\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00c0\n\f\3\r\3\r\3\r\3\r\6\r\u00c6\n\r\r\r\16\r\u00c7\3\16\3\16\7\16"+
		"\u00cc\n\16\f\16\16\16\u00cf\13\16\3\16\3\16\3\17\3\17\5\17\u00d5\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\6\21\u00e0\n\21\r\21\16"+
		"\21\u00e1\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22\6\22\u00ec\n\22"+
		"\r\22\16\22\u00ed\3\22\3\22\5\22\u00f2\n\22\3\23\3\23\5\23\u00f6\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0101\n\26\f\26\16"+
		"\26\u0104\13\26\3\26\3\26\3\26\2\3\6\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\3\4\2\4\5\13\f\2\u0121\2\60\3\2\2\2\4I\3\2\2\2\6Q\3"+
		"\2\2\2\by\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u008f\3\2\2\2\20"+
		"\u009a\3\2\2\2\22\u009d\3\2\2\2\24\u00a8\3\2\2\2\26\u00bf\3\2\2\2\30\u00c5"+
		"\3\2\2\2\32\u00c9\3\2\2\2\34\u00d2\3\2\2\2\36\u00d8\3\2\2\2 \u00e5\3\2"+
		"\2\2\"\u00f1\3\2\2\2$\u00f5\3\2\2\2&\u00f7\3\2\2\2(\u00fa\3\2\2\2*\u00fd"+
		"\3\2\2\2,\61\5\4\3\2-\61\5\6\4\2.\61\5\b\5\2/\61\5*\26\2\60,\3\2\2\2\60"+
		"-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\4\2\2\678\7\""+
		"\2\289\7\3\2\29J\5\6\4\2:;\7\5\2\2;<\7\"\2\2<=\7\3\2\2=J\7\n\2\2>?\7\6"+
		"\2\2?@\7\"\2\2@A\7\3\2\2AJ\7\f\2\2BC\7\7\2\2CD\7\"\2\2DE\7\3\2\2EJ\7\13"+
		"\2\2FG\7\b\2\2GH\7\"\2\2HJ\5&\24\2I\66\3\2\2\2I:\3\2\2\2I>\3\2\2\2IB\3"+
		"\2\2\2IF\3\2\2\2J\5\3\2\2\2KL\b\4\1\2LR\7\"\2\2MR\7\t\2\2NR\7\n\2\2OR"+
		"\7\13\2\2PR\7\f\2\2QK\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2"+
		"Rs\3\2\2\2ST\f\21\2\2TU\7\r\2\2Ur\5\6\4\22VW\f\20\2\2WX\7\16\2\2Xr\5\6"+
		"\4\21YZ\f\17\2\2Z[\7\17\2\2[r\5\6\4\20\\]\f\16\2\2]^\7\20\2\2^r\5\6\4"+
		"\17_`\f\b\2\2`a\7\21\2\2ar\5\6\4\tbc\f\7\2\2cd\7\22\2\2dr\5\6\4\bef\f"+
		"\6\2\2fg\7\23\2\2gr\5\6\4\7hi\f\5\2\2ij\7\24\2\2jr\5\6\4\6kl\f\4\2\2l"+
		"m\7\25\2\2mr\5\6\4\5no\f\3\2\2op\7\3\2\2pr\5\6\4\4qS\3\2\2\2qV\3\2\2\2"+
		"qY\3\2\2\2q\\\3\2\2\2q_\3\2\2\2qb\3\2\2\2qe\3\2\2\2qh\3\2\2\2qk\3\2\2"+
		"\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2\2\2us\3\2\2\2vz\5\n"+
		"\6\2wz\5\26\f\2xz\5(\25\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\t\3\2\2\2{\u008a"+
		"\5\f\7\2|~\5\f\7\2}\177\5\20\t\2~}\3\2\2\2~\177\3\2\2\2\177\u008a\3\2"+
		"\2\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\5\16"+
		"\b\2\u0086\u0088\5\20\t\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089{\3\2\2\2\u0089|\3\2\2\2\u0089\u0081\3\2\2\2\u008a"+
		"\13\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\22"+
		"\n\2\u008e\r\3\2\2\2\u008f\u0090\7\35\2\2\u0090\u0091\7\26\2\2\u0091\u0092"+
		"\5\6\4\2\u0092\u0093\7\27\2\2\u0093\u0096\7\30\2\2\u0094\u0097\5\6\4\2"+
		"\u0095\u0097\5\b\5\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\31\2\2\u0099\17\3\2\2\2\u009a"+
		"\u009b\7\36\2\2\u009b\u009c\5\22\n\2\u009c\21\3\2\2\2\u009d\u00a3\7\30"+
		"\2\2\u009e\u00a2\5\6\4\2\u009f\u00a2\5\b\5\2\u00a0\u00a2\5\4\3\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\26"+
		"\2\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\7\27\2\2\u00ab\25\3\2\2\2\u00ac\u00ad"+
		"\7\37\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7 \2\2"+
		"\u00b0\u00b1\7\t\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4"+
		"\5\30\r\2\u00b4\u00b5\7\31\2\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\7\37\2"+
		"\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9\7!\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb"+
		"\7\27\2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7\31\2"+
		"\2\u00be\u00c0\3\2\2\2\u00bf\u00ac\3\2\2\2\u00bf\u00b6\3\2\2\2\u00c0\27"+
		"\3\2\2\2\u00c1\u00c6\5\6\4\2\u00c2\u00c6\5\4\3\2\u00c3\u00c6\5\b\5\2\u00c4"+
		"\u00c6\5*\26\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00cd\7\30\2\2\u00ca\u00cc\5\30"+
		"\r\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\31"+
		"\2\2\u00d1\33\3\2\2\2\u00d2\u00d4\7\26\2\2\u00d3\u00d5\5 \21\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\27\2\2"+
		"\u00d7\35\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9\u00da\7\"\2\2\u00da\37\3\2"+
		"\2\2\u00db\u00e6\5\36\20\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\7\32\2\2"+
		"\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\36\20\2"+
		"\u00e4\u00e6\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00df\3\2\2\2\u00e6!\3"+
		"\2\2\2\u00e7\u00f2\5$\23\2\u00e8\u00e9\5$\23\2\u00e9\u00ea\7\32\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5$\23\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2#\3\2\2\2"+
		"\u00f3\u00f6\7\"\2\2\u00f4\u00f6\5\6\4\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\5\32\16\2\u00f9"+
		"\'\3\2\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\5\6\4\2\u00fc)\3\2\2\2\u00fd"+
		"\u00fe\7\"\2\2\u00fe\u0102\7\26\2\2\u00ff\u0101\5\"\22\2\u0100\u00ff\3"+
		"\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\27\2\2\u0106+\3\2\2\2"+
		"\33\60\62IQqsy~\u0083\u0087\u0089\u0096\u00a1\u00a3\u00bf\u00c5\u00c7"+
		"\u00cd\u00d4\u00e1\u00e5\u00ed\u00f1\u00f5\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}