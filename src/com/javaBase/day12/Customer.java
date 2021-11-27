package com.javaBase.day12;

/**
 * @Descripton:  javaBean的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:47 2021/6/30
 */
public class Customer {
    private int id;
    private String name;
    public Customer(){

    }
    public void setId(int i){
        id =i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

}
