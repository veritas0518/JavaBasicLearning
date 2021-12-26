package com.javaBase.day23;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:30 2021/7/11
 */
public class HourlyEmployee extends Employee {
    private int hour;   //每月工作的小时
    private int wage;  //每小时的工资

    @Override
    public double earnings() {
        return hour * wage;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int hour, int wage) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }

}
