package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RowGCD1459 {

    public static void printGCD(long[] gcdNumsArr) {
        long largestNum = returnLargestNum(gcdNumsArr);
        List<Long> divisorsOfTheLarNum = returnDivisors(largestNum);
        List<Long> commonDivisors = new ArrayList<>();
        boolean isDivisor = true;

        for (int i = 0; i < divisorsOfTheLarNum.size(); i++) {
            isDivisor = true;
            for (int j = 0; j < gcdNumsArr.length; j++) {
                if (gcdNumsArr[j] % divisorsOfTheLarNum.get(i) != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                commonDivisors.add(divisorsOfTheLarNum.get(i));
            }
        }
        System.out.print(Collections.max(commonDivisors) + " ");
    }

    public static List<Long> returnDivisors(long num) {
        List<Long> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add((long) i);
                // If both divisors are not the same, add the second one
//                Meaning if the both i and num / i are same, we are not adding it twice.
//                4 % 2 = 0, 2 * 2 = 4, so we include only one 2
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors;
    }

    public static long returnLargestNum(long[] gcdNumsArr) {
        long largestNum = gcdNumsArr[0];
        for (int i = 0; i < gcdNumsArr.length; i++) {
            if (gcdNumsArr[i] > largestNum) {
                largestNum = gcdNumsArr[i];
            }
        }
        return largestNum;
    }

    public static long[] returnIntArr(String[] strArr) {
        long[] convertedArr = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            convertedArr[i] = Long.parseLong(strArr[i]);
        }
        return convertedArr;
    }

    public static long[] returnAddedNumersArr(long[] numArr1, long numberToAdd) {
        long[] numbersAfterAddition = new long[numArr1.length];
        for (int i = 0; i < numArr1.length; i++) {
            numbersAfterAddition[i] = numArr1[i] + numberToAdd;
        }
        return numbersAfterAddition;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        long[] numArr1 = returnIntArr(reader.readLine().split(" "));
        long[] numsToAdd = returnIntArr(reader.readLine().split(" "));
        for (int i = 0; i < numsToAdd.length; i++) {
            printGCD(returnAddedNumersArr(numArr1, numsToAdd[i]));
        }
    }
}
