package operations;

import expression.Expression;

import java.util.List;

public class ConditionBody extends Expression {
    List<Expression> body;

    public ConditionBody(List<Expression> expressions)
    {
        this.body = expressions;
    }


}
