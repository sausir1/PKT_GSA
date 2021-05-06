package expression;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {

    public static boolean hasErrors = false;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e)
    {
        hasErrors =true;

        List<String> SyntaxErrors = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(SyntaxErrors);
        System.err.println("Syntax error occured!");
        System.err.println("Token " + "\""+((Token) offendingSymbol).getText() + "\""+
                " (line"+line+", column " + (charPositionInLine + 1) + " )" + ":" + msg);
        System.err.println("Rule Stack: "+ SyntaxErrors);
    }
}
