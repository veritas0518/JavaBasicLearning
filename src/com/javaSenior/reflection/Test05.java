package com.javaSenior.reflection;

/**
 * @ClassName: Test06
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/16 18:48
 **/

//测试类什么时候会初始化
public class Test05 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用，如果父类没有被加载，就会自动加载父类
//        Son son = new Son();

        //反射也会产生主动引用
//        Class clazz = Class.forName("com.javaSenior.reflection.Son");

        //不会产生类的引用的方法：子类调用父类的一个静态变量或者是一个静态方法
//        System.out.println(Son.b);
//        Son[] array = new Son[5];
        System.out.println(Son.M);
    }
}

class Father {
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
