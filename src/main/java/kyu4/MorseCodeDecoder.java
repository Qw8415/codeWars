package kyu4;

import java.util.*;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        bits = cutZeros(bits);
        Map<Integer, String> dictionary = createDictionary(bits);
        var counter = 0;
        var currentBit = '1';
        StringBuilder stringBuilder = new StringBuilder();
        for (char bit : bits.toCharArray()) {
            if (bit == currentBit) {
                counter++;
            } else {
                stringBuilder.append(dictionary.get(counter * currentBit));
                counter = 1;
                currentBit = (currentBit == '1') ? '0' : '1';
            }
        }
        stringBuilder.append(dictionary.get(counter * currentBit));
        return stringBuilder.toString();
    }

    public static String decodeMorse(String morseCode) {
        String[] wordsMorseCode = morseCode.split("   ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordsMorseCode) {
            for (String c : word.split(" "))
                stringBuilder.append(MorseCode.get(c));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private static String cutZeros(String bits) {
        int start = bits.indexOf('1');
        int end = bits.lastIndexOf('1');
        return bits.substring(start, end + 1);
    }

    private static HashMap<Integer, String> createDictionary(String bits) {
        var counter = 0;
        var currentBit = '1';
        TreeSet<Integer> symbols = new TreeSet<>();
        for (char bit : bits.toCharArray()) {
            if (bit == currentBit) {
                counter++;
            } else {
                symbols.add(counter);
                counter = 1;
                currentBit = (currentBit == '1') ? '0' : '1';
            }
        }
        symbols.add(counter);
        HashMap<Integer, String> dictionary = new HashMap<>();
        var first = symbols.first();
        var last = symbols.last();
        switch ((int)last/first) {
            case 7:
                dictionary.put(first * '1', ".");
                dictionary.put(first * '0', "");
                dictionary.put(first * '1' * 3, "-");
                dictionary.put(first * '0' * 3, " ");
                dictionary.put(last * '0', "   ");
                break;
            case 3:
                dictionary.put(last * '1', "-");
                dictionary.put(last * '0', " ");
            case 1:
                dictionary.put(first * '1', ".");
                dictionary.put(first * '0', "");
                break;
            case 2:
                dictionary.put(first * '1', "-");
                dictionary.put(first * '0', " ");
                dictionary.put(last * '0', "   ");
                break;
        }
        return dictionary;
    }
}
