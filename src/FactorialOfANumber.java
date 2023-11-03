import java.util.Scanner;
public class FactorialOfANumber {

    // method to find the factorial of a number

    int findFactorial(int number) {
        int factorial = 1;
        for(int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        // get input value for the number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // call the findFactorial() method
        FactorialOfANumber obj = new FactorialOfANumber();
        int result = obj.findFactorial(number);

        System.out.println(result);
    }


}
