package com.javaBase.day18.evening;

/**
 * @Descripton: 判断两个Circle的各种属性是否相等（用重写的方式）
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:44 2021/7/6
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle("white", 2.0, 2.1);
        System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等：" + circle1.equals(circle2));
        System.out.println(circle1);
        System.out.println(circle2.toString());
    }
}
