package com.javaBase.day20;

/**
 * @Descripton: static关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:41 2021/7/8
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "中国"; //可以通过"类.静态变量"的方式进行调用
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c2.nation = "USA";
        c2.eat();
        Chinese.show();
        System.out.println(c1.nation);

    }
}

class Chinese {
    String name;
    int age;
    static String nation;

    public void eat() {
        System.out.println("中国人喜欢吃中餐！");
        //调用非静态结构
        info();
        System.out.println("name: " + name);

        //调用非静态结构
        walk();
        System.out.println("nation: " + nation);
    }

    public static void show() {
        System.out.println("我是中国人");
        //不能调用非静态结构
        //eat(); 不能调非静态方法，生命周期不够
        //name ="Tom";  不能调属性，生命周期不够
        //可以调用静态的结构
        System.out.println(nation);
        walk();
    }

    public void info() {
        System.out.println("name: " + name + ",age" + age);
    }

    public static void walk() {
        System.out.println("走路");
    }

}
