package com.okc.operator;

/**
 * @ClassName: Demo05 逻辑运算符
 * @Author: okc
 * @Date: 2021/4/13 12:59
 * @Version 11
 **/
public class Demo05 {
    public static void main(String[] args) {
        //与&& 或|| 非!
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b:"+(a&&b));
        //false 逻辑与运算：两个变量都为真，结果才为真
        System.out.println("a||b:"+(a||b));
        //true 逻辑非运算，两个变量一个为真，结果为真
        System.out.println("!(a&&b):"+!(a&&b));
        //true 逻辑非运算：真为假，假为真

    }
}
