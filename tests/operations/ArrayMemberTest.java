package operations;

import expression.Expression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import types.Number;
import types.String;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMemberTest {

    ArrayMember member;
    Expression expression;
    @BeforeEach
    void setUp() {
        this.expression = new String("string");
        member = new ArrayMember("Member", this.expression);
    }

    @Test
    void getId() {
        assertEquals(member.getId(), "Member");
        assertNotEquals(member.getId(), "156");
    }

    @Test
    void getElement() {
        // not in the same address place..?
        assertNotEquals(member.getElement(), new String("string"));
        assertEquals(this.expression, member.getRawElement());
        assertNotEquals(member.getElement(), "WROng");
        assertNotEquals(member.getElement(), new Number(4));
    }

    @Test
    void testToString() {
        assertNotEquals(member.toString(), "Member[\"string\"]");
        assertEquals(member.toString(), "Member[string]");
        this.member = new ArrayMember("one", new Number(5));
        assertEquals("one[5]", this.member.toString());
    }
}