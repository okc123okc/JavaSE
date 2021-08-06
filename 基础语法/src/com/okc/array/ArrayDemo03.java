package com.okc.array;

/**
 * @ClassName: ArrayDemo03 数组进阶使用
 * @Author: okc
 * @Date: 2021/4/17 13:58
 * @Version 1.8
 **/
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
       /*
       //没有下标
        for (int array : arrays) {
            System.out.println(array);
        }
        */
        printArrays(arrays);
        int[] reverse = reverse(arrays);
        printArrays(reverse);
    }
    //打印数组元素
    public static void printArrays(int[] arrays){
        for (int i = 0 ; i < arrays.length ; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }
    //数组反转
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0,j = arrays.length-1 ; i < arrays.length ; i++,j--) {
            result[j] = arrays[i];
        }
        return result;
    }
}
