package com.okc.oop.demo10;

/**
 * @ClassName: Application
 * @Author: okc
 * @Date: 2021/4/27 15:25
 * @Version 1.8
 **/
public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getID();
    }
}
