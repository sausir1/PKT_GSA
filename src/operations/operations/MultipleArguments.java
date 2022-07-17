package operations;

import expression.Expression;

import java.util.List;

public class MultipleArguments extends Expression{
    List<String> vars;

    public List<String> getList(){
        return vars;
    }

    public MultipleArguments(List<String> vars){

        this.vars = vars;
    }
}
