package com.okc.array;

import java.util.Arrays;

/**
 * @ClassName: ArrayDemo05 工具类Arrays
 * @Author: okc
 * @Date: 2021/4/17 20:35
 * @Version 1.8
 **/
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] a = {1,233,4234,2332,35,656,899};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        //[I@14ae5a5
        //[1, 233, 4234, 2332, 35, 656, 899]
        printArrays(a);
        //排序：升序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //数组填充
        Arrays.fill(a, 0);
        //Arrays.fill(a, 2,4,0); //选择区域填充
        System.out.println(Arrays.toString(a));
        //[0, 0, 0, 0, 0, 0, 0]
    }
    /**
     * @description 仿写Arrays.toString
     */
    public static void printArrays(int[] a){
        for (int i = 0 ; i < a.length ; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.println(a[i]+"]");
            }else{
                System.out.print(a[i]+", ");
            }

        }
    }

}
