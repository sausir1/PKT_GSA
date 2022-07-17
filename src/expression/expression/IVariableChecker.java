package expression;

import antlr.GsaGrammarParser.*;

public interface IVariableChecker {

    public void checkIfExists(IntDeclarationContext ctx);
    public void checkIfExists(StringDeclarationContext ctx);
    public void checkIfExists(CharDeclarationContext ctx);
    public void checkIfExists(MethodDeclarationContext ctx);
    public void checkIfExists(BoolDeclarationContext ctx);

}
