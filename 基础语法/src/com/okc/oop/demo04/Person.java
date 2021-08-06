package com.okc.oop.demo04;

/**
 * @ClassName: Person  父类
 * @Author: okc
 * @Date: 2021/4/20 0:24
 * @Version 1.8
 **/
public class Person {
    //public
    //protected
    //default
    //private
    protected String name = "小明";
    public Person(){
        System.out.println("Person无参数调用了");
    }
    public void say() {
        System.out.println("Person say()调用了");
    }
}
