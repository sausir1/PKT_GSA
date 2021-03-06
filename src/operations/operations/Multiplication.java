package operations;

import expression.Expression;

public class Multiplication extends Expression {
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Expression getLeft(){ return left; }
    public Expression getRight(){ return right; }

    @Override
    public String toString(){
        return left.toString() + " * " + right.toString();
    }
}
