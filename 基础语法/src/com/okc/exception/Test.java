package com.okc.exception;

/**
 * @ClassName: Test
 * @Author: okc
 * @Date: 2021/4/28 0:08
 * @Version 1.8
 **/
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {//监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){//捕获异常 catch(想要捕获的异常类型) Throwable 最大 Exception Error
            System.out.println("程序出现异常，变量不能为0");
        }finally {//处理善后工作
            System.out.println("finally");
        }
    }
    //假设这方法中，处理不了这个异常。方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if (b==0){
            //主动抛出异常，throw 一般在方法中使用
            throw new ArithmeticException();
        }
    }

}
