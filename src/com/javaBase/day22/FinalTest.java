package com.javaBase.day22;

/**
 * @Descripton:  final关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:18 2021/7/10
 *
 *
 * 1.final可以用来修饰的结构：类、方法、变量
 *
 * 2.final用来修饰一个类：此类不能被其他类所继承
 *        比如：String类、System类、StringBuffer类
 *
 * 3.final用来修饰方法：表明此方法不能被重写
 *        比如：Object类中getClass()
 *
 * 4.final用来修饰一个变量：此时的“变量”就称为是一个常量
 *        final修饰属性：可以考虑赋值的位置有：1.显式初始化  2.代码块中初始化 3.构造器中初始化
 *        final修饰局部变量:
 *          尤其是使用final修饰形参时，表明此形参是一个常量，当我们调用此方法时，给常量形参赋一个实参，一旦赋值以后，就只能
 *          在方法体内使用此形参，但不能进行重新赋值
 *
 *   static final :用来修饰属性：全局常量
 *
 *
 */

public class FinalTest {
    final int WIDTH = 10;  //变成大写的快捷键是 Ctrl + shift +u
    final int LEFT;
    final int RIGHT;

    {
        LEFT = 1;
    }

    public FinalTest() {
        RIGHT = 2;
    }

    public FinalTest(int n) {
        RIGHT = n;
    }

    public void doWidth() {
        //  width=20;  //不能再赋值了
    }

    public void show() {
        final int NUM = 10;  //常量 ，习惯性的声明成大写
    }

    public void show(final int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;
        num = num + 5;
        FinalTest test = new FinalTest();
        test.show(10);
    }
}

final class FinalA {
}

class AA {
    public final void show() {
    }
}
