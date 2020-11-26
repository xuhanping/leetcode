package com.xuhanping.stringProblems;

import java.beans.PropertyEditorSupport;
import java.util.Map;

public class Problem0007 {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0){
            flag = false;
        }
        if (!flag){
            x = Math.abs(x);
        }
        String s = x + "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            stringBuilder.append(s.charAt(i));
        }
        int result = 0;
        try {
            result = Integer.parseInt(stringBuilder.toString());
        }catch (Exception e){

        }
        return flag ? result : -result;
    }
}
