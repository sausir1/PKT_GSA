package operations;

import expression.Expression;

public class ArrayMember extends Expression {
    Expression e;
    String id;

    public ArrayMember(String id, Expression e){
        this.id = id;
        this.e =e;
    }

    public String getId(){
        return this.id;
    }
    public String getElement(){
        return this.e.toString();
    }

    @Override
    public String toString() {
        return this.id + "["+this.e+"]";
    }
}
