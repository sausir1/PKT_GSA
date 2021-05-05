package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor extends Expression{
    List<Expression> expressions;
    public Map<String,Integer> vals; //simboliu lentele laikanti reiksmes
    public ExpressionProcessor(List<Expression> list){
        this.expressions = list;
        vals = new HashMap<>();
    }

    public List<String> getResults(){
        List<String> results = new ArrayList<>();
        for (Expression e:expressions)
        {
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                vals.put(decl.id, decl.val);
            } else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e);
                results.add(input + " is " + res);
            }
        }
        return results;
    }

    private int getResultOf(Expression e){
        int result = 0;
        if(e instanceof Number){
            Number num = (Number) e;
            result = num.num;
        }
        if(e instanceof Variable){
            Variable var = (Variable) e;
            result = vals.get(var.id);
        }
        else if(e instanceof Addition){
            Addition add = (Addition) e;
            int left = getResultOf(add.left);
            int right = getResultOf(add.right);
            result = left + right;
        }
        else if (e instanceof Multiplication){
            Multiplication mult = (Multiplication) e;
            int left = getResultOf(mult.left);
            int right = getResultOf(mult.right);
            result = left * right;
        }
        return result;
    }
}
