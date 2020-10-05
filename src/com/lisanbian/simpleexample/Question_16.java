package com.lisanbian.simpleexample;
/**
 * 数值的整数次方，不使用库函数进行乘方操作
 */
public class Question_16 {

    public static void main(String[] args) {
        System.out.println(powerWithExponent(2.0,3));
    }

    public static double powerWithExponent(double base,int exponent){
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;

        double result = powerWithExponent(base,exponent>>1);
        result*=result;
        if((exponent&0x1)==1)
            result*=base;

        return result;
    }
}
