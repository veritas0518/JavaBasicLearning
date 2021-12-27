package com.javaBase.day23;

import java.util.Calendar;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:40 2021/7/11
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月的月份：");
//        int month = scanner.nextInt();

        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);


        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
        emps[1] = new HourlyEmployee("小米", 1003, new MyDate(1991, 7, 6), 60, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);

            if (month+1 == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
