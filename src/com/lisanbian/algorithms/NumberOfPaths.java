package com.lisanbian.algorithms;
/**
 * 设有一个机器人在m*n个网格间的大小移动，且每次只能向左或向右移动一个
 * 问，到网格最后一个有多少路径
 */

public class NumberOfPaths {

    public static void main(String[] args) {
        System.out.println(numberOfPaths(7,3));
    }


    public static int numberOfPaths(int m,int n){
        if(m<1||n<1)
            return 0;

        //存储每到一格的路径数
        int[][] paths = new int[m][n];

        //两条边都只有一条路径
        for(int i =0;i<m;i++)
            paths[i][0] = 1;
        for(int j = 0;j<n;j++)
            paths[0][j] = 1;


        for(int i =1;i<m;i++)
            for(int j = 1;j<n;j++)
                paths[i][j] = paths[i-1][j]+paths[i][j-1];

        return paths[m-1][n-1];

    }
}
