package BasicJavaCodes;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
        int num = sc.nextInt();
        String[] arr = new String[num];
        System.out.println("enter array elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        sortArray(arr);
        for(String s : arr) {
            System.out.print(s + " ");
        }
    }

    private static void sortArray(String[] arr) {
        Arrays.sort(arr);
        int midpoint = (arr.length / 2) + (arr.length % 2);
        for(int i = 0; i < arr.length; i++) {
            if(i < midpoint) arr[i] = arr[i].toUpperCase();
            else arr[i] = arr[i].toLowerCase();
        }

    }
}
