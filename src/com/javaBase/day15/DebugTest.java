package com.javaBase.day15;

/**
 * @Descripton:  Debug的使用以及断点的设置
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:16 2021/7/3
 */
public class DebugTest {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println("i = " + i + ", j = " + j);
        DebugTest test = new DebugTest();
        int max = test.getMax(i, j);
        System.out.println("max = " + max);
    }

    private int getMax(int k, int m) {
        int max = 0;
        if (k < m) {
            max = k;
        } else {
            max = m;
        }
        return max;
    }
}