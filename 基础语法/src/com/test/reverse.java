package com.test;

/**
 * @ClassName: reverse
 * @Author: okc
 * @Date: 2021/5/18 13:07
 * @Version 1.8
 **/
public class reverse {
    public static void main(String[] args) {
        String x = "abc123";
        System.out.println(reverse1(x));
    }

    public static String reverse1(String string){
        return new StringBuffer(string).reverse().toString();
    }
}
