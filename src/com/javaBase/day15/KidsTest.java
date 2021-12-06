package com.javaBase.day15;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:41 2021/7/3
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(13);
        someKid.printAge();
        someKid.setYearsOld(11);
        someKid.printAge();
        someKid.setSalary(0);
        someKid.employeed();
        someKid.manOrWoman();
    }
}
