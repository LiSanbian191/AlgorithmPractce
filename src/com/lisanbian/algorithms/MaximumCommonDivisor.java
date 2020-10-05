package com.lisanbian.algorithms;
/**
 * 欧几里得算法求最大公约数
 */
public class MaximumCommonDivisor {

    public static void main(String[] args) {

        System.out.println("10与5的最大公约数为：");
        System.out.println(gcd(10,5));


        System.out.println("最大公约数：");
        System.out.println(gcd(2*3*4*5*6,3*4*5*7));
    }

    public static int gcd(int p,int q){
        if(q==0)
            return p;

        int r = p%q;
        return gcd(q,r);
    }

}
