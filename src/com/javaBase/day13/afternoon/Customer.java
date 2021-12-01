package com.javaBase.day13.afternoon;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:04 2021/7/1
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName =lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
        this.account = account;
    }
}
