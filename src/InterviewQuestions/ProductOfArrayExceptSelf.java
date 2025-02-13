package InterviewQuestions;
//Leetcode - 238
import java.util.*;
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int pre = 1, post = 1;
        for(int i  = 0; i < nums.length; i++) {
            result[i] = pre;
            pre = nums[i] * pre;
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * post;
            post = nums[i] * post;
        }
        return result;
    }

    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[n-1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;

    }
}
