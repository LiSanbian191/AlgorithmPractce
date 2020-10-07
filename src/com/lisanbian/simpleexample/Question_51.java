package com.lisanbian.simpleexample;

import com.lisanbian.utils.RandArray;

/**
 * 数组中的逆序对
 */
public class Question_51 {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        System.out.println(reversePairs(arr));
    }

    public static int reversePairs(int[] nums) {

        return reversePairsCore(nums, 0, nums.length - 1);
    }
    static int reversePairsCore(int[] arr, int start, int end) {

        if (start >= end)
            return 0;

        int mid = (start + end)>>1;
        int count = 0;
        count += reversePairsCore(arr, start, mid);
        count += reversePairsCore(arr, mid + 1, end);
        count += mergeAndCount(arr, start, mid, end);

        return count;
    }
    /**
     * 合并两个数组并统计逆序对数
     */
    static int mergeAndCount(int[] arr,int start,int mid,int end){
        if (start >= end)
            return 0;

        int count=0;
        //辅助数组
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {

            count += arr[i] <= arr[j] ?j - (mid + 1):0;
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            count += j - (mid + 1);
            temp[k++] = arr[i++];
        }
        while (j <= end)
            temp[k++] = arr[j++];
        for (int m = 0;m<temp.length;m++)
            arr[start+m] = temp[m];
        return count;

    }
}
