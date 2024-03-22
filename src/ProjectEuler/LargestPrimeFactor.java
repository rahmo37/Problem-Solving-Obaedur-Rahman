package ProjectEuler;

public class LargestPrimeFactor {

// The prime factors of 13195 are 5,7,13 and 29.
// What is the largest prime factor of the number 600851475143?
    public static void main(String[] args) {


        long num = 600851475143L;

        long largestPrimeFactor = 0;

        for (long i = 2; i <= num; i++) {
            if (num % i == 0) {
                num = num / i;
                largestPrimeFactor = i;
                i = 2;
            }
        }
        System.out.println("Largest Prime Factor: " + largestPrimeFactor);
    }
}
