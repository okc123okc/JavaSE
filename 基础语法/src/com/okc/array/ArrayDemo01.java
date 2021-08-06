package com.okc.array;

/**
 * @ClassName: ArrayDemo01
 * @Author: okc
 * @Date: 2021/4/16 20:29
 * @Version 1.8
 **/
public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4,5,6};
        System.out.println(a[0]);

        //动态初始化:包含默认初始化
        int[] b = new int[10];
        b[0]=100;
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
