package com.dataStructures.sort;

/**
 * @ClassName: SelectSort
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/2/9 8:02
 **/

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,2,77,66,1,22,333,444343,44};
        SelectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void SelectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp =  arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i]  =temp;
            }
        }
    }
}
