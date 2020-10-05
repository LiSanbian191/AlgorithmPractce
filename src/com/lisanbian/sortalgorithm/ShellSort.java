package com.lisanbian.sortalgorithm;

import javax.print.DocFlavor;

/**
 * 希尔排序
 */

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {1,2,241,1,43,5,61,6312,631,621,2441,436241,1534145};
        shellSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void shellSort(int[] arr){
        if(arr==null||arr.length==0)
            return;

        int i,j;
        int tmp;
        int gap = arr.length/2;

        while (gap>0){
            for (i = gap;i<arr.length;i++){
                tmp = arr[i];
                j = i-gap;
                while (j>=0&&tmp<arr[j]){
                    arr[j+gap] = arr[j];
                    j-=gap;
                }
                arr[j+gap] = tmp;
            }
            gap/=2;
        }

    }
}
