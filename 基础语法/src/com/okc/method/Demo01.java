package com.okc.method;

/**
 * @ClassName: Demo01
 * @Author: okc
 * @Date: 2021/4/15 14:08
 * @Version 1.8
 **/
public class Demo01 {
    //main方法
    public static void main(String[] args) {
        //实际参数：实际调用传给它的参数
        int sum  = add(2, 1);
        int sum1 = add(3,5,65);
        System.out.println(sum);
        System.out.println(sum1);
    }

    //加法
    //形式参数，用来定义作用的
    public static int add(int a,int b){
        return a+b;
    }
    //方法重载
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
