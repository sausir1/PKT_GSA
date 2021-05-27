// Generated from C:/Users/Owner/IdeaProjects/Antlr4GSA\GsaGrammar.g4 by ANTLR 4.9.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GsaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GsaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GsaGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GsaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(GsaGrammarParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(GsaGrammarParser.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclaration(GsaGrammarParser.BoolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDeclaration(GsaGrammarParser.CharDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GsaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(GsaGrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(GsaGrammarParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GsaGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GsaGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GsaGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(GsaGrammarParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(GsaGrammarParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(GsaGrammarParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GsaGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GsaGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(GsaGrammarParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(GsaGrammarParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(GsaGrammarParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsOrLessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsOrLessThan(GsaGrammarParser.EqualsOrLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsOrGreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsOrGreaterThan(GsaGrammarParser.EqualsOrGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GsaGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iteration}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(GsaGrammarParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GsaGrammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OnlyIfStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyIfStatement(GsaGrammarParser.OnlyIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(GsaGrammarParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElifStatement(GsaGrammarParser.IfElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link GsaGrammarParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GsaGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStatement(GsaGrammarParser.ElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(GsaGrammarParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionBody}
	 * labeled alternative in {@link GsaGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBody(GsaGrammarParser.ConditionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GsaGrammarParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(GsaGrammarParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForToStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForToStatement(GsaGrammarParser.ForToStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUntilStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUntilStatement(GsaGrammarParser.ForUntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalStatement}
	 * labeled alternative in {@link GsaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalStatement(GsaGrammarParser.LocalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HierarcyStatements}
	 * labeled alternative in {@link GsaGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarcyStatements(GsaGrammarParser.HierarcyStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnoStatement}
	 * labeled alternative in {@link GsaGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnoStatement(GsaGrammarParser.UnoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalStatements}
	 * labeled alternative in {@link GsaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalStatements(GsaGrammarParser.LocalStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodArguments}
	 * labeled alternative in {@link GsaGrammarParser#methodArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(GsaGrammarParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArg}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArg(GsaGrammarParser.IntArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(GsaGrammarParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharArg}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArg(GsaGrammarParser.CharArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArg}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArg(GsaGrammarParser.BoolArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArg}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArg(GsaGrammarParser.SingleArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleArgs}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleArgs(GsaGrammarParser.MultipleArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArgument}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgument(GsaGrammarParser.SingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleArguments}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleArguments(GsaGrammarParser.MultipleArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GsaGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GsaGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDefinition}
	 * labeled alternative in {@link GsaGrammarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(GsaGrammarParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link GsaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(GsaGrammarParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GsaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(GsaGrammarParser.MethodInvocationContext ctx);
}