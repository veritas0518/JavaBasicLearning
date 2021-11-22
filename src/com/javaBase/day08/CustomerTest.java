package com.javaBase.day08;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
    }
}

class Customer {
    String name;
    int age;
    boolean isMale;

    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour);
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国际是" + nation;
        return info;
    }
}
