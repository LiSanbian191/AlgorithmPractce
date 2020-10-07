package com.lisanbian.sortalgorithm;

import com.lisanbian.utils.RandArray;

/**
 * 归并排序
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(10, 20);
        RandArray.printArray(arr,10);
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        RandArray.printArray(arr,10);


    }

    public static void mergeSort(int[] arr,int start,int end){
        if(arr==null||start>=end)
            return;

        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end){

        int[] tmp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i<=mid&&j<=end){
            if(arr[i]<arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }

        while (i<=mid)
            tmp[k++] = arr[i++];
        while (j<=end)
            tmp[k++] = arr[j++];

        for (int c = 0;c<tmp.length;c++)
            arr[start+c] = tmp[c];
    }
}
