package com.xuhanping.arrayProblems;

import java.util.HashSet;

public class Problem0645 {
    public int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int sum = (1 + length) * length / 2;
        HashSet<Integer> hashSet = new HashSet<>(length);
        int[] arr = new int[2];
        for (int item : nums){
            if (hashSet.contains(item)){
                arr[0] = item;
            }else {
                hashSet.add(item);
                sum -= item;
            }
        }
        arr[1] = sum;
        return arr;
    }
}
