package com.xuhanping.arrayProblems;

public class Problem0495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        int poisoningTime = 0;
        for (int i = 0; i < timeSeries.length; i++){
            if (poisoningTime < timeSeries[i]){
                time += duration;
            }else {
                time += timeSeries[i] + duration - 1 - poisoningTime;
            }
            poisoningTime = timeSeries[i] + duration - 1;
        }
        return time;
    }
}
