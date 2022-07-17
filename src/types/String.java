package types;

import expression.Expression;

public class String extends Expression {
    java.lang.String string;

    public String(java.lang.String string) {
        this.string = string;
    }

    public java.lang.String getString() {
        return this.string;
    }

    public java.lang.String toString() {
        return this.string;
    }

}
