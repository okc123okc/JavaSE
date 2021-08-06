package com.okc.oop.demo10;

/**
 * @ClassName: Test
 * @Author: okc
 * @Date: 2021/4/27 15:39
 * @Version 1.8
 **/
public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用将实例保存到变量中
        //匿名对象的使用
        new Apple().eat();
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }

}