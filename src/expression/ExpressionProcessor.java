package expression;

import operations.*;
import types.Bool;
import types.Char;
import types.Number;

import java.util.*;

public class ExpressionProcessor extends Expression{

    List<Expression> expressions;
    public Map<String,String> stringVals; //simboliu lentele laikanti reiksmes
    public Map<String, Boolean> booleanVals; //simboliu lentele laikanti reiksmes
    public Map<String,Integer> intVals; //simboliu lentele laikanti reiksmes
    public Map<String, String> charVals; //simboliu lentele laikanti reiksmes
    public List<String> allIDs;
    public Map<String, Expression> values;
    //public Map<String,String> methodDeclarations; nzn ar sito reikia kolkas


    public ExpressionProcessor(){}

    public ExpressionProcessor(List<Expression> list){
        this.expressions = list;
        stringVals = new HashMap<>();
        booleanVals = new HashMap<>();
        intVals = new HashMap<>();
        charVals = new HashMap<>();
        values = new HashMap<>();
        allIDs = new ArrayList<>();
    }

    public int getInteger(String id){

        if(intVals.containsKey(id)) {
            return intVals.get(id);
        }
        else return 0;
    }

    private List<Expression> getMethodArguments(MethodArguments ma)
    {
        List<Expression> expressions =  new ArrayList<>();
        for(int i = 0; i< ma.getArgumentsList().size(); i++)
        {
            expressions.add(ma.getArgumentsList().get(i));
        }
        return expressions;
    }

    private List<String> AnalyzeMethod(Method e)
    {
        List<String> LocalResults = new ArrayList<>();
        String name = e.getMethodName();
        if(!values.containsKey(name))
        {

            LocalStatements body = (LocalStatements) e.getBody();
            if(body != null)
            {
                MethodArguments argsExpression = (MethodArguments) e.getArguments();
                List<Expression> arguments = getMethodArguments(argsExpression);
                Map<String, Types> localValues = ArgumentsToMap(arguments);
                LocalResults = getResultsOfMethod(localValues,body);
            }
        }
        //Map<String, Expression> localValues
        return LocalResults;
    }

    public Map<String, Types> ArgumentsToMap(List<Expression> expressions) {
        Map<String, Types> localValues = new HashMap<>();
        for(Expression e: expressions)
        {
            if(e instanceof MethodParameter)
            {
                localValues.put(((MethodParameter) e).getId(),((MethodParameter) e).getType());
            }
        }
        return localValues;

    }

