package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个链表的第一个公共节点
 */
public class Question_52 {

    public static void main(String[] args) {
        Node headA = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node headB = new Node(6);
        Node f = new Node(7);

        headA.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        headB.next  = f;
        f.next  = d;

        System.out.println(findFirstCommonNode(headA,headB).data);

    }
    //建立一个集合，将第一个链表的节点加入，再遍历第二个链表，如果包含相同的就返回，即为第一个共同节点
    public static Node findFirstCommonNode(Node headA,Node headB){
        if(headA==null||headB==null)
            return null;

        Set<Node> set = new HashSet<>();
        Node tmp = headA;
        while (tmp!=null){
            set.add(tmp);
            tmp = tmp.next;
        }
        tmp = headB;
        while (tmp!=null){
            if(!set.add(tmp))
                return tmp;
            tmp=tmp.next;
        }
        return null;

    }

}
