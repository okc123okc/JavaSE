package com.okc.operator;

/**
 * @ClassName: Demo08 三元运算符
 * @Author: okc
 * @Date: 2021/4/13 13:30
 * @Version 11
 **/
public class Demo08 {
    public static void main(String[] args) {
        //x ? y : z
        //如果x==true,则结果为y,否则结果为z
        int score = 59;
        String type = score < 60 ? "不及格":"及格";
        System.out.println(type);
        //不及格
    }
}