    public List<String> getResultsOfMethod(Map<String, Types> localArgs, LocalStatements ls ){
        List<String> results = new ArrayList<>();
        Map<String, Expression> localValues = new HashMap<>();
        for (Expression e:ls.getStatements())
        {
            if(e instanceof Method)
            {
                Method method = (Method) e;
                AnalyzeMethod((Method) e);
            }
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                if(!localArgs.containsKey(decl.id))
                {
                    results.add(decl.id + " is " + decl.val);
                    localArgs.put(decl.id, decl.type);
                    localValues.put(decl.id, decl.val);
                }
            } else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e,localValues);
                if(res == 0){ // GetResultOf metode jeigu neiskviecia funkcijos, kvies GetREsultOfBool funkcija
                    boolean res2 = getResultOfBool(e, localValues);
                    results.add(input + " = " + res2);
                }else {
                    results.add(input + " = " + res);
                }
            }
        }
        return results;
    }


    public List<String> getResults(){
        List<String> results = new ArrayList<>();
        for (Expression e:expressions)
        {
            if(e instanceof Method)
            {
                Method method = (Method) e;
                results.add("METHOD "+ method.getMethodName() + " RESULTS");
                results.addAll(AnalyzeMethod(method));
                results.add("===========================");
            }
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                Expression valType = decl.val;
                switch (decl.type){
                    case INT:
                        values.put(decl.id, decl.val);
                        break;
                    case CHAR:
                        values.put(decl.id,decl.val);
                        break;
                    case STRING:
                        values.put(decl.id, decl.val);
                        break;
                    case BOOL:
                        values.put(decl.id, decl.val);
                        break;
                }
                results.add(decl.id + " is " + decl.val);
            } else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e, this.values);
                if(res == 0){ // GetResultOf metode jeigu neiskviecia funkcijos, kvies GetREsultOfBool funkcija
                    boolean res2 = getResultOfBool(e,this.values);
                    results.add(input + " = " + res2);
                }else {
                    results.add(input + " = " + res);
                }
            }
        }
        return results;
    }

    public List<String> getResults(Expression e, Map<String, Expression> localValues){
        List<String> results = new ArrayList<>();
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                switch (decl.type){
                    case INT:
                        values.put(decl.id, decl.val);
                        break;
                    case CHAR:
                        values.put(decl.id, decl.val);
                        break;
                    case STRING:
                        values.put(decl.id, decl.val);
                        break;
                    case BOOL:
                        values.put(decl.id, decl.val);
                        break;
                }
                //results.add(decl.id + " is " + decl.val);
            } else {
                //visiems kitiems atvejams
                String input = e.toString();
                int res = getResultOf(e, localValues);
                if(res == 0){ // GetResultOf metode jeigu neiskviecia funkcijos, kvies GetREsultOfBool funkcija
                    boolean res2 = getResultOfBool(e, localValues);
                    results.add(input + " = " + res2);
                }else {
                    results.add(input + " = " + res);
                }
            }

        return results;
    }


    // TODO visa sita metoda dar  reikia pertvarkyt, nes cia tik sudetis tarp skaiciu veikia
    public int getResultOf(Expression e, Map<String, Expression> localValues){
        int result = 0;
        if(e instanceof Number){
            Number num = (Number) e;
            result = num.getNum();
        }
        if(e instanceof Variable){
            Variable var = (Variable) e;
            if(localValues.containsKey(var.id))
            {
                result = getResultOf(localValues.get(var.id), localValues);
            }
        }
        else if(e instanceof Addition){
            Addition add = (Addition) e;
            int left = getResultOf(add.getLeft(), localValues);
            int right = getResultOf(add.getRight(),localValues);
            result = left + right;
        }
        else if (e instanceof Multiplication){
            Multiplication mult = (Multiplication) e;
            int left = getResultOf(mult.getLeft(), localValues);
            int right = getResultOf(mult.getRight(), localValues);
            result = left * right;
        }
        else if (e instanceof Division){
            Division div = (Division) e;
            int left = getResultOf(div.getLeft(), localValues);
            int right = getResultOf(div.getRight(), localValues);
            result = left / right;
        }
        else if (e instanceof Subtraction){
            Subtraction subt = (Subtraction) e;
            int left = getResultOf(subt.getLeft(), localValues);
            int right = getResultOf(subt.getRight(), localValues);
            result = left - right;
        }
        else if(e instanceof Assigment)
        {
            Assigment as = (Assigment) e;
            int right = getResultOf((as.getRight()), localValues);
            result = right;
        }
        else if (e instanceof  ForTo){
            ForTo f = (ForTo) e;
            forTo(f, localValues);
        }
        return result;
    }

    public boolean getResultOfBool(Expression e,Map<String, Expression> localValues){
        boolean result = false;
        if (e instanceof Equals){
            Equals eq = (Equals) e;
            int left = getResultOf(eq.getLeft(), localValues);
            int right = getResultOf(eq.getRight(), localValues);
            if(left == right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof EqualsOrGreaterThan){
            EqualsOrGreaterThan eq = (EqualsOrGreaterThan) e;
            int left = getResultOf(eq.getLeft(), localValues);
            int right = getResultOf(eq.getRight(), localValues);
            if(left >= right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof EqualsOrLessThan){
            EqualsOrLessThan eq = (EqualsOrLessThan) e;
            int left = getResultOf(eq.getLeft(), localValues);
            int right = getResultOf(eq.getRight(), localValues);
            if(left <= right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof GreaterThan){
            GreaterThan eq = (GreaterThan) e;
            int left = getResultOf(eq.getLeft(), localValues);
            int right = getResultOf(eq.getRight(), localValues);
            if(left > right){
                result = true;
            }else{
                result = false;
            }
        }
        else if (e instanceof LessThan){
            LessThan eq = (LessThan) e;
            int left = getResultOf(eq.getLeft(), localValues);
            int right = getResultOf(eq.getRight(), localValues);
            if(left < right){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }

    public void forTo(Expression expression,Map<String, Expression> localValues){
        if(expression instanceof ForTo){
            ForTo fr = (ForTo) expression;
            for (int i = fr.getStart(); i < fr.getEnd(); i++){
                fr.setCurrent(i);
                System.out.println((getResults(fr.getExpression(), localValues)));
            }
        }
    }
}
