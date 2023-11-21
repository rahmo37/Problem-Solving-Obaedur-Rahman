package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BadTriangle {

    public static void badTriangle(int[] triSidesArr) {
        for (int i = 2; i < triSidesArr.length; i++) {
            if (triSidesArr[0] + triSidesArr[1] <= triSidesArr[i]) {
                System.out.println("1 2" + " " + (i + 1));
                return;
            }
        }
        System.out.println(-1);
    }


    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    public static int[] returnIntArr(String[] strArr) {
        int[] convertedArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            convertedArr[i] = Integer.parseInt(strArr[i]);
        }
        return convertedArr;
    }

    public static boolean lookForString(String str) {
        if (str.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine()) * 2;
        String[] inputArr = new String[numOfInput];
        int i = 0;
        while (i < numOfInput) {
            inputArr[i] = reader.readLine();
            i++;
        }

        // Defining my 2d Arrays
        int[][] numArrs = new int[inputArr.length / 2][];

        // Extracting the inner arrays
        int l = 0;
        for (int j = 0; j < numArrs.length; j++) {
            for (int k = l; k < inputArr.length; k++) {
                if (lookForString(inputArr[k])) {
                    numArrs[j] = returnIntArr(inputArr[k].split(" "));
                    l = k + 1;
                    badTriangle(numArrs[j]);
                    break;
                }
            }
        }
    }
}
