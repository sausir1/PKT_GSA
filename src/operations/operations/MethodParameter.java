package operations;


import expression.*;
import expression.Expression;

public class MethodParameter extends Expression {
    String id;
    Types type;

    public MethodParameter(String id, Types type)
    {
        this.id = id;
        this.type = type;
    }

    public String getId(){ return this.id;}
    public Types getType(){ return this.type;}


    @Override
    public String toString()
    {
        return this.type.name().toLowerCase() + " " + this.id;
    }
}
