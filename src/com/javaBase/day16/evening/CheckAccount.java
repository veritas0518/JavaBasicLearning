package com.javaBase.day16.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 21:36 2021/7/4
 */
public class CheckAccount extends Account {
    private double overdraft;
public void setOverdraft(){
    this.overdraft =overdraft;
}
public double getOverdraft(){
    return overdraft;
}
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()) {
            overdraft -= (amount - getBalance());
            setBalance(0);
        } else
            System.out.println("超过可透支限额");
}
}
