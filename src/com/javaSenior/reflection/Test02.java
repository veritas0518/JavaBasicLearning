package com.javaSenior.reflection;

/**
 * @ClassName: Test02
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/11/15 22:34
 **/

//测试Class类的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.name);

        //方式一：通过对象获得( 对象.getClass() )
        Class clazz = person.getClass();
        System.out.println(clazz);

        //方式二：forName()：这个方法的执行会导致：类加载，类加载了，那么静态代码块，静态方法也会随着类的执行而执行
        Class clazz1 = Class.forName("com.javaSenior.reflection.Student");
        System.out.println(clazz1);

        //方式三：通过类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //方式四：基本内置类型的包装类都有一个Type类型
        Class clazz3 = Integer.TYPE;
        System.out.println(clazz3);

        //获得父类的类型
        Class superclass = clazz1.getSuperclass();
        System.out.println(superclass);


        System.out.println(clazz.hashCode());
        System.out.println(clazz1.hashCode());
        System.out.println(clazz2.hashCode());
        System.out.println(clazz3.hashCode());
    }
}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class   Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
