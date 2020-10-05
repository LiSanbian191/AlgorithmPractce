package com.lisanbian.sortalgorithm;

import com.sun.source.tree.WhileLoopTree;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,3,31,41,53,2,1,13,11,1434,1413,53441,22,13421,1341};
        quickSort(arr,0,arr.length-1);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] arr,int left,int right) {

        if(left>=right||arr==null||arr.length<2)
            return;

        int leftIndex = left;
        int rightIndex = right;
        int base = arr[leftIndex];
        while (leftIndex<rightIndex){
            while (leftIndex<rightIndex&&arr[rightIndex]>=base){
                rightIndex--;
            }
            if(leftIndex<rightIndex)
                 arr[leftIndex] = arr[rightIndex];
            while (leftIndex<rightIndex&&arr[leftIndex]<=base){
                leftIndex++;
            }
            if (leftIndex<rightIndex)
                arr[rightIndex] = arr[leftIndex];
        }
        arr[leftIndex] = base;
        quickSort(arr,left,leftIndex-1);
        quickSort(arr,rightIndex+1,right);


    }
}
