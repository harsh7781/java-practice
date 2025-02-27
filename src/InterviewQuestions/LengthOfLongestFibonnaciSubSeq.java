package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LengthOfLongestFibonnaciSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lenLongestFibSubseq(arr));
    }

    private static int lenLongestFibSubseq(int[] arr) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr) set.add(n);

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int firstNum = arr[i];
                int secondNum = arr[j];
                int sum = firstNum + secondNum;
                int count = 2;

                while(set.contains(sum)) {
                    count++;
                    firstNum = secondNum;
                    secondNum = sum;
                    sum = firstNum + secondNum;
                }

                ans = Math.max(ans, count);
            }
        }
        return ans == 2 ? 0 : ans;
    }

}
