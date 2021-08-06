package com.okc.struct;

/**
 * @ClassName: ForDemo03
 * @Author: okc
 * @Date: 2021/4/13 23:30
 * @Version 1.8
 **/
public class ForDemo03 {
    public static void main(String[] args) {
        //输出1-1000被5整除的数，每三个换行
        for (int i = 1 ; i < 1000 ; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println();
            }
        }
    }
}
