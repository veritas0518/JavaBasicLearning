package com.javaBase.day13.evening;

import com.javaBase.day11.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * @Descripton: package关键字的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:22 2021/7/1
 */
public class packageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1, 234, 4});
        Bank bank = new Bank();
        ArrayList list = new ArrayList();
        HashMap map = new HashMap();
        Circle c1 = new Circle();
        Account a1 = new Account(1000);
        //如果要导入同名的类，需要导入哪个包下的，即全类名的方式显示
        com.javaBase.day13.afternoon.Account a2 = new com.javaBase.day13.afternoon.Account(1000, 2000, 2.13);

    }
}
