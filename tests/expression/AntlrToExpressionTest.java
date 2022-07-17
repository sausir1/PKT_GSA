package expression;

import operations.*;
import operations.Division;
import operations.MethodParameter;
import operations.Multiplication;
import org.antlr.v4.runtime.CommonToken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.*;
import org.mockito.Mockito;
import types.Bool;
import types.Char;
import types.Number;
import types.String;

import java.util.ArrayList;

import static antlr.GsaGrammarParser.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.*;

class AntlrToExpressionTest {

    @Mock DeclContext declContext;
    @Mock
    expression.VariableChecker variableChecker;
    AutoCloseable autoCloseable;
    @Mock
    expression.AntlrToExpression antlr;


    @BeforeEach
    void setUp() {
        this.autoCloseable = MockitoAnnotations.openMocks(this);
        this.variableChecker = Mockito.mock(VariableChecker.class);
    }

    @Test
    void visitIntArrayDeclaration() {
        this.antlr = new AntlrToExpression(new ArrayList<>());
        ArrayList<java.lang.String> vars = new ArrayList<>();
        String value = new String("ab");
        StringDeclarationContext strCtx = Mockito.mock(StringDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(strCtx.ID().getText()).thenReturn("a");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.when(this.antlr.visit(strCtx.getChild(3))).thenReturn(value);
//        Mockito.when(this.antlr2.antlr.getVariables()).thenCallRealMethod();

        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitStringDeclaration(strCtx);
        assertThat(this.antlr.getVariables())
                .contains("a");
    }
    @Test
    void visitStringDeclaration() {
        ArrayList<java.lang.String> vars = new ArrayList<>();
        String value = new String("abc");
        StringDeclarationContext ctx = Mockito.mock(StringDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.antlr = new AntlrToExpression(new ArrayList<>());
        Mockito.when(ctx.ID().getText()).thenReturn("a");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.doNothing().when(this.variableChecker)
                .checkIfExists(Mockito.isA(StringDeclarationContext.class));
        Mockito.when(this.antlr.visit(ctx.getChild(3))).thenReturn(value);
        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitStringDeclaration(ctx);
        assertThat(this.antlr.getVariables())
                .hasSize(2)
                .contains("a");
    }

    @Test
    void visitBoolDeclaration() {
        ArrayList<java.lang.String> vars = new ArrayList<>();
        Bool value = new Bool(true);
        BoolDeclarationContext ctx = Mockito.mock(BoolDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.antlr = new AntlrToExpression(new ArrayList<>());
        Mockito.when(ctx.ID().getText()).thenReturn("a");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.doNothing().when(this.variableChecker)
                .checkIfExists(Mockito.isA(BoolDeclarationContext.class));
        Mockito.when(this.antlr.visit(ctx.getChild(3))).thenReturn(value);
//        Mockito.when(this.antlr2.antlr.visitCharDeclaration(ctx)).thenCallRealMethod();
//        Mockito.when(this.antlr2.antlr.getVariables()).thenCallRealMethod();

        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitBoolDeclaration(ctx);
        assertThat(this.antlr.getVariables())
                .hasSize(2)
                .contains("a");
    }

    @Test
    void visitCharDeclaration() {
        ArrayList<java.lang.String> vars = new ArrayList<>();
        Char value = new Char('v');
        CharDeclarationContext ctx = Mockito.mock(CharDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.antlr = new AntlrToExpression(new ArrayList<>());
        Mockito.when(ctx.ID().getText()).thenReturn("a");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.doNothing().when(this.variableChecker)
                .checkIfExists(Mockito.isA(CharDeclarationContext.class));
        Mockito.when(this.antlr.visit(ctx.getChild(3))).thenReturn(value);
        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitCharDeclaration(ctx);
        assertThat(this.antlr.getVariables())
                .hasSize(2)
                .contains("a");
    }

    @Test
    void visitIntDeclaration() {
        ArrayList<java.lang.String> vars = new ArrayList<>();
        Number value = new Number(51);
        IntDeclarationContext ctx = Mockito.mock(IntDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.antlr = new AntlrToExpression(new ArrayList<>());
        Mockito.when(ctx.getChild(1).getText()).thenReturn("a");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.doNothing().when(this.variableChecker)
                .checkIfExists(Mockito.isA(IntDeclarationContext.class));
        Mockito.when(this.antlr.visit(ctx.getChild(3))).thenReturn(value);
        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitIntDeclaration(ctx);
        assertThat(this.antlr.getVariables())
                .hasSize(2)
                .contains("a");
    }

    @Test
    void visitMultiplication() {
        this.antlr = Mockito.mock(AntlrToExpression.class, Mockito.RETURNS_DEEP_STUBS);
        MultiplicationContext ctx = Mockito.mock(MultiplicationContext.class);
        Number num1 = new Number(2);
        Number num2 = new Number(2);
        Mockito.when(this.antlr.visit(ctx.getChild(0))).thenReturn(num1);
        Mockito.when(this.antlr.visit(ctx.getChild(2))).thenReturn(num2);
        Mockito.when(this.antlr.visitMultiplication(ctx)).thenCallRealMethod();
        assertNotEquals(new Division(new Number(44), new Number(486)), this.antlr.visitMultiplication(ctx));
//        assertThat(new Subtraction(num1, num2)).isSameAs(antlr2.antlr.visitSubtraction(ctx));
        assertThat(this.antlr.visitMultiplication(ctx)).isInstanceOf(Multiplication.class);
        assertThat(this.antlr.visitMultiplication(ctx)).isNotInstanceOf(Subtraction.class);
    }

    @Test
    void visitDivision() {
        this.antlr = Mockito.mock(AntlrToExpression.class, Mockito.RETURNS_DEEP_STUBS);
        DivisionContext ctx = Mockito.mock(DivisionContext.class);
        Number num1 = new Number(2);
        Number num2 = new Number(2);
        Mockito.when(this.antlr.visit(ctx.getChild(0))).thenReturn(num1);
        Mockito.when(this.antlr.visit(ctx.getChild(2))).thenReturn(num2);
        Mockito.when(this.antlr.visitDivision(ctx)).thenCallRealMethod();
        assertNotEquals(new Division(new Number(44), new Number(486)), this.antlr.visitDivision(ctx));
//        assertThat(new Subtraction(num1, num2)).isSameAs(antlr2.antlr.visitSubtraction(ctx));
        assertThat(this.antlr.visitDivision(ctx)).isInstanceOf(Division.class);
        assertThat(this.antlr.visitDivision(ctx)).isNotInstanceOf(Subtraction.class);
    }

    @Test
    void visitAddition() {
        this.antlr = Mockito.mock(AntlrToExpression.class, Mockito.RETURNS_DEEP_STUBS);
        AdditionContext ctx = Mockito.mock(AdditionContext.class);
        Number num1 = new Number(2);
        Number num2 = new Number(2);
        Mockito.when(this.antlr.visit(ctx.getChild(0))).thenReturn(num1);
        Mockito.when(this.antlr.visit(ctx.getChild(2))).thenReturn(num2);
        Mockito.when(this.antlr.visitAddition(ctx)).thenCallRealMethod();
        assertNotEquals(new Addition(new Number(44), new Number(486)), this.antlr.visitAddition(ctx));
//        assertThat(new Subtraction(num1, num2)).isSameAs(antlr2.antlr.visitSubtraction(ctx));
        assertThat(this.antlr.visitAddition(ctx)).isInstanceOf(Addition.class);
        assertThat(this.antlr.visitAddition(ctx)).isNotInstanceOf(Subtraction.class);
    }

    @Test
    void visitVariable() {
        this.antlr = new AntlrToExpression(new ArrayList<>());
        VariableContext ctx = Mockito.mock(VariableContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Variable v = Mockito.spy(new Variable("abc"));
        Mockito.when(ctx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(5);
        Mockito.when(token.getCharPositionInLine()).thenReturn(2);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("abc");
        this.antlr.visitVariable(ctx);
        assertThat(this.antlr.getErrors())
                .hasSize(1)
                .contains("Error. variable abc is not declared (5,3)");
    }


    @Test
    void visitSubtraction() {
        this.antlr = Mockito.mock(AntlrToExpression.class, Mockito.RETURNS_DEEP_STUBS);
        SubtractionContext ctx = Mockito.mock(SubtractionContext.class);
        Number num1 = new Number(2);
        Number num2 = new Number(2);
        Mockito.when(this.antlr.visit(ctx.getChild(0))).thenReturn(num1);
        Mockito.when(this.antlr.visit(ctx.getChild(2))).thenReturn(num2);
        Mockito.when(this.antlr.visitSubtraction(ctx)).thenCallRealMethod();
        assertNotEquals(new Subtraction(new Number(44), new Number(486)), this.antlr.visitSubtraction(ctx));
//        assertThat(new Subtraction(num1, num2)).isSameAs(antlr2.antlr.visitSubtraction(ctx));
        assertThat(this.antlr.visitSubtraction(ctx)).isInstanceOf(Subtraction.class);
    }

    @Test
    void visitMethodDeclaration() {
        ArrayList<java.lang.String> vars = new ArrayList<>();
        Number value = new Number(5);
        MethodDeclarationContext ctx = Mockito.mock(MethodDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.antlr = new AntlrToExpression(new ArrayList<>());
        Mockito.when(ctx.getChild(1).getText()).thenReturn("method");
        Mockito.when(this.variableChecker.getVars()).thenReturn(vars);
        Mockito.when(this.variableChecker.getErrors()).thenReturn(vars);
        Mockito.doNothing().when(this.variableChecker)
                .checkIfExists(Mockito.isA(MethodDeclarationContext.class));
        Mockito.when(this.antlr.visit(ctx.getChild(2).getChild(0))).thenReturn(value);
        Mockito.when(ctx.getChild(2).getChild(1).getChildCount()).thenReturn(1);
        assertThat(this.antlr.getVariables()).hasSize(0);
        this.antlr.visitMethodDeclaration(ctx);
        assertThat(this.antlr.getVariables())
                .hasSize(0);
    }


    @Test
    void visitParameter() {
        this.antlr = new AntlrToExpression(new ArrayList<>());
        ParameterContext ctx = Mockito.mock(ParameterContext.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("int");
        Mockito.when(ctx.getChild(1).getText()).thenReturn("a");

        assertThat(this.antlr.visitParameter(ctx)).isInstanceOf(MethodParameter.class);
        assertThat(this.antlr.visitParameter(ctx)).isNotInstanceOf(SingleArgContext.class);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("int");
        Mockito.when(ctx.getChild(1).getText()).thenReturn("b");

        assertThat(this.antlr.visitParameter(ctx)).isInstanceOf(MethodParameter.class);
        assertThat(this.antlr.visitParameter(ctx)).isNotInstanceOf(SingleArgContext.class);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("string");
        Mockito.when(ctx.getChild(1).getText()).thenReturn("c");

        assertThat(this.antlr.visitParameter(ctx)).isInstanceOf(MethodParameter.class);
        assertThat(this.antlr.visitParameter(ctx)).isNotInstanceOf(SingleArgContext.class);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("bool");
        Mockito.when(ctx.getChild(1).getText()).thenReturn("d");

        assertThat(this.antlr.visitParameter(ctx)).isInstanceOf(MethodParameter.class);
        assertThat(this.antlr.visitParameter(ctx)).isNotInstanceOf(SingleArgContext.class);
        Mockito.when(ctx.getChild(0).getText()).thenReturn("char");
        Mockito.when(ctx.getChild(1).getText()).thenReturn("e");
        assertThat(this.antlr.visitParameter(ctx)).isInstanceOf(MethodParameter.class);
        assertThat(this.antlr.visitParameter(ctx)).isNotInstanceOf(SingleArgContext.class);
    }
}