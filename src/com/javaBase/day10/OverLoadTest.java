package com.javaBase.day10;

/**
 * @Descripton: 理解方法的重载
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:39 2021/6/28
 */
//public class OverLoadTest {
//    public static void main(String[] args) {
//        OverLoadTest test =new OverLoadTest();
//        test.getSum(1.1,2);
//    }
//    public void getSum(int i, int j) {
//        System.out.println("1");
//    }
//    public void getSum(double i, double j) {
//        System.out.println("2");
//    }
//    public void getSum(String s, int j) {
//        System.out.println("3");
//    }
//    public void getSum(int i, String s) {
//        System.out.println("4");
//    }
//}
public class OverLoadTest {
    public static void main(String[] args) {
        String arr ="hello";
        OverLoadTest test = new OverLoadTest();
        test.mOL(arr);
        test.mOL(2);
        test.mOL(4, 5);
        test.max(5, 6);
        test.max(6.7, 8.9);
        System.out.println("最大值为" + test.max(1.1, 2.2, 3.3));
    }

    public void mOL(int i) {
        System.out.println((int) Math.pow(i, 2));
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String arr) {
        System.out.println("字符串为" + arr);
    }

    public void max(int i, int j) {
        int max = 0;
        if (i > j) {
            max = i;
        } else {
            max = j;
        }
        System.out.println("最大值为" + max);
    }

    public void max(double i, double j) {
        double max = 0.0;
        if (i > j) {
            max = i;
        } else {
            max = j;
        }
        System.out.println("最大值为" + max);

    }

    public double max(double i, double j, double k) {

        double max = (i > j) ? i : j;
        return (max > k) ? max : k;


    }
}