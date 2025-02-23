package InterviewQuestions;
//LeetCode 556
import java.util.Scanner;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nextGreaterElementIII(n));
    }

    public static int nextGreaterElementIII(int n) {
        char[] nums = (Integer.toString(n)).toCharArray();

        // Step 1: Find the first decreasing element from the end
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i == -1)
            return -1; // If no such element is found, return -1
        // Step 2: Find the element just larger than nums[i] from the end
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Step 3: Swap elements at i and j
        swap(nums, i, j);

        // Step 4: Reverse the sequence after i to get the next smallest lexicographic
        // permutation
        reverse(nums, i + 1, nums.length - 1);

        // Convert back to long and check if it's within the 32-bit integer range
        long ansLong = Long.parseLong(new String(nums));
        return (ansLong > Integer.MAX_VALUE) ? -1 : (int) ansLong;
    }

    private static void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}

