package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下打印二叉树
 * 不分行，从上到下，同一层次从左到右打印输出
 */
public class Question_32 {

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(8);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        BinaryTreeNode node3 = new BinaryTreeNode(10);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(7);
        BinaryTreeNode node6 = new BinaryTreeNode(9);
        BinaryTreeNode node7 = new BinaryTreeNode(11);
        node1.setLchildNode(node2);
        node1.setRchildNode(node3);
        node2.setLchildNode(node4);
        node2.setRchildNode(node5);
        node3.setLchildNode(node6);
        node3.setRchildNode(node7);
        System.out.println("单行从上到下打印二叉树：");
        printTopToBottom(node1);
        System.out.println();
        System.out.println("分行从上到下打印二叉树：");
        printFromTopToBottomPlus(node1);
    }

    public static void printTopToBottom(BinaryTreeNode root){
        if(root == null)
            return;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTreeNode node = queue.poll();
            System.out.print(node.getData()+" ");
            if(node.getLchildNode()!=null)
                queue.add(node.getLchildNode());
            if(node.getRchildNode()!=null)
                queue.add(node.getRchildNode());
        }
    }

    public static void printFromTopToBottomPlus(BinaryTreeNode root){
        if(root==null)
            return;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        int toBePrinted = 1;//当前行要打印的节点数
        int nextLevel = 0;//下一行要打印的节点数

        while (!queue.isEmpty()){
            BinaryTreeNode node = queue.poll();
            System.out.print(node.getData()+" ");

            if(node.getLchildNode()!=null){
                queue.add(node.getLchildNode());
                nextLevel++;
            }
            if(node.getRchildNode()!=null){
                queue.add(node.getRchildNode());
                nextLevel++;
            }
            --toBePrinted;
            if(toBePrinted==0){
                System.out.println();
                toBePrinted = nextLevel;
                nextLevel = 0;
            }

        }

    }




}
