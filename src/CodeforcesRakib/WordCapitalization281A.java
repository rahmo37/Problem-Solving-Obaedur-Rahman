package CodeforcesRakib;

import java.util.Scanner;

public class WordCapitalization281A {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        if (s.length() > 0) {
            char firstChar = Character.toUpperCase(s.charAt(0));
            String result = firstChar + s.substring(1);
            System.out.println(result);
        } else {
            System.out.println("Input string is empty.");
        }

        scanner.close();
    }
}

