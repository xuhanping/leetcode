package com.xuhanping.stringProblems;

public class Problem0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = strs[0].length();
        int index = 0;
        boolean flag = true;
        while (index < length && flag){
            for (int i = 0; i < strs.length - 1; i++){
                if (strs[i+1].length() <= index || strs[i].charAt(index) != strs[i+1].charAt(index)){
                    flag = false;
                    break;
                }
                if (i == strs.length - 2){
                    stringBuilder.append(strs[0].charAt(index++));
                }
            }
        }
        return stringBuilder.toString();

    }
}
