package com.okc.method;

/**
 * @ClassName: Demo02
 * @Author: okc
 * @Date: 2021/4/15 14:20
 * @Version 1.8
 **/
public class Demo02 {
    public static void main(String[] args) {
        int max = max(30 , 20);
        System.out.println(max);
    }
    public static int max(int n1,int n2){
       int result = 0;
       if (n1==n2){
           System.out.println("num1==num2");
           //终止方法
           return 0;
       }
       if (n1>n2){
           result=n1;
       }else {
           result=n2;
       }
        return result;
    }
}
