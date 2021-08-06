package com.okc.operator;

/**
 * @ClassName: Demo03
 * @Author: okc
 * @Date: 2021/4/13 11:16
 * @Version 11
 **/
public class Demo03 {
    public static void main(String[] args) {
        //关系运算符的结果：布尔值
        int a = 10;
        int b = 20;
        int c = 22;
        System.out.println(c % a);
        //2 取余（模运算）
        System.out.println(a > b);
        System.out.println(a<b);
        System.out.println(a == b);
        System.out.println(a != b);
        //false true false true
    }
}
