package com.lisanbian.simpleexample;

import java.util.Arrays;

/**
 * 二叉搜索树的后序遍历序列
 * 输入一个数组，判断是否为一个二叉搜索树的后序遍历序列
 * 根据二叉搜索树的后续遍历性质，左子树都小于根节点，在序列得最左边，右子树都大于根节点，在左子树序列之后
 */
public class Question_33 {
    public static void main(String[] args) {
        int[] array = {6, 8, 7, 11, 14, 12, 10};
        boolean b = verifySequenceOfBST(array);
        System.out.println(b);
    }

    public static boolean verifySequenceOfBST(int[] sequence){
        boolean result = false;
        if(sequence==null||sequence.length<=0)
            return result;

        int root = sequence[sequence.length-1];//二叉搜索树得根节点

        //找到左子树的序列
        int i;
        for(i = 0 ;i<sequence.length-1;i++){
            if(sequence[i]>root)
                break;
        }

        //验证右子树的序列
        int j = i;
        for(;j<sequence.length-1;j++){
            if(sequence[j]<root)
                return false;
        }

        boolean left = true;
        if(i>0)
            left = verifySequenceOfBST(Arrays.copyOfRange(sequence,0,i-1));

        boolean right = true;
        if(j<sequence.length-1)
            right = verifySequenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));

        result = left&&result;
        return result;

    }
}
