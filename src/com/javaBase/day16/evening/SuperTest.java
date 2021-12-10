package com.javaBase.day16.evening;

/**
 * @Descripton: super关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:23 2021/7/4
 */
public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        System.out.println();
        s.study();
        System.out.println("下面显示的是super关键字的使用");
        Student s1 =new Student("Tom",21,"IT");
        s1.show();

        System.out.println("***************");
        Student s2 =new Student();
    }
}

