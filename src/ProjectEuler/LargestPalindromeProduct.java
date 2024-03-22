package ProjectEuler;

public class LargestPalindromeProduct {
    //A palindromic number reads the same both ways. The largest palindrome made from the product of two 2 digit numbers
    // is 9009 = 91 x 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.
    public static void main(String[] args) {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        System.out.println("Largest Palindrome Product: " + max);
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
