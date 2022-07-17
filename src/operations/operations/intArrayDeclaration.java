package operations;

import expression.Expression;
import expression.Types;

public class intArrayDeclaration extends Expression{
    Expression expression;
    String id;
    Types type;

    public Expression getExpression(){
        return expression;
    }
    public String getID(){
        return this.id;
    }

    public intArrayDeclaration(Expression exp,String id, Types type){
        this.expression = exp;
        this.id = id;
        this.type = type;
    }
}
