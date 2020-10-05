package com.lisanbian.simpleexample;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 数据流中的中位数
 * 用最大堆和最小堆实现，最小堆的堆顶大于最大堆的堆顶
 */
public class Question_41 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(getMedian(arr));
    }

    public static Double getMedian(int[] arr){
        if(arr==null)
            return null;
        if(arr.length==1)
            return arr[0]/1.0 ;

        double median = 0;
        //构造最大最小堆
        Queue<Integer> maxHeap = new PriorityQueue<>();
        Queue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i = 0;i<arr.length;i++){
            //偶数个插入maxHeap
            if(i%2==0){
                if(!maxHeap.isEmpty()&&arr[i]>maxHeap.peek()){
                    maxHeap.add(minHeap.poll());
                    minHeap.add(arr[i]);
                }
                else
                    maxHeap.add(arr[i]);
                //奇数个插入最小堆
            }else {
                if(!minHeap.isEmpty()&&arr[i]<minHeap.peek()){
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(arr[i]);
                }else
                    minHeap.add(arr[i]);
            }


        }

        //根据容量关系，取出中位数
        if(minHeap.size()==maxHeap.size())
            median =  (maxHeap.peek()+minHeap.peek())/2.0;
        else if(maxHeap.size()>minHeap.size())
            median = maxHeap.peek()/1.0;
        else if(minHeap.size()>maxHeap.size())
            median = minHeap.peek()/1.0;
        return median;




    }

}
