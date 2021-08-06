package com.okc.io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Package: com.okc.io.object
 * @ClassName: ObjectInputStreamDemo
 * @Description: 反序列化
 * @Author: okc
 * @Date: 2021/8/6 23:56
 * @Version 1.8
 **/

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        //读
        Student student = (Student) ois.readObject();
        //关闭
        System.out.println(student);
        ois.close();
    }
}
