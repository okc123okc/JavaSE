package com.okc.oop.demo04;

/**
 * @ClassName: Student 派生类，子类
 * @Author: okc
 * @Date: 2021/4/20 0:24
 * @Version 1.8
 **/
public class Student extends Person{
    //子类继承了父类，拥有父类的所有方法
    //私有的无法被继承
    private String name = "xiaoming";
    public Student(){
        System.out.println("Student无参数调用了");
    }

    @Override
    public void say() {
        //这里隐藏了代码 super()；
        System.out.println("Student say()调用了");
    }

    public void test1(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }
    public void test2(){
        say();
        this.say();
        super.say();
    }
}


/*
 super注意点：
 1.super调用父类的构造方法，必须在构造方法的第一个
 2.super必须只能出现在子类的方法或者构造方法中
 3super和this不能同时调用构造方法

 VS this：
    代表的对象不同：
        this:本身调用这个对象
        super：代表父类对象的应用
    前提：
        this：没有继承也可以用
        super：只能在继承条件才可以使用
    构造方法：
        this():本类的构造
        super()：父类的构造
*/