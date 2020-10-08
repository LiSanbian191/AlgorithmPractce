package com.lisanbian.simpleexample;

import com.lisanbian.utils.RandArray;

/**
 * n个骰子的点数
 */

public class Question_60 {
    public static void main(String[] args) {
        double[] doubles = twoSum(2);
        for(double d : doubles)
            System.out.print(d+" ");
    }
    public static double[] twoSum(int n) {
        int[][] dp = new int [n + 1][6 * n + 1];//i个骰子点数总和为s的出现的次数
        for(int s = 1;s <= 6;s++)
            dp[1][s] = 1;
        for(int i = 2;i <= n;i++){//骰子的数量
            for(int s = i;s <= 6 * i;s++){//i个骰子点数之和
                for(int d = 1;d <= 6;d++){//当前骰子的点数
                    if(s < d + i - 1)
                        break;//如果点数之和小于(当前点数 + 前i-1个骰子的最小和),不存在该情况
                    dp[i][s] = dp[i][s] + dp[i - 1][s - d];//dp[i-1][s-d]即对应i个骰子取到s，最后一个骰子为d的情况
                }
            }
        }
        double[] tmp = new double[5 * n + 1];
        for(int i = n;i <= 6 * n;i++){
            tmp[i - n] = dp[n][i] / Math.pow(6,n);
        }
        return tmp;
    }


}
