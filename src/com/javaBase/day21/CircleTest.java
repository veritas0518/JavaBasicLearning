package com.javaBase.day21;


/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:29 2021/7/9
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("c1的id是：" + c1.getId());
        System.out.println("c2的id是：" + c2.getId());
        System.out.println("c3的id是：" + c2.getId());

        System.out.println("创建的圆的个数为："+Circle.getTotal());
    }

}

class Circle {
    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }
public Circle(double radius){
    this();
        this.radius =radius;

}
    private static int total;  //记录创建圆的个数
    private static int init = 1001;  //static所申明的属性被所有对象所共享

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
