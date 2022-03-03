package com.javaSenior.reflection;

/**
 * @ClassName: Test04
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/15 23:06
 **/

public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}

class A {

    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    static int m = 100;

    public A() {
        System.out.println("A类的无参构造初始化");
    }

}