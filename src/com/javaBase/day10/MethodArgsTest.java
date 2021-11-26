package com.javaBase.day10;

/**
 * @Descripton: 可变个数形参的方法
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package: com.javabase.day10
 * @Date:Create in 19:38 2021/6/28
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test =new MethodArgsTest();
        //test.show(new String[]{"hello","nihao"});//本来得去new一个
        test.show("hello","nihao");  //调用这样直接写就行了
    }
      //原来的写法是这样的
//    public void show(String[] strs){
//        for (int i = 0; i < strs.length; i++) {
//            System.out.println(strs[i]);
//        }
//    }
      //新特性，用...不用去new了
    public void show(String ... strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
