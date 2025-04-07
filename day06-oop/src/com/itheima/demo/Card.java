package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 卡片信息包括车牌号码 车主姓名 电话号码 卡片余额
@Data // @Data注解可以自动生成getter setter toString方法
@AllArgsConstructor // @AllArgsConstructor注解可以自动生成带参数的构造方法
@NoArgsConstructor // @NoArgsConstructor注解可以自动生成无参数的构造方法
public class Card {
    private String carId; // 车牌号码
    private String ownerName; // 车主姓名
    private String phone; // 电话号码
    private double balance; // 卡片余额

    // 预存金额
    public void deposit(double money){
        this.balance+=money;
    }

    // 消费金额
    public void consume(double money){
        this.balance-=money;
    }

}
