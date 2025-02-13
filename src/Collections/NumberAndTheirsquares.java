package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberAndTheirsquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters you want to enter: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Map<Integer, Integer> res = squaresOfNum(nums);
        for(Map.Entry<Integer, Integer> entry : res.entrySet()) {
            System.out.println("Square of " + entry.getKey() + " = " + entry.getValue());
        }

    }

    private static Map<Integer, Integer> squaresOfNum(int[] nums) {
        Map<Integer, Integer> squares = new HashMap<>();
        for(int num : nums) {
            int squ = num * num;
            if(!squares.containsKey(num)) {
                squares.put(num, squ);
            }
        }
        return squares;
    }
}
