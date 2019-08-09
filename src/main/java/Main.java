import kyu4.*;

public class Main {

    public static void main(String[] args) {
        String morseCode = MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011");
        System.out.println(morseCode);
        morseCode = MorseCodeDecoder.decodeMorse(morseCode);
        System.out.println(morseCode);
    }

}
