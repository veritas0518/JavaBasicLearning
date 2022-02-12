package com.javaSenior.Day44;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: TCPTest3
 * @Description: 实现TCP的网络编程3
 * @Author: TianXing.Xue
 * @Date: 2021/8/9 11:37
 *
 * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端
 **/

public class TCPTest3 {

    @Test
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            //2.
            os = socket.getOutputStream();
            //3.
            fis = new FileInputStream("友情与爱情.jpg");
            //4.
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //关闭数据的输出
            socket.shutdownOutput();

            //5.接收来自于服务器端的数据，并显示到控制台上
            InputStream is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buffer1 = new byte[1024];
            int len1;
            while ((len1 = is.read(buffer1)) != -1) {
                baos.write(buffer1, 0, len1);
            }
            System.out.println(baos);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(9090);
            socket = ss.accept();
            is = socket.getInputStream();

            fos = new FileOutputStream("beauty2.jpg");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            System.out.println("图片传输完成");

            //6.服务器端给予客户端反馈
            os = socket.getOutputStream();
            os.write("你好，我已收到照片".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.资源关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
