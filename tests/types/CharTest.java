package types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharTest {

    @Test
    void getChar() {
        Char ch = new Char('a');
        assertEquals(ch.getChar(), 'a');
        assertNotEquals(ch.getChar(), 'B');
    }

    @Test
    void testToString() {
        Char ch = new Char('a');
        Char ba = new Char('6');
        assertEquals(ch.toString(), "a");
        assertNotEquals(ch.toString(), "bbAa");
        assertEquals(ch.getClass(), ba.getClass());
        assertNotEquals(ch.toString(), ba.toString());
    }
}