package com.javaBase.day12;

/**
 * @Descripton: this关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:13 2021/6/30
 * <p>
 * 在类的方法中，我们可以使用”this.属性“或”this.方法“的方式，调用当前对象属性或方法。但是通常情况下，我们省略”this.“
 * 特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用”this.变量“的方式，表明次变量式属性，而非形参
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(1);
        System.out.println(p1.getAge());
Person p2 =new Person("Jerry",20);
        System.out.println(p2.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        this.eat();
        String info = "hello world";
        System.out.println(info);
    }

    public Person(String name) {
        this();  //构造器的调用必须在首行
        this.name = name;
    }

    public Person(int age) {
        this();
        this.age = age;
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
    }

    public void setName(String name) {
        //所以就说明  前面这个是属性，后面这个是形参
        this.name = name; //this.  "."出来的不是属性就是方法
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;  //this 可以理解为当前对象的
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("人吃饭");
        sleep();  //这里其实是this.sleep();  只不过省略了this 而已
    }

    public void sleep() {
        System.out.println("人睡觉");
    }
}
