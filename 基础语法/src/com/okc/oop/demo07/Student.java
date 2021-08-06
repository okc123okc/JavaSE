package com.okc.oop.demo07;

/**
 * @ClassName: student  static
 * @Author: okc
 * @Date: 2021/4/27 14:22
 * @Version 1.8
 **/
public class Student {
    //静态变量
    private static int age;
    //非静态变量
    private double score;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.age);
        System.out.println(age);
        System.out.println(student.score);
    }
}
