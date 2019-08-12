package kyu5;

public class Greed{
    public static int greedy(int[] dice){
        int result = 0;
        int[] numberOfOccurrences = {0,0,0,0,0,0,0};
        for (int roll : dice) {
            numberOfOccurrences[roll]++;
        }
        for (int i = 1; i < numberOfOccurrences.length; i++) {
            if (numberOfOccurrences[i] > 2) {
                if (i == 1) {
                    result += 1000;
                } else {
                    result += i * 100;
                }
                numberOfOccurrences[i] -= 3;
            }
        }
        result += numberOfOccurrences[1]*100;
        result += numberOfOccurrences[5]*50;
        return result;
    }
}
