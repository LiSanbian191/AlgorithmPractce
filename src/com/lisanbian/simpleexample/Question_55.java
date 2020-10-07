package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;

/**
 * 二叉树的深度
 */
public class Question_55 {
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

        System.out.println(treeDepth(root));
    }

    public static int treeDepth(BinaryTreeNode root){
        if(root==null)
            return 0;
        int left = treeDepth(root.getLchildNode());
        int right = treeDepth(root.getRchildNode());

        return left>right?left+1:right+1;


    }
}
