package com.javaBase.day11;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 18:33 2021/6/29
 */
public class ValueTransferTest{
    public static void main(String[] args) {
    value v1 =new value();
    v1.m=10;
    v1.n=20;
    ValueTransferTest v2 =new ValueTransferTest();
    v2.swap(v1);
        System.out.println("m="+v1.m+",n="+v1.n);
    }
    public void swap(value v1){
        int temp=v1.m;
        v1.m = v1.n;
        v1.n=temp;
    }
}
class value{
    int m;
    int n;
}