package com.okc.operator;

/**
 * @ClassName: Demo02
 * @Author: okc
 * @Date: 2021/4/13 11:13
 * @Version 11
 **/
public class Demo02 {
    public static void main(String[] args) {
        long a = 12121212121111L;
        int b = 123;
        short c = 10;
        byte d = 8;

        System.out.println(a + b + c + d);
        System.out.println(b + c + d);
        System.out.println(c + d);
        //long int int
        //当有long相加时候，结果必是long类型
        }
}
