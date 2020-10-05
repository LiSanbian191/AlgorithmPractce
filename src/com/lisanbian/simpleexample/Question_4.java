package com.lisanbian.simpleexample;
/**
 * 二维数组中的查找
 * 二维数组从左至右，从上到下排序，判断是否在数组中存在给定的数字
 */
public class Question_4 {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println(isExistsNum(arr,22));
    }

   public static boolean isExistsNum(int[][] arr,int num){
        boolean isExists = false;
        if(arr == null)
            return false;

        int r = arr.length;//行数
        int c = arr[0].length;//列数

       int i = 0;
       int j = c-1;
        while (i<r-1&&j>=0){
            if(arr[i][j] == num){
                return true;
            }
            else if(arr[i][j]>num){
                j--;
            }
            else {
                i++;
            }
        }
        return isExists;
    }
}
