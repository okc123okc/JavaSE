package com.okc.struct;

/**
 * @ClassName: ForDemo02
 * @Author: okc
 * @Date: 2021/4/13 23:24
 * @Version 1.8
 **/
public class ForDemo02 {
    public static void main(String[] args) {
        //用for循环输出0~100的偶数和和奇数和
        int evenSum = 0;
        int oddSum = 0;
        for (int i=0;i<=100;i++){
            if (i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("偶数和："+evenSum);
        System.out.println("奇数和："+oddSum);
    }
}
