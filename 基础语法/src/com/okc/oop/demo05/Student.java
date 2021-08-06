package com.okc.oop.demo05;

/**
 * @ClassName: Student
 * @Author: okc
 * @Date: 2021/4/25 23:48
 * @Version 1.8
 **/
public class Student extends Person {
    @Override
    public void run(){
        System.out.println("son");
    }
    public void eat(){
        System.out.println("eat");
    }
}

/**
 *多态注意事项：
 * 多态是方法的多态，属性没有多态
 * 父类和子类，有联系（注意类型转换异常）
 * 存在的条件：继承关系，方法需要重写，父类引用指向子类
*/