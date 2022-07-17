package operations;

import expression.Expression;
import org.junit.jupiter.api.Test;
import types.Number;
import types.String;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void getId() {
        Assignment assignment = new Assignment("a", new Number(4465));
        assertEquals(assignment.getId(), "a");
        assertNotEquals(assignment.getId(), "b");
    }

    @Test
    void getRight() {
        Expression num = new Number(4665);
        Expression strung = new String("4665");
        Assignment assignment = new Assignment("a", num);
        assertEquals(assignment.getRight(), num);
        assertNotEquals(assignment.getRight(), strung);
    }


    @Test
    void testToString() {
        Expression num = new Number(4665);
        Expression str = new String("4665");
        Assignment assignment2 = new Assignment("a", str);
        Assignment assignment = new Assignment("a", num);
        java.lang.String result = assignment.toString();
        assertEquals("a=4665", result);
        assertEquals("a=4665", assignment2.toString());
        assertEquals(assignment.toString(), assignment2.toString());
        assertNotEquals(assignment, assignment2);
    }
}