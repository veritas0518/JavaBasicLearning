package com.javaBase.day09;

public class Exer3Test {
    public static void main(String[] args) {
        exer e1 = new exer();
        //e1.method();
        System.out.println("矩形的面积为：" + e1.method(5, 6));
    }
}

class exer {
    public int method(int m, int n) {

//        Scanner scan =new Scanner(System.in);
//        System.out.println("请输入矩形的长：");
//        int m =scan.nextInt();
//        System.out.println("请输入矩形的宽：");
//        int n=  scan.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}