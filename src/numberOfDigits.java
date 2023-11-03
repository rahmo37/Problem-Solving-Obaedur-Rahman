import java.util.Scanner;

public class numberOfDigits {


    public static void main(String[] args) {
        int numToFind = 5;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 0;

        while(number > 0) {
            if((number % 10) == numToFind) {
                counter++;
            }
            number = number / 10;
        }
        System.out.println(counter);
    }
}
