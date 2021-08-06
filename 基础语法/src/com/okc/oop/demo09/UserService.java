package com.okc.oop.demo09;

/**
 * @ClassName: UserService 接口
 * 关键字 interface
 * @Author: okc
 * @Date: 2021/4/27 15:03
 * @Version 1.8
 **/
public interface UserService {
    //接口中所有定义的方法其实都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

    //接口中定义的属性默认是 public static final 常量
    //一般不会在接口中使用定义常量
    int age = 99;
}
