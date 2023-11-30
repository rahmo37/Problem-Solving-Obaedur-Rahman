package Programiz;

public class RecursiveExponent {
    static double counter = 1.0;

    public static int recursiveExponent(double x, int n) {
        double exp = Math.pow(x, (1 / counter));
        if (counter == n) {
            return (int)Math.ceil(x);
        } else {
            counter++;
            return recursiveExponent(x * exp, n);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        final int n = 8;
        System.out.println(recursiveExponent(x, n));
    }
}
