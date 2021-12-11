package com.javaBase.day16;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:55 2021/7/4
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;
    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    void methodDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    protected void methodProtected(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    public void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
}
