package com.okc.io.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Package: com.okc.io.buffer
 * @ClassName: FileCopyNormalDemo
 * @Description: 通过字节流复制文件
 * @Author: okc
 * @Date: 2021/8/6 17:08
 * @Version 1.8
 **/

public class FileCopyNormalDemo {
    public static void main(String[] args) throws IOException {
        //计算时间
        long start = System.currentTimeMillis();
        //创建字节输入输出流
        FileInputStream fis = new FileInputStream("D:\\test\\io\\jdk1.8.exe");
        FileOutputStream fos = new FileOutputStream("D:\\test\\io\\jdk1.8_new1.exe");
        //读写操作
        int len;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //关闭资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("文件复制消耗时间为："+(end-start)+"ms");
        //文件复制消耗时间为：2156ms
    }
}
