package CodeforcesRakib;

import java.util.Scanner;

public class TheatreSquare1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        // Calculate the number of flagstones needed for rows and columns
        long rows = (n + a - 1) / a; // Equivalent to ceil(n/a)
        long columns = (m + a - 1) / a; // Equivalent to ceil(m/a)

        // Calculate the total number of flagstones needed
        long totalFlagstones = rows * columns;

        // Print the result
        System.out.println(totalFlagstones);

        scanner.close();
    }
}
