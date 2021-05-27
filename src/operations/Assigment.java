package operations;

import expression.Expression;

public class Assigment {
    Expression left;
    Expression right;

    public Expression getLeft(){ return left; }
    public Expression getRight(){ return right; }

    public Assigment(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return left.toString() + " = " + right.toString();
    }
}
