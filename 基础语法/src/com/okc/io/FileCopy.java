package com.okc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileCopy
 * @Description: 文件复制
 * @Author: okc
 * @Date: 2021/8/6 10:04
 * @Version 1.8
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //1.创建输入输出字节流
        FileInputStream fis = new FileInputStream("D:\\test\\io\\1.png");
        FileOutputStream fos = new FileOutputStream("D:\\test\\io\\2.png");
        //2.读写操作
        int len;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            //写到硬盘=>复制
            fos.write(bytes,0,len);
        }
        //3.关闭流
        fos.close();
        fis.close();

    }
}
