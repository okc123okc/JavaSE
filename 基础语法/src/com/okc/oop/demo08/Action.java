package com.okc.oop.demo08;

/**
 * @ClassName: Action abstract 抽象类
 * 约束 想要有人帮我们实现
 * @Author: okc
 * @Date: 2021/4/27 14:41
 * @Version 1.8
 **/
public abstract class Action {
    //abstract，抽象方法，只有方法名字，没有方法的实现
    public abstract void doSomething();

    //不能new这个抽象类，只能靠子类去实现它
    //抽象类中可以写普通方法
    //抽象方法必须在抽象类中
}
