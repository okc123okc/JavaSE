package com.okc.method;

/**
 * @ClassName: Demo05
 * @Author: okc
 * @Date: 2021/4/16 15:08
 * @Version 1.8
 **/
public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        System.out.println(demo05.f(5));
    }
    //求阶乘:递归思想
    public int f(int n){
        if (n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
