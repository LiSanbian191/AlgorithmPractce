package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

/**
 * 合并两个有序的链表
 */
public class Question_25 {

    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);

        l1.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node l2 = new Node(2);
        Node nodeA = new Node(4);
        Node nodeB = new Node(6);
        Node nodeC = new Node(8);

        l2.next = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;

        Node head = mergeSortedLists(l1, l2);

        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }


    }

    public static Node mergeSortedLists(Node l1,Node l2){
        if(l1==null)
            return l2;
        if(l2 == null)
            return l1;

        Node head = new Node();
        Node tail = new Node();
            if(l1.data<l2.data){
                head = l1;
                l1 = l1.next;
            }
            else {
                head = l2;
                l2 = l2.next;
            }
            tail = head;

        while (l1!=null&&l2!=null){
            if(l1.data<l2.data){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        if(l1!=null)
            tail.next = l1;
        if(l2!=null)
            tail.next = l2;


        return head;

    }

}
