package com.lisanbian.simpleexample;

import java.util.Stack;

/**
 * 栈的压入，弹出序列，给定入栈序列的数组，一个出栈序列的数组，判断是否合法
 */
public class Question_31 {

    public static void main(String[] args) {
        int[] pushOrder = {1, 2, 3, 4, 5};
        int[] popOrder = {4, 5, 3, 1, 2};
        int[] popOrder1 = {4, 5, 3, 2, 1};
        int[] popOrder2 = {5, 4, 3, 2, 1};


        System.out.println(isPopOrder(pushOrder,popOrder));
        System.out.println(isPopOrder(pushOrder,popOrder1));
        System.out.println(isPopOrder(pushOrder,popOrder2));
    }

    public static boolean isPopOrder(int[] arrPush,int[] arrPop ){

        boolean result = false;
        if(arrPush==null||arrPop==null)
            return result;
        if(arrPush.length!=arrPop.length)
            return result;

        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0;i<arrPush.length;i++){
            stack.push(arrPush[i]);
            while (!stack.isEmpty()&&stack.peek()==arrPop[j]){
                stack.pop();
                j++;
            }
        }

        if(stack.size()==0)
            result = true;
        return result;
    }
}
