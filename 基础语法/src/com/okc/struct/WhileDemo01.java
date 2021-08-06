package com.okc.struct;

/**
 * @ClassName: WhileDemo01
 * @Author: okc
 * @Date: 2021/4/13 23:09
 * @Version 1.8
 **/
public class WhileDemo01 {
    public static void main(String[] args) {
        //输出1-100
        int i = 0;
        while (i<100){
            i++;
            System.out.println(i);
        }
        /*
        while(true)死循环
        */
        //计算1+2+···+100
        int x = 0;
        int sum = 0;
        while (x<=100){
            sum=sum+x;
            x++;
        }
        System.out.println(sum);
    }
}
