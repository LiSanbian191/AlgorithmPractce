package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class Question_6 {


    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("使用栈实现：");
        printListFromTail(head);
        System.out.println("使用递归实现：");
        printListFromTailPlus(head);
    }

    //使用递归实现
    public static void printListFromTailPlus(Node head){
        if(head!=null){
            if(head.next!=null){
                printListFromTailPlus(head.next);
            }
            System.out.println(head.data);
        }

    }


    //使用栈实现
    public static void printListFromTail(Node head){
        if(head==null){
            System.out.println("头节点为空");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node node = head;
        while (node!=null){
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }

}
