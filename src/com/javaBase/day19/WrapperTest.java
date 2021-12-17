package com.javaBase.day19;

import org.junit.Test;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:16 2021/7/7
 */
public class WrapperTest {
    //String类型 --> 基本数据类型、包装类:调用包装类的parseXxx(String s)
    @Test
    public void test3() {
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
        //范围在-128~127内时，可以直接使用数组中的元素，可以不用再去new了
        Integer n = 128;
        Integer m = 128;
        System.out.println(n == m);
    }

    //基本数据类型、包装类 --> String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void ValueOfTest() {
        int num1 = 10;
        //方式一：连接运算
        String str1 = num1 + "";
        //方式二：调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);
        Double d1 = 12.4;
        String str3 = String.valueOf(d1);
        System.out.println(str3);
    }


    @Test
    public void BoxTest() {

        //自动装箱:基本数据类型 --> 包装类

        int num1 = 10;
        Integer in1 = num1;

        boolean b1 = true;
        Boolean b2 = b1;  //自动装箱
        System.out.println(b2);


        //自动拆箱:包装类 --> 基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;  //自动拆箱
    }

    //包装类 ---> 基本数据类型 :调用包装类的xxxValue()
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);
    }


    // 基本数据类型  --->   包装类
    @Test
    public void testInteger() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());  //只能纯粹的数字

    }

    @Test
    public void testFloat() {
        Float f1 = new Float(12.3);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);
    }

    @Test
    public void testBoolean() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");  //忽略大小写
        Boolean b3 = new Boolean("true123");
        System.out.println(b1);  //true
        System.out.println(b2);  //true
        System.out.println(b3);  //flase
    }

    @Test
    public void testOrder() {
        Order o1 = new Order();
        System.out.println(o1.isMale);
        System.out.println(o1.isFemale); //null
    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}

