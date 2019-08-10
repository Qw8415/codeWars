import kyu4.*;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][] {{1,2}, {3,4}};
        for (int[] i : array) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + "\t");
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }



}
