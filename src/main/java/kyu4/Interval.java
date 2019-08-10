package kyu4;

import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) return 0;
        sort(intervals);
        mergeOverlappingIntervals(intervals);
        return Arrays.stream(intervals).mapToInt(i -> i[1] - i[0]).sum();
    }

    private static void mergeOverlappingIntervals(int[][] arr) {
        for (int i = 1, k = 0; i < arr.length; k = i, i++) {
            if (arr[i][0] < arr[k][1]) {
                arr[i][0] =  arr[k][0];
                arr[i][1] = (arr[i][1] > arr[k][1]) ? arr[i][1] : arr[k][1];
                arr[k][0] = arr[k][1] = 0;
            }
        }
    }

    private static void sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 1; j < arr.length - i; j++)
                if (arr[j - 1][0] > arr[j][0])
                    swap(arr, j, j-1);
    }

    private static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
