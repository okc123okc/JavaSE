package com.okc.oop.demo02;

/**
 * @ClassName: Person
 * @Author: okc
 * @Date: 2021/4/18 17:56
 * @Version 1.8
 **/
public class Person {
    //一个类即使什么都不写，它也会存在一个方法
    //若是什么都不写，在Person中会默认存在public Person(){}

    String name;

    //实例化初始值
    //使用new关键字，本质是在调用构造器
    public Person() {
    }

    //有参构造：一旦定义了有参构造，无参数必须显示定义
    public Person(String name) {
        this.name = name;
    }
}
