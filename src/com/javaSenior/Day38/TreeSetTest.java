package com.javaSenior.Day38;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName: TreeSet
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/3 11:53
 * @Version:
 **/

public class TreeSetTest {
    /*
    1.向TreeSet 中添加的数据，要求是相同类的对象
    2.两种排序方式：自然排序(实现Comparable接口) 和 定制排序(Comparator)

    3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()
    4.定制排序中，比较两个对象是否相同的标准为：compare ()返回0，不再是equals()

     */
    @Test
    public void test1() {
        TreeSet set = new TreeSet();

        //不能添加不同类的对象
//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new Person("Tom",12));

        //举例一
//        set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(11);
//        set.add(8);

        //举例二
        set.add(new Users("Tom", 12));
        set.add(new Users("Jerry", 32));
        set.add(new Users("Jim", 2));
        set.add(new Users("Mike", 65));
        set.add(new Users("Jack", 33));

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Users && o2 instanceof Users){
                    Users user1 =(Users) o1;
                    Users user2 =(Users) o2;
                    return Integer.compare(user1.getAge(),user2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeSet set =new TreeSet(com);
        set.add(new Users("Tom", 12));
        set.add(new Users("Jerry", 32));
        set.add(new Users("Jim", 2));
        set.add(new Users("Mike", 65));
        set.add(new Users("Jack", 33));
        set.add(new Users("Marry", 33));
        set.add(new Users("Jack", 56));

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
