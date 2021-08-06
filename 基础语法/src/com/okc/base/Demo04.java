package com.okc.base;

/**
 * @ClassName: com.okc.base.Demo04 变量及其作用域
 * @Author: okc
 * @Date: 2021/4/12 17:08
 * @Version 11
 **/
public class Demo04 {
    //类变量 static
    static double salary = 2500;
    //实例变量：从属于对象。如果不进行初始化，这个基本类型的默认值为0
    //布尔值：默认false
    //除了基本类型，其余的默认值是null
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);
        //变量类型 变量名字 = new com.okc.base.Demo04();
        Demo04 demo04 = new Demo04();
        System.out.println(demo04.age);
        System.out.println(demo04.name);
        //0 null
        //类变量 static
        System.out.println(salary);
        //2500.0
    }
}
