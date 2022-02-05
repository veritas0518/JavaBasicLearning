package com.javaSenior.Day41;

import org.junit.Test;

import java.util.List;

/**
 * @ClassName: DAOTest
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/6 10:54
 **/

public class DAOTest {
    @Test
    public void test1() {
        DAO<User> dao = new DAO<>();
        dao.save("1001", new User(1001, 34, "周杰伦"));
        dao.save("1002", new User(1002, 20, "昆凌"));
        dao.save("1003", new User(1003, 25, "蔡依林"));

        dao.update("1003", new User(1003, 30, "方文山"));
        dao.delete("1002");

        List<User> list = dao.list();
        list.forEach(System.out::println);
    }
}
