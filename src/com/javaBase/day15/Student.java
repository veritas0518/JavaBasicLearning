package com.javaBase.day15;

/**
 * @Descripton: 继承父类 Person
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:36 2021/7/3
 */
public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name = " + name + "age= " + age);
    }
}
