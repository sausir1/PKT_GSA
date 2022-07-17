package expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTest {

    @Test
    void testToString() {
        Variable v= new Variable("a");
        assertEquals("a", v.toString());
    }
}