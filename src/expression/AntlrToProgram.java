package expression;

import antlr.GsaGrammarBaseVisitor;
import antlr.GsaGrammarParser;
import antlr.GsaGrammarParser.ProgramContext;
import operations.LocalStatements;
import operations.Method;
import operations.MethodCall;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends GsaGrammarBaseVisitor<Program> {

    public List<String> semanticErrors;

    @Override
    public Program visitProgram(ProgramContext ctx) {
        Program prog = new Program();
        semanticErrors = new ArrayList<String>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        int n = ctx.getChildCount();
        for(int i= 0; i<  ctx.getChildCount(); i++){
            String text = ctx.getChild(i).getText();
            if(text.contains("defstart"))
            {
                prog.addExpressions(exprVisitor.visit(ctx.getChild(i)));
                break;
            }
        }
        if(prog.expresions.size() == 1) //buvo entyr pointas
        {
            Method start = (Method) prog.expresions.get(0);
            LocalStatements lc = (LocalStatements) start.getBody();
            for(Expression e : lc.getStatements())
            {
                if(e instanceof MethodCall)
                {
                    MethodCall mc = (MethodCall) e;
                    String search = mc.getMethodName();
                    int methodId = getChildMethodWithName(search,ctx);
                    prog.addExpressions(exprVisitor.visit(ctx.getChild(methodId)));
                }
            }
        } else
        {
            semanticErrors.add("No START method found! Define an entry point for a program with def start(){...}");
        }
//        for(int i=0;i<n-1; i++){
//                prog.addExpressions(exprVisitor.visit(ctx.getChild(i)));
//        }
        return prog;
    }

    private int getChildMethodWithName(String name, ProgramContext ctx)
    {
        for(int i = 0; i < ctx.getChildCount(); i++)
        {
            String text = ctx.getChild(i).getText();
            String defText = text.substring(0,text.indexOf('('));
            if(defText.contains(name))
            {
                return i;
            }
        }
        return -1;
    }
}
