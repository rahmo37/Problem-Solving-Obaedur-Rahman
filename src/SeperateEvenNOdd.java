import java.util.ArrayList;

public class SeperateEvenNOdd {

    public static void sperateOddsNEvens(int[] numArr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] % 2 == 0) {
                evenList.add(numArr[i]);
            } else {
                oddList.add(numArr[i]);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 4, 5, 7, 8};
        sperateOddsNEvens(numArr);

    }

}
