package com.javaBase.day20;

import org.junit.Test;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:42 2021/7/8
 */
public class ReviewTest {

    //关于toString()方法
    @Test
    public void test3() {
        String s = "abc";
        System.out.println(s);
        System.out.println(s.toString());
    }

    //手动写的和自动生成的equals()的区别
    @Test
    public void test2() {
        Person p1 = new Person("Tom", 12);
        Man m1 = new Man("Tom", 12);
        System.out.println(p1.equals(m1));
    }

    //数组也作为Object类的子类出现，可以调用Object类中声明的方法
    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3};
        print(arr.getClass().getSuperclass());

    }

    public void print(Object obj) {
        System.out.println(obj);
    }
}
