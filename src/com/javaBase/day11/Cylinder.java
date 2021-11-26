package com.javaBase.day11;

/**
 * @Descripton: String.format的使用（保留几位小数）
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:02 2021/6/29
 */
public class Cylinder {
    public static void main(String[] args) {
        cy c1 =new cy();
        c1.radius =2.8;
        c1.height =5;
        c1.area();
        System.out.println("体积为="+String.format("%.2f",c1.volume()));
    }
}
class cy{
    double radius;
    int height;
    public void area(){
        System.out.println("底面积="+Math.PI*Math.pow(radius,2));
    }
    public double volume(){
        return (Math.PI*Math.pow(radius,2))*height;
    }
}