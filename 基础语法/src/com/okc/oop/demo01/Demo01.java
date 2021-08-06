package com.okc.oop.demo01;

/**
 * @ClassName: demo01 值传递
 * @Author: okc
 * @Date: 2021/4/18 13:28
 * @Version 1.8
 **/
public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        //1
        Demo01.change(a);
        System.out.println(a);
        //1
    }

    private static void change(int a) {
        a=10;
    }
}
