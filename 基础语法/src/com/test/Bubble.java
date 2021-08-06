package com.test;

import java.util.Arrays;

/**
 * @ClassName: Bubble 冒泡排序法
 * @Author: okc
 * @Date: 2021/5/17 22:35
 * @Version 1.8
 **/
public class Bubble {
    public static void main(String[] args){
        int[] arrays = {2,45,23,121,1,35,88};
        System.out.println(Arrays.toString(sort(arrays)));
    }

    public static int[] sort(int[] arrays){
        int number = 0;
        for (int i = 0 ; i < arrays.length; i++) {
            for (int j = 0 ; j < arrays.length-i-1 ; j++) {
                if (arrays[j] > arrays[j+1]){
                    number = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = number;
                }
            }
        }
        return arrays;
    }
}
