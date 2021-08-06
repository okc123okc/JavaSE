package com.okc.method;

/**
 * @ClassName: Demo04
 * @Author: okc
 * @Date: 2021/4/16 14:41
 * @Version 1.8
 **/
public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,54,45,546,656,6565);
        demo04.getMax(1,2,54,45,546,656,6565);


    }
    //可变参数
    public void test(int...x){
        for (int i = 0 ; i < x.length ; i++) {
            System.out.println(x[i]);
        }
    }
    //找最大值
    public void getMax(double...y){
        double result = y[0];
        //排序
        for (int i = 0 ; i < y.length ; i++) {
            if (result<y[i]){
                result = y[i];
            }
        }
        System.out.println("The max num is："+result);
    }
}
