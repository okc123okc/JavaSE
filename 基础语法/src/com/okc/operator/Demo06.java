package com.okc.operator;

/**
 * @ClassName: Demo06 位运算
 * @Author: okc
 * @Date: 2021/4/13 13:11
 * @Version 11
 **/
public class Demo06 {
    public static void main(String[] args) {
        /*
        A = 0011 1100
        B = 0000 1101
        ---------------------
        与  A&B = 0000 1100
        或  A|B = 0011 1101
        异或  A^B = 0011 0001
        取反  ~B =  1111 0010
        ----------------------
        如何快速算出2*8=16  2*2*2*2
        效率高
        左移 << *2
        右移 >> /2
        0000 0000 0
        0000 0010 2
        0000 0100 4
        0000 1000 8
        0001 0000 16
        */
        System.out.println(2 << 3);
        //16
    }
}
