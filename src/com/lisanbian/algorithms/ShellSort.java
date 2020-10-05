package com.lisanbian.algorithms;

import com.lisanbian.utils.RandArray;

/**
 * 插入排序算法的改进，分组插入
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(1000000, 1000000);
        long l = System.currentTimeMillis();
        shellSort(arr);
        long end = System.currentTimeMillis();
        long span = end-l;
        System.out.println(span);
    }

    public static void shellSort(int[] arr){
        if(arr==null||arr.length<2)
            return;

        int i,j;
        int tmp;
        int gap = arr.length/2;

        while (gap>0){
            for(i = gap;i<arr.length;i+=gap){
                j = i;
                tmp = arr[j];
                while (j>0&&arr[j-gap]>tmp){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j] = tmp;
            }
            gap/=2;
        }



    }
}
