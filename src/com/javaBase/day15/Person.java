package com.javaBase.day15;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:35 2021/7/3
 */
public class Person extends Creature {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
