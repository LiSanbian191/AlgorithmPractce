package com.lisanbian.algorithms;
/**
 * 计算平方根,牛顿迭代法
 */
public class NewtonSqrt {

    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            System.out.printf("%d的平方根：",i);
            System.out.println(sqrt(i));
        }
    }

    public static double sqrt(double num){
        if(num<0)
            return Double.NaN;
        double err = 1e-15;
        double t=num;
        while(Math.abs(t-num/t)>err*t) {
            t=(num/t+t)/2.0;
        }
        return t;


    }
}
