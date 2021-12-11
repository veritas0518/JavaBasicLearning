package com.javaBase.day16;

/**
 * @Descripton: 方法的重写
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:18 2021/7/4
 *
 * 1.面试题：区分方法的重载与重写
 *
 * 父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类型或者是A类的子类  （注意是引用类型！）
 * 父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值必须是相同的基本数据类型
 */
public class PersonStudentTest {
    public static void main(String[] args) {
        Student s = new Student("计算机科学与技术");
        s.eat();
        s.walk(10);
        Person p1 = new Person();
        p1.eat();


    }
}
