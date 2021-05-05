package expression;

import antlr.GsaGrammarBaseVisitor;
import antlr.GsaGrammarParser.ProgramContext;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends GsaGrammarBaseVisitor<Program> {

    public List<String> semanticErrors;

    @Override
    public Program visitProgram(ProgramContext ctx) {
        Program prog = new Program();
        semanticErrors = new ArrayList<String>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        for(int i=0;i<ctx.getChildCount(); i++){
            if (i == ctx.getChildCount()-1) {
                //paskutinis vaikas yra EOF(end of file)
            } else {
                prog.addExpressions(exprVisitor.visit(ctx.getChild(i)));
            }
        }
        return prog;
    }
}
