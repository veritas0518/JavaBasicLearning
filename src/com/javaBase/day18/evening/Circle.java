package com.javaBase.day18.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:35 2021/7/6
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Circle) {
            Circle c1 = (Circle) obj;
            if (this.radius == c1.radius) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
