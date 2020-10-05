package com.lisanbian.simpleexample;
/**
 * 连续子数组的最大和
 */
public class Question_42 {

    public static void main(String[] args) {
        int[] arr = {1,-2,-21,2,23,-122};
        System.out.println(findGreatestSumOfSubArray(arr));
    }

    public static Integer findGreatestSumOfSubArray(int[] arr){
        if(arr==null||arr.length<1)
            return -1;
        if(arr.length==1)
            return arr[0];

        int nCurrentSum = 0;
        int nGreatestSum=0;
        for(int i = 0;i<arr.length;i++){
            if(nCurrentSum<=0)
                nCurrentSum=arr[i];
            else
                nCurrentSum+=arr[i];
            if(nCurrentSum>nGreatestSum)
                nGreatestSum=nCurrentSum;
        }
        return nGreatestSum;

    }
}
