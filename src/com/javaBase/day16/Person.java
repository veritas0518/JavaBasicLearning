package com.javaBase.day16;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:14 2021/7/4
 */
public class Person {
    String name;
    int age;

    public Person() {

    }

    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk(int distance) {
        System.out.println("走路，走的距离是：" + distance + "公里");
    }
}
