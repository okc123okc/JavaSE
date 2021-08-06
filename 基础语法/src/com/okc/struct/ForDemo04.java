package com.okc.struct;

/**
 * @ClassName: ForDemo04
 * @Author: okc
 * @Date: 2021/4/14 0:01
 * @Version 1.8
 **/
public class ForDemo04 {
    public static void main(String[] args) {
        //增强for循环
        int[] numbers = {10,20,30,40,50};
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println();
        //遍历数组元素
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
