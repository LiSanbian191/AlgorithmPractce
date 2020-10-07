package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;
import com.lisanbian.datastructure.Node;

/**
 * 二叉搜索树第K大节点
 * 二叉搜索树的中序遍历是有序的，中序遍历的逆序的第k个节点即是第K大节点
 */

public class Question_54 {
    int j;
    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(8);
        BinaryTreeNode a = new BinaryTreeNode(6);
        BinaryTreeNode b = new BinaryTreeNode(10);
        BinaryTreeNode c = new BinaryTreeNode(4);
        BinaryTreeNode d = new BinaryTreeNode(7);
        BinaryTreeNode e = new BinaryTreeNode(9);
        BinaryTreeNode f = new BinaryTreeNode(11);
        BinaryTreeNode g = new BinaryTreeNode(3);
        BinaryTreeNode h = new BinaryTreeNode(5);

        root.setLchildNode(a);
        root.setRchildNode(b);
        a.setLchildNode(c);
        a.setRchildNode(d);
        b.setLchildNode(e);
        b.setRchildNode(f);
        c.setLchildNode(g);
        c.setRchildNode(h);

        Question_54 question_54 = new Question_54();

        BinaryTreeNode kthNode = question_54.findKthNode(root, 3);
        System.out.println(kthNode.getData());
    }

    public  BinaryTreeNode findKthNode(BinaryTreeNode root,int k){
        if(root == null||k<1)
            return null;
        return KThNodeCore(root,k);
    }

    public  BinaryTreeNode KThNodeCore(BinaryTreeNode root,int k){
        BinaryTreeNode target = null;
        j=k;
        if(root.getRchildNode()!=null)
            target = KThNodeCore(root.getRchildNode(),j);
        if(target == null){
            if(j==1){
                target = root;
                return target ;
            }

            j--;
        }
        if(target==null&&root.getLchildNode()!=null)
            target = KThNodeCore(root.getLchildNode(),j);

        return target;

    }
}
