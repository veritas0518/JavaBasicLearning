package com.javaBase.day15;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:05 2021/7/3
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3.4);
        c1.setRadius(2.1);
        System.out.println("圆柱的体积为= " + c1.findVolume());
        System.out.println("圆柱的表面积为 = " + c1.findArea());

        Cylinder c2 =new Cylinder();
        System.out.println("圆柱的体积为= " + c2.findVolume());
        System.out.println("圆柱的表面积为 = " + c2.findArea());
    }
}
