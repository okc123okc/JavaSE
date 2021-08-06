package com.okc.io.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Package: com.okc.io.object
 * @ClassName: ObjectInputStreamDemo
 * @Description: 对象序列化
 * @Author: okc
 * @Date: 2021/8/6 23:47
 * @Version 1.8
 **/
class Student implements Serializable {
    //设置序列化版本号
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建序列化输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        //写
        Student student = new Student("okc",18);
        oos.writeObject(student);
        //关闭
        oos.close();
        System.out.println("序列化完成");
    }
}
