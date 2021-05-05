package expression;

import java.time.temporal.ValueRange;

public class VariableDeclaration extends Expression{
    public String id;
    public String type;
    public int val;

    public VariableDeclaration(String id, String type, int val){
        this.id = id;
        this.type  = type;
        this.val = val;
    }
}
