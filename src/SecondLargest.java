import java.util.Scanner;

public class SecondLargest {
    // method to find the second largest element
    // takes an integer array as input
    int findSecondLargest(int[] numbers) {

        // variables to track the largest and second largest elements
        int largest, secondLargest;

        // initialize largest and second largest elements
        // with first and second elements making the comparison

        if (numbers[0] > numbers[1]) {
            largest = numbers[0];
            secondLargest = numbers[1];
        }
        else {
            largest = numbers[1];
            secondLargest = numbers[0];
        }

        // run a loop from the third element
        for (int i = 2; i < numbers.length; ++i) {
            // compare the element with largest and second largest
            // if the element is greater than largest,
            // assign largest to secondLargest and element to largest
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            // if element is greater than secondLargest but smaller than largest
            // assign the element to secondLargest
            else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }

        // return the second largest element
        return secondLargest;
    }

    public static void main(String[] args) {

        // define an array
        int[] numbers = new int[5];

        // get input values for array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        // call the method by passing array as the input
        SecondLargest obj = new SecondLargest();
        int secondLargest = obj.findSecondLargest(numbers);

        // print the second largest element
        System.out.println(secondLargest);
    }


}
