package types;

import expression.Expression;

public class String extends Expression {
    String string;

    public String getString() {
        return this.string;
    }

    public String(String str){
        this.string = str;
    }

}
