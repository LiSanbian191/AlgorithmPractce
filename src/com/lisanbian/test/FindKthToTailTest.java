package com.lisanbian.test;

import com.lisanbian.datastructure.Node;
import com.lisanbian.simpleexample.FindKthToTail;

public class FindKthToTailTest {

    public static void  main(String[] args){
        Node head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        head.next.next.next = new Node(4);

        Node node = FindKthToTail.finfKthToTail(head,0);

        System.out.println(node);

    }


}
