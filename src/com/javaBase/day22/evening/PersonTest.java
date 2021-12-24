package com.javaBase.day22.evening;

/**
 * @Descripton: 关于抽象类的匿名子类的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:03 2021/7/10
 */

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());// 匿名对象

        Worker worker = new Worker();
        method1(worker);  //非匿名的类非匿名的对象

        method1(new Worker());  //非匿名的类匿名的对象

        System.out.println("*******************");

        //创建了一个匿名子类的对象：p
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
        method1(p);
        System.out.println("**********************");

        //创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }
        });

    }

    public static void method1(Person p) {
        p.eat();
        p.walk();
    }

    public static void method(Student s) {
    }
}

class Worker extends Person {
    @Override
    public void eat() {

    }

}