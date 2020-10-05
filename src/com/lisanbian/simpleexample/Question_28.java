package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;

/**
 * 对称的二叉树
 * 比较二叉树的前序遍历序列和对称前序遍历序列来判断二叉是不是对称的
 */
public class Question_28 {

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(8);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        BinaryTreeNode node3 = new BinaryTreeNode(6);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(7);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        BinaryTreeNode node7 = new BinaryTreeNode(5);
        node1.setLchildNode(node2);
        node1.setRchildNode(node3);
        node2.setLchildNode(node4);
        node2.setRchildNode(node5);
        node3.setLchildNode(node6);
        node3.setRchildNode(node7);

        System.out.println(isSymmetrical(node1));
    }

    public static boolean isSymmetrical(BinaryTreeNode root){
        return isSymmetrical(root,root);
    }

    public static boolean isSymmetrical(BinaryTreeNode root1,BinaryTreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null)
            return false;

        if(root1.getData()!=root2.getData())
            return false;
        return isSymmetrical(root1.getRchildNode(),root2.getLchildNode())&&isSymmetrical(root1.getLchildNode(),root2.getRchildNode());
    }

}
