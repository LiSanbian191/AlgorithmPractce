package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

/**
 * 删除链表的节点，在O(1)的时间里删除一个给定的节点
 */


public class Question_18 {

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

        System.out.println("删除前：");
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        deleteNode(head,node3);
        System.out.println("删除后：");
        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }


    }
    public static void deleteNode(Node head,Node toBeDelete){
        if(head==null||toBeDelete==null)
            return;
        Node tmp = head;
        if(toBeDelete.next==null){
            while (tmp.next!=toBeDelete){
                tmp = tmp.next;
            }
            tmp.next =null;
        } else if(toBeDelete==head){
            head=head.next;
        }else {
            toBeDelete.setData(toBeDelete.next.getData());
            toBeDelete.setNext(toBeDelete.next.getNext());
        }



    }

}
