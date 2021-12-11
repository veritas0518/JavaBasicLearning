package com.javaBase.day16;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:58 2021/7/4
 */
public class orderTest {
    public static void main(String[] args) {
        Order order =new Order();

        //同一个包中的其他类，不可以调用private的属性和方法
        order.orderDefault=1;
        order.orderProtected=2;
        order.orderPublic=3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
