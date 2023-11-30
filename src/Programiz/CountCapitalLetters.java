package Programiz;

public class CountCapitalLetters {

    public static int CountCapitalLetters(String text) {
        char[] charArr = text.toCharArray();
        int counter = 0;
        for(int i = 0; i < charArr.length; i++) {
            int asciiCode = charArr[i];
            if(asciiCode >= 65 && asciiCode <= 90) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String text = "Dhaka is the Capital of Bangladesh";
        int numOfCaps = CountCapitalLetters(text);
        String reason = "There are: " + numOfCaps + " capital letters in the text";
        System.out.println(numOfCaps);
        System.out.println(reason);
    }
}
