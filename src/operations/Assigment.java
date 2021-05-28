package operations;

import expression.Expression;

public class Assigment extends Expression{
    String id;
    int value;

    public String getId(){ return id; }
    public int getValue() {return value;}

    public Assigment(String id, int value){
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString(){
        return id;
    }
}
