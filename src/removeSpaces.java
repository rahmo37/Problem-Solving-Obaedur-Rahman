import java.util.Scanner;

public class removeSpaces {

    public static String removeSpaces(String text) {

        String spaceRemovedStr = "";

//        String spaceRemovedStr = text.replace(" ", "");

        String[] strArr = text.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            spaceRemovedStr += strArr[i];
        }


        return spaceRemovedStr;
    }

    public static void main(String[] args) {
        // get an input string
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // remove spaces from input string using removeSpaces() method
        String noSpacesString = removeSpaces(text);

        // print the resulting string
        System.out.println(noSpacesString);
    }


}
