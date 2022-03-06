package com.javaSenior.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: Test09
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/16 21:23
 **/

public class Test09 {

    //普通方式调用
    public static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }

        long endTime =  System.currentTimeMillis();

        System.out.println("普通方式执行10亿次需要的时间"+(endTime-startTime)+"ms");
    }
    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class clazz1 = user.getClass();
        Method getName = clazz1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endTime =  System.currentTimeMillis();

        System.out.println("反射方式执行10亿次需要的时间"+(endTime-startTime)+"ms");
    }
    //关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class clazz1 = user.getClass();
        Method getName = clazz1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        getName.setAccessible(true);
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endTime =  System.currentTimeMillis();

        System.out.println("关闭检测反射方式执行10亿次需要的时间"+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();

    }

}
