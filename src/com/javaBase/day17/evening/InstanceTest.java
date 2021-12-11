package com.javaBase.day17.evening;

/**
 * @Descripton: 多态性联系
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:59 2021/7/5
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e) {
        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
        if (e instanceof Graduate) {
            System.out.println("a graduated student\na student\na person");
        } else if (e instanceof Student) {
            System.out.println("a student\na person");
        } else System.out.println("a person");
    }
}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }

}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school;
    }
}

class Graduate extends Student {
    protected String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age + "\nschool: " + school + "\nmajor: " + major;
    }
}

