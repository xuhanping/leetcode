package com.xuhanping.stringProblems;

import java.util.HashSet;

/**
 * @author xuhanping
 * @date 2020/10/24 4:43 下午
 */
public class Problem0003 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int result = 0, i = 0, j = 0, length = s.length();
        while (i < length && j < length){
            if (hashSet.contains(s.charAt(j))){
                hashSet.remove(s.charAt(i++));
            }else {
                hashSet.add(s.charAt(j++));
                result = Math.max(result, j - i);
            }
        }
        return result;
    }
}
