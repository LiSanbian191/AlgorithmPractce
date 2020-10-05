package com.lisanbian.simpleexample;
/**
 * 将字符串中的空格替换为“%20”
 */

public class Question_5 {

    public static void main(String[] args) {
        String s = "What is up!";
        System.out.println(stringReplace(s));
        String s1 = " ";
        System.out.println(stringReplace(s1));

        String s3 = " 2q23r fqef qfeqe qwefqq31 fqfqe ";
        System.out.println(stringReplace(s3));
    }

    public static String stringReplace(String s){
        if(s==null||s=="")
            return null;
        String result = null;

        //将字符串转为字符数组，统计空格个数
        char[] chars = s.toCharArray();
        int count = 0;//记录空格数量
        for(int i = 0;i<chars.length;i++ ){
            if(chars[i] ==' ')
                count++;
        }
        if(count==0)
            return s;

        //新建字符数组，填充%20
        char[] resultChars = new char[chars.length + 2 * count];
        int i = chars.length-1;
        int j = resultChars.length-1;
        while (i>=0){
            if(chars[i]==' '){
                resultChars[j] = '0';
                resultChars[j-1] = '2';
                resultChars[j-2] = '%';
                j=j-3;
            }else {
                resultChars[j] = chars[i];
                j--;
            }
            i--;
        }

        result = new String(resultChars);
        return result;
    }

}
