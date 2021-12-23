package com.javaBase.day22.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:59 2021/7/10
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager =new Manager("库克",1001,5000,50000);
        manager.work();
        CommonEmployee commonEmployee =new CommonEmployee();
        commonEmployee.work();
    }
}
