package com.javaBase.Day24.Evening;

/**
 * 开发中局部内部类的使用
 *
 * 面试题：抽象类和接口的异同？
 *   相同点：不能实例化；都可以包含抽象方法
 *
 *   不同点：1.接口没有构造器（java7,java8,java9）
 *            抽象类可以定义属性、构造器、抽象下、方法
 *          2.类：单继承性    接口：多继承
 *            类与接口：多实现
 */
public class InnerClassTest1 {
    public void method() {
        class AA {

        }
    }

    public Comparable getComparable() {
        //创建了一个实现Comparable接口的类：局部内部类
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
