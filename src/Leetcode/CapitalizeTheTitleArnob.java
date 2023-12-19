package Leetcode;

public class CapitalizeTheTitleArnob {

    public static String capitalizeTitle(String title) {

        String[] titleWordsArray = title.split(" ");
        String x = "";

        for (int i = 0; i < titleWordsArray.length; i++) {

            if (titleWordsArray[i].length() <= 2) {

                x += titleWordsArray[i].toLowerCase() + " ";

            } else

                x += titleWordsArray[i].substring(0, 1).toUpperCase() + titleWordsArray[i].substring(1).toLowerCase() + " ";
        }
        String sentense = x.trim();
        System.out.println(sentense);
        return sentense;
    }

    public static void main(String[] args) {
        String Sentence = "capiTalIze tHe IS titLe";
        capitalizeTitle(Sentence);
    }
}