package com.javaBase.day20;

import java.util.Objects;

/**
 * @Descripton:  重写Person类来测试系自己重写的equals方法和我写的区别
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:28 2021/7/5
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("人，走路");
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person1 = (Person) o;
//        return age == person1.age && name.equals(person1.name);
//    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.age == p.age && this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
