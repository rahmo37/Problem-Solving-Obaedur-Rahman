package Leetcode;

public class SmallestEvenMultiple2413 {


        public static int smallestEvenMultiple(int n) {
            // check that n is divisible by 2 and return n if true
            if(n % 2 == 0) {
                return n;
            } else {
                // return n multiply by 2 otherwise
                return n * 2;
            }
        }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(7));

    }

}

