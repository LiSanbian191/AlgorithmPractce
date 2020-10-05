package com.lisanbian.simpleexample;
/**
 * 打印从1到最大的n位数
 */
public class Question_17 {
    public static void main(String[] args) {
        printNum(3);
    }

    private static void printNum(int n) {
        if (n < 0)
            return;
        int[] array = new int[n];
        printArray(array, 0);
    }

    private static void printArray(int[] array, int n) {

        if (n != array.length) {
            for (int i = 0; i < 10; i++) {
                array[n] = i;
                printArray(array, n + 1);
            }
        } else {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] != 0) {
                    flag = true;
                }
                if (flag) {
                    System.out.print(array[j]);
                }
            }
            // 去掉空白行
            if (flag) {
                System.out.println();
            }
        }
    }
}
