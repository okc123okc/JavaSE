package com.okc.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileReaderDemo
 * @Description: 字符输入流 Reader
 * @Author: okc
 * @Date: 2021/8/6 10:17
 * @Version 1.8
 **/

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输入流
        FileReader fileReader = new FileReader("D:\\test\\io\\1.txt");
        //读操作
        //int read = fileReader.read();
        //System.out.println((char) read);
        char[] chars = new char[2];
        int len;
        while ((len= fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        //关闭
        fileReader.close();
    }
}
