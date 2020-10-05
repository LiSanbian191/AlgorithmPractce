package com.lisanbian.simpleexample;
/**
 * 数组中出现次数超过一半的数字
 * 数组中有个数字出现次数超过一半，找出并打印
 */
public class Question_39 {
    public static void main(String[] args) {
        int[] arr = {22,2,3,312,212,22,22,222,22,22,22,22,22,22,23,12,2,2,222,22,22};
        System.out.println(moreThanHalfNum(arr));
    }

    public static Integer moreThanHalfNum(int[] arr){

        Integer result = null;
        if(arr==null||arr.length==0)
            return result;

        int count = 1;
        result = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(count==0){
                result = arr[i];
            }
            if(arr[i]==result)
                count++;
            else
                count--;
        }
        return result;

    }
}
