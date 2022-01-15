package com.javaSenior.Day32;

import org.junit.Test;

/**
 * @ClassName: StringMethodTest
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/7/28 11:24
 * @Version: 1.0
 **/
public class StringMethodTest {
    @Test
    public void test() {
        String s1 = "heLlowOrLd";
        String s2 = s1.toUpperCase();

        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.isEmpty());
        System.out.println(s2);

        String s3 = "       he  llo   wor  ld    ";
        String s4 = s3.trim();  //去除首位空格
        System.out.println("-----" + s3 + "------");
        System.out.println("-----" + s4 + "------");

    }

    @Test
    public void test2() {
        String s1 = "HelloWorld";
        String s2 = "helloworld";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));  //忽略大小写比较是否相等

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));  //比较两个字符串大小，涉及到字符串排序

        String s7 = "上海市黄浦区";
        String s8 = s7.substring(3);
        System.out.println(s8);

        String s9 = s7.substring(0, 3);  //左闭右开
        System.out.println(s9);
    }

    @Test
    public void test3() {
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");  //是不是以指定的字符串结尾的，是boolean类型的
        System.out.println(b1);

        boolean b2 = str1.startsWith("He");//是不是以指定的字符串开始的，是boolean类型的
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);  //是不是从2开始以ll开头的
        System.out.println(b2);

        String str2 = "wo";
        System.out.println(str1.contains(str2));  //是否包含对应的串

        System.out.println(str1.indexOf("lo"));  //首次出现的位置，没有就返回-1

        System.out.println(str1.indexOf("lo",5));  //从5开始往后找

        String str3 = "hellorworld";

        System.out.println(str1.lastIndexOf("or"));  //从后往前找，返回的索引从前往后
        System.out.println(str1.lastIndexOf("or",6));  //从右往左找，返回的索引值从左往右

        /*
            什么情况下：indexOf(str) 和 LastIndexOf(str) 返回值相同
                情况一：存在唯一的一个str
                情况二：不存在str
         */

    }

    @Test
    public void test4() {
        String str1 = "上海市黄浦区黄浦区";

        String str2 = str1.replace('黄', '红');  //替换所有的一个字符
        String str3 = str1.replace("黄浦区", "嘉定区");  //替换所有的字符串
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("***********************");
        String str = "12hello34world5java7890";
        String string = str.replaceAll("\\d+",",").replaceAll("^,|,$","");
        System.out.println(string);
    }
}
