package com.okc.operator;

/**
 * @ClassName: Demo01
 * @Author: okc
 * @Date: 2021/4/13 11:07
 * @Version 1.8
 **/
public class Demo01 {
    public static void main(String[] args) {
        //二元运算符
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double)b);
        //30 -10 200 0 0.5
        //在出现小数的情况下，需要注意作用范围
    }
}
