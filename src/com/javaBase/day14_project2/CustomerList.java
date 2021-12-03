package com.javaBase.day14_project2;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 15:38 2021/7/2
 */
public class CustomerList {
    private Customer[] customers; //用来保存对象客户的数组
    private int total = 0;  //记录已保存客户对象的数量

    //用来初始化customer数组的构造器
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    //将指定的客户添加到数组中
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        } else {
            customers[total++] = customer;
            return true;
        }
    }

    //修改指定索引位置的客户信息
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }

    //删除指定索引位置上的客户
    //注意！删除数组上的元素只能把数组后面的元素往前移，再把最后一个元素的值置为null!
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    //获取所有的客户信息
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    //获取指定索引位置上的客户
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        } else {
            return customers[index];  //如果找到了元素则返回
        }
    }

    //获取存储的客户的数量
    public int getTotal() {
        return total;
    }
}
