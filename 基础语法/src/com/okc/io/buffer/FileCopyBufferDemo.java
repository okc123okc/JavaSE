package com.okc.io.buffer;

import java.io.*;

/**
 * @Package: com.okc.io.buffer
 * @ClassName: FileCopyBufferDemo
 * @Description: 通过字节缓冲流复制文件
 * @Author: okc
 * @Date: 2021/8/6 17:16
 * @Version 1.8
 **/
//相比于FileInputStream,差不多快了三倍。
// 缓存流作为缓冲读写数据使用，它有一个大小为8k的缓存池，
// 加上缓存流的话在读取数据的时候每次就会一次性读取8k，
// 然后读完了再读取8k，输出也是如此，所以能够优化读写上的速度
public class FileCopyBufferDemo {
    public static void main(String[] args) throws IOException {
        //计算时间
        long start = System.currentTimeMillis();
        //创建字节输入输出缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\test\\io\\jdk1.8.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\test\\io\\jdk1.8_new2.exe"));

        //读写操作
        int len;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes, 0, len);
        }

        //关闭资源
        bis.close();
        bos.close();

        long end = System.currentTimeMillis();
        System.out.println("文件复制消耗时间为："+(end-start)+"ms");
        //文件复制消耗时间为：764ms


    }
}
