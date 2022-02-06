package com.javaSenior.Day41;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @ClassName: FileTest
 * @Description: File类的使用
 * @Author: TianXing.Xue
 * @Date: 2021/8/6 11:16
 *
 *   1.File类的一个对象，代表一个文件或一个文件目录(俗称：文件夹)
 *   2.File类声明在java.io包下
 *   3.File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法
 *     并未涉及到写入或读取文件内容的操作，如果需要读取或写入文件内容，必须使用IO流来完成
 *   4.后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的"终点"。
 *
 **/

public class FileTest {
    /*
    1.如何创建File类的实例
        File(String filePath)
        File(String parentPath, String childPath)
        File(File parentFile, String childPath)

    2.
     相对路径：相较于某个路径下，指明的路径
     绝对路径：包含盘符在内的文件或文件目录的路径

    3.路径分隔符
     Windows: \\
     unix: /

     */

    @Test
    public void test1() {

        //构造器1
        File file1 = new File("hello.txt"); //相对于当前module
        File file2 = new File("D:\\JavaCode\\src\\com.javabase.Day41\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("D:\\JavaCode\\src", "com/javaSenior/Day41");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3, "hi.txt");
        System.out.println(file4);
    }

    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified())); //修改时间

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    /*
    public String[] list() : 获取指定目录下的所有文件或者文件目录的名称数组  ---> 相对路径
    public File[] listFile() : 获取指定目录下的所有文件或者文件目录的File数组 ---> 绝对路径

     */
    @Test
    public void test3() {
        File file = new File("D:\\JavaCode\\src");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
    public boolean renameTo(File dest) : 把文件重命名为指定的文件路径
     比如：file1.renameTo(file2) 为例:
       要想保证返回true,需要file1在硬盘中是存在的，且file2不存在
     */

    @Test
    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hi.txt");

        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    @Test
    public void test5() {
        File file1 = new File("hello.txt");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println();

        File file2 = new File("D:\\io");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
    }

    /*
    创建硬盘中对应的文件或文件目录
    public boolean createNewFile()：创建文件。若文件存在，则不创建，返回false
    public boolean mkdir() : 创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层不存在就无法创建
    public boolean mkdirs() : 创建文件目录。如果上层文件目录不存在，一并创建


     */
    @Test
    public void test6() throws IOException {
        File file1 = new File("hi.txt");
        if (!file1.exists()) { //file1.exists()是如果存在，加个! 就是如果不存在
            file1.createNewFile();
            System.out.println("创建成功");
        } else { //文件存在
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test7() {
        //文件目录的创建
        File file1 = new File("d:\\io\\io1\\io3");

        boolean mkdir = file1.mkdir();
        if (mkdir) {
            System.out.println("创建成功1");
        }

        File file2 = new File("d:\\io\\io1\\io4");

        boolean mkdir1 = file2.mkdirs();
        if (mkdir1) {
            System.out.println("创建成功2");
        }

        //要想删除成功，io4文件目录下不能有子目录或文件
        File file3 = new File("d:\\io\\io1\\io4");
        file3 = new File("d:\\io\\io1");
        System.out.println(file3.delete());
    }
}
