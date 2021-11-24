package com.javaBase.day09;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = (i + 1);
            stu[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stu[i].score = (int) (Math.random() * (100 + 1));
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].number + " " + stu[i].state + " " + stu[i].score);
        }
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].state == 3) {
                System.out.println("三年级学生的信息为" + stu[i].number + " " + stu[i].state + " " + stu[i].score);
            }
        }
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu.length - i - 1; j++) {
                if (stu[j].score < stu[j + 1].score) {
                    //如果需要换序，交换的是数组的元素，也就是Student的对象！！不能把成绩给换了
                    Student temp = stu[j + 1];
                    stu[j + 1] = stu[j];
                    stu[j] = temp;
                }
            }
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].number + " " + stu[i].state + " " + stu[i].score);
        }
    }
}

class Student {
    int number;  //学号
    int state;  //年纪
    int score;  //成绩

}
