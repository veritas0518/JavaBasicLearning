package com.javaBase.day22.evening;

/**
 * @Descripton: abstract关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:08 2021/7/10
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象了，就不可实例化
//        Person p1 =new Person();
//        p1.eat();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(); //这就是抽象方法

    public void walk() {
        System.out.println("人走路");
    }


}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public void eat() {
        System.out.println("学生要多吃肉");
    }
}