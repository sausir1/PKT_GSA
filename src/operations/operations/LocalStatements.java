package operations;

import expression.Expression;

import java.util.List;

public class LocalStatements extends Expression{
    List<Expression> expressions;

    public List<Expression> getStatements(){
        return expressions;
    }

    public LocalStatements(List<Expression> exp){
        this.expressions = exp;
    }



}
