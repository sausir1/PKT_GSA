package app;

import antlr.GsaGrammarLexer;
import antlr.GsaGrammarParser;
import expression.AntlrToProgram;
import expression.ExpressionProcessor;
import expression.Program;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Gsa {
    public static void main(String[] args) {
        if(args.length == 1){
            String file = args[0];
            GsaGrammarParser parser = getParser(file);
            //reikia padaryti parse tree

            ParseTree antlrAST = parser.prog();
            // sukurti visitoriu
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            if(progVisitor.semanticErrors.isEmpty()){
                // nera klaidu
                ExpressionProcessor ep = new ExpressionProcessor(prog.expresions);
                for(String eval: ep.getResults()){
                    System.out.println(eval);

                }
            } else {
                //yra klaidu
                for(String err: progVisitor.semanticErrors){
                    System.out.println(err);
                }
            }
        } else {
            System.err.println("Error!");
        }
    }

    /*
    * Programos pradzia
    * */
    private static GsaGrammarParser getParser(String filename){
        GsaGrammarParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            GsaGrammarLexer lexer = new GsaGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GsaGrammarParser(tokens);
        }catch (IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}
