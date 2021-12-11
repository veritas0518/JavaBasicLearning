package com.javaBase.day17;

/**
 * @Descripton:  多态性的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:45 2021/7/5
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test =new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物，进食");
    }
    public void shout(){
        System.out.println("动物，叫");
    }

}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}