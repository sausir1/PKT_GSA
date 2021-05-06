package expression;

import antlr.GsaGrammarBaseVisitor;
import antlr.GsaGrammarParser.*;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpression extends GsaGrammarBaseVisitor<Expression> {

    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    /*
    * Kai aplankyti visi visit metodai
    * galima suprast, kad kintamieji sudeti tokia tvarka,
    *  kokia buvo iskviesti ir metodai
    **/
    private List<String> vars; // susideti visiems kintamiesiems paskelbtus pogramoje

    //Klaidoms talpinti
    private List<String> semanticErrors; //pakartotiniams paskelbimams, nepasklebtu kintamuju naudojimas

    @Override
    public Expression visitDeclaration(DeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: variable with name " + id + " already declared in ("+line+","+col+")");
        } else{
            vars.add(id);
        }
        String type = ctx.getChild(0).getText();
        String val = ctx.getChild(3).getText();
        // gali buti ir ctx.NUM().getText();
        int num = Integer.parseInt(val);
        return new VariableDeclaration(id,type,num);
    }

    @Override
    public Expression visitMultiplication(MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public Expression visitAddition(AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public Expression visitVariable(VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int col = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)){
            semanticErrors.add("Error. variable " +id+" is not declared ("+line+","+col+")");
        }
        return new Variable(id);

    }

    @Override
    public Expression visitNumber(NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }
}
