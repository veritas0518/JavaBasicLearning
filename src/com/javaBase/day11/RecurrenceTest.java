package com.javaBase.day11;

/**
 * @Descripton:  递归的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:54 2021/6/29
 */
public class RecurrenceTest {
    public static void main(String[] args) {
        RecurrenceTest fi = new RecurrenceTest();
        for (int i = 0; i < 10; i++) {
            System.out.print(fi.fibo(i) + " ");
        }
        System.out.println();
        System.out.println("阶乘的结果为："+fi.jiecheng(4));
    }

   public int jiecheng(int n){
        if(n==1){
            return 1;
        }else
            return n*jiecheng(n-1);
   }
    public int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else
            return fibo(n - 1) + fibo(n - 2);
    }
}
