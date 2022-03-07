package com.dataStructures.queue;

import java.util.Scanner;

/**
 * @ClassName: ArrayQueueDemo
 * @Description: 数组模拟成环形队列
 * @Author: TianXing.Xue
 * @Date: 2022/1/12 20:11
 **/

public class ArrayQueueDemo {
    public static void main(String[] args) {

        //先创建一个队列
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' '; //接收用户的输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        //输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列中取出数据");
            System.out.println("h(head): 查看队列头的数据");

            key = scanner.next().charAt(0); //接收一个字符

            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数字");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是：%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    //查看队列头的数据是什么
                    try {
                        int result = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是：%d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false; //死循环就会退出
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

//使用数组模拟队列 --> 编写一个ArrayQueue类
class ArrayQueue {
    private int maxSize; //表示数组的最大容量
    private int front; //指向队列的队列头
    private int rear; //队列尾部
    private int[] arr; //该数组用于存放数据，模拟队列

    //创建队列的构造器
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1; //指向队列头部的前一个位置
        rear = -1; //指向队列尾部（就是队列最后一个数据）
    }

    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1; //当队尾指针指向maxSize-1 （即最后一个数的下标）
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        //首先判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能加入数据");
            return;
        }
        rear++; //让rear后移
        arr[rear] = n;
    }

    //获取队列的数据（出队列）
    public int getQueue() {
        if (isEmpty()) {
            //通过抛出异常处理
            throw new RuntimeException("队列为空！不能取出数据！");
        }
        front   ++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空！没有数据没法打印");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

    //显示队列的头数据为多少，注意：不是取出数据！！
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空的，没有头数据！");
        }

        return arr[front + 1]; //因为front指向队列头的前一个数据
    }

}