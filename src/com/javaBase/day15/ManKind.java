package com.javaBase.day15;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:37 2021/7/3
 */
public class ManKind {
    private int sex;  //性别
    private int salary;  //薪资

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        }
        if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        }
        if (salary != 0) {
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
