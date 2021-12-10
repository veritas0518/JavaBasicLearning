package com.javaBase.day16.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:23 2021/7/4
 */
public class Student extends Person {
    String major;
    int id = 1002;

    public Student() {
    }

    public Student(String major) {
        super();  //默认有这个东西
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);  //这里指的是调用了父类中的name 和age 的构造器
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的东西");
    }

    public void study() {
        System.out.println("学生学习知识");
        eat();  //方法前面省略了this 关键字，那就表明调用的是重写过的子类中的这个方法
        super.eat();  //因为子类重写过eat方法了，要想调用父类的eat方法，就得在前面加上关键字super
        walk();  //因为walk没有被重写所以可以直接省略它前面的super关键字，调用的就直接是父类了
    }

    public void show() {
        System.out.println("name = " + name + ",age= " + age);
        System.out.println("id =" + id);  //现在调用的id 是子类自己写的已经覆盖过父类的id：1002
        System.out.println("id = " + super.id);  //现在调用的id是父类原来自己的id: 1001
    }
}
