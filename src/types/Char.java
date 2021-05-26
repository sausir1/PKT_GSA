package types;

import java.lang.String;
import expression.Expression;

public class Char extends Expression {
    char c;

    public int getChar() {
        return this.c;
    }

    public Char(char ch){
        this.c = ch;
    }

    @Override
    public String toString(){
        return ""+this.c;
    }
}
