package BasicJavaCodes;

import java.util.Scanner;

public class CheckANumberIsIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        if (checkNumber(num)) {
            System.out.println(num + " is an increasing number.");
        } else {
            System.out.println(num + " is not an increasing number.");
        }
    }

    private static boolean checkNumber(int num) {
        int prevDigit = num % 10;
        num /= 10;
        while(num > 0) {
            int currDigit = num % 10;
            if(currDigit > prevDigit) return false;
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }
}
