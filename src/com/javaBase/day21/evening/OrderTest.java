package com.javaBase.day21.evening;

/**
 * @Descripton: 属性赋值的先后顺序
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 21:34 2021/7/9
 *
 * 属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化/③在代码块中赋值(谁先写谁后写)
 * ④构造器中初始化
 * ⑤有了对象后，可以通过“对象.属性”或“对象.方法”来进行赋值
 *
 * 执行的先后顺序 1 --> 2/3 --> 4
 */
public class OrderTest {
    public static void main(String[] args) {
        OrderCompare order = new OrderCompare();
        System.out.println(order.orderId);
    }
}

class OrderCompare {

    {
        orderId = 4;
    }

    int orderId = 3;
}