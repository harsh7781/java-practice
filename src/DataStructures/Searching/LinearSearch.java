package DataStructures.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);
        if(result != -1) System.out.println(target + " is found at index : " + result);
        else System.out.println(target + " not found!!");
    }

    private static int linearSearch(int[] arr, int target) {
        int steps = 0;
        for(int i = 0; i < arr.length; i++) {
            steps++;
            if(arr[i] == target) {
                System.out.println("No of Steps :" + steps);
                return i;
            }
        }
        System.out.println("No of Steps :" + steps);
        return -1;
    }
}
