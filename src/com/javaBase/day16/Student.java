package com.javaBase.day16;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:14 2021/7/4
 */
public class Student extends Person {

    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习的专业是：" + major);
    }

    //对父类中的eat方法进行重写
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

}
