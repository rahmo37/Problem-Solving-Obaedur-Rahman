package Leetcode;

public class CapitalizeTheTitle2129 {

    public static String capitalizeTitle(String title) {

        String[] titleWordsArray = title.split(" ");

        String [] arr = new String[titleWordsArray.length];

        String x = "";

        for (int i = 0; i < titleWordsArray.length; i++) {

            if (titleWordsArray[i].length() <= 2) {

             x = titleWordsArray[i].toLowerCase();

            } else

            x = titleWordsArray[i].substring(0, 1).toUpperCase() + titleWordsArray[i].substring(1).toLowerCase();

                arr[i] = x;
        }

        String sentence = "";
        for (String j : arr) {
            sentence = sentence + j + " ";
        }
        sentence = sentence.trim();
        System.out.println(sentence);
        return sentence;
    }

    public static void main(String[] args) {

        String Sentence = "capiTalIze tHe titLe";
        capitalizeTitle(Sentence);
    }
}