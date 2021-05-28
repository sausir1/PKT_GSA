package expression;


public class VariableDeclaration extends Expression{
    public String id;
    public Types type;
    public Expression val;

    public VariableDeclaration(String id, Types type, Expression val){
        this.id = id;
        this.type  = type;
        this.val = val;
    }

    @Override
    public String toString()
    {
        return type.name().toLowerCase() + " "+ id + " = " + val.toString();
    }

}


