package operations;

import expression.Expression;

import java.util.List;

public class UnoStatement extends Expression{
    List<Expression> expressions;

    public List<Expression> getList(){
        return expressions;
    }

    public UnoStatement(List<Expression> exp){
        this.expressions = exp;
    }



}
