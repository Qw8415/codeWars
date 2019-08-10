package kyu4;

class Magnets {

    public static double doubles(int maxk, int maxn) {
        double sum = 0;
        for(int k = 1; k <= maxk; k++) {
            for (int n = 1; n <= maxn; n++) {
                sum += 1 / (k * Math.pow(n+1, 2*k));
            }
        }
        return sum;
    }
}