package com.itheima.demo;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class GoldCard extends Card{


    public GoldCard(String carId, String ownerName, String phone, int balance) {
        super(carId, ownerName, phone, balance);
    }

    @Override
    public void consume(double money) {
        System.out.println("当前消费："+money);
        System.out.println("金卡会员优惠价："+money*0.8);
        if (getBalance()<money*0.8){
            System.out.println("您当前的余额是："+getBalance()+"，当前余额不足！请存钱");
            return;
        }
        // 更新金卡的账户余额
        setBalance(getBalance()-money*0.8);
        // 判断消费如果大于200 调用一个独有功能 打印洗车票
        if(money>200){
            printWashCarTicket();
        }else {
            System.out.println("当前消费不满200元，不能免费洗车");
        }

    }

    public void printWashCarTicket(){
        System.out.println("您消费了，请打印洗车票");
    }


}
