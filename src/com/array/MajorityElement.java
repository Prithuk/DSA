package com.array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        int mathV = length / 2;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > mathV) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = majorityElement(new int[]{3, 2, 3});
        System.out.println(result);
    }
}