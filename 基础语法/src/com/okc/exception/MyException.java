package com.okc.exception;

/**
 * @ClassName: MyException 自定义异常
 * @Date: 2021/4/28 0:25
 * @Version 1.8
 **/
public class MyException extends Exception {
    //传递数字>10
    private int detail;

    public MyException(int a){
        this.detail=a;
    }

    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
