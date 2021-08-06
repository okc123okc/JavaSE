package com.okc.operator;

/**
 * @ClassName: Demo07
 * @Author: okc
 * @Date: 2021/4/13 13:24
 * @Version 11
 **/
public class Demo07 {
    public static void main(String[] args) {
        //扩展运算符
        int a = 10;
        int b = 20;
        a+=b;
        System.out.println(a);
        //30 等价于a=a+b;
        a-=b;
        System.out.println(a);
        //10 等价于a=a-b;
        //字符串连接符 +
        System.out.println("" + a + b);
        System.out.println(a + b + "");
        //1020 30
        //当String出现在连接符前，会变成String！！！
    }
}
