package com.javaBase.day18;

/**
 * @Descripton: ==和equals的区别
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:07 2021/7/6
 * <p>
 * "=="在对于引用数据变量比较的是两个变量的地址值是否相等
 * <p>
 * equals()方法的使用：
 * 1.是一个方法,而非运算符
 * 2.只能用于引用数据类型
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        double j = 10.0;
        System.out.println("***********基本数据类型比较***********");
        System.out.println(i == j);  //会自动类型提升，所以输出true

        char c = 10;
        System.out.println(i == c);  //char型的10就是对应的数字10 ，输出还是true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);  //true

        System.out.println("************引用数据类型比较***********");

        Customer customer = new Customer("Tom", 21);

        Customer customer1 = new Customer("Tom", 21);
        System.out.println(customer == customer1);  //false

        String str1 = new String("hello world");
        String str2 = new String("hello world");
        System.out.println(str1 == str2);  //false 引用数据类型 == 比较的是地址值
        System.out.println("***********************************");
        System.out.println(customer.equals(customer1));  //false (重写后) --> true
        System.out.println(str1.equals(str2));  //true


    }
}
