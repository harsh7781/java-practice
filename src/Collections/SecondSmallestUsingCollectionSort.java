package Collections;

import java.util.*;

public class SecondSmallestUsingCollectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters you want to enter: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Second smallest element from the array :" + secondSmallest(nums));

    }

    private static int secondSmallest(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i);
        Collections.sort(arr);
        return arr.get(1);
    }
}
