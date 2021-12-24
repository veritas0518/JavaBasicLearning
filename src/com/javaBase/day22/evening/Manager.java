package com.javaBase.day22.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:52 2021/7/10
 */
public class Manager extends Employee {
    private double bonus;  //奖金
public Manager(){

}
public Manager(double bonus){
    super();
    this.bonus=bonus;
}
public Manager(String name ,int id,double salary,double bonus){
    super(name,id,salary);
    this.bonus=bonus;
}
    @Override
    public void work() {
        System.out.println("管理员工，提高公司的运行效率");
    }

}
