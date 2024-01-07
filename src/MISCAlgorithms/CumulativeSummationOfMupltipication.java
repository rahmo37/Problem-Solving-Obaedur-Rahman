package MISCAlgorithms;

import java.util.Scanner;

public class CumulativeSummationOfMupltipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Multiply with");
        int multiplyWith = sc.nextInt();
        System.out.println("Cumulative Summation of the number " + number + " Multiplied with " + multiplyWith + " is :" + cumulativeSummation(number, multiplyWith));
    }
    public static int cumulativeSummation(int number, int multiplyWith) {
        int sum = multiplyWith * ((number * (number + 1)) / 2);
        return sum;
    }
}
