package BasicJavaCodes;

import java.util.Scanner;

public class ModifystringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(modifyNumber(num));
    }

    private static int modifyNumber(int num) {
        String numberStr = String.valueOf(num);
        StringBuffer modifiedNumber = new StringBuffer();
        for (int i = 0; i < numberStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numberStr.charAt(i));
            int nextDigit = Character.getNumericValue(numberStr.charAt(i + 1));

            int diff = Math.abs(currentDigit - nextDigit);
            modifiedNumber.append(diff);
        }

        modifiedNumber.append(numberStr.charAt(numberStr.length() - 1));
        return Integer.parseInt(modifiedNumber.toString());
    }
//
//    public static int modifyNumber1(int number1) {
//        int result = 0;
//        int previousDigit = number1 % 10;
//        number1 /= 10;
//
//        int placeValue = 1;
//
//        while (number1 > 0) {
//            int currentDigit = number1 % 10;
//            number1 /= 10;
//            int diff = Math.abs(currentDigit - previousDigit);
//            result = diff * placeValue + result;
//            previousDigit = currentDigit;
//            placeValue *= 10;
//        }
//
//        result = previousDigit * placeValue + result;
//
//        return result;
//    }
}
