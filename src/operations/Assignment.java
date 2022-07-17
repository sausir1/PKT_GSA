package operations;

import expression.Expression;

public class Assignment extends Expression {
    String id;
    Expression equalsTo;

    public String getId(){ return id; }
    public Expression getRight(){return this.equalsTo;};

    public Assignment(String id, Expression equalsTo){
        this.id = id;
        this.equalsTo = equalsTo;
    }

    @Override
    public String toString(){
        return id + "="+this.equalsTo.toString();
    }
}
