package DataStructures;

//For BinarySearch to work array elements must be sorted

import java.util.Scanner;

public class BinarySearch {
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

        int result = binarySearching(arr, target);
        int result1 = binarySearchUsingRecursion(arr, target, 0, arr.length-1);
        if(result != -1 && result1 != -1) System.out.println(target + " is found at index : " + result);
        else System.out.println(target + " not found!!");
    }

    private static int binarySearchUsingRecursion(int[] arr, int target, int l, int r) {
        int steps = 0;
        while(l <= r) {
            steps++;
            int mid = l + (r - l) / 2;
            if(arr[mid] == target) {
                System.out.println("No of steps using recursion : " + steps);
                return mid;
            }
            else if(arr[mid] < target) return binarySearchUsingRecursion(arr, target, mid + 1, r);
            else return binarySearchUsingRecursion(arr, target, l, mid - 1);
        }
        System.out.println("No of steps using recursion : " + steps);
        return -1;
    }

    private static int binarySearching(int[] arr, int target) {
        int steps = 0;
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            steps++;
            int mid = l + (r - l) / 2;
            if(arr[mid] == target) {
                System.out.println("No of steps : " + steps);
                return mid;
            }
            else if(arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        System.out.println("No of steps : " + steps);
        return -1;

    }
}
