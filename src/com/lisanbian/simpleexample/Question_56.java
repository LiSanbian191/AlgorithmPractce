package com.lisanbian.simpleexample;
/**
 * 数组中数字出现的次数，要求时间复杂度O(n),空间复杂度O(1)
 * 数组中只出现一次的两个数字
 */
public class Question_56 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,1,12,3,5,13};
        int[] singleNumbers = singleNumbers(arr);
        for (int num:singleNumbers)
            System.out.print(num+" ");
    }

    public static int[] singleNumbers(int[] nums) {
        if(nums==null||nums.length<2)
            return nums;

        //异或数组所有元素的结果
        int resultOfOR = 0;

        for(int num:nums){
            resultOfOR=resultOfOR^num;
        }

        int mask = resultOfOR &(-resultOfOR);

        int[] result = new int[2];
        //划分后每个就相当于每个子数组中只会出现一个出现一次的数字，和元素一次做与运算结果即为所求的那个数
        for(int num:nums){
            if((mask&num)==0)
                result[0]^=num;
            else
                result[1]^=num;
        }
        return result;
    }


}
