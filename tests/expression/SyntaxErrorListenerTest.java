package expression;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import java.util.Collections;
import java.util.List;

class SyntaxErrorListenerTest {

    @Test
    void syntaxError() {
        Recognizer<?,?> recognizer = Mockito.mock(Recognizer.class);
        ArrayList<String> stack  = new ArrayList<String>();
        RecognitionException except = Mockito.mock(RecognitionException.class);
        PrintStream spy = Mockito.spy(System.err);
        Token obj = Mockito.mock(Token.class);

        stack.add("Method already declared");
        stack.add("Variable b already declared");

        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        assertThat(SyntaxErrorListener.hasErrors).isEqualTo(false);
        Mockito.when((obj).getText()).thenReturn("35");
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getRuleInvocationStack()).thenReturn(stack);


//        errorListener.syntaxError(recognizer, obj, 15, 6, "test", except);
//        assertThat(SyntaxErrorListener.hasErrors).isEqualTo(true);
//        Mockito.verify(spy).println("Syntax error occurred!");
//        Mockito.verify(spy).println("Token \"35\" (line15, column 7 ) :test");
//        Mockito.verify(spy).println("Rule Stack: Variable b already declared, Method already declared");
    }
}