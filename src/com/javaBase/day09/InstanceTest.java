package com.javaBase.day09;

/**
 * @Descripton: 理解“万事万物皆对象”  学会匿名对象
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:36 2021/6/27
 */

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();

        //匿名对象
        //只能调用一次
        new Phone().price = 2000;
        new Phone().showPrice();
    }
}

class Phone {
    double price;

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println(price);
    }
}