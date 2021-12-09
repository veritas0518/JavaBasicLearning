package com.javaBase.day16.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:23 2021/7/4
 */

public class Person {
    String name;
    int age;
    int id=1001;

    public Person()
    {
        System.out.println("我无处不在");
    }

    public Person(String name){
        this.name =name;
    }

    public Person(String name,int age){
        this(name);  //调用上面的构造器
        this.age=age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}
