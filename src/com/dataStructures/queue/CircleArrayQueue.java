package com.dataStructures.queue;

import java.util.Scanner;

/**
 * @ClassName: CircleArrayQueue
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/13 18:17
 **/

public class CircleArrayQueue {

    public static void main(String[] args) {

        System.out.println("测试数组模拟环形队列是否正确");
        //先创建一个环形队列
        CircleArray circleArray = new CircleArray(4);
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
                    circleArray.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数字");
                    int value = scanner.nextInt();
                    circleArray.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = circleArray.getQueue();
                        System.out.printf("取出的数据是：%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    //查看队列头的数据是什么
                    try {
                        int result = circleArray.headQueue();
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

class CircleArray {
    private int maxSize; //表示数组的最大容量
    private int front; //指向队列的队列头
    private int rear; //队列最后一个元素的后一个位置
    private int[] arr; //该数组用于存放数据，模拟队列

    public CircleArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满，不能加入数据！");
            return;
        }

        //直接将数据加入
        arr[rear] = n;
        //注意这里rear需要取模，不然会越界！！！
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空！不能取出数据");

        }
        //这里要注意front是指向队列的第一个元素
        //1.先把front对应的值保存到一个临时变量
        //2.将front后移,注意要考虑取模！！！
        //3.将临时保存的变量返回
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空，不能显示数据");
            return;
        }
        //思路：从front开始遍历，遍历多少个元素
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d] = %d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //求出当前队列的有效数据的个数
    public int size() {
        return (rear + maxSize - front) % maxSize; //这是求有效数据的个数的方程式，很重要
    }

    //显示队头元素
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空！不能显示队头元素");
        }
        return arr[front];
    }
}