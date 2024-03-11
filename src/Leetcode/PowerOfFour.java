package Leetcode;

import static java.lang.Math.pow;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {

        if (n == 0) {
            System.out.println("False for zero");
            return false;
        }

        for (int i = 0; i <= 100; i++) {

            if (n == pow(4, i)) {
                System.out.println("sakib");
                return true;
            }
        }
        System.out.println("Rakib");
        return false;
    }
        public static void main (String[] args){
            isPowerOfFour(1);
        }
}
