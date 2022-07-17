package expression;

import org.antlr.v4.runtime.CommonToken;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.*;
import org.mockito.Mockito;

import java.util.ArrayList;

import static antlr.GsaGrammarParser.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.*;

class VariableCheckerTest {

    @Mock
            IntDeclarationContext intCtx;
    @Mock
            StringDeclarationContext strCtx;
    @Mock
            BoolDeclarationContext  boolCtx;
    @Mock
            CharDeclarationContext charCtx;
    @Mock
            MethodDeclarationContext methCtx;
    @Mock
            DeclContext declContext;

    AutoCloseable autoCloseable;

    ArrayList<String> vars;
    ArrayList<String> errors;
    VariableChecker variableChecker;

    @BeforeEach
    void setUp() {
        this.autoCloseable = MockitoAnnotations.openMocks(this);
        this.vars = new ArrayList<String>();
        this.errors = new ArrayList<>();
        vars.add("a");
        vars.add("b");
        vars.add("c");
        vars.add("d");
        this.variableChecker = new VariableChecker(vars, errors);
    }

    @AfterEach
    void tearDown () throws Exception {
        this.autoCloseable.close();
    }

    @Test
    void getVars() {
        assertEquals(this.vars, this.variableChecker.getVars());
        assertNotEquals(this.errors, this.variableChecker.getVars());
    }

    @Test
    void getErrors() {
        assertNotEquals(this.vars, this.variableChecker.getErrors());
        assertEquals(this.errors, this.variableChecker.getErrors());
    }

    @Test
    void checkIfExistsInteger() {
        this.intCtx = Mockito.mock(IntDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.intCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(16);
        Mockito.when(token.getCharPositionInLine()).thenReturn(4);
        Mockito.when(this.intCtx.getChild(1).getText()).thenReturn("b");
        assertThat(variableChecker.getErrors()).hasSize(0);
        variableChecker.checkIfExists(this.intCtx);
        assertThat(variableChecker.getErrors())
                .hasSize(1)
                .contains("Error: variable with name b already declared in (16,5)");
    }

    @Test
    void testCheckIfExistsBool() {
        this.boolCtx = Mockito.mock(BoolDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.boolCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(11);
        Mockito.when(token.getCharPositionInLine()).thenReturn(12);
        Mockito.when(this.boolCtx.getChild(1).getText()).thenReturn("c");
        assertThat(this.variableChecker.getVars()).hasSize(4);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        this.variableChecker.checkIfExists(this.boolCtx);
        assertThat(this.variableChecker.getErrors())
                .hasSize(1)
                .contains("Error: variable with name c already declared in (11,13)");
        assertThat(this.variableChecker.getVars()).hasSize(4);
    }

    @Test
    void testCheckIfExistsMethod() {
        this.methCtx = Mockito.mock(MethodDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.methCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(1);
        Mockito.when(token.getCharPositionInLine()).thenReturn(3);
        Mockito.when(this.methCtx.getChild(1).getText()).thenReturn("a");
        assertThat(this.variableChecker.getVars()).hasSize(4);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        this.variableChecker.checkIfExists(this.methCtx);
        assertThat(this.variableChecker.getErrors())
                .hasSize(1)
                .contains("Error: method can't be declared, variable with name a already declared in (1,4)");
        assertThat(this.variableChecker.getVars()).hasSize(4);
    }

    @Test
    void testCheckIfExistsChar() {
        this.charCtx = Mockito.mock(CharDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.charCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(17);
        Mockito.when(token.getCharPositionInLine()).thenReturn(19);
        Mockito.when(this.charCtx.getChild(1).getText()).thenReturn("a");
        assertThat(this.variableChecker.getVars()).hasSize(4);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        this.variableChecker.checkIfExists(this.charCtx);
        assertThat(this.variableChecker.getErrors())
                .hasSize(1)
                .contains("Error: variable with name a already declared in (17,20)");
        assertThat(this.variableChecker.getVars()).hasSize(4);
    }

    @Test
    void testCheckIfExistsString() {
        this.strCtx = Mockito.mock(StringDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.strCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(15);
        Mockito.when(token.getCharPositionInLine()).thenReturn(14);
        Mockito.when(this.strCtx.getChild(1).getText()).thenReturn("c");
        assertThat(this.variableChecker.getVars()).hasSize(4);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        this.variableChecker.checkIfExists(this.strCtx);
        assertThat(this.variableChecker.getErrors())
                .hasSize(1)
                .contains("Error: variable with name c already declared in (15,15)");
        assertThat(this.variableChecker.getVars()).hasSize(4);
    }

    @Test
    void testSuccesfullyAddUniqueNameVariables() {
        this.boolCtx = Mockito.mock(BoolDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.strCtx = Mockito.mock(StringDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.charCtx = Mockito.mock(CharDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.methCtx = Mockito.mock(MethodDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        this.intCtx = Mockito.mock(IntDeclarationContext.class, Mockito.RETURNS_DEEP_STUBS);
        org.antlr.v4.runtime.Token token = Mockito.mock(CommonToken.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(this.strCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(this.boolCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(this.charCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(this.methCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(this.intCtx.ID().getSymbol()).thenReturn(token);
        Mockito.when(token.getLine()).thenReturn(15);
        Mockito.when(token.getCharPositionInLine()).thenReturn(14);
        Mockito.when(this.strCtx.getChild(1).getText()).thenReturn("e");
        Mockito.when(this.boolCtx.getChild(1).getText()).thenReturn("f");
        Mockito.when(this.charCtx.getChild(1).getText()).thenReturn("g");
        Mockito.when(this.methCtx.getChild(1).getText()).thenReturn("h");
        Mockito.when(this.intCtx.getChild(1).getText()).thenReturn("i");
        this.variableChecker.checkIfExists(this.intCtx);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        assertThat(this.variableChecker.getVars()).hasSize(5);
        this.variableChecker.checkIfExists(this.strCtx);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        assertThat(this.variableChecker.getVars()).hasSize(6);

        this.variableChecker.checkIfExists(this.methCtx);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        assertThat(this.variableChecker.getVars()).hasSize(7);

        this.variableChecker.checkIfExists(this.charCtx);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        assertThat(this.variableChecker.getVars()).hasSize(8);

        this.variableChecker.checkIfExists(this.boolCtx);
        assertThat(this.variableChecker.getErrors()).hasSize(0);
        assertThat(this.variableChecker.getVars())
                .hasSize(9)
                .contains("a","b","c","d","e","f","g","h","i");
    }
}