package operations;

import expression.Expression;

public class ConditionBlock extends Expression {
    Expression mid;

    public Expression getAnswer(){ return mid; }

    public ConditionBlock(Expression answer){
        this.mid = answer;
    }

    @Override
    public String toString(){
        return "Condition " + mid.toString();
    }
}
