package com.lisanbian.algorithms;

import com.lisanbian.utils.RandArray;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = RandArray.randomArray(1000000, 1000000);
        long l = System.currentTimeMillis();
        mergeSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        long span = end-l;
        System.out.println(span);
    }

    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right)
            return;

        int mid = (left+right)/2;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int left,int mid,int right){
        //临时数组
        int[] tmp = new int[right-left+1];
        int i = left;
        int j =mid+1;
        int k = 0;
        while (i<=mid&&j<=right){
            if(arr[i]<arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }
        //将左边或右边剩下的元素依次添加进临时数组
        while (i<=mid)
            tmp[k++] = arr[i++];
        while (j<=right)
            tmp[k++] = arr[j++];

        //将临时数组中的元素复制到原数组中
        for(int c = 0;c<tmp.length;c++)
            arr[left+c] = tmp[c];

    }
}
