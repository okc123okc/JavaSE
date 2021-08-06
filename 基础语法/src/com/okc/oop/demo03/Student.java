package com.okc.oop.demo03;

/**
 * @ClassName: Student
 * @Author: okc
 * @Date: 2021/4/18 21:54
 * @Version 1.8
 **/
public class Student {
    //属性私有
    private String name;
    private int age;
    private char sex;

    //通过public的get、set方法来进行操作这个属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0){
            this.age=0;
        }else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
