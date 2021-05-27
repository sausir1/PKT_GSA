package expression;

import antlr.GsaGrammarBaseVisitor;
import antlr.GsaGrammarParser.*;
import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;
import operations.Equals;
import operations.EqualsOrGreaterThan;
import operations.EqualsOrLessThan;
import operations.GreaterThan;
import operations.LessThan;
import org.antlr.v4.runtime.Token;
import types.Number;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpression extends GsaGrammarBaseVisitor<Expression> {

    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    /*
     * Kai aplankyti visi visit metodai
     * galima suprast, kad kintamieji sudeti tokia tvarka,
     *  kokia buvo iskviesti ir metodai
     **/
    private List<String> vars; // susideti visiems kintamiesiems paskelbtus programoje

    //Klaidoms talpinti
    private List<String> semanticErrors; //pakartotiniams paskelbimams, nepasklebtu kintamuju naudojimas


    private String checkIfExists(DeclContext ctx)
    {
        String id = "";
        VariableChecker checker = new VariableChecker(vars,semanticErrors);
        if(ctx instanceof IntDeclarationContext)
        {
            IntDeclarationContext e = (IntDeclarationContext) ctx;
            checker.checkIfExists(e);
            id = e.ID().getText();
        }
        if(ctx instanceof StringDeclarationContext)
        {
            StringDeclarationContext e = (StringDeclarationContext) ctx;
            checker.checkIfExists(e);
            id = e.ID().getText();
        }
        if(ctx instanceof MethodDeclarationContext)
        {
            MethodDeclarationContext e = (MethodDeclarationContext) ctx;
            checker.checkIfExists(e);
            id = e.ID().getText();
        }
        if(ctx instanceof BoolDeclarationContext)
        {
            BoolDeclarationContext e = (BoolDeclarationContext) ctx;
            checker.checkIfExists(e);
            id = e.ID().getText();
        }
        if(ctx instanceof CharDeclarationContext)
        {
            CharDeclarationContext e = (CharDeclarationContext) ctx;
            checker.checkIfExists(e);
            id = e.ID().getText();
        }
        this.semanticErrors = checker.getErrors();
        this.vars = checker.getVars();
        return id;
    }

    @Override
    public Expression visitStringDeclaration(StringDeclarationContext ctx) {
        String id = checkIfExists(ctx);
        String val = ctx.getChild(3).getText();
        return new VariableDeclaration(id, Types.STRING,val);
    }

    @Override
    public Expression visitBoolDeclaration(BoolDeclarationContext ctx) {
        String id = checkIfExists(ctx);
        String val = ctx.getChild(3).getText();
        return new VariableDeclaration(id, Types.BOOL,val);
    }

    @Override
    public Expression visitCharDeclaration(CharDeclarationContext ctx) {
        String id = checkIfExists(ctx);
        String val = ctx.getChild(3).getText();
        return new VariableDeclaration(id, Types.CHAR,val);
    }

    @Override
    public Expression visitMethodDeclaration(MethodDeclarationContext ctx) {
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Expression visitString(StringContext ctx) {
        return super.visitString(ctx);
    }


    @Override
    public Expression visitIntDeclaration(IntDeclarationContext ctx) {
        String id = checkIfExists(ctx);
        String type = ctx.getChild(0).getText();
        String val = ctx.getChild(3).getText();
        return new VariableDeclaration(id, Types.INT,val);
    }

    @Override
    public Expression visitMultiplication(MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public Expression visitDivision(DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Division(left,right);
    }

    @Override
    public Expression visitAddition(AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Addition(left,right);
    }

    @Override
    public Expression visitVariable(VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)){
            semanticErrors.add("Error. variable " +id+" is not declared ("+line+","+col+")");
        }
        return new Variable(id);
    }


    @Override
    public Expression visitAssignment(AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Expression visitEqualsOrGreaterThan(EqualsOrGreaterThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new EqualsOrGreaterThan(left,right);
    }

    @Override
    public Expression visitEquals(EqualsContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Equals(left,right);
    }

    @Override
    public Expression visitSubtraction(SubtractionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Subtraction(left,right);
    }

    @Override
    public Expression visitBool(BoolContext ctx) {
        return super.visitBool(ctx);
    }

    @Override
    public Expression visitChar(CharContext ctx) {
        return super.visitChar(ctx);
    }

    @Override
    public Expression visitIfElseStatement(IfElseStatementContext ctx) {
      return super.visitIfElseStatement(ctx);
    }

    @Override
    public Expression visitCondition(ConditionContext ctx) {
        int n = ctx.conditionalStatement().getChildCount();

        for(int i = 0; i< n; i++)
        {
            Expression e = visit(ctx.getChild())
        }
        return new ;
    }

    @Override
    public Expression visitIfElifStatement(IfElifStatementContext ctx) {
        return super.visitIfElifStatement(ctx);
    }

    @Override
    public Expression visitConditionBlock(ConditionBlockContext ctx) {

        Expression e = visitGreaterThan((GreaterThanContext) ctx.expr() );
        return new ConditionBlock(e);
    }

    @Override
    public Expression visitIfStatement(IfStatementContext ctx) {
        Expression condition = visit(ctx.getChild(1));
        Expression body = visit(ctx.ifBody());
        return new IfStatement(condition, body);
    }

    @Override
    public Expression visitElifStatement(ElifStatementContext ctx) {
        return super.visitElifStatement(ctx);
    }

    @Override
    public Expression visitElseStatement(ElseStatementContext ctx) {
        return super.visitElseStatement(ctx);
    }

    @Override
    public Expression visitConditionBody(ConditionBodyContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        for(int i = 1; i< ctx.getChildCount()-1; i++)
        {
            Expression e = visit(ctx.getChild(i));
            expressions.add(e);
        }
        return new ConditionBody(expressions);
    }

    @Override
    public Expression visitGreaterThan(GreaterThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new GreaterThan(left,right);
    }

    @Override
    public Expression visitLessThan(LessThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new LessThan(left,right);
    }

    @Override
    public Expression visitEqualsOrLessThan(EqualsOrLessThanContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new EqualsOrLessThan(left,right);
    }

    @Override
    public Expression visitNumber(NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Expression visitIteration(IterationContext ctx) {
        Expression e = visit(ctx.getChild(0));

        return new Iteration(e);
    }

    @Override
    public Expression visitLocalStatements(LocalStatementsContext ctx) {
        List<Expression> expressions = new ArrayList<Expression>();
        for(int i = 0; i< ctx.getChildCount(); i++){
            Expression e = visit(ctx.getChild(i));
            expressions.add(e);
        }

        return new LocalStatements(expressions);
    }

    @Override
    public Expression visitForToStatement(ForToStatementContext ctx) {
        int start = Integer.parseInt(ctx.getChild(2).getText());
        int end = Integer.parseInt(ctx.getChild(4).getText());
        Expression e = visit(ctx.getChild(7));


        return super.visitForToStatement(ctx);
    }
}
