package com.javaSenior.reflection;

import java.lang.annotation.ElementType;

/**
 * @ClassName: Test03
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/15 22:48
 **/

//所有类型的Class
public class Test03 {
    public static void main(String[] args) {
        Class<Object> clazz1 = Object.class; //类
        Class<Comparable> clazz2 = Comparable.class; //接口
        Class<String[]> clazz3 = String[].class; //数组
        Class<int[][]> clazz4 = int[][].class; //二维数组
        Class<Override> clazz5 = Override.class; //注解
        Class<ElementType> clazz6 = ElementType.class; //枚举类
        Class<Integer> clazz7 = Integer.class; //基本数据类型
        Class<Void> clazz8 = void.class; //void
        Class<Class> clazz9 = Class.class; //Class
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println(clazz4);
        System.out.println(clazz5);
        System.out.println(clazz6);
        System.out.println(clazz7);
        System.out.println(clazz8);
        System.out.println(clazz9);

        //只要元素类型与维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }

}
