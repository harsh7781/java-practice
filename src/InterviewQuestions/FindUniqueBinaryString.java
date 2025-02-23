package InterviewQuestions;
//LeetCode - 1980
import java.util.Scanner;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }

        System.out.println(findUniqueBinaryString(nums));
    }

    private static String findUniqueBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            sb.append((c == '0') ? "1" : "0");
        }
        return sb.toString();
    }

}
