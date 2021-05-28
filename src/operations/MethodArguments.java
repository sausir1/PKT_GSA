package operations;

import expression.Expression;

import java.util.List;

public class MethodArguments extends Expression {
    List<Expression> argumentsList;

    public List<Expression> getArgumentsList()
    {
        return this.argumentsList;
    }


    public MethodArguments(List<Expression> Args)
    {
        this.argumentsList = Args;
    }

    @Override
    public String toString()
    {
        return this.argumentsList.toString();
    }
}
