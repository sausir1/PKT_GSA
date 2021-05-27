package expression;

import operations.*;
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


    public ExpressionProcessor(){}

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
            }
            else if(e instanceof Condition)
            {
                ConditionBody res =  getResultOfCondition((Condition) e);
                if(res!= null)
                {
                    getResults(res);
                }
            }
            else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e);
                if(res == 0){ // GetResultOf metode jeigu neiskviecia funkcijos, kvies GetREsultOfBool funkcija
                    boolean res2 = getResultOfBool(e);
                    results.add(input + " = " + res2);
                }else {
                    results.add(input + " = " + res);
                }
            }
        }
        return results;
    }


    public List<String> getResults(Expression e){
        List<String> results = new ArrayList<>();
        for (Expression e2:expressions)
        {
            if(e instanceof Condition)
            {
                Expression res =  getResultOfCondition((Condition) e);
                if(res!= null)
                {
                    getResults(res);
                }
            }
            else {
                //visiems kitiems atvejams
                String input = e2.toString();
                int res = getResultOf(e2);
                if(res == 0){ // GetResultOf metode jeigu neiskviecia funkcijos, kvies GetREsultOfBool funkcija
                    boolean res2 = getResultOfBool(e2);
                    results.add(input + " = " + res2);
                }else {
                    results.add(input + " = " + res);
                }
            }
        }
        return results;
    }


    private ConditionBody getResultOfCondition(Condition e)
    {
        ConditionBody cb = null;
        List<Expression> ems = e.getMid();
        for(int i = 0; i< ems.size(); i++)
        {
            cb = getResultOfStatement(ems.get(i));
            if(cb != null)
            {
                return cb;
            }
        }
        return cb;
    }

    private ConditionBody getResultOfStatement(Expression e)
    {
        ConditionBlock cblck = (ConditionBlock) ((IfStatement) e).getEquation();
        if(getResultOfBool((cblck.getAnswer())))
        {
            return (ConditionBody) ((IfStatement) e).getBody();
        }
        return null;
    }

    // TODO visa sita metoda dar  reikia pertvarkyt, nes cia tik sudetis tarp skaiciu veikia
    public int getResultOf(Expression e){
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
        return result;
    }

    public boolean getResultOfBool(Expression e){
        boolean result = false;
        if (e instanceof Equals){
            Equals eq = (Equals) e;
            int left = getResultOf(eq.getLeft());
            int right = getResultOf(eq.getRight());
            if(left == right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof EqualsOrGreaterThan){
            EqualsOrGreaterThan eq = (EqualsOrGreaterThan) e;
            int left = getResultOf(eq.getLeft());
            int right = getResultOf(eq.getRight());
            if(left >= right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof EqualsOrLessThan){
            EqualsOrLessThan eq = (EqualsOrLessThan) e;
            int left = getResultOf(eq.getLeft());
            int right = getResultOf(eq.getRight());
            if(left <= right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof GreaterThan){
            GreaterThan eq = (GreaterThan) e;
            int left = getResultOf(eq.getLeft());
            int right = getResultOf(eq.getRight());
            if(left > right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof LessThan){
            LessThan eq = (LessThan) e;
            int left = getResultOf(eq.getLeft());
            int right = getResultOf(eq.getRight());
            if(left < right){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
}
