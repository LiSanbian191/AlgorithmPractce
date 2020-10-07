package com.lisanbian.simpleexample;
/**
 *在排序数组中查找数字，给定一个数组和一个数字，统计其在数组中出现的次数 个数
 * 使用二分查找分别找出第一个给定的和最后一个给定的数的坐标，后者与前者做计算即可得到
 */
public class Question_53 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,6,6,6,6,45,334};
        System.out.println(numberOfK(arr,6));
    }

    public static int numberOfK(int[] arr,int k){
        if(arr==null)
            return 0;
        int start = findFirstK(arr,k,0,arr.length-1);
        int end = findLastK(arr,k,0,arr.length-1);
        if(start>-1&&end>-1)
            return end-start+1;
        else
            return 0;

    }

    public static int findFirstK(int[] arr, int k, int start, int end){
        if(start>end)
            return -1;

        int mid  = (start+end)>>1;
        int midData = arr[mid];
        if(midData==k){
            if(mid>0&&arr[mid-1]!=k||mid==0)
                return mid;
            else
                end = mid-1;
        }else if(midData>k)
            end = mid-1;
        else
            start = mid+1;

        return findFirstK(arr,k,start,end);
    }

    public static int findLastK(int[] arr, int k, int start, int end) {
        if (start > end)
            return -1;

        int mid = (start + end) >> 1;
        int midData = arr[mid];

        if (midData == k) {
            if (mid < arr.length - 1 && arr[mid + 1] != k || arr[arr.length - 1] == k)
                return mid;
            else start = mid + 1;
        } else if (midData < k)
            start = mid + 1;
        else
            end = mid - 1;

        return findLastK(arr, k, start, end);
    }

}
