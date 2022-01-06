package com.javaBase.Day25.Evening;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s =new Student();

            s.register(-1001);
            System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    int id;

    public void register(int id) throws Exception{
        if(id>0){
            this.id =id;
        }else{
            //手动抛出一个异常对象
            //throw new RuntimeException("您输入的数据非法");
            //throw new Exception("您输入的数据非法");
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}