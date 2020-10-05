package com.lisanbian.simpleexample;

import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class Question_30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        minStack.push(5);
        minStack.push(4);
        minStack.push(0);
        System.out.println("此时栈中最小的元素是：");
        System.out.println(minStack.getMin());
        System.out.println("弹出一个栈顶元素："+minStack.pop());
        System.out.println("当前栈的最小元素：");
        System.out.println(minStack.getMin());
    }

}

class MinStack{
    private Stack<Integer> stack,minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer num){
        stack.push(num);
        if(minStack.size()==0||num<minStack.peek())
            minStack.push(num);
        else
            minStack.push(minStack.peek());

    }

    public Integer pop(){
        if(stack.size()==0)
            return null;
        else {
            minStack.pop();
        }
        return stack.pop();

    }

    public Integer getMin(){
        return minStack.peek();
    }





}
