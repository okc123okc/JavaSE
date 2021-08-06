package com.okc.struct;

/**
 * @ClassName: DoWhileDemo01
 * @Author: okc
 * @Date: 2021/4/13 23:14
 * @Version 1.8
 **/
public class DoWhileDemo01 {
    public static void main(String[] args) {
        //与while相似，while不满足判断条件不执行，但do while至少执行一次
        int i = 0;
        int sum = 0;
        do{
            sum = sum +i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
