package kyu4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryRegexpTest {
    @Test
    public void testSimple() {
        assertFalse(BinaryRegexp.multipleOf3().matcher(" 0").matches());
        assertFalse(BinaryRegexp.multipleOf3().matcher("abc").matches());
        assertTrue(BinaryRegexp.multipleOf3().matcher("000").matches());

        assertTrue(BinaryRegexp.multipleOf3().matcher("110").matches());
        assertFalse(BinaryRegexp.multipleOf3().matcher("111").matches());
        assertTrue(BinaryRegexp.multipleOf3().matcher(Integer.toBinaryString(12345678)).matches());
    }
}
