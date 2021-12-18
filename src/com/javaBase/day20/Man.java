package com.javaBase.day20;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:29 2021/7/5
 */
public class Man extends Person {
    public Man(String name, int age) {
        super(name, age);
    }

    public void earnMoney() {
        System.out.println("男人负责挣钱养家");
    }

    public void eat() {
        System.out.println("男人多吃肉");
    }

    public void walk() {
        System.out.println("男人多走路");
    }
}
