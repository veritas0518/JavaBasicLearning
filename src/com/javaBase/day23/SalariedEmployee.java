package com.javaBase.day23;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:22 2021/7/11
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;  //月工资

    public SalariedEmployee() {

    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary =monthlySalary;
    }
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }

}
