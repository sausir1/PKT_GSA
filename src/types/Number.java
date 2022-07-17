package types;

import java.lang.String;
import expression.Expression;

public class Number extends Expression {
    int num;

    public int getNum() {
        return this.num;
    }

    public Number(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return Integer.toString(num);
    }
}
