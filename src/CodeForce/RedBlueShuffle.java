//Logic is good but Time limit exceeded....aborting this problem
package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RedBlueShuffle {
    static HashMap<Integer, Integer> mapBlueValue = new HashMap<>();

    public static String redBlueShuffle(int[] redArr, int[] blueArr) {
        int scale = 0;
        for (int i = 0; i < redArr.length; i++) {
            mapBlueValue.put(redArr[i], blueArr[i]);
        }
        long[] permutationArr = returnPermutation(redArr);

        for (long perm : permutationArr) {
            if (returnWinnerForEachTurn(perm).equals("RED")) {
                scale++;
            } else {
                scale--;
            }
        }

        if (scale > 0) {
            return "RED";
        } else if (scale < 0) {
            return "BLUE";
        }
        return "EQUAL";
    }

    private static long[] returnPermutation(int[] redArr) {
        List<Long> resultList = new ArrayList<>();
        permute(redArr, 0, resultList);

        long[] result = new long[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    private static void permute(int[] array, int start, List<Long> result) {
        if (start == array.length - 1) {
            result.add(convertToLong(array));
            return;
        }

        for (int i = start; i < array.length; i++) {
            swap(array, start, i);
            permute(array, start + 1, result);
            swap(array, start, i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static long convertToLong(int[] array) {
        long result = 0;
        for (int value : array) {
            result = 10 * result + value;
            if (result < 0) {
                // Handle overflow
                throw new ArithmeticException("Number too large to fit in a long");
            }
        }
        return result;
    }

    public static String returnWinnerForEachTurn(long num) {
        ArrayList<Integer> keyArr = new ArrayList<>();
        StringBuilder redNumber = new StringBuilder();
        StringBuilder blueNumber = new StringBuilder();
        long num1 = num;
        while (num1 != 0) {
            int num2 = (int) (num1 % 10);
            keyArr.add(num2);
            num1 = num1 / 10;
        }
        for (int i = keyArr.size() - 1; i >= 0; i--) {
            redNumber.append(keyArr.get(i));
            blueNumber.append(mapBlueValue.get(keyArr.get(i)));
        }
        if (Long.parseLong(redNumber.toString()) > Long.parseLong(blueNumber.toString())) {
            return "RED";
        } else {
            return "BLUE";
        }
    }

    public static int[] returnIntArr(String[] strArr) {
        int[] convertedArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            convertedArr[i] = Integer.parseInt(strArr[i]);
        }
        return convertedArr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine()) * 3;
        String[] inputArr = new String[numOfInput];
        int i = 0;
        while (i < numOfInput) {
            inputArr[i] = reader.readLine();
            i++;
        }
        for (int j = 1; j < inputArr.length; j += 3) {
            if (Long.parseLong(inputArr[j]) == Long.parseLong(inputArr[j + 1])) {
                System.out.println("EQUAL");
            } else {
                System.out.println(redBlueShuffle(returnIntArr(inputArr[j].split("")), returnIntArr(inputArr[j + 1].split(""))));
            }
        }
    }
}
