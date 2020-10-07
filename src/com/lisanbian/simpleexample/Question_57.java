package com.lisanbian.simpleexample;

import com.lisanbian.utils.RandArray;

/**
 * 和为s的数字
 * 输入递增排序数组和一个数字s,在数组中查找两个数，使得他们的和正好是s,如果有多对，输出任意一对
 */
public class Question_57 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,43,233,532,8686};
        int[] result = findNumbersWithSum(arr, 8);
        RandArray.printArray(result,10);

    }

    public static int[] findNumbersWithSum(int[] arr,int s){
        if(arr==null||arr.length<2)
            return null;
        int[] result = new int[2];
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if(arr[left]+arr[right]==s){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }
            if(arr[left]+arr[right]<s&&left<right)
                left++;
            if(arr[left]+arr[right]>s&&left<right)
                right--;


        }

        return result;

    }
}
