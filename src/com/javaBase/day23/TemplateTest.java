package com.javaBase.day23;

/**
 * @Descripton: 模板方法的设计模式
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 15:59 2021/7/11
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template {

    //计算某段代码执行所需要花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();

        code();  //  不确定的部分/易变的部分

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}