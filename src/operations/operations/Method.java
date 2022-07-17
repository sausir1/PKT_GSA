package operations;

import expression.Expression;

public class Method extends Expression {
    Expression arguments;
    String methodName;
    Expression body;


    public Method(String name, Expression arguments, Expression body)
    {
        this.arguments = arguments;
        this.methodName = name;
        this.body = body;
    }

    public Expression getArguments(){
        return this.arguments;
    }
    public Expression getBody()
    {
        return this.body;
    }
    public String getMethodName()
    {
        return this.methodName;
    }

    @Override
    public String toString()
    {
        return this.methodName + arguments.toString();
    }
}
