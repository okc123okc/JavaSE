package com.okc.scanner;

import java.util.Scanner;

/**
 * @ClassName: Demo04 Scanner 小案例
 * @Author: okc
 * @Date: 2021/4/13 22:21
 * @Version 1.8
 **/
public class Demo04 {
    public static void main(String[] args) {
        //计算多个数的平均值，当输入非数字时，输出结果
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double v = scanner.nextDouble();
            m++;
            sum+=v;
            System.out.println("您当前输入的是第"+m+"个数，"+"sum="+sum);
        }
        System.out.println("sum="+sum+",average="+sum/m);
        scanner.close();
    }
}
