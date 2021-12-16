package com.javaBase.day18;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 21:17 2021/7/5
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(String colour , double weight,double radius){
        super(colour,weight);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14*radius*radius;
    }
}
