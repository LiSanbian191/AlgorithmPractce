package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.Node;

/**
 * 寻找链表倒数第K个节点
 */

public class FindKthToTail {


    public static Node finfKthToTail(Node head,int k){
        if(head ==null)
            return null;
        else if(k<=0)
            return null;

         Node nAhead = head;
         Node nBehind = head;

         int i = 0;
         while (i<k-1){
             nAhead = nAhead.next;
             if(nAhead==null)
                 return null;
             i++;
         }
         int j = 0;
         while (nAhead.next!=null){
             nAhead = nAhead.next;
             nBehind = nBehind.next;
             j++;
         }

        return (i+j)>=k?nBehind:null;

    }

}
