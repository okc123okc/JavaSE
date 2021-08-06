package com.okc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileOutputStreamDemo    OutputStream
 * @Description: 字节输出流 ： 内存-->硬盘   写操作
 * @Author: okc
 * @Date: 2021/8/5 22:03
 * @Version 1.8
 **/

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        //创建字节输出流: 从 内存-->硬盘
        FileOutputStream fos = null;
        try {
            //默认覆盖原有的内容
            fos = new FileOutputStream("D:\\test\\io\\fos.txt");
            //追加原有的内容
            //fos = new FileOutputStream("D:\\test\\io\\fos.txt",true);
            try {
                //单字节写出，写入硬盘
                //fos.write(97);
                //fos.write(98);
                //fos.write(99);
                //写出一个字节数组
                byte[] bytes = "hello,world".getBytes();
                //fos.write(bytes);
                //写出一个字节数据，按区间
                fos.write(bytes,6, 5);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //关闭
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
