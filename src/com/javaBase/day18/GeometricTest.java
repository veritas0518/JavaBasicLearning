package com.javaBase.day18;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 16:15 2021/7/6
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test =new GeometricTest();
        Circle c1 =new Circle("white",1.0,2.3);
        test.displayGeometricObject(c1);
        Circle c2 =new Circle("white",1.0,3.3);

        test.displayGeometricObject(c2);
        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("c1和c2的面积是否相等？："+isEquals);
        MyRectangle rect =new MyRectangle("red",2.1,3.4,1.0);
        System.out.println("长方形的体积是："+rect.findArea());
    }
    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为："+o.findArea());
    }
    //测试对象的面积是否相等
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea()==o2.findArea();
    }
}
