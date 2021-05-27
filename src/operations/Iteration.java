package operations;

import expression.Expression;

public class Iteration extends Expression{
    Expression iteration;


    public Expression getIteration(){ return iteration; }

    public Iteration(Expression iter){
        this.iteration = iter;
    }

    @Override
    public String toString(){
        return iteration.toString();
    }
}
