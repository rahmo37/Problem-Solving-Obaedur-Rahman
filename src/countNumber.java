public class countNumber {


    public static void main(String[] args) {
        Integer number = 54321;

//      String[] numStrArr = Integer.toString(number).split("");
//      System.out.println(numStrArr.length);

        int counter = 0;
        while(number > 0) {
            number = number / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
