package com.okc.io.buffer;

import java.io.*;

/**
 * @Package: com.okc.io.buffer
 * @ClassName: InputStreamReaderDemo
 * @Description: 转换流 字节流->字符流
 * @Author: okc
 * @Date: 2021/8/6 22:59
 * @Version 1.8
 **/

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建输入转换流  读操作   默认UTF-8
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"),"GBK");
        //读
        int len;
        char[] chars = new char[1024];
        while ((len=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        //关闭资源
        isr.close();

        //创建一个输出转换流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
        osw.write("写入一个GBK格式的文件");
        osw.close();
    }
}
