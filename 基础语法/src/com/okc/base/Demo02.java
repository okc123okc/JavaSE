package com.okc.base;

/**
 * @ClassName: Demo2 基本数据类型的拓展
 * @Author: okc
 * @Date: 2021/4/12 0:05
 * @Version 11
 **/
public class Demo02 {
    public static void main(String[] args) {
        //整数拓展： 进制 二进制0b 十进制 八进制0 十六进制0x
        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("====================================");
        //=====================================================
        //浮点数拓展
        //银行业务怎么表示？ BigDecimal 数学工具类
        //float  有限 离散 舍入误差 大约 接近但不等于
        //double
        //最好完全避免使用浮点数进行比较
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f == d);
        //false
        System.out.println(f);
        System.out.println(d);

        float d1 = 23432423423423423424f;
        float d2 = d1+1;
        System.out.println(d1 == d2);
        //true
        System.out.println("====================================");
        //=====================================================
        //字符拓展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        //强制转换
        System.out.println((int) c1);
        System.out.println(c2);
        //强制转换
        System.out.println((int)c2);
        //所有的字符本质还是数字
        //编码 Unicode
        char c3 = '\u0061';
        System.out.println(c3);
        System.out.println("====================================");
        //=====================================================
        //布尔值拓展
        boolean flag = true;
        if(flag){}
        if (flag==true){}
    }
}
