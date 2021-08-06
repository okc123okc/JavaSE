package com.okc.scanner;

import java.util.Scanner;

/**
 * @ClassName: Demo03
 * @Author: okc
 * @Date: 2021/4/13 22:07
 * @Version 1.8
 **/
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据：" + i);
        }else {
            System.out.println("输入的不是整数");
        }

        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据：" + f);
        }else {
            System.out.println("输入的不是小数");
        }
        scanner.close();

    }
}
