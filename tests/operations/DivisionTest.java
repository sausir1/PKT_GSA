package operations;

import expression.Expression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import types.Number;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    Expression exp1;
    Expression exp2;
    Division division;
    @BeforeEach
    void setUp() {
        this.exp1 = new Number(4);
        this.exp2 = new Number(5);
        this.division = new Division(this.exp1, this.exp2);
    }

    @Test
    void getLeft() {
        assertEquals(this.division.getLeft(), this.exp1);
        assertNotEquals(this.division.getLeft(), this.exp2);
    }

    @Test
    void getRight() {
        assertEquals(this.division.getRight(), this.exp2);
        assertNotEquals(this.division.getRight(), this.exp1);
    }

    @Test
    void testToString() {
        assertEquals("4 / 5",this.division.toString());
    }
}