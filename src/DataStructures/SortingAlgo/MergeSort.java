package DataStructures.SortingAlgo;

import java.util.Scanner;

public class MergeSort {
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
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;  // size of left array
        int n2 = r - mid; // size of right array

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        //copy data into temporary arrays
        for(int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];
        }

        for(int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        //Merge left and right subaarays
        while(i < n1 && j < n2) {
            if(lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from leftArray
        while(i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        // Copy remaining elements from rightArray
        while(j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
}
