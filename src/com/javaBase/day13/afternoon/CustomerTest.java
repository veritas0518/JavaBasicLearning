package com.javaBase.day13.afternoon;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:13 2021/7/1
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 =new Customer("Jane ","Smith");
        Account acct =new Account(1000,2000,0.0123);
        c1.setAccount(acct);
       c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);
        System.out.println("Customer["+c1.getFirstName()+","+c1.getLastName()+"] has an account: id is "
                +c1.getAccount().getId()+",annualInterestRate is "+ c1.getAccount().getAnnualInterestRate()*100+
                "%"+",balance is"+ c1.getAccount().getBalance());
    }
}
