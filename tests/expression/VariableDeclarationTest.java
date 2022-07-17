package expression;

import org.junit.jupiter.api.Test;
import types.Number;

import static org.junit.jupiter.api.Assertions.*;

class VariableDeclarationTest {

    @Test
    void testToString() {
        VariableDeclaration var = new VariableDeclaration("a", Types.INT, new Number(5));
        assertEquals("int a = 5", var.toString());
    }
}