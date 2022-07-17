package operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import types.Number;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    Subtraction sub;
    Number num;
    Number num2;

    @BeforeEach
    void setUp() {
        num = new Number(5);
        num2 = new Number(1);
        this.sub = new Subtraction(num, num2);
    }

    @Test
    void getLeft() {
        assertEquals(this.sub.getLeft(), this.num);
        assertNotEquals(this.sub.getLeft(), this.num2);
    }

    @Test
    void getRight() {
        assertEquals(this.sub.getRight(), this.num2);
        assertEquals(this.num.getClass(), this.num.getClass());
        assertNotEquals(this.sub.getRight(), this.num);
    }

    @Test
    void testToString() {
        assertEquals("5 - 1", this.sub.toString());
        assertNotEquals("5-1",this.sub.toString());
        this.sub = new Subtraction(new Addition(new Number(5), new Number(5)), new Number(2));
        assertEquals("5+5 - 2", this.sub.toString());
    }
}