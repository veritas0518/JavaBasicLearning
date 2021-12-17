package com.javaBase.day18;

/**
 * @Descripton:  Object类的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:38 2021/7/6
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order =new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}
class Order{

}
