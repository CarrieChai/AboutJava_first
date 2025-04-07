package com.itheima.object;

import java.time.LocalDate;
import java.util.Date;

public class BookTest {
    public static void main(String[] args) {
        //目标 学习Java自带的Data类
        Date d = new Date();
        System.out.println(d); //Thu Mar 06 11:31:27 CST 2025
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2025-03-06
        int day = 199/6;
        System.out.println(day);//33
        LocalDate l =localDate.plusDays(day);
        System.out.println(day+"天之后是"+l);//33天之后是2025-04-08
    }
}
