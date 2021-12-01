package com.javaBase.day13.afternoon;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:45 2021/7/1
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy b1 =new Boy("罗密欧",21);
        b1.shout();
        Girl g1 =new Girl("朱丽叶",18);
        g1.marry(b1);
        Girl g2 =new Girl("朱茵",17);

        int compare = g1.compare(g2);
        if(compare>0){
            System.out.println(g1.getName()+"大");
        }else if(compare<0){
            System.out.println(g2.getName()+"大");
        }else{
            System.out.println("一样大");
        }
    }
}
