package com.lisanbian.algorithms;

import com.lisanbian.utils.RandArray;

/**
 * 选择排序算法
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(1000000, 1000);
        long l = System.currentTimeMillis();
        selectionSort(arr);
        long end = System.currentTimeMillis();
        long span = end-l;
        System.out.println(span);
    }

    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2)
            return;
        int i,j;

        for( i = 0;i<arr.length;i++){
            int min = i;
            for( j =i;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

    }
}
