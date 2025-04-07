package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标： 加油站致富小程序
        // 1 创建卡片类 以便创建金卡或银卡对象 封装车主的数据
        // 2 创建卡片父类Card 定义金卡和银卡的共同属性和方法
        // 3 定义一个金卡类 继承Card类 金卡必须重写消费方法（8折优惠） 独有功能 打印洗车票
        // 3 定义一个银卡类 继承Card类 银卡必须重写消费方法（9折优惠）
        // 4 办一张金卡：创建金卡对象 交给一个独立的业务（支付机）来完成 用于存款和消费
        GoldCard goldCard = new GoldCard("晋A0000","张三","12345678998",5000);
        // 4 办一张银卡：创建银卡对象 交给一个独立的业务（支付机）来完成 用于存款和消费
        SilverCard silverCard = new SilverCard("晋A0001","李四","12345678999",2000);
        pay(silverCard);

    }

    // 支付机：用一个办法来刷卡  可能接受金卡 也可能银卡
    public static void pay(Card card) {
        System.out.println("请刷卡，请输入当前消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);


    }

}
