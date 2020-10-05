package com.lisanbian.simpleexample;
/**
 * 顺时针打印矩阵
 */
public class Question_29 {

    public static void main(String[] args) {
        int[][] a = create(5, 5);
        print(a);
        System.out.println("顺时针输出：");
        clockwisePrint(a, 0, 4);
    }


    public static void clockwisePrint(int[][] arr,int i,int j){
        if (j < i)
            return;
        if (j == i) {
            System.out.print(arr[i][j] + " ");
            return;
        }
        int y = i;
        while (y <= j) {
            System.out.print(arr[i][y] + " ");
            y++;
        }
        y = i + 1;
        while (y <= j) {
            System.out.print(arr[y][j] + " ");
            y++;
        }
        y = j - 1;
        while (y >= i) {
            System.out.print(arr[j][y] + " ");
            y--;
        }

        y = j - 1;
        while (y >= i + 1) {
            System.out.print(arr[y][i] + " ");
            y--;
        }
        clockwisePrint(arr, i + 1, j - 1);

    }
    private static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] create(int row, int line) {
        int[][] a = new int[row][line];
        int num = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                a[i][j] = num++;
            }
        }
        return a;
    }

}
