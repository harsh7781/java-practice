package DataStructures;

import java.util.Scanner;

public class BubbleSortCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting begins : ");
        bubbleSort(arr);
        System.out.println("After Sorting: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for(int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
