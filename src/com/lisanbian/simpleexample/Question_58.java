package com.lisanbian.simpleexample;
/**
 * 翻转字符串
 * 给定一个英文句子，翻转单词顺序，标点符号视为普通字符处理
 */
public class Question_58 {

    public static void main(String[] args) {
        String s = "I love Java!";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        if(s==null||s==" ")
            return s;

        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strings.length-1;i>=0;i--){
            if(!strings[i].equals(""))
                sb.append(strings[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
