package operations;

import expression.Expression;

public class Iteration extends Expression{
    Expression left;


    public Expression getLeft(){ return left; }

    public Iteration(Expression left){
        this.left = left;
    }

    @Override
    public String toString(){
        return left.toString();
    }
}
