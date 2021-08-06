package com.okc.struct;

/**
 * @ClassName: Demo
 * @Author: okc
 * @Date: 2021/4/13 23:37
 * @Version 1.8
 **/
public class Demo {
    public static void main(String[] args) {
        //打印九九乘法表
        //for
        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1 ; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            //循环完一次换行
            System.out.println();
        }
        //while
        int x = 0;
        while (x<=8){
            x++;
            int y = 0;
            while (y<x){
                y++;
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
        }
        //do while
        int w = 0;
        do {
            w++;
            int z =0;
            do {
                z++;
                System.out.print(w+"*"+z+"="+w*z+"\t");
            }while (z < w);
            System.out.println();
        }while (w < 9);
        //打印正三角形 5
        for (int s = 1 ; s <= 5 ; s++) {
            for (int b = 5 ; b >= s ; b--) {
                System.out.print(" ");
            }
            for (int b = 1 ; b <= s ; b++) {
                System.out.print("*");
            }
            for (int b = 1 ; b < s ; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
