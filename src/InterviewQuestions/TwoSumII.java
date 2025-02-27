package InterviewQuestions;

import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Target Element :");
        int target = sc.nextInt();
        int[] ans = twoSumII(arr, target);
        for(int num : ans) System.out.print(num + " ");
    }

    private static int[] twoSumII(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            if(numbers[left] + numbers[right] > target) right--;
            else if(numbers[left] + numbers[right] < target) left++;
            else return new int[]{left + 1, right + 1};
        }
        return null;
    }
}
