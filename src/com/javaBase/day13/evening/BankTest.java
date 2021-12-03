package com.javaBase.day13.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:53 2021/7/1
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("jane", "smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "，的账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
        bank.addCustomer("jakie", "chen");
        bank.getCustomer(1).setAccount(new Account(500));
        System.out.println("银行客户的人数为：" + bank.getNumberOfCustomer());
    }
}
