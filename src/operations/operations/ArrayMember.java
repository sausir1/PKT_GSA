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

    public Expression getRawElement () {
        return this.e;
    }

    @Override
    public String toString() {
        return this.id + "["+this.e+"]";
    }
}
