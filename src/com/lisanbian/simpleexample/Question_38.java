package com.lisanbian.simpleexample;
/**
 * 字符串的排列
 */
public class Question_38 {

    public static void main(String[] args) {
        printStringArray("abc");

    }
    public static void printStringArray(String s){
        if(s==null||s=="")
            return;
        char[] chars = s.toCharArray();
        printStringArray( chars,0);

    }

    public static void printStringArray(char[] chars,int i){
        if(chars == null||i>=chars.length)
            return;

        if(i==chars.length-1){
            System.out.println(String.valueOf(chars));
        }else {
            for(int j = i;j<chars.length;j++){
                char tmp = chars[j];
                chars[j] = chars[i];
                chars[i] = tmp;

                printStringArray(chars,i+1);

                //将元素复位，不影响下一次排列
                tmp = chars[j];
                chars[j] = chars[i];
                chars[i] = tmp;
            }
        }
    }
}
