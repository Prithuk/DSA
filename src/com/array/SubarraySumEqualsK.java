package com.array;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int countSubarraysWithSumK(int[] nums, int k) {
        // HashMap to store (cumulative sum, number of occurrences of this sum)
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // Initialize with sum 0 to count subarrays starting from index 0
        int count = 0;
        int sum = 0;

        // Traverse through the array
        for (int num : nums) {
            sum += num;
            // Check if (sum - k) is in the map, if yes, there exists a subarray with sum k
            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k);
            }
            // Add the current sum to the map (or update its count if already present)
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        System.out.println(sumMap);
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {10, 15, -5, 15, -10, 5};
        int[] nums = {1,0,1,2,1,0,4,1,3};

//        int k = 5;
        int k=4;
        System.out.println("Number of subarrays with sum " + k + " is: " + countSubarraysWithSumK(nums, k)); // Output: 2
    }
}
