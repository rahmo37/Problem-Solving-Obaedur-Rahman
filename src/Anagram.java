public class Anagram {

    public static String isAnagram(String txt1, String txt2) {
        if(txt1.equals(txt2)) {
            return "Not an Anagram";
        }
        char[] txt1Arr = txt1.toCharArray();
        char[] txt2Arr = txt2.toCharArray();
        if(returnTotal(txt1Arr) == returnTotal(txt2Arr)) {
            return "Anagram";
        } else {
            return "Not an Anagram";
        }
    }

    public static int returnTotal(char[] charArr) {
        int total = 0;
        for(int i = 0; i < charArr.length; i++) {
            total += charArr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        String text1 = "night";
        String text2 = "thing";
        System.out.println(isAnagram(text1, text2));
    }

}
