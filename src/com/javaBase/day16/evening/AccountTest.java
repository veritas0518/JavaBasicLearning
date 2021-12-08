package com.javaBase.day16.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 21:30 2021/7/4
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct =new Account(1122,20000,0.045);
        acct.withdraw(30000);
        System.out.println("余额为："+acct.getBalance());
        acct.withdraw(2500);
        System.out.println("余额为："+acct.getBalance());
        acct.deposit(3000);
        System.out.println("余额为"+acct.getBalance()+",月利率为："+(acct.getMonthlyInterest()*100)+"%");
    }
}
