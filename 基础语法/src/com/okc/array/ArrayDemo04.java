package com.okc.array;

/**
 * @ClassName: ArrayDemo04  二维数组
 * @Author: okc
 * @Date: 2021/4/17 20:20
 * @Version 1.8
 **/
public class ArrayDemo04 {
    public static void main(String[] args) {
        //[4][2]
        /*
         1,2  array[0]
         2,3  array[1]
         3,4  array[2]
         4,5  array[3]
        */
        int[][] arrays = {{1,2},{2,3},{3,4},{4,5}};
        printArrays(arrays[0]);
        System.out.println("");
        System.out.println(arrays[0][0]);
        System.out.println(arrays[0][1]);
        //1	2
        //1
        //2
        for (int i = 0 ; i < arrays.length ; i++) {
            for (int j = 0 ; j <arrays[0].length  ; j++) {
                System.out.println(arrays[i][j]);
            }
        }
        //1
        //2
        //2
        //3
        //3
        //4
        //4
        //5
    }
    public static void printArrays(int[] arrays){
        for (int i = 0 ; i < arrays.length ; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }
}
