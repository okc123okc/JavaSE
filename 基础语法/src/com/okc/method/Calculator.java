package com.okc.method;

import java.util.Scanner;

/**
 * @ClassName: Calculator
 * @Author: okc
 * @Date: 2021/4/16 15:32
 * @Version 1.8
 **/
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = "";
        int n1 = 0;
        int n2 = 0;
        Calculator calculator = new Calculator();
        while (true){
            System.out.println("请选择加减乘除（+-*/）,输入其他字符即可退出");
            if (scanner.hasNext()){
                choose=scanner.next();
            }
            System.out.println("请输入第一个数：");
            if (scanner.hasNextInt()){
                n1=scanner.nextInt();
            }
            System.out.println("请输入第二个数：");
            if (scanner.hasNextInt()){
                n2=scanner.nextInt();
            }
            switch (choose){
                case "+" :
                    System.out.println(calculator.add(n1, n2));
                    break;
                case "-" :
                    System.out.println(calculator.sub(n1, n2));
                    break;
                case "*" :
                    System.out.println(calculator.mul(n1, n2));
                    break;
                case "/" :
                    System.out.println(calculator.div(n1, n2));
                    break;
                default:
                    scanner.close();
            }
        }

    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int mul(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
