package com.lisanbian.simpleexample;
/**
 *简单问题要考虑周全
 * 比如边界值，错误处理，索引越界等信息
 */
public class StringToInt {


    public static void main(String[] args) {
        System.out.println(strToInt("24325"));

        System.out.println(strToInt("adfarea423354897rwe"));

        System.out.println(strToInt(""));

        System.out.println(strToInt("21474836471"));

        System.out.println(strToInt("12324137508591580925708507352135013"));


        System.out.println(Integer.MAX_VALUE);
    }

    public static int strToInt(String str){


        if(str == null)
            return -1;
        else if(str=="")
            return -1;

        int num = 0;
        int i = 0;
        while (i<str.length()&&num<=Integer.MAX_VALUE){
            char c = str.charAt(i);
            if(c>='0'&&c<='9')
            num = num*10+(c-'0');

            i++;
        }
        return num;
    }
}
