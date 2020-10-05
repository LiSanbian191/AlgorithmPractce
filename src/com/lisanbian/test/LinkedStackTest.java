package com.lisanbian.test;

import com.lisanbian.algorithms.LinkedStack;
import com.lisanbian.datastructure.Node;

public class LinkedStackTest {

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        for (int i =0;i<=100;i++){
            stack.push(i);
        }
        System.out.println(stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
