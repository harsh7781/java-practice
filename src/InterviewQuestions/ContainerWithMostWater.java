package InterviewQuestions;

import java.util.List;
import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(containerWithMostWater(arr));
    }

    private static int containerWithMostWater(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right) {
            int width = right - left;
            int area = Math.min(heights[left], heights[right]) * width;
            maxArea = Math.max(maxArea, area);
            if(heights[left] <= heights[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
