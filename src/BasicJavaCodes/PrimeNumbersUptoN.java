package BasicJavaCodes;

import java.util.Scanner;

public class PrimeNumbersUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till which number you want to print prime numbers");
        int num = sc.nextInt();
        for(int i = 2; i < num; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
