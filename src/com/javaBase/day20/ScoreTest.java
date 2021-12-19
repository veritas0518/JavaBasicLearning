package com.javaBase.day20;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Descripton:  Vector的使用来计算学生成绩的等第
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:28 2021/7/8
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Vector v =new Vector();
        int maxScore =0;
        for(;;){
            System.out.println("请输入学生成绩（负数为结束）");
           int score =  scanner.nextInt();
           if(score<0){
               break;
           }
           if(score>100){
               System.out.println("输入的数据非法，请重新输入：");
               continue;
           }
            Integer inScore =score;
            v.addElement(inScore);
           // v.addElement(score);  //自动装箱
            if(maxScore<score){
                maxScore=score;
            }
        }
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj =v.elementAt(i);

            //自动拆箱
            int score =(int) obj;

            if(maxScore-score<=10){
                level ='A';
            }else if(maxScore-score<=20){
                level ='B';
            }else if(maxScore-score<=30){
                level ='C';
            }else {
                level ='D';
            }
            System.out.println("student-"+i+" score is "+score+",level is "+level);
        }

    }
}
