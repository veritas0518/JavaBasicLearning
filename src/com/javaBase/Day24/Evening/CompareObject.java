package com.javaBase.Day24.Evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 20:16 2021/7/14
 */
public interface CompareObject {
    //若返回值是0，代表相等；若为正数，负数代表当前对象小
    public int compareTo(Object o);
}
