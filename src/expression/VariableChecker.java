package expression;

import antlr.GsaGrammarParser.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class VariableChecker implements IVariableChecker  {

    private List<String> vars;
    private List<String> semanticErrors;


    public VariableChecker(List<String> vars, List<String> errors)
    {
        this.semanticErrors = errors;
        this.vars = vars;
    }
    public List<String> getVars()
    {
        return this.vars;
    }
    public List<String> getErrors()
    {
        return this.semanticErrors;
    }


    @Override
    public void checkIfExists(IntDeclarationContext ctx)
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
    }
    @Override
    public void checkIfExists(BoolDeclarationContext ctx)
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
    }
    @Override
    public void checkIfExists(MethodDeclarationContext ctx)
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
    }
    @Override
    public void checkIfExists(CharDeclarationContext ctx)
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
    }
    @Override
    public void checkIfExists(StringDeclarationContext ctx)
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
    }



}
