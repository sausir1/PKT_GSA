package expression;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;
import types.Bool;
import types.Char;
import types.Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor extends Expression{

    List<Expression> expressions;
    public Map<String,String> stringVals; //simboliu lentele laikanti reiksmes
    public Map<String, Boolean> booleanVals; //simboliu lentele laikanti reiksmes
    public Map<String,Integer> intVals; //simboliu lentele laikanti reiksmes
    public Map<String, String> charVals; //simboliu lentele laikanti reiksmes
    public List<String> allIDs;
    //public Map<String,String> methodDeclarations; nzn ar sito reikia kolkas


    public ExpressionProcessor(List<Expression> list){
        this.expressions = list;
        stringVals = new HashMap<>();
        booleanVals = new HashMap<>();
        intVals = new HashMap<>();
        charVals = new HashMap<>();
        allIDs = new ArrayList<>();
    }

    public List<String> getResults(){
        List<String> results = new ArrayList<>();
        for (Expression e:expressions)
        {
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                switch (decl.type){
                    case INT:
                        intVals.put(decl.id, decl.getNumVal());
                        break;
                    case CHAR:
                        charVals.put(decl.id,decl.getStrVal());
                        break;
                    case STRING:
                        stringVals.put(decl.id, decl.getStrVal());
                        break;
                    case BOOL:
                        booleanVals.put(decl.id, decl.isBoolVal());
                        break;
                }
                //results.add(decl.id + " is " + decl.val);
            } else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e);
                results.add(input + " = " + res);
            }
        }
        return results;
    }


    // TODO visa sita metoda dar  reikia pertvarkyt, nes cia tik sudetis tarp skaiciu veikia
    private int getResultOf(Expression e){
        int result = 0;
        if(e instanceof Number){
            Number num = (Number) e;
            result = num.getNum();
        }
        if(e instanceof Variable){
            Variable var = (Variable) e;
            if(intVals.containsKey(var.id))
            {
                result = intVals.get(var.id);
            } else if (stringVals.containsKey(var.id)){
                result = 100; //TODO sutvarkyti cia dar reik.
            }
        }
        else if(e instanceof Addition){
            Addition add = (Addition) e;
            int left = getResultOf(add.getLeft());
            int right = getResultOf(add.getRight());
            result = left + right;
        }
        else if (e instanceof Multiplication){
            Multiplication mult = (Multiplication) e;
            int left = getResultOf(mult.getLeft());
            int right = getResultOf(mult.getRight());
            result = left * right;
        }
        else if (e instanceof Division){
            Division div = (Division) e;
            int left = getResultOf(div.getLeft());
            int right = getResultOf(div.getRight());
            result = left / right;
        }
        else if (e instanceof Subtraction){
            Subtraction subt = (Subtraction) e;
            int left = getResultOf(subt.getLeft());
            int right = getResultOf(subt.getRight());
            result = left - right;
        }
        else if (e instanceof Subtraction){

        }
        return result;
    }
}
