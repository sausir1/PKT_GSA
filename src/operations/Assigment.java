package operations;

import expression.Expression;

public class Assigment {
    String id;

    public String getId(){ return id; }

    public Assigment(String id){
        this.id = id;
    }

    @Override
    public String toString(){
        return id;
    }
}
