package com.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Demo01
 * @Author: okc
 * @Date: 2021/4/18 15:11
 * @Version 1.8
 **/
public class Demo03 {
    public static void main(String[] args) {
        //定义组数
        int T;
        //闯关成功记录数
        int N;
        //定义id
        int[] P ;
        //分数
        int[] S;
        //礼品数
        int result = 0;
        //中位数
        float middle;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        N = sc.nextInt();
        int[] array = new int[N];
        int ans = 0, x;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                x = sc.nextInt();
                if (j%2!=0){
                    //存入数组
                    array[i] = x;
                    ans += x;
                }
                if (j%2==0){

                }
            }
        }
        //升序
        Arrays.sort(array);
        //System.out.println(ans);
        //System.out.println(Arrays.toString(array));
        middle=middle(array);
        System.out.println(middle);

        //System.out.println(T);
        //scanner.close();
    }
    public static float middle(int[] array){
        //取出数组中位数
        float middle=0;
        for (int i = 0 ; i <array.length  ; i++) {
            if (array.length%2!=0){
                middle=array[array.length/2-1];
            }else{
                middle=(array[array.length/2-1]+array[array.length/2])/2;
            }
        }
        return middle;
    }
}
