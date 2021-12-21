package com.javaBase.day21;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:42 2021/7/9
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 =new Account();
        Account acct2 =new Account("qwerty",2000);
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());
    }
}
