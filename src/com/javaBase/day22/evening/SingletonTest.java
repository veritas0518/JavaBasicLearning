package com.javaBase.day22.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:34 2021/7/10
 */
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 =Bank.instance;
        Bank bank2 =Bank.instance;
        System.out.println(bank2==bank1);
    }

}
class Bank{
    private Bank(){

    }
    public static final Bank instance =new Bank();
}
