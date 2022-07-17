package types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {

    @Test
    void getString() {
        String stringExample = new String("Stirng");
        assertEquals(stringExample.getString(), "Stirng");
        assertNotEquals(stringExample.getString(), "004561");
    }


    @Test
    void testToString() {
        String stringExample = new String("Stirng");
        assertEquals(stringExample.getString(), stringExample.toString());
    }
}