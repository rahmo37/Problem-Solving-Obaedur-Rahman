package Leetcode;

public class ReverseVowelOfString {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);

    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {

        ReverseVowelOfString reverseVowelOfString = new ReverseVowelOfString();
        String result = reverseVowelOfString.reverseVowels("hello");
        System.out.println("Result: " + result);
    }
}
