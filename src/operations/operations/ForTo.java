package operations;

import expression.Expression;

public class ForTo extends Expression {
    int start;
    int end;
    int current;
    Expression LocalExp;

    public Expression getExpression(){ return LocalExp; }
    public int getStart(){ return start; }
    public int getCurrent(){return current;}
    public int getEnd(){ return end; }

    public ForTo(int start, int end, Expression exp){
        this.start = start;
        this.end = end;
        this.LocalExp = exp;
    }

    public void setCurrent(int current){
        this.current = current;
    }
}
