package com.lisanbian.simpleexample;
/**
 * 把数字翻译成字符串
 */
public class Question_46 {

    public static void main(String[] args) {
        System.out.println(translateNum(13));
    }
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1];
            if((ch[i-2] =='1')||(ch[i-2] == '2' && ch[i-1] >= '0' && ch[i-1] <= '5')){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
