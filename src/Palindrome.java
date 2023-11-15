public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == str.charAt(str.length() - (i + 1))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}


//public class PalindromeChecker {
//
//    public static boolean isPalindrome(String str) {
//        str = str.toLowerCase(); // Convert to lowercase to make the check case-insensitive
//        int i = 0, j = str.length() - 1;
//
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false; // Not a palindrome if mismatch found
//            }
//            i++;
//            j--;
//        }
//        return true; // Palindrome if no mismatches found
//    }
//
//    public static void main(String[] args) {
//        String testString = "Radar";
//        boolean result = isPalindrome(testString);
//        System.out.println("\"" + testString + "\" is palindrome? " + result);
//    }
//}
