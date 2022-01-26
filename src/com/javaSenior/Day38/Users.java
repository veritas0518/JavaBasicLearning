package com.javaSenior.Day38;

import java.util.Objects;

/**
 * @ClassName: Users
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/3 13:05
 * @Version:
 **/

public class Users implements Comparable {
    @Override
    public int compareTo(Object o) {
        if (o instanceof Users) {
            Users user = (Users) o;
            int compare = this.name.compareTo(user.name);
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.age, user.age);
            }

        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }

    private String name;
    private int age;

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
