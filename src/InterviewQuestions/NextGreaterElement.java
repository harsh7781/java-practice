package InterviewQuestions;
//LeetCode 496
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums = new int[n1];

        for(int i = 0; i < n1; i++) {
            nums[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] ans = nextGreaterElementBruteForce(nums, nums2);
        int[] result = nextGreaterElementOptimized(nums, nums2);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : result) {
            System.out.print(i + " ");
        }

    }

    private static int[] nextGreaterElementOptimized(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int n : nums2) {
            while(!st.isEmpty() && st.peek() < n) {
                map.put(st.pop(), n);
            }
            st.add(n);
        }

        int i = 0;
        int[] ans = new int[nums1.length];
        for(int num : nums1) {
            ans[i++] = map.getOrDefault(num, -1);
        }
        return ans;
    }

    private static int[] nextGreaterElementBruteForce(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            int greaterIdx = -1, j = nums2.length - 1;
            while(j >= 0 && nums2[j] != nums1[i]) {
                if(nums2[j] > nums1[i]){
                    greaterIdx = nums2[j];
                }
                j--;
            }
            ans[i] = greaterIdx;
        }

        return ans;
    }
}
