package BasicJavaCodes;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbernof elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter array elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second smallest element from the array is: " + secondSmallestUsingSorting(arr));
        System.out.println("The second smallest element from the array is: " + secondSmallestWithoutUsingSorting(arr));
    }

    private static int secondSmallestWithoutUsingSorting(int[] arr) {
        if(arr.length < 2) throw new IllegalArgumentException("Array size should be greater than two");
        int smallest =  Integer.MAX_VALUE;
        int secondSmallest =  Integer.MAX_VALUE;
        for(int ele: arr) {
            if(ele < smallest) {
                secondSmallest = smallest;
                smallest = ele;
            }
            else if(ele < secondSmallest && ele != smallest) secondSmallest = ele;
        }
        return secondSmallest;
    }

    private static int secondSmallestUsingSorting(int[] arr) {
        if(arr.length < 2) throw new IllegalArgumentException("Array size should be greater than two");
        Arrays.sort(arr);
        return arr[1];
    }
}
