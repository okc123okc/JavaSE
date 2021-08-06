package com.okc.oop.demo01;

/**
 * @ClassName: Demo02 引用传递：对象，本质还是值传递
 * @Author: okc
 * @Date: 2021/4/18 13:48
 * @Version 1.8
 **/
public class Demo02 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        //null
        Demo02.change(person);
        System.out.println(person.name);
        //okc
    }

    private static void change(Person person) {
        person.name="okc";
    }
}
/**
 *定义一个Person类，有一个属性：name
*/

class Person{
    String name;
}