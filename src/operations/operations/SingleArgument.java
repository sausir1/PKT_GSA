package operations;

import expression.Expression;
public class SingleArgument  extends Expression{
    String var;

    public String getExpression(){ return var; }

    public SingleArgument(String exp){
        this.var = exp;
    }
}
