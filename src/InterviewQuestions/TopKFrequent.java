package InterviewQuestions;
//Leetcode 347

import java.util.*;
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) return nums;
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
                Comparator.comparingInt(count::get)
        );

        for(int n : count.keySet()) {
            heap.add(n);
            if(heap.size() > k) heap.poll();
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;

    }
}
