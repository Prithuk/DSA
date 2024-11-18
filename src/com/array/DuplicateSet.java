package com.array;

import java.util.HashSet;

public class DuplicateSet {

    public static void main(String[] args) {
        int[] nums = {1,1, 3,4,2};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (!set.add(nums[i])) {
                System.out.println(nums[i]);
            }
        }
    }
}


