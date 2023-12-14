package CodeforcesRakib;
import java.math.BigInteger;
public class GCDPractice {
        public static void main(String[] args) {
            // Example: Find the GCD of 24, 36, and 48
            int[] numbers = {24, 36, 48};

            BigInteger result = BigInteger.valueOf(numbers[0]);

            for (int i = 1; i < numbers.length; i++) {
                BigInteger currentNumber = BigInteger.valueOf(numbers[i]);
                result = result.gcd(currentNumber);
            }

            System.out.println("GCD of the numbers: " + result);
        }
    }

