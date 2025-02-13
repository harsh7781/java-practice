package BasicJavaCodes;

import java.util.Scanner;

//: Create a method to find the sum of the cubes of the digits of an n digit number

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cube = sumOfDigitsOfCube(num);
        System.out.print(cube);
    }

    private static int sumOfDigitsOfCube(int num) {
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, 3);
            num = num / 10;
        }
        return sum;
    }
}