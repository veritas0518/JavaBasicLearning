package com.javaBase.day17;

import java.util.Scanner;

/**
 * @Descripton:  辗转相减法求最大公因数和最小公倍数
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 15:40 2021/7/5
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();

        while(true) {
            if (a > b) {
                a -= b;
                if(b>a){
                    System.out.println(a);
                }
            }if(b>a){
                b-=a;
                if(a>b){
                    System.out.println(b);
                }
            }
            if(a==b){
                System.out.println(a);
                break;
            }
        }


    }

}
