// Generated from C:/Users/Owner/IdeaProjects/Antlr4GSA\GsaGrammar.g4 by ANTLR 4.9.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GsaGrammarParser}.
 */
public interface GsaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GsaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GsaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GsaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GsaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GsaGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GsaGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(GsaGrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(GsaGrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(GsaGrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(GsaGrammarParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GsaGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GsaGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GsaGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GsaGrammarParser.NumberContext ctx);
}