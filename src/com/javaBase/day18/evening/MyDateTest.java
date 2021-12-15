package com.javaBase.day18.evening;

/**
 * @Descripton:  equals()的练习
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:59 2021/7/6
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2");
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equals to m2");
        } else {
            System.out.println("m1 is not equals to m2");
        }
    }

}

class MyDate {
    private int day;

    private int month;
    private int year;

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyDate) {
            MyDate date = (MyDate) obj;
            if (this.day == date.day && this.month == date.month && this.year == date.year) {
                return true;
            } else return false;
        }
        return false;
    }

}
