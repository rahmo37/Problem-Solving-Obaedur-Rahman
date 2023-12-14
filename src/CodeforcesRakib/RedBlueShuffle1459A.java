package CodeforcesRakib;


import java.util.Scanner;

public class RedBlueShuffle1459A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
//            System.out.println("t inside While :" + t );
            int rc = 0, bc = 0;
            int n = scanner.nextInt();
            String r = scanner.next();
            String b = scanner.next();
//            System.out.println(r + " " + b);
            for (int i = 0; i < n; i++) {
                if (r.charAt(i) > b.charAt(i)) {
                    rc++;
                } else if (r.charAt(i) < b.charAt(i))
                    bc++;
                else {
                    rc++;
                    bc++;
                }
            }

            if (rc > bc)
                System.out.println("RED");
            else if (bc > rc)
                System.out.println("BLUE");
            else
                System.out.println("EQUAL");
        }
    }
}
