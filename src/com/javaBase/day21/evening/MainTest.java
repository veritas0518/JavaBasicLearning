package com.javaBase.day21.evening;

/**
 * @Descripton: main方法的使用说明
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:39 2021/7/9
 */
public class MainTest {
    public static void main(String[] args) {  //入口
        Main.main(new String[100]);  //静态里才能调静态
    }
}

class Main {
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}