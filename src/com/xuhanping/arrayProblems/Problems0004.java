package com.xuhanping.arrayProblems;

/**
 * @author xuhanping
 * @date 2020/10/24 5:53 下午
 */
public class Problems0004 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int numa = 0, numb = 0, i = 0;
        while (numa < nums1.length || numb < nums2.length){
            if (numa < nums1.length && numb < nums2.length){
                arr[i++] = nums1[numa] < nums2[numb] ? nums1[numa++] : nums2[numb++];
            }else if (numa >= nums1.length){
                arr[i++] = nums2[numb++];
            }else {
                arr[i++] = nums1[numa++];
            }
        }
        return arr.length % 2 == 1 ? arr[arr.length / 2] / 1.0 : (arr[arr.length / 2] + arr[arr.length / 2 - 1])/2.0;
    }
}
