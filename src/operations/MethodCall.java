package operations;

import expression.Expression;

import java.util.List;

public class MethodCall extends Expression {

    List<Expression> givenArgs;
    String methodName;

    public String getMethodName()
    {
        return this.methodName;
    }

    public MethodCall(List<Expression> givenArgs, String methodName)
    {
        this.givenArgs = givenArgs;
        this.methodName = methodName;
    }


    @Override
    public String toString()
    {
        return "Calling method->"+methodName+" with args->"+givenArgs.toString();
    }
}
