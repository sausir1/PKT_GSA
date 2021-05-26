package operations;

import expression.Expression;

public class EqualsOrGreaterThan {
    Expression left;
    Expression right;

    public Expression getLeft(){ return left; }
    public Expression getRight(){ return right; }

    public EqualsOrGreaterThan(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return left.toString() + ">=" + right.toString();
    }
}
