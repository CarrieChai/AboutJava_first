package com.itheima.demo;

public class SilverCard extends Card{
    public SilverCard(String carId, String ownerName, String phone, int balance) {
        super(carId, ownerName, phone, balance);
    }

    @Override
    public void consume(double money) {
        System.out.println("当前消费："+money);
        System.out.println("金卡会员优惠价："+money*0.9);
        if (getBalance()<money*0.9){
            System.out.println("您当前的余额是："+getBalance()+"，当前余额不足！请存钱");
            return;
        }
        // 更新金卡的账户余额
        setBalance(getBalance()-money*0.9);
    }
}
