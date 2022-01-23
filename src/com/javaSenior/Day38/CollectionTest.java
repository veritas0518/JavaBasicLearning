package com.javaSenior.Day38;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: ColllectionTest
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/3 14:16
 * @Version:
 **/

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(343);
        coll.add(123);

        coll.forEach(System.out::println);

    }
}
