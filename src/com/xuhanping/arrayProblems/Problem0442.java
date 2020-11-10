package com.xuhanping.arrayProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhanping
 * @date 2020/11/10 7:47 下午
 */
public class Problem0442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] > 0){
                nums[n] *= -1;
            }else {
                list.add(n+1);
            }
        }
        return list;
    }
}
