package com.javaBase.day15;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:39 2021/7/3
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();
        Student s1 = new Student();
        s1.major = "物联网";
        s1.study();
        s1.breathe();
        Creature c1 = new Creature();
        System.out.println(c1.toString());
    }
}
