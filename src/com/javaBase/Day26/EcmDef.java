package com.javaBase.Day26;

/**
 * throw 和 throws 的区别：
 *    > throw 表示抛出一个异常类的对象那个，生成异常对象的过程。声明在方法体内。
 *    > throws 属于异常处理的一种方式，声明在方法的声明处
 *
 *
 */
public class EcmDef {
    public static void main(String[] args) {

        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            int result = ecm(i, j);
            System.out.println("结果为：" + result);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("算数异常 除0");
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("分子或分母为负数！");

        }
        return i / j;
    }
}
