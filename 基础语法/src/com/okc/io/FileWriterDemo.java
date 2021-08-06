package com.okc.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileWriterDemo  Writer
 * @Description: 字符输出流 写操作
 * @Author: okc
 * @Date: 2021/8/6 10:30
 * @Version 1.8
 **/

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流
        FileWriter fileWriter = new FileWriter("D:\\test\\io\\1.txt");
        //写操作
        fileWriter.write("你好，okc!");
        //刷新
        fileWriter.flush();
        //继续写
        fileWriter.write("我来了");
        //关闭
        fileWriter.close();
    }
}
