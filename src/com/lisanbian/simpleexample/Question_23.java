package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * 链表中环的入口节点
 */
public class Question_23 {

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
        node4.setNext(node2);

        if(entryNodeOfLoop(head)==null)
            System.out.println("链表中不存在环");
        else
            System.out.println("链表中存在环,起始节点的值为："+entryNodeOfLoop(head).getData());
    }

    public static Node entryNodeOfLoop(Node head){
        if(head == null)
            return null;

        Set<Object> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }

        return null;

    }
}
