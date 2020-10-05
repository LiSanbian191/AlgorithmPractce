package com.lisanbian.simpleexample;

import com.lisanbian.datastructure.BinaryTreeNode;
import com.lisanbian.datastructure.Node;

import java.util.Arrays;

/**
 * 重建二叉树
 * 输入前序和中序遍历的结果，重建二叉树
 */
public class Question_7 {

    public static void main(String[] args) {
        char[] preOrder = {1,2,4,8,5,3,6,7};
        char[] inOrder = {8,4,2,5,1,6,3,7};
        BinaryTreeNode root =   reConstructBinaryTree(preOrder,inOrder);
        postOrder(root);

    }

    public static BinaryTreeNode reConstructBinaryTree(char[] preOrder,char[] inOrder){
        if(preOrder.length==0||inOrder.length==0){
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
        for(int i = 0;i<inOrder.length;i++){
            if(preOrder[0]==inOrder[i]){
                root.setLchildNode(reConstructBinaryTree(Arrays.copyOfRange(preOrder,1,i+1),Arrays.copyOfRange(inOrder,0,i)));
                root.setRchildNode(reConstructBinaryTree(Arrays.copyOfRange(preOrder,i+1,preOrder.length),Arrays.copyOfRange(inOrder,i+1,inOrder.length)));

            }
        }
    return root;
    }

    public static void postOrder(BinaryTreeNode root){
        if(root!=null){
            postOrder(root.getLchildNode());
            postOrder(root.getRchildNode());
            System.out.println(root.getData());
        }
    }

}
