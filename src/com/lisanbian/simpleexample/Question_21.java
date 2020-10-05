package com.lisanbian.simpleexample;
/**
 * 调整字符串顺序使奇数位于偶数前
 */
public class Question_21 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        sortOddFrontEven(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void sortOddFrontEven(int[] arr){
        if(arr==null||arr.length==0){
            System.out.println("数组有误！");
            return;
        }

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            while (left<right&&(arr[left]%2==1)){
                left++;
            }
            while ((left<right&&arr[right]%2==0)){
                right--;
            }

            if(left<right){
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }else {
                break;
            }


        }

    }
}
