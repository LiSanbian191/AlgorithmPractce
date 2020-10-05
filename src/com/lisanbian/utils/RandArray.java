package com.lisanbian.utils;

import java.util.Random;

/**
 * 生成随机数组辅助类
 */

public class RandArray {
    static Random random = new Random();
    public static int[] randomArray(int count,int limit){
        //count表示数组的大小,limit表示数的范围
        int[] arr = new int[count];

        for(int i = 0;i<count;i++)
            arr[i] = random.nextInt(limit);
        return arr;
    }

    public static void printArray(int[] arr,int num){
        if(arr==null)
            return;

        for(int i = 0;i<arr.length;i++){
            if(i%num==0)
                System.out.println();
            System.out.printf("%8d",arr[i]);
        }


    }

}
