package com.lisanbian.simpleexample;
/**
 * 求指定n的斐波那契数列，递归太耗空间与时间
 */
public class Question_10 {


    public static void main(String[] args) {
        System.out.println(fibonacci(10));

        System.out.println(fibonacciPlus(10));
    }

    public static long fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;

        long[] arr = new long[n];
        arr[0] = 0;
        arr[1] =1;

        for(int i = 2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

    public static long fibonacciPlus(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;

        long result = 0;
        long tmp1  = 0;
        long tmp2 = 1;
        for(int i = 2;i<n;i++){
            result = tmp1+tmp2;
            tmp1 = tmp2;
            tmp2 = result;
        }
        return result;
    }

}
