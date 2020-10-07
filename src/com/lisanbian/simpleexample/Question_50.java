package com.lisanbian.simpleexample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 */
public class Question_50 {

    public static void main(String[] args) {
        System.out.println(firstNotRepeating("aasmsdfdfddfe"));
    }

    public static Character firstNotRepeating(String s){
        if(s == null||s=="")
            return null;

        int index= 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        while (index<s.length()){
            char c = s.charAt(index);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
            index++;
        }

        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            if(map.get(c)==1){
                return c;

            }
        }
        return null;

    }

}
