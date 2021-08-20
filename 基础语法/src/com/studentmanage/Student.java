package com.studentmanage;

/**
 * @Package: com.studentmanage
 * @ClassName: Student
 * @Description:
 * @Author: okc
 * @Date: 2021/8/20 22:47
 * @Version 1.8
 **/

public class Student {
    private String sid;
    private String name;
    private String age;
    private String sex;
    private String address;

    public Student() {
    }

    public Student(String sid , String name , String age , String sex , String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
