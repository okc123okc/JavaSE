package com.okc.oop.demo10;

/**
 * @ClassName: Outer
 * @Author: okc
 * @Date: 2021/4/27 15:25
 * @Version 1.8
 **/
public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的的方法");
    }
    public void method(){
        //局部内部类
        class Inner2{

        }
    }


    //成员内部类
    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
    //静态内部类
    public static class Inner1{
        public void in(){
            System.out.println("静态内部类");
        }
        //无法调用外部类的私有属性，static先编译执行了
    }
}
//内部类
class A{
    public static void main(String[] args) {

    }
}