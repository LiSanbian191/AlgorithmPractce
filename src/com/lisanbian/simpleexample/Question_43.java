package com.lisanbian.simpleexample;
/**
 * 1~n整数中1出现的次数
 */
public class Question_43 {

    public static void main(String[] args) {
        System.out.println(numberOfBetween1AndN(11));
    }

    public static Integer numberOfBetween1AndN(int n){
        if(n<=0)
            return null;
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum+=numberOf1(i);
        }
        return sum;
    }

    public static Integer numberOf1(int n){
        int sum = 0;
        while (n!=0){
            if(n%10==1)
                sum++;
            n/=10;
        }
        return sum;
    }
}
