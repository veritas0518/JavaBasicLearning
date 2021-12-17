package com.javaBase.day18;

import java.util.Objects;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:14 2021/7/6
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 手动实现的toString重写方法
     *
     */
//    public String toString() {
//        return "Customer[name = "+name +",age = "+age+"]" ;
//    }


    /**
     *   手动实现equals的重写
     */
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Customer) {
//            Customer cust = (Customer) obj;
//            if (this.age == cust.age && this.name.equals(cust.name)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }
}
