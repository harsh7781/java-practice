package InterviewQuestions;
// LeetCode 128
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(longestCommonSubsequenceUsingSorting(nums));
        System.out.println(longestCommonSubsequenceOptimal(nums));
    }

    private static int longestCommonSubsequenceUsingSorting(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int ans = 1, curr = 1;
        int prev = nums[0];

        for(int i=1; i<n;i++){
            if(nums[i] == prev + 1){
                curr ++;

            }
            else if(nums[i] != prev){
                curr = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, curr);
        }
        return ans;

    }

    private static int longestCommonSubsequenceOptimal(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int i : nums) numSet.add(i);
        int longestSub = 1;
        for(int num : numSet) {
            if(numSet.contains(num - 1)) continue;
            else {
                int currentNum = 1;
                int currentSub = 1;
                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub, currentSub);
            }
        }
        return longestSub;
    }
}
