package com.javaBase.day07;
/**
 * @Descripton:  .equals的使用以及反转数组
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:39 2021/6/21
 *
 */
public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"aa", "bb", "cc", "dd", "ee"};
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        String dest = "11";
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {

            if (dest.equals(arr1[i])) {
                System.out.println("找到了指定的元素，位置是：" + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("没找到");
        }
    }
}