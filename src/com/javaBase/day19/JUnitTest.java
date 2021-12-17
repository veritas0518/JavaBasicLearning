package com.javaBase.day19;


import org.junit.Test;

/**
 * @Descripton: JAVA中的JUnitTest的单元测试
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:29 2021/7/7
 *
 * 1.在单元测试方法上需要声明注解：@Test
 * 2.声明好单元测试方法以后就可以在方法体内测试相关的代码。
 *
 *
 */
public class JUnitTest {
    @Test
   public void testEquals(){
        String s1 ="mm";
        String s2 ="mm";
        System.out.println(s1.equals(s2));


    }
    @Test
    public void testToString(){
        String s1 ="nn";
        System.out.println(s1.toString());
    }
}
