package com.javaBase.day10;

/**
 * @Descripton: 测试自己写的ArrayUtil 里的方法能不能在这里调用
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 17:08 2021/6/28
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 69, 11, 33, 655, 454, -6, -532, 5};
        int max = util.getMax(arr);
        System.out.println("最大值为:" + max);
        System.out.println("最小值为" + util.getMin(arr));
        System.out.println("总和为：" + util.getSum(arr));
        System.out.println("平均值为：" + util.getAvg(arr));
        System.out.println("排序前");
        util.print(arr);
        System.out.println();
        System.out.println("排序后");
        util.sort(arr);
        util.print(arr);
        System.out.println();
        System.out.println("反转前");
        util.print(arr);
        System.out.println();
        System.out.println("反转后");
        util.reverse(arr);
        util.print(arr);
        System.out.println();
        int index = util.getIndex(arr, 33);
        if (index >= 0) {
            System.out.println("找到了！查找元素的下标为：" + index);
        } else {
            System.out.println("没找到");
        }

    }
}
