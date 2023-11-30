package Leetcode;

//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

import java.util.Scanner;

public class ToLowerCase709 {


     static String toLowerCase (String str){

         String lower = str.toLowerCase();

         return lower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toLowerCase (s));

    }
}




