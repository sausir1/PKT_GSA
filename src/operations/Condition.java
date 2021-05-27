package operations;

import expression.Expression;

import java.util.List;

public class Condition extends Expression {
    List<Expression> mid;

    public List<Expression> getMid(){ return mid; }

    public Condition(List<Expression> left){
        this.mid = left;
    }

    @Override
    public String toString(){
        return mid.toString();
    }


}
