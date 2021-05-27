package operations;

import expression.Expression;

import java.util.List;

public class ForTo extends Expression {
    int start;
    int end;
    Expression LocalExp;

    public Expression getExpression(){ return LocalExp; }
    public int getStart(){ return start; }
    public int getEnd(){ return end; }

    public ForTo(int start, int end, Expression exp){
        this.start = start;
        this.end = end;
        this.LocalExp = exp;
    }
}
