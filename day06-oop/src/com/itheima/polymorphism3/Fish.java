package com.itheima.polymorphism3;

public class Fish extends Animal {
    @Override
    public void run()
    {
        System.out.println("鱼跑");
    }

    // 定义一个鱼的独有方法 吐泡泡
    public void bubble()
    {
        System.out.println("鱼吐泡泡");
    }
}
