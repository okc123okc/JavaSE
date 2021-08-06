package com.okc.struct;

/**
 * @ClassName: SwitchDemo02
 * @Author: okc
 * @Date: 2021/4/13 22:55
 * @Version 1.8
 **/
public class SwitchDemo02 {
    public static void main(String[] args) {
        //switch 支持String:其实质通过哈希值去匹配
        String name = "okc";
        switch (name){
            case "okc":
                System.out.println("okc");
                break;
            case "欧":
                System.out.println("欧");
                break;
            default:
                System.out.println("未知");
        }
    }
}
