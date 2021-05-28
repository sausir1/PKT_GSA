package operations;

import expression.Expression;

import java.util.List;

public class MethodInvocation extends Expression{
    Expression expression;

    public Expression getExpression(){
        return expression;
    }

    public MethodInvocation(Expression exp){
        this.expression = exp;
    }

}
