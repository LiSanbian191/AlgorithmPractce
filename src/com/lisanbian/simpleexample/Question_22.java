package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

import java.util.logging.Handler;

/**
 * 链表中倒数第K个节点
 */
public class Question_22 {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println(findKthTail(head,0).data);
    }
    public static Node findKthTail(Node head,int k){
        if(head==null||k<=0){
            System.out.println("参数有误");
            return null;
        }

        Node fastNode = head;
        Node slowNode = head;

        int i = 0;
        while (i<k-1){
            fastNode = fastNode.next;
            if(fastNode==null)
                return null;
            i++;
        }
        while (fastNode.next!=null){
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
        return slowNode;
        }

    }


