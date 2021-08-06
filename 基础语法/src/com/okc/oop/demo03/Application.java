package com.okc.oop.demo03;

/**
 * @ClassName: Application
 * @Author: okc
 * @Date: 2021/4/18 21:54
 * @Version 1.8
 **/
/**
 *封装的好处：
 * 提高程序的安全性，保护数据
 * 隐藏代码的实现细节
 * 统一接口
 * 系统可维护增加了
*/
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("okc");
        System.out.println(student.getName());
        student.setAge(3);
        System.out.println(student.getAge());
    }
}
