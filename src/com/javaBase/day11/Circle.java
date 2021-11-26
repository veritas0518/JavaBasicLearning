package com.javaBase.day11;



/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:28 2021/6/29
 */
public class Circle {
    double radius;

    public static void main(String[] args) {
        PassObject pass = new PassObject();
        Circle c = new Circle();
        pass.printAreas(c, 5);

    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tAreas");
        for (int i = 1; i <=time; i++) {
            c.radius=i;
            System.out.print(c.radius + "\t\t\t" + String.format("%.2f",c.findArea()));
            System.out.println();
        }
        System.out.println("now radius is:"+(time+1));
    }

}