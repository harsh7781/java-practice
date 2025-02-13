package BasicJavaCodes;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter array elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = modifyArray(arr);
        System.out.println("After removing duplicate elements and sorting them in Desc order");
        for(int ele: res) {
            System.out.print(ele + " ");
        }

    }

    private static int[] modifyArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }
        int[] uniqueArr = new int[count];
        for(int i = 0; i < count; i++) {
            uniqueArr[i] = temp[i];
        }

        Arrays.sort(uniqueArr);

        for (int i = 0; i < uniqueArr.length / 2; i++) {
            int tempVal = uniqueArr[i];
            uniqueArr[i] = uniqueArr[uniqueArr.length - 1 - i];
            uniqueArr[uniqueArr.length - 1 - i] = tempVal;
        }
        return uniqueArr;
    }
}
