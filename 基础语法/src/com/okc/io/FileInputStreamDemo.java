package com.okc.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileInputStreamDemo   InputStream
 * @Description: 字节输入流  硬盘-->内存   读操作
 * @Author: okc
 * @Date: 2021/8/5 22:30
 * @Version 1.8
 **/

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流 从 硬盘-->内存
        FileInputStream fis = new FileInputStream("D:\\test\\io\\fos.txt");
        //读操作,一个一个读
        int a = fis.read();
        System.out.println("字节："+(char)a);
        int b = fis.read();
        System.out.println("字节："+(char)b);
        //读操作,读数组
        int len;
        byte[] bytes = new byte[2];
        while ((len=fis.read(bytes))!=-1){
            System.out.println("字符串："+new String(bytes,0,len));
        }

        fis.close();
    }
}
