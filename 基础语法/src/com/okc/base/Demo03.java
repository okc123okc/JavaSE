package com.okc.base;

/**
 * @ClassName: com.okc.base.Demo03 类型转换
 * @Author: okc
 * @Date: 2021/4/12 16:41
 * @Version 11
 **/
public class Demo03 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        double d = i;
        //强制转换 （类型）变量名 高--低
        //自动转换 低--高
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        //输出结果 128 -128  128.0 byte出现内存溢出 -128~127
        /*注意点：
        * 不能对布尔值进行转换
        * 不能把对象类型转换为不相干的类型
        * 在把高容量转换到低容量的时候，强制转换
        * 转换的时候可能存在内存溢出，或者精度问题
        * */
        System.out.println("=================");
        System.out.println((int) 23.8);
        System.out.println((int) -45.89f);
        //输出结果 23 -45 精度问题
        System.out.println("=================");
        char c = 'a';
        int n = c+1;
        System.out.println(n);
        System.out.println((char) n);
        //98 b
        System.out.println("=================");
        //操作比较大的数的时候，注意溢出问题
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;
        System.out.println(total);
        //输出溢出-1474836480
        long total1=money*years;
        System.out.println(total1);
        //默认是int,转换之前已经存在问题 -1474836480
        long total3 = money*((long)years);
        System.out.println(total3);
        //输出20000000000

    }
}
