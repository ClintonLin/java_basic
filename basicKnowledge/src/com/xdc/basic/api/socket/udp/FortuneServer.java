package com.xdc.basic.api.socket.udp;

import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.apache.commons.io.IOUtils;

import com.xdc.basic.skills.GetPath;

class FortuneServer
{
    public static void main(String args[])
    {
        String curPath = GetPath.getRelativePath();

        DatagramSocket ServerSocket = null;
        FileInputStream inStream = null;
        try
        {
            // 创建绑定到1114端口的ServerSocket对象
            ServerSocket = new DatagramSocket(1114);

            while (true)
            {
                // 创建缓冲区
                byte[] data = new byte[256];
                // 创建接收数据包
                DatagramPacket rPacket = new DatagramPacket(data, data.length);

                System.out.println("等待客户端连接...");
                // 等待接收数据包
                ServerSocket.receive(rPacket);
                System.out.println("已有客户端发来请求: " + rPacket.getAddress().getHostAddress() + ":" + rPacket.getPort());
                System.out.println("shoudaojieguo:" + rPacket.getData() );
                // 读取待发送的内容
                inStream = new FileInputStream(new File(curPath + "Fortunes.txt"));
                if (inStream.read(data) <= 0)
                {
                    System.err.println("Error: couldn't read fortunes");
                }

                // 创建发送数据包
                DatagramPacket sPacket = new DatagramPacket(data, data.length, rPacket.getAddress(), rPacket.getPort());
                // 发送报文
                ServerSocket.send(sPacket);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            IOUtils.closeQuietly(ServerSocket);
            IOUtils.closeQuietly(inStream);
        }
    }
}