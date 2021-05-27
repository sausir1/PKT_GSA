package operations;

import expression.Expression;

public class ConditionBlock extends Expression {
    Expression mid;

    public Expression getMid(){ return mid; }

    public ConditionBlock(Expression left){
        this.mid = left;
    }

    @Override
    public String toString(){
        return mid.toString();
    }
}
