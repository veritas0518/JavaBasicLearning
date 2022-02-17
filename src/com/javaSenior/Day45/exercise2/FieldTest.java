package com.javaSenior.Day45.exercise2;

import com.javaSenior.Day45.exercise1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName: FieldTest
 * @Description: 获取当前运行时类的属性结构
 * @Author: TianXing.Xue
 * @Date: 2021/8/10 11:51
 **/

public class FieldTest {

    @Test
    public void test1() {

        Class clazz = Person.class;

        //获取属性结构
        //getFields()：获取当前运行时类及其父类中声明为public访问权限得到属性
        Field[] field = clazz.getFields();
        for (Field f : field) {
            System.out.println(f);
        }

        System.out.println();

        //getDeclaredFields()：获取当前运行时类中声明的所有属性，跟权限没有关系。（不包含父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    //权限修饰符 数据类型 变量名
    @Test
    public void test2() {
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {

            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers) + "\t");

            //2.数据类型
            Class type = f.getType();
            System.out.println(type.getName() + "\t");

            //3.变量名
            String fName = f.getName();
            System.out.println(fName);

            System.out.println(f);
        }
    }
}