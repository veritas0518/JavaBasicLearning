package com.javaBase.day21.evening;

/**
 * @Descripton: 类的成员之四：代码块（或初始化块）
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:53 2021/7/9
 *
 *    代码块的执行要先于构造器!!!
 *
 * 1.代码块的作用：初始化类、对象
 * 2.代码块如果有修饰的话，只能用static
 * 3.分类：静态代码块、非静态代码块
 * 4.静态代码块：
 *   >内部可以有输出语句
 *   >随着类的加载而执行,而且只执行一次
 *   >作用：初始化类的信息
 *   >如果一个类中定义了多个代码块，则按照声明的先后顺序执行
 *   >静态代码块的执行要优于非静态代码块的执行
 *   >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构（因为静态是一开始就出来的，非静态是后面造出来的，都还没造出来怎么调用）
 *
 * 5.非静态代码块
 *   >内部可以有输出语句
 *   >随着对象的创建而执行
 *   >没创建一个对象就执行一次非静态代码块
 *   >作用：可以再创建对象时，对对象的属性进行初始化
 *   >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 *   >非静态代码块内可以调用静态的属性、静态的方法，可以调用非静态的结构
 *
 *
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);
    }
}

class Person {
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //static代码块
    static {
        System.out.println("hello static block");
        desc = "我是一个爱学习的人";
    }

    //非static代码块
    {
        System.out.println("hello block");
        age = 1;
    }


    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info() {
        System.out.println("我是一个快乐的人");
    }
}
