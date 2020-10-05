package com.lisanbian.algorithms;

import com.lisanbian.utils.RandArray;

/**
 * 插入排序算法
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(1000000, 1000);
        long l = System.currentTimeMillis();
        insertSort(arr);
        long end = System.currentTimeMillis();
        long span = end-l;
        System.out.println(span);




    }
    public static void insertSort(int[] arr){
        if(arr==null||arr.length<2)
            return;

        int i,j;
        int tmp;

        for(i=1;i<arr.length;i++){
            tmp = arr[i];
            j=i;
            while (j>0&&arr[j-1]>tmp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = tmp;
        }
    }
}
