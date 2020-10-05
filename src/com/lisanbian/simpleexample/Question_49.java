package com.lisanbian.simpleexample;
/**
 * 丑数
 * 只包含因子2，3和5的数称为丑数
 * 习惯上把1当作第一个丑数
 */
public class Question_49 {

    public static void main(String[] args) {
        System.out.println(getUglyNumber(1500));
    }

    public static int getUglyNumber(int num){
        if(num==0)
            return 0;

        int count = 0;
        int number = 0;
        while (count<num){
            ++number;
            if (isUgly(number)){
                ++count;
            }
        }
        return number;
    }

    public static boolean isUgly(int num){
        while (num%2==0)
            num/=2;
        while (num%3==0)
            num/=3;
        while (num%5==0)
            num/=5;
        return (num==1)?true:false;
    }



}
