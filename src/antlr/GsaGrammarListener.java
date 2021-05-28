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
	 * Enter a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(GsaGrammarParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(GsaGrammarParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(GsaGrammarParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(GsaGrammarParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(GsaGrammarParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(GsaGrammarParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterCharDeclaration(GsaGrammarParser.CharDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitCharDeclaration(GsaGrammarParser.CharDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GsaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclaration}
	 * labeled alternative in {@link GsaGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GsaGrammarParser.MethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(GsaGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(GsaGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GsaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GsaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(GsaGrammarParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(GsaGrammarParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(GsaGrammarParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(GsaGrammarParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(GsaGrammarParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(GsaGrammarParser.SubtractionContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(GsaGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(GsaGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(GsaGrammarParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(GsaGrammarParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(GsaGrammarParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(GsaGrammarParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(GsaGrammarParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(GsaGrammarParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsOrLessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsOrLessThan(GsaGrammarParser.EqualsOrLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsOrLessThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsOrLessThan(GsaGrammarParser.EqualsOrLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsOrGreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsOrGreaterThan(GsaGrammarParser.EqualsOrGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsOrGreaterThan}
	 * labeled alternative in {@link GsaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsOrGreaterThan(GsaGrammarParser.EqualsOrGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GsaGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GsaGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iteration}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration(GsaGrammarParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iteration}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration(GsaGrammarParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GsaGrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GsaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GsaGrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OnlyIfStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterOnlyIfStatement(GsaGrammarParser.OnlyIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OnlyIfStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitOnlyIfStatement(GsaGrammarParser.OnlyIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(GsaGrammarParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(GsaGrammarParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElifStatement(GsaGrammarParser.IfElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElifStatement(GsaGrammarParser.IfElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link GsaGrammarParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GsaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link GsaGrammarParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GsaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStatement(GsaGrammarParser.ElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElifStatement}
	 * labeled alternative in {@link GsaGrammarParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStatement(GsaGrammarParser.ElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(GsaGrammarParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link GsaGrammarParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(GsaGrammarParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBody}
	 * labeled alternative in {@link GsaGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterConditionBody(GsaGrammarParser.ConditionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBody}
	 * labeled alternative in {@link GsaGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitConditionBody(GsaGrammarParser.ConditionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GsaGrammarParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(GsaGrammarParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GsaGrammarParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(GsaGrammarParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForToStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForToStatement(GsaGrammarParser.ForToStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForToStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForToStatement(GsaGrammarParser.ForToStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUntilStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForUntilStatement(GsaGrammarParser.ForUntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUntilStatement}
	 * labeled alternative in {@link GsaGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForUntilStatement(GsaGrammarParser.ForUntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalStatement}
	 * labeled alternative in {@link GsaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalStatement(GsaGrammarParser.LocalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalStatement}
	 * labeled alternative in {@link GsaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalStatement(GsaGrammarParser.LocalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalStatements}
	 * labeled alternative in {@link GsaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterLocalStatements(GsaGrammarParser.LocalStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalStatements}
	 * labeled alternative in {@link GsaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitLocalStatements(GsaGrammarParser.LocalStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodArguments}
	 * labeled alternative in {@link GsaGrammarParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(GsaGrammarParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodArguments}
	 * labeled alternative in {@link GsaGrammarParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(GsaGrammarParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GsaGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link GsaGrammarParser#methodArg}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GsaGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleArg}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterSingleArg(GsaGrammarParser.SingleArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleArg}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitSingleArg(GsaGrammarParser.SingleArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleArgs}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterMultipleArgs(GsaGrammarParser.MultipleArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleArgs}
	 * labeled alternative in {@link GsaGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitMultipleArgs(GsaGrammarParser.MultipleArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleArgument}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgument(GsaGrammarParser.SingleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleArgument}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgument(GsaGrammarParser.SingleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleArguments}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterMultipleArguments(GsaGrammarParser.MultipleArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleArguments}
	 * labeled alternative in {@link GsaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitMultipleArguments(GsaGrammarParser.MultipleArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GsaGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GsaGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GsaGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GsaGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDefinition}
	 * labeled alternative in {@link GsaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(GsaGrammarParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDefinition}
	 * labeled alternative in {@link GsaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(GsaGrammarParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link GsaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(GsaGrammarParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link GsaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(GsaGrammarParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link GsaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(GsaGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link GsaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(GsaGrammarParser.MethodCallContext ctx);
}