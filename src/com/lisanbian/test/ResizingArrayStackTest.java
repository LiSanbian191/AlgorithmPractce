package com.lisanbian.test;

import com.lisanbian.algorithms.ResizingArrayStack;

public class ResizingArrayStackTest {
    public static void main(String[] args) {
        //测试扩容是否正常，及出栈顺序是否正确

        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        for(int i = 0;i<100;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
