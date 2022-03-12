package com.dataStructures.sparseArray;

/**
 * @ClassName: SparseArray
 * @Description: 稀疏数组和二维数组之间的转换（五子棋）
 * @Author: TianXing.Xue
 * @Date: 2022/1/11 20:03
 **/

public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组 11 * 11
        //0:表示没有棋子，1表示黑子，2表示蓝子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;

        //输出原始二维数组
        System.out.println("原始的二维数组：");
        for (int[] row : chessArr1) { //二维数组是由众多一位数组组成的，所以增强for循环里要用一位数组
            for (int data : row) { //每个一位数组是由众多元素组成的
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //将二维数组转稀疏数组的思想
        //1.先遍历二维数组，得到非零数据的个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }

        //2.创建对应的稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //遍历二维数组，将非零的值存放到稀疏数组中去
        int count = 0; //count用于记录是第几个非零数据
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                }
            }
        }

        //输出稀疏数组的形式
        System.out.println();
        System.out.println("得到的稀疏数组为：");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
        }
        System.out.println();

        //将稀疏数组恢复成原始的二维数组
        int[][] chessArr2 = new int[sparseArray[0][0]][sparseArray[0][1]];

        //输出恢复后的二维数组
        for (int i = 1; i < sparseArray.length; i++) {
            chessArr2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        for (int[] arr : chessArr2) {
            for (int data : arr) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
