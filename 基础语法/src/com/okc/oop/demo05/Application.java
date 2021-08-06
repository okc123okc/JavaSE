package com.okc.oop.demo05;

/**
 * @ClassName: Application
 * @Author: okc
 * @Date: 2021/4/25 23:48
 * @Version 1.8
 **/
public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定:父类的引用指向子类
        //Student能调用的方法都是自己的或继承父类的
        Student s1 = new Student();
        //Person父类型，可以指向子类，但不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        //子类重写了父类的方法，执行子类
        s2.run();
        s1.run();
        //对象能执行的方法，主要看左边类型，与右边关系不打
        //s2.eat();无法调用
        //类型之间的转换：父类->子类
        ((Student)s2).eat();
        //eat
    }
}
