package com.okc.io.buffer;

import java.io.*;

/**
 * @Package: com.okc.io.buffer
 * @ClassName: BufferedDemo
 * @Description: 字符输入输出缓冲流
 * @Author: okc
 * @Date: 2021/8/6 17:38
 * @Version 1.8
 **/

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("D:\\test\\io\\fos.txt"));
        //读操作
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        //关闭资源
        br.close();

        //创建字符输入缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("in.txt"));
        //写操作
        bw.write("你好");
        //换行
        bw.newLine();
        bw.write("okc");
        //关闭资源
        bw.close();


    }

}
