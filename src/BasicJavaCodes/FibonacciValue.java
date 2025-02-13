package BasicJavaCodes;

import java.util.Scanner;

public class FibonacciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want fibonnacci value");
        int n = sc.nextInt();
        System.out.println("Fibonacci (recursive) of " + n + " is: " + fibonacciRecursive(n - 1));
        System.out.println("Fibonacci (non-recursive) of " + n + " is: " + fibonacciNonRecursive(n - 1));
    }

    private static int fibonacciNonRecursive(int num) {
        if(num <= 1) return 1;

        int a = 1, b = 1;
        for(int i = 2; i <= num; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    private static int fibonacciRecursive(int num) {
        if(num <= 1) return 1;
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
}
