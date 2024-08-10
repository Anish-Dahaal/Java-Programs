//Real world problem  solving in virtual world
// for char only single cotaions are used
//

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            String res;
            int a = sc.nextInt();
            // if (a % 2 == 0) {
            // System.out.println(a + " is even.");
            // } else
            // System.out.println(a + " is odd.");
            res = a % 2 == 1 ? "odd" : "even";
            System.out.println(res);

        }
    }
}