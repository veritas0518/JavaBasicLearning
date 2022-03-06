package com.javaSenior.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @ClassName: Test11
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/17 10:09
 **/

//练习反射操作注解
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("com.javaSenior.reflection.Student2");
        //通过反射获得注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值
        TableXtx tableXtx = (TableXtx) clazz.getAnnotation(TableXtx.class);
        String value = tableXtx.value();
        System.out.println(value);

        //获得类指定的注解
        Field field = clazz.getDeclaredField("name");
        FieldXtx annotation = field.getAnnotation(FieldXtx.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@TableXtx("db_student")
class Student2 {
    @FieldXtx(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldXtx(columnName = "db_age", type = "int", length = 10)
    private int age;
    @FieldXtx(columnName = "db_name", type = "varchar", length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//@target：注解作用域
@Target(ElementType.TYPE)
//@Retention()：在什么级别获取
@Retention(RetentionPolicy.RUNTIME)
@interface TableXtx {  //类名的注解
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldXtx {
    String columnName();

    String type();

    int length();
}
