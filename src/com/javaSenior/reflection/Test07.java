package com.javaSenior.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @ClassName: Test07
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/16 20:23
 **/

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class clazz = Class.forName("com.javaSenior.reflection.User");

        User user = new User();
        //通过反射获得它的类名和包名
        clazz = user.getClass();

        //获得类的名字
        System.out.println(clazz.getName()); //获得包名 + 类名
        System.out.println(clazz.getSimpleName()); //获得类名

        System.out.println("===============================");
        //获得类的属性
        Field[] fields = clazz.getFields(); //只能找到public属性
//        Field f = fields[0];
        //取出这个Field它的名字
//        String fieldName = f.getName();
//        System.out.println("fieldName:" + fieldName);
        for (Field field : fields) {
            //获得属性的修饰符(包括static,final之类的)
            int modifiers = field.getModifiers();
            //Modifier.toString()：可以把数字转换成字符串
            String modifiersString = Modifier.toString(modifiers);
            System.out.println("modifiersString："+modifiersString);

            //获得属性的类型
            Class fieldType = field.getType();
            //获得类型的名字
            String fieldTypeName = fieldType.getName();
            String simpleName = fieldType.getSimpleName();
            System.out.println("对象的类型：" + fieldTypeName);
            System.out.println("对象的简单类型：" + simpleName);
            System.out.println(field);
        }

        fields = clazz.getDeclaredFields(); //找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        System.out.println("======================");
        //获得类的方法
        Method[] methods1 = clazz.getMethods(); //获得本类及其父类的全部public方法
        for (Method method : methods1) {
            System.out.println("正常的getMethods()：" + method);
        }
        System.out.println("*-******************");
        Method[] methods = clazz.getDeclaredMethods(); //获得本类的所有方法，包括私有的
        for (Method method : methods) {
            System.out.println("getDeclaredMethods：" + method);
        }

        System.out.println("======================");
        //获得指定的方法
        Method getName = clazz.getMethod("getName", null);
        Method setName = clazz.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("***************************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        //获得指定的构造器
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器：" + declaredConstructor);

    }
}
