package com.javaBase.day08;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        //对应方式一
        //c1.radius  = 2.1;
        //System.out.println("圆的面积是 "+c1.getSpace());
        //对应方式二
        c1.getSpace();
    }
}

class Circle {
    double radius;
    //方式一：有返回值
//    public double getSpace(){
//        double space  = Math.PI *Math.pow(radius,2);
//        return space;

    //方式二：无返回值
    public void getSpace() {
        radius = 2.1;
        double space = Math.PI * Math.pow(radius, 2);
        System.out.println("圆的面积是 " + space);
    }
}