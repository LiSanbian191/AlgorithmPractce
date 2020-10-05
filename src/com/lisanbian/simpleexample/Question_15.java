package com.lisanbian.simpleexample;
/**
 * 二进制1的个数
 */
public class Question_15 {

    public static void main(String[] args) {
        System.out.println(numberOf1(11));
    }

    public static int numberOf1(int n){
        int count = 0;
        while(n!=0){
            ++count;
            n=(n-1)&n;
        }
        return count;
    }
}
