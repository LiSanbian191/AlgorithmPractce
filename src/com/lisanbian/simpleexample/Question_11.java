package com.lisanbian.simpleexample;
/**
 * 旋转数组的最小数字，要求达到时间复杂度最小
 */
public class Question_11 {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int[] arr1 = {1,1,0,1,1,1,1};
        int[] arr2 = {3,4,5,1,8};
        int min = findMin(arr);
        System.out.println(min);
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
    }

    public static int findMin(int[] arr){

        int left = 0;
        int right = arr.length-1;
        if(arr==null||arr.length==0||arr[0]<arr[right]){
            try {
                throw new Exception("输入的数组有误！");

            }catch (Exception e){
                e.printStackTrace();
                return -1;
            }
        }
        int mid;
        while(left<right){
            mid = (left+right)/2;
            if(arr[left]==arr[mid]&&arr[mid]==arr[right])
                return searchMin(arr,left,right);

            if(right-left==1)
                break;
            if(arr[mid]>=arr[left])
                left=mid;
            else
                right=mid;
        }
        return arr[right];
    }

    public static int searchMin(int[] arr,int left,int right){
        int result = arr[left];
        for(int i = left+1;i<right;++i){
            if(arr[i]<result)
                result = arr[i];
        }
        return result;
    }

}
