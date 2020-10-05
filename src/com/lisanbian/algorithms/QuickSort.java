package com.lisanbian.algorithms;

import com.lisanbian.utils.RandArray;
import org.w3c.dom.html.HTMLDOMImplementation;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(1000000, 1000000);
        long l = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        long span = end-l;

        RandArray.printArray(arr,30);
        System.out.println();
        System.out.println(span);
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)
            return;

        int start = low;
        int end = high;
        int tmp = arr[low];
        while (start<end){
            while(start<end&&arr[end]>=tmp)
                end--;
            arr[start] = arr[end];
            while (start<end&&arr[start]<=tmp)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = tmp;
        quickSort(arr,low,start-1);
            quickSort(arr,start+1,high);
    }
}
