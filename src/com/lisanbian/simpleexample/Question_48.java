package com.lisanbian.simpleexample;

import java.util.HashSet;

/**
 * 最长不含重复字符的子字符串,滑动窗口机制
 */
public class Question_48 {

    public static void main(String[] args) {
        String s = "absfsddawfdsavdsavddddddscd";
        System.out.println(longestSubStringWithoutDuplication(s));
    }

    public static int longestSubStringWithoutDuplication(String s){
        if(s==null||s=="")
            return -1;
        if(s.length()==1)
            return 1;

        HashSet<Character> hashSet = new HashSet<>();

        int maxLength = 0;
        int i = 0,j=0;
        char[] chars = s.toCharArray();

        while (j<chars.length){
            if(hashSet.contains(chars[j])){
                hashSet.remove(chars[i++]);
            }
            else {
                hashSet.add(chars[j++]);
            }

            maxLength = maxLength>(j-i)?maxLength:j-i;
        }
        return maxLength;
    }
}
