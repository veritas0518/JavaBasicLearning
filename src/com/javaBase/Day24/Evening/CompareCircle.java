package com.javaBase.Day24.Evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:21 2021/7/14
 */
public class CompareCircle extends Circle implements CompareObject {

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareCircle) {
            CompareCircle c1 = (CompareCircle) o;

            //正确方式一
//            if (this.getRadius() > c1.getRadius()) {
//                return 1;
//            } else if (this.getRadius() < c1.getRadius()) {
//                return -1;
//            } else {
//                return 0;
//            }

            //当属性radius声明为Double类型时，可以调用包装类的方法
            //正确方式二
            return this.getRadius().compareTo(c1.getRadius());  //这个compareTo()是已经封装好的，可以拿来直接用

        } else {
            throw new RuntimeException("传入的数据类型不匹配");

        }
    }
}
