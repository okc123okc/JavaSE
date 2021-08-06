package com.test;

/**
 * @ClassName: TheFirstUpperCase
 * @Author: okc
 * @Date: 2021/5/24 0:23
 * @Version 1.8
 **/
public class TheFirstUpperCase {
    public static void main(String[] args) {
        System.out.println(StringUtil.initCap("hello"));
        System.out.println(StringUtil.initCap("h"));
    }
}

class StringUtil{
    public static String initCap(String str){
        if (str == null || "".equals(str)){
            return str;
        }
        if (str.length()==1){
            return str.toUpperCase();
        }
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}