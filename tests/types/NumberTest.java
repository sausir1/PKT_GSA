package types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    Number num;
    @BeforeEach
    void setUp() {
        num = new Number(156);
    }

    @Test
    void getNum() {
        Number numb2 = new Number(165);
        assertEquals(this.num.getNum(), 156);
        assertNotEquals(numb2.getNum(), this.num.getNum());
        assertEquals(numb2.getClass(), this.num.getClass());
        assertNotEquals(this.num.getNum(), 179816);
    }

    @Test
    void testToString() {
        assertEquals("156", this.num.toString());
    }
}