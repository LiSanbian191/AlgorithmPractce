package com.lisanbian.sortalgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,321,523,4524,121,131,14134,1434};
        bubbleSortPlus(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length==0)
            return;

        int i, j;
        int tmp;

        for(i=0;i<arr.length-1;i++){
            for (j=arr.length-1;j>arr.length-i-1;j--){
                if(arr[j]<arr[j-1]){
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    //增加标志位
    public static void bubbleSortPlus(int[] arr){
        if(arr==null||arr.length==0)
            return;

        int i,j;
        int tmp;
        boolean flag;
        for(i = 0;i<arr.length-1;i++){
            flag = true;
            for (j=arr.length-1;j>arr.length-i-1;j--){
                if(arr[j]<arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    flag = false;
                }
            }
            if(flag==true)
                return;
        }

    }

}
