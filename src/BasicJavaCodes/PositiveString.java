package BasicJavaCodes;

import java.util.Scanner;

public class PositiveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string which you want to check: ");
        String str = sc.nextLine();
        System.out.println(str + " is Positive string: " + checkString(str));
    }

    private static boolean checkString(String str) {
        char[] strArr = str.toCharArray();
        for(int i = 0; i < strArr.length - 1; i++) {
            if(strArr[i] > strArr[i + 1] ) return false;
        }
        return true;
    }
}
