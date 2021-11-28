package com.javaBase.day12;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:24 2021/6/30
 */
public class Triangle {
    private double base;
    private double height;
    public void setBase(double b){
        base =b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h){
        height =h;
    }
    public double getHeight(){
        return height;
    }
    public Triangle(){

    }
    public Triangle(double b,double h){
        base =b;
        height =h;
    }
}
