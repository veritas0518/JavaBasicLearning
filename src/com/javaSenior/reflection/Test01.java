package com.javaSenior.reflection;

/**
 * @ClassName: Test01
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/15 22:07
 **/

//什么叫反射
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        /* Class.forName("类的全类名")
            1.forName()：这是一个静态方法
            2.方法的参数是一个字符串
            3.字符串需要的是一个完整类名
            4.必须带有包名

         */
        Class clazz = Class.forName("com.javaSenior.reflection.User");
        System.out.println(clazz); //class com.javaSenior.reflection.User

        Class clazz1 = Class.forName("com.javaSenior.reflection.User");
        Class clazz2 = Class.forName("com.javaSenior.reflection.User");
        Class clazz3 = Class.forName("com.javaSenior.reflection.User");

        //**在内存中，一个类只有一个class对象**
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(clazz.hashCode());
        System.out.println(clazz1.hashCode());
        System.out.println(clazz2.hashCode());
        System.out.println(clazz3.hashCode());
    }
}

class User {
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}