package com.javaBase.day11;

/**
 * @Descripton:  数组的转置
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:21 2021/6/29
 */
public class ArrayReverse {
    public static void main(String[] args) {
    int[][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int[][]b=new int[3][3];
    reverse r1 =new reverse();
    b=r1.rev(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class reverse{
    public int[][] rev(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                int temp =arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
}
