package com.xuhanping.arrayProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhanping
 * @date 2020/11/10 7:07 下午
 */
public class Problem0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] > 0) {
                nums[n] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}
