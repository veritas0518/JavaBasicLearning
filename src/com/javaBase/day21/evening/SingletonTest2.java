package com.javaBase.day21.evening;

/**
 * @Descripton: 单例模式的懒汉式实现
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:17 2021/7/9
 *
 *
 * 区别饿汉式和懒汉式
 * 饿汉式：好处：饿汉式天然是线程安全的
 *       坏处：对象加载时间过长
 *
 * 懒汉式：好处：延迟对象的创建
 *       坏处：目前的写法，线程不安全   --> 到多线程再修改
 *
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

class Order {
    //1.私有化类的构造器
    private Order() {

    }

    //2.声明当前类的变量,没有初始化
    //4.此对象必须声明为static
    private static Order instance = null;

    //3.声明public、static的返回当前类的对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;

    }
}