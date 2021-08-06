package com.test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: Test2 计算任意两个日期之间间隔的天数
 * @Author: okc
 * @Date: 2021/7/12 23:07
 * @Version 1.8
 **/


public class Test2 {


    //定义时间格式
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String []args) throws Exception{
        String first = "2021-6-11";
        String second = "2021-7-12";
        //格式化处理
        Date firstDate = format.parse(first);
        Date secondDate = format.parse(second);
        int number = longOfTwoDate(firstDate, secondDate);
        System.out.println(number);
    }

    /**
     * @Description: longOfTwoDate方法是计算时间差（天数）
     * @param: [first, second]
     * @param first 第一个日期
     * @param second 第二个日期
     * @return: int
     */
    public static int longOfTwoDate(Date first,Date second) {
        //对日期进行操作
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(first);
        int numberDay = 0;
        //对比计算
        while(calendar.getTime().compareTo(second)!=0){
            calendar.add(Calendar.DATE, 1);
            numberDay++;
        }
        return numberDay;
    }
}