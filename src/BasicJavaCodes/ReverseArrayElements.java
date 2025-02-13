package BasicJavaCodes;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter array elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        revrseArrayElementsAndSort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void revrseArrayElementsAndSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }
        Arrays.sort(arr);
    }

    private static int reverseNumber(int i) {
        int rev = 0;
        while(i > 0) {
            int rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }
        return rev;
    }
}
