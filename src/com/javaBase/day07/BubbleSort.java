package com.javaBase.day07;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 6, 2, 7, 34, 65, 12, 7, 232, 14, 54};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
