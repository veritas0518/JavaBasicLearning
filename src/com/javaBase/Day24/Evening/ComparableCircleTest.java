package com.javaBase.Day24.Evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:30 2021/7/14
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle c1 =new CompareCircle(3.4);
        CompareCircle c2 =new CompareCircle(3.4);

        int compareValue = c1.compareTo(c2);
        if(compareValue>0){
            System.out.println("c1对象大");
        }else if (compareValue<0){
            System.out.println("c2对象大");
        }else{
            System.out.println("两个对象一样大");
        }

        int compareValue1 =c1.compareTo(new String("aa"));
        System.out.println(compareValue1);

    }
}
