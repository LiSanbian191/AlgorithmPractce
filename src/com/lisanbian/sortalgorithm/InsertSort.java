package com.lisanbian.sortalgorithm;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {43,1,2,4,67,6,3,24,864,3321,11,52};
        insertSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("折半插入”");
        int[] arr1 = {43,1,2,4,67,6,3,24,864,3321,11,52};
        insertSort(arr1);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }

    public static void insertSort(int[] arr){
        if(arr==null||arr.length==0)
            return;

        int i,j;
        int tmp;

        for(i=1;i<arr.length;i++){
            j=i;
            tmp=arr[j];
            while (j>0&&tmp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = tmp;
        }
    }

    //折半插入
    public static void insertSortPlus(int[] arr){
        if(arr==null||arr.length==0)
            return;

        int i,j;
        int low,high,mid;
        int tmp;
        for(i = 1;i<arr.length;i++){
            low = 0;
            high = i-1;
            tmp = arr[i];
            while (low<=high){
                mid=(low+high)/2;
                if(tmp>arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            for(j=i-1;j>high;j--){
                arr[j+1] = arr[j];

            }
            arr[j+1] = tmp;
        }
    }
}
