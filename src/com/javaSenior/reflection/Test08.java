package com.javaSenior.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: Test08
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/16 20:56
 **/

//通过反射动态创建对象
public class Test08 {
    public static void main(String[] args) throws Exception{

        //获得Class对象
        Class clazz = Class.forName("com.javaSenior.reflection.User");

        //通过反射构造的一个对象
        //newInstance() 这个方法会调用User这个类的无参数构造方法，完成对象的创建
        User user = (User) clazz.getConstructor().newInstance(); //本质上是调用了类的无参构造器
        System.out.println(user);

        //通过构造器创建对象
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) declaredConstructor.newInstance("xtx", 001, 18); //通过有参构造方法
        System.out.println(user2);

        System.out.println("=============================");
        //通过反射调用普通方法
        User user3 = (User) clazz.getConstructor().newInstance();
        //通过反射获得一个方法
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        //invoke(给哪个对象,要激活的方法所传的值)：激活，执行的意思
        setName.invoke(user3,"leeds");
        System.out.println(user3.getName());

        System.out.println("=============================");
        //通过反射操作属性
        User user4 = (User) clazz.getConstructor().newInstance();
        Field name = clazz.getDeclaredField("name");

        //因为类中的这些属性都是private的，不能直接操作私有属性
        name.setAccessible(true); //必须关闭一个权限的安全监测，setAccessible(true)
        name.set(user4,"LEEDS");
        System.out.println(user4.getName());
    }
}
