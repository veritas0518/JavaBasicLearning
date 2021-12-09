package com.javaBase.day16.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:14 2021/7/5
 */
public class CheckAccountTest {

    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);

        acct.withdraw(5000);
        System.out.println("余额为：" + acct.getBalance() + "可透支限额为：" + acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("余额为：" + acct.getBalance() + "可透支限额为：" + acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("余额为：" + acct.getBalance() + "可透支限额为：" + acct.getOverdraft());

    }
}
