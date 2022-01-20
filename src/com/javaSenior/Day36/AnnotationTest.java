package com.javaSenior.Day36;

/**
 * @ClassName: AnnotationTest
 * @Description: 注解的使用
 * @Author: TianXing.Xue
 * @Date: 2021/8/1 15:42
 * @Version: 1.0
 *
 *  1.理解Annotation:
 *  ① jkd 5.0中新增的
 *
 *  ②Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并
 *  程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息
 *
 *  2.Annotation的使用实例
 *  示例一：生成文档相关的注解
 *  示例二：在编译时进行格式检查(JDK内置的三个基本注解)
 * @Override：限定重写弗雷方法
 * @SuppressWarning:抑制编译器警告
 * @deprecated :已过时
 *
 *  3.如何自定义注解：参照SuppressWarning定义
 *      ①注解声明为：@interface
 *      ②内部定义成员，通常使用value表示
 *      ③可以指定成员的默认值，使用default定义
 *      ④如果自定义的注解没有成员，表明是一个标识作用。
 *
 *      如果注解有成员，在使用注解时，需要指明成员的值。
 *      自定义注解必须配上注解的信息处理流程(使用反射)才有意义
 *
 *  4.jdk 提供的4中元注解
 *    元注解：对现有的注解进行解释说明的注解
 *   Retention：指定所修饰的Annotation的生命周期：SOURCE\CLASS (默认行为)
 *   Target
 *   Inherited
 *   Documented
 *
 *  5.通过反射获取注解信息
 *
 *  6.jdk 8 中注解的新特性：可重复注解、类型注解
 *    可重复注解 ①在MyAnnotation上声明@Repeatable,成员值为MyAnnotations.class
 *             ②MyAnnotation的Target和
 **/

public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Person();

    }
}

@MyAnnotations()
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface info{
    void show();
}
class Student extends Person implements info{
    public void walk(){
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}