package com.okc.oop.demo02;

/**
 * @ClassName: Application
 * @Author: okc
 * @Date: 2021/4/18 14:01
 * @Version 1.8
 **/
public class Application {
    public static void main(String[] args) {
        //new实例化了一个对象
        Person person = new Person();
        Person person1 = new Person("okc");

        System.out.println(person.name);
        System.out.println(person1.name);

    }
}


/*//类是抽象的，需要实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        Student student = new Student();
        student.name="okc";
        student.study();
*/
/*//构造器 ：
1.和类名相同
2.没有返回值
作用：
1.new 本质在调用构造方法
2：初始化对象的值
注意点：一旦定义了有参构造，无参数必须显示定义
*/