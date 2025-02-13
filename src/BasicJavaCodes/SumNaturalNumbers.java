package BasicJavaCodes;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit\n");
        int num = sc.nextInt();
        System.out.println("The sum of the first " + num + " natural numbers divisible by 3 or 5 is: " + calculateSum(num));
    }

    private static int calculateSum(int n) {
        int sum = 0;
        int count = 0;
        int num = 1;
        while (count < n) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
                count++;
            }
            num++;
        }

        return sum;
    }
}
