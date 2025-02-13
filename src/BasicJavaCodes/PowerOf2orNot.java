package BasicJavaCodes;

import java.util.Scanner;

public class PowerOf2orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        if (powerOf2(num)) {
            System.out.println(num + " is power of 2");
        } else {
            System.out.println(num + " is not power of 2.");
        }
    }

    private static boolean powerOf2(int num) {
        for(int i = 1; i < num/2; i++) {
            if((Math.pow(2, i)) == num) {
                return true;
            }
        }
        return false;
    }
}
