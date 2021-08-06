package com.okc.struct;

/**
 * @ClassName: SwitchDemo01 多选择结构switch
 * @Author: okc
 * @Date: 2021/4/13 22:49
 * @Version 1.8
 **/
public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透 :不加break的情况
        //switch：匹配一个具体的值
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
