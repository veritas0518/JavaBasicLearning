package com.dataStructures.linkedList;

import java.util.Stack;

/**
 * @ClassName: TestStack
 * @Description: 演示栈的基本使用
 * @Author: TianXing.Xue
 * @Date: 2022/1/21 23:26
 **/

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //入栈
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");

        //出栈
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
