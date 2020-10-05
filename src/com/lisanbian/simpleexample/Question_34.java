package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;

import javax.print.attribute.standard.NumberUp;
import java.util.Stack;

/**
 * 二叉树中和为某一值的路径
 */
public class Question_34 {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        BinaryTreeNode node1 = new BinaryTreeNode(5);
        BinaryTreeNode node2 = new BinaryTreeNode(4);
        BinaryTreeNode node3 = new BinaryTreeNode(7);
        BinaryTreeNode node4 = new BinaryTreeNode(12);
        root.setLchildNode(node1);
        root.setRchildNode(node4);
        node1.setLchildNode(node2);
        node1.setRchildNode(node3);
        findPath(root, 22);
    }

    public static void findPath(BinaryTreeNode root,int num){
        if(root == null)
            return;
        int currentSum = 0;

        Stack<Integer> stack = new Stack<>();
        findPath(root,stack,currentSum,num);

    }

    public static void findPath(BinaryTreeNode root,Stack<Integer> stack,int currentSum,int sum){
        currentSum+=root.getData();
        stack.push(root.getData());
        if(root.getRchildNode()==null&&root.getRchildNode()==null){
            if(currentSum==sum){
                System.out.println("找到路径：");
                for (Integer i:stack){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        if(root.getLchildNode()!=null){
            findPath(root.getLchildNode(),stack,currentSum,sum);
        }
        if ((root.getRchildNode()!=null)){
            findPath(root.getRchildNode(),stack,currentSum,sum);
        }
        stack.pop();
    }

}
