package Leetcode.StringBuilderPractice;

public class StringReverseStringBuilder {

    public static void main(String[] args) {
        String str = " Hello World";
        StringBuilder sb = new StringBuilder(str);
        String reverse = String.valueOf(sb.reverse());
        System.out.println(reverse);

    }
}