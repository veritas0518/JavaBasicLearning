package com.javaSenior.Day44;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: UDPTest
 * @Description: UDP协议的网络编程
 * @Author: TianXing.Xue
 * @Date: 2021/8/9 13:39
 **/

public class UDPTest {

    //发送端
    @Test
    public void send() {

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str = "我是UDP方式发射的导弹";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();

            DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //接收端
    @Test
    public void receive() {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);
            byte[] buffer = new byte[100];

            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
            socket.receive(packet);

            System.out.println(new String(packet.getData(),0,packet.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
