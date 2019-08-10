package kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() throws Exception {
       assertEquals("HEY JUDE", MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")));
    }

    @Test
    public void testZerosHandling() throws Exception {
        assertEquals("E", MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits("00001000")));
    }

    @Test
    public void testDotAndDash() throws Exception {
        assertEquals("A", MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits("111000111111111")));
    }
}
