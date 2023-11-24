package Programiz;

public class toggleCharacter {


    public static void main(String[] args) {
        System.out.println(toggleCharacter("Programiz.Test"));
    }

    public static String toggleCharacter(String str) {

        char[] strToChar = str.toCharArray();
        String toggledStr = "";
        for (int i = 0; i < strToChar.length; i++) {
            if (isLowerCase(strToChar[i])) {
                toggledStr = toggledStr + Character.toString(strToChar[i]).toUpperCase();
            } else {
                toggledStr = toggledStr +Character.toString(strToChar[i]).toLowerCase();
            }
        }
        return toggledStr;
    }

    public static Boolean isLowerCase(char alphabet) {
        int asciiCode = alphabet;
        int[] asciiRange = {97, 122};
        if (asciiCode >= asciiRange[0] && asciiCode <= asciiRange[1]) {
            return true;
        } else {
            return false;
        }
    }

}
