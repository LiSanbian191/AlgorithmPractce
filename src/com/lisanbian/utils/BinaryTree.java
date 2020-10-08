package com.lisanbian.utils;

import com.lisanbian.datastructure.BinaryTreeNode;

import java.util.Stack;

/**
 * 二叉树处理工具类
 */
public class BinaryTree {

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

        System.out.println("括号表示法输出：");
        printBTNode(root);
        System.out.println();
        System.out.println("先序递归遍历：");
        preOrder(root);
        System.out.println();
        System.out.println("先序非递归遍历：");
        preOrderWithoutRecursion(root);

        System.out.println("中序递归遍历：");
        inOrder(root);
        System.out.println();
        System.out.println("中序非递归遍历：");
        inOrderWithoutRecursion(root);
        System.out.println();

        System.out.println("后序递归遍历：");
        postOrder(root);
        System.out.println();
        System.out.println("后序非递归遍历：");
        postOrderWithoutRecursion(root);

    }

    /**
     * 根据括号表示法创建二叉树
     */
    public static BinaryTreeNode createBTNode(String s){
        return null;
    }


    /**
     * 括号表示法输出二叉树
     */
    public static void printBTNode(BinaryTreeNode root){
        if(root==null)
            return;

        System.out.print(root.getData()+" ");
        if(root.getLchildNode()!=null||root.getRchildNode()!=null){
            System.out.print("(");
            printBTNode(root.getLchildNode());
            if(root.getRchildNode()!=null)
                System.out.print(",");
            printBTNode(root.getRchildNode());
            System.out.print(")");
        }

    }

    /**
     * 先序遍历
     */
    public static void preOrder(BinaryTreeNode root){
        if(root==null)
            return;
        System.out.print(root.getData()+" ");
        preOrder(root.getLchildNode());
        preOrder(root.getRchildNode());

    }

    /**
     * 中序遍历
     */
    public static void inOrder(BinaryTreeNode root){
        if(root==null)
            return;
        inOrder(root.getLchildNode());
        System.out.print(root.getData()+" ");
        inOrder(root.getRchildNode());

    }
    /**
     * 后序遍历
     */
    public static void postOrder(BinaryTreeNode root){
        if(root==null)
            return;
        postOrder(root.getLchildNode());
        postOrder(root.getRchildNode());
        System.out.print(root.getData()+" ");
    }


    /**
     * 先序遍历非递归
     */
    public static void preOrderWithoutRecursion(BinaryTreeNode root){
        if(root==null)
            return;

        //使用栈辅助遍历
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode tmp;
        if(root!=null){
            stack.push(root);
            while (!stack.isEmpty()){
                tmp = stack.pop();
                System.out.print(tmp.getData()+" ");
                if(tmp.getRchildNode()!=null)
                    stack.push(tmp.getRchildNode());
                if(tmp.getLchildNode()!=null)
                    stack.push(tmp.getLchildNode());

            }
        }
        System.out.println();
    }
    /**
     * 中序遍历非递归
     */
    public static void inOrderWithoutRecursion(BinaryTreeNode root){
        if(root==null)
            return;
        BinaryTreeNode tmp;
        Stack<BinaryTreeNode> stack = new Stack<>();
        if (root != null) {
            tmp = root;
            while (!stack.isEmpty() || tmp != null) {

                while (tmp != null) {
                    stack.push(tmp);
                    tmp = tmp.getLchildNode();
                }
                if(!stack.isEmpty()){
                    tmp = stack.pop();
                    System.out.print(tmp.getData()+" ");
                    tmp = tmp.getRchildNode();
                }

            }
        }
        System.out.println();
    }

    public static void postOrderWithoutRecursion(BinaryTreeNode root){
        if(root==null)
            return;
        BinaryTreeNode tmp;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode assistant;
        boolean flag;
        if(root!=null){
            tmp = root;
            do{
                while (tmp!=null){
                    stack.push(tmp);
                    tmp = tmp.getLchildNode();
                }
                assistant = null;
                flag = true;
                while(!stack.isEmpty()&&flag){
                    tmp = stack.peek();
                    if(tmp.getRchildNode()==assistant){
                        System.out.print(tmp.getData()+" ");
                        assistant = tmp;
                        stack.pop();
                    }
                    else {
                        tmp = tmp.getRchildNode();
                        flag = false;
                    }
                }
        }while (!stack.isEmpty());
    }
        System.out.println();
    }
}
