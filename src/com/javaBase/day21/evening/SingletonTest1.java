package com.javaBase.day21.evening;

/**
 * @Descripton: 饿汉式单例设计模式
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:09 2021/7/9
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
    }

}

//饿汉式单例设计模式
class Bank {

    //1.私有化类的构造器
    //不能从外边造对象
    private Bank() {

    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态的方法返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}