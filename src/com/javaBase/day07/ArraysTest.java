package com.javaBase.day07;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{6, 5, 1, 67, 43, 56, 11, 111};
        int[] arr2 = new int[]{2, 32, 41, 0, 76, 5, 89, 4, 2};
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

//        boolean isEquals =  Arrays.equals(arr1,arr2);  //判断两个数组是否相等
//        System.out.println(isEquals);


        //System.out.println(Arrays.toString(arr1));  //输出数组信息


//        Arrays.fill(arr1,10);  //将指定值填充到数组中，就是替代
//        System.out.println(Arrays.toString(arr1));

//        Arrays.sort(arr2);  //对数组进行排序
//        System.out.println(Arrays.toString(arr2));

        int index = Arrays.binarySearch(arr3, 5);  //二分查找，必须有序
        System.out.println(index);


    }
}
