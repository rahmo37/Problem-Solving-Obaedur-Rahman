package Programiz;// Arnob's Problem Set

//13.	First Unique Character Write a function firstUnique(s) that takes a string and returns the first non-repeating character's index.
//        If it doesn't exist, return -1. Example:
//        javascriptCopy code
//        firstUnique("leetcode"); // Output: 0


public class FirstUniqueNumber {
    public static void main(String[] args) {
        String str = "pseetwpsqccq";
        System.out.println(firstUnique(str));
    }

    public static int firstUnique(String str) {
        int counter;
        for (int i = 0; i < str.length(); i++) {
            counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
                if (counter > 1) {
                    break;
                }
            }
            if (counter == 1) {
                return i;
            }
        }
        return -1;
    }
}
