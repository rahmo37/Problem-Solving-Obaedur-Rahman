//Write a program to find the nth fibonacci number.
//
//        Fibonacci Numbers are a series of numbers in which each number is the sum of two preceding numbers.
//
//        For example,
//
//        Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8


public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(findNthFib(20));
    }

    public static int findNthFib(int n) {
        if (n <= 1) {
            return n;
        }
        System.out.println("fibonacci number: "  + 0);
        System.out.println("fibonacci number: "  + 1);
        int firstNum = 0;
        int secondNum = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            System.out.println("fibonacci number: " + result);
        }
        return result;
    }
}
