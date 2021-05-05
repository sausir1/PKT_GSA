// Generated from C:/Users/Owner/IdeaProjects/Antlr4GSA\GsaGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GsaGrammarParser}.
 */
public interface GsaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GsaGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GsaGrammarParser.DeclContext ctx);
}