//Function calling to itself
package DataStructures;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " : " + fact(n));
    }

    private static int fact(int n) {
        if(n != 0) {
            return n * fact(n - 1);
        }
        return 1;
    }

}
