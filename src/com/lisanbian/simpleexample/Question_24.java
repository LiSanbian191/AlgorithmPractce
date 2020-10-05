package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

/**
 * 链表反转
 */
public class Question_24 {

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

        System.out.println("翻转前的链表顺序：1，2，3，4，5");

        Node newHead = reverseOfLinkedList(head);
        while (newHead!=null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }

    }

    public static Node reverseOfLinkedList(Node head){
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        Node newHead = new Node();
        Node nextNode = head;//指向下一个要翻转的节点
        while (head!=null){
            nextNode = head.next;
            head.next = newHead.next;
            newHead = head;
            head = nextNode;
        }
        return newHead;

    }
}
