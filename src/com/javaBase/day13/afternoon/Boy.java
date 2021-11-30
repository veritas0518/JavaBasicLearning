package com.javaBase.day13.afternoon;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:24 2021/7/1
 */
public class Boy {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Boy(String name ,int age){
        this.name =name;
        this.age =age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(age>=22){
            System.out.println("可以合法登记");
        }else{
            System.out.println("先谈恋爱");
        }
    }
}
