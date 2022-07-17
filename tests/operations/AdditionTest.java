package operations;

import expression.Expression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import types.Number;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Expression exp1;
    Expression exp2;
    Addition addition;

    @BeforeEach
    void setUp() {
        this.exp1 = new Number(5);
        this.exp2 = new Number(11);
        this.addition = new Addition(exp1, exp2);
    }

    @Test
    void getLeft() {
        assertEquals(this.addition.getLeft(), this.exp1);
    }

    @Test
    void getRight() {
        assertEquals(this.addition.getRight(), this.exp2);
        assertNotSame(this.addition.getRight(), this.exp1);
    }

    @Test
    void testToString() {
        assertEquals("5+11", this.addition.toString());
    }
}