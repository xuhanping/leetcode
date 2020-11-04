package com.xuhanping.arrayProblems;

public class Problem0485 {
    /**
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                num++;
            }else {
                max = Math.max(max, num);
                num = 0;
            }
        }
        max = Math.max(max, num);
        return max;
    }
}
