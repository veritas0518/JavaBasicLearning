package com.javaBase.Day24;

/**
 * @Descripton:   接口的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:15 2021/7/11
 *
 * JDK7以前：只能定义全局常量和抽象方法
 *       >全局常量：public static final的. 但是书写时可以省略不写
 *       >抽象方法：public abstract
 *
 * JDK8:除了定义全局变量和抽象方法外，还可以定义静态方法、默认方法
 *
 * 面试题：抽象类与接口有哪些异同？
 *
 *
 */

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane pl1 =new Plane();
        pl1.fly();
    }
}

interface Flyable {
    public static final int MAX_SPEED = 7900;  //第一宇宙速度
    int MIN_SPEED = 1;  //省略了public static final

    public abstract void fly();

    void stop();//省略了 public  abstract
}

interface Attackable{
    void attack();

}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{}


class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//***********************************************
interface AA {
    void  method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}
