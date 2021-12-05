package com.javaBase.day15;

/**
 * @Descripton:  子类Cylinder
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:57 2021/7/3
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        super();  //默认的
        length = 1.0;
    }



    public Cylinder(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    public double findArea() {  //返回圆柱的表面积

        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
