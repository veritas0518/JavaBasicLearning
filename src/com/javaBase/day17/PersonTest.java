package com.javaBase.day17;

/**
 * @Descripton: 面向对象的特征之多态性
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:33 2021/7/5
 * <p>
 * <<总结：编译看左边，运行看右边>>
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        System.out.println("*********************************");
        //对象的多态性：父类的引用指向子类的对象
        //new 的对象至少是个子类

        Person p2 = new Man();
        //Person p3 =new Woman();
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 -- 虚拟方法调用
        p2.eat();  //调用时是看左边的，p2左边也就是Person父类，只能调父类的方法
        p2.walk();  //而执行的话执行的是右边的，也就是子类的
        System.out.println("**********************************");

        //有了对象的多态性以后，内存实际上是加载了子类特有的属性和方法的
        // 但是由于变量声明为父类类型，导致编译时，只能调用父类声明的属性和方法。子类特有的不能调用


        //向下转型:有风险，精度损失
        //可能会出现ClassCastException的异常
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        /**
         *  instanceof 关键字的使用：
         *  1.a instance of A :判断对象a是否是类A的实例，如果是，返回true;如果不是，返回false 。它是boolean类型的！
         *  2.为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true,就向下
         *  转型，如果返回false,不进行向下转型。
         *  3.如果 a instance of A 返回true,则a instance of B也返回true  (B是A的父类)
         */
        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("**********Woman***********");
        }

        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.earnMoney();
            System.out.println("***********MAN***********");
        }

        if (p2 instanceof Person) {
            System.out.println("*********Person*********");
        }

        if (p2 instanceof Object) {
            System.out.println("*********Object*********");
        }


    }
}
