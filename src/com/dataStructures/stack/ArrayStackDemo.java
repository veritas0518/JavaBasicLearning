package com.dataStructures.stack;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @ClassName: ArrayStackDemo
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/23 21:22
 **/

public class ArrayStackDemo {
    public static void main(String[] args) {
        //测试栈是否正确
        ArrayStack stack = new ArrayStack(4);
        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("show:表示显示栈");
            System.out.println("exit:退出程序");
            System.out.println("push:表示添加数据到栈");
            System.out.println("pop:表示从栈取出数据(出栈)");
            System.out.println("请输入你的选择");
            key = scanner.next();
            switch (key.charAt(0)) {
                case 's':
                    stack.list();
                    break;
                case 'p':
                    System.out.println("亲输入一个数：");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 'o':
                    try {
                        int res = stack.pop();
                        System.out.println("取出的数据是：" + res);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;

                case 'e':
                    scanner.close();
                    loop = false;
                    break;
            }
        }
        System.out.println("程序退出！！！");
    }

}

class ArrayStack {
    private int maxSize; //栈的大小
    private int[] stack; //数组模拟栈，数据放在该数组中
    private int top = -1; //top表示栈顶

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        //先判断栈是否满
        if (isFull()) {
            System.out.println("栈满！不能入栈");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈，将栈顶的数据返回
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空！不能出栈");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //显示栈的情况[遍历栈]，遍历时需要从栈顶开始显示数据
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空！无法遍历数据");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = [%d]\n", i, stack[i]);
        }

    }

}
