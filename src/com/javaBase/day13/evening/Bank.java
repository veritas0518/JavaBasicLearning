package com.javaBase.day13.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:32 2021/7/1
 */
public class Bank {
    private Customer[] customers;  //存放多个客户的数组
    private int numberOfCustomer;  //客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        } else return null;
    }
}
