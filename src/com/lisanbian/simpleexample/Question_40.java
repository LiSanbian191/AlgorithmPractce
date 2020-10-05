package com.lisanbian.simpleexample;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最小的K个数
 */
public class Question_40 {

    public static void main(String[] args) {
        int[] arr = {1,32,3,31243,131,4312,545,1341,512354,142,23,22,14,124,143,521};
        int[] leastNumbers = getLeastNumber(arr, 6);
        for(int i:leastNumbers){
            System.out.print(i+" ");
        }

    }

    public static int[] getLeastNumber(int[] arr,int k){
        if(k<=0)
            return null;
        if(arr==null||arr.length<=k)
            return arr;
        int[] result = new int[k];

        //创建一个最大堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0;i<arr.length;i++){
            if(maxHeap.isEmpty()||maxHeap.size()<k)
                maxHeap.add(arr[i]);
            else if(arr[i]<maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.add(arr[i]);
            }
        }

        for(int i=0;i<k;i++){
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
