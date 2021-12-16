package com.javaBase.day18.evening;

import com.javaBase.day18.Customer;

import java.util.Date;

/**
 * @Descripton:  了解Object类里toString()的使用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:12 2021/7/6
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 =new Customer("Tom",21);
        System.out.println(cust1.toString());
        Date d1 =new Date(132131313344L);
        System.out.println(d1);

    }



}
