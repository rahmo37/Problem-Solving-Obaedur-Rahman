package Leetcode;

public class MaxNumberWordsFoundInSentences2114 {

    public static int mostWordsFound(String[] sentences) {
        int length = 0;
        for (int i = 0; i < sentences.length; i++) {
            if(length < sentences[i].split(" ").length) {
                length = sentences[i].split(" ").length;
            }
        }
        return length;
    }


    public static void main(String[] args) {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj", "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom", "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg", "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm", "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr", "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk", "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        System.out.println(mostWordsFound(sentences));
    }
}