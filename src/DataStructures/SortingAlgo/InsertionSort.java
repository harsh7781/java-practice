package DataStructures.SortingAlgo;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting begins : ");
        insertionSort(arr);
        System.out.println("After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
