package Leetcode;

public class MaxNumberWordsFoundInSentences2114 {

    public static int mostWordsFound(String[] sentences) {

        int length = sentences.length;

        int max = 0;

        for (int i = 0; i < sentences.length; i++) {

            if (max < sentences[i].length()) {

                max = sentences[i].length();
            }
        }

        for (int j = 0; j < sentences.length; j++) {

            if (max == sentences[j].length()) {
                System.out.println(sentences[j]);
            }

            return length;
        }


        public static void main (String[]args){
            String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
            mostWordsFound(sentences);

        }
    }
}