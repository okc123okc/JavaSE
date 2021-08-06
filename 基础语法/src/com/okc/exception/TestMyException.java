package com.okc.exception;

/**
 * @ClassName: TestMyException
 * @Author: okc
 * @Date: 2021/4/28 0:31
 * @Version 1.8
 **/
public class TestMyException {
    //可能会存在异常的方法
    static void test(int a) throws MyException{
        System.out.println("传递的参数："+a);
        if (a>10){
            throw new MyException(a);
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("出错啦");
            e.printStackTrace();
        }
    }
}
