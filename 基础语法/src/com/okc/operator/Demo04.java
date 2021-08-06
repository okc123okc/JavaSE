package com.okc.operator;

/**
 * @ClassName: Demo04
 * @Author: okc
 * @Date: 2021/4/13 11:19
 * @Version 11
 **/
public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增 自减 一元运算符
        int a = 3;
        int b = a++;
        //执行完这行代码后，先给b赋值，再自增
        //相当于这里还有一行 a++ a=a+1
        System.out.println(a);
        //输出：4

        //++a a=a+1 a:5
        int c = ++a;
        //执行完这行代码前，先自增，再给b赋值 所有c:5
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //a:5 b:3 c:5
        //自减同理

        //幂运算 很多运算，我们会使用工具类来操作
        double pow =Math.pow(2,3);
        System.out.println(pow);
        //2的3次方 8
    }
}
