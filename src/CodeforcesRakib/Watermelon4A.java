package CodeforcesRakib;
import java.util.Scanner;
public class Watermelon4A {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the weight of the watermelon
            int w = scanner.nextInt();

            // Check if it's possible to divide the watermelon into two even parts
            if (w > 2 && w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            scanner.close();
        }
    }
