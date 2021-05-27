package operations;

import expression.Expression;

public class IfStatement extends Expression {
    Expression equation;
    Expression body;

    public Expression getEquation(){ return equation; }


    public IfStatement(Expression equation, Expression body){
        this.equation = equation;
        this.body = body;
    }

    @Override
    public String toString(){
        return equation.toString();
    }

}
