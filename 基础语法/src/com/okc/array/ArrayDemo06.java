package com.okc.array;

import java.util.Arrays;

/**
 * @ClassName: ArrayDemo06 冒泡排序
 * @Author: okc
 * @Date: 2021/4/17 20:56
 * @Version 1.8
 **/
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,34,45,56234,21,345,652131,311};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }
    /**
     * @description 冒泡排序
     * 比较数组中，两个相邻的元素，如果第一个数比第二个数大，则交换位置
     * 每一次比较，都会产生出一个最大，或者最小的数字
     * 下一轮则可以少一次排序
     * 依次循环，直到结束
     */
    public static int[] sort(int[] arrays){
        int num = 0;
        //外层循环，判断需要走多少次
        for (int i = 0 ; i < arrays.length  ; i++) {
            //标志位，减少没有意义的比较
            boolean flag = false;
            //内层循环，比较两个数，第一个数比第二个数大，则交换位置
            for (int j = 0 ; j < arrays.length-1-i ; j++) {
                if (arrays[j+1]<arrays[j]){
                    num = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = num;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return arrays;
    }

}
