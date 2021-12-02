package com.javaBase.day13.afternoon;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:24 2021/7/1
 */
public class Girl {
    private String name;
    private int age;
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;

    }
    public Girl(String name ,int age){
        this.name = name ;
        this.age =age;
    }
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);  //当前对象
    }
    public int compare(Girl girl){
        if(this.age>girl.age){
            return 1;
        }else if(this.age<girl.age){
            return -1;
        }else return 0;
    }
}
