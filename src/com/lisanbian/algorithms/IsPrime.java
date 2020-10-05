package com.lisanbian.algorithms;
/**
 * 判断一个数是否是素数
 */
public class IsPrime {

    public static void main(String[] args) {

        for(int i =1 ;i<=100;i++){
            System.out.printf("第%d个数字：",i);
            System.out.println();
            System.out.println(isPrime(i));
            System.out.println(isPrimeBase(i));
        }
    }

    public static boolean isPrime(int num){
        if(num<2)
            return false;

        for(int i = 2;i*i<=num;i++)
            if(num%i==0)
                return false;
        return true;
    }

    public static boolean isPrimeBase(int num){
        if(num<2)
            return false;

        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
