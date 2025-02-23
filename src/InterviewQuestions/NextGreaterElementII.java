package InterviewQuestions;
//Leetcode - 506
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       int[] ans = nextGreaterElementII(nums);

        for(int i : ans) {
            System.out.print(i + " ");
        }

    }

    private static int[] nextGreaterElementII(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];
        Arrays.fill(result, -1);
        for(int i = 0; i < n * n; i++) {
            int num = nums[i % n];
            while(!st.isEmpty() && nums[st.peek()] < num) {
                result[st.pop()] = num;
            }
            if(i < n) st.push(i);
        }
        return result;
    }
}
