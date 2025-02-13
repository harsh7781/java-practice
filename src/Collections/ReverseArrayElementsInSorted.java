package Collections;

import java.util.*;

public class ReverseArrayElementsInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want to enter: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> sortedNumbers = reverseArrayElementsInSortedOrder(nums);
        System.out.println("Array elements are : " + sortedNumbers);

    }

    private static List<Integer> reverseArrayElementsInSortedOrder(int[] nums) {
        List<Integer> numbers = new ArrayList<>();

        for(int i : nums) {
            String reversedStr = new StringBuilder(String.valueOf(i)).reverse().toString();
            numbers.add(Integer.parseInt(reversedStr));
        }

        Collections.sort(numbers);
        return  numbers;
    }
}
