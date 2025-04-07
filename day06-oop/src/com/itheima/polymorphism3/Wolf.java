package com.itheima.polymorphism3;

public class Wolf extends Animal {
    @Override
    public void run(){
        System.out.println("狼跑");
    }

    // 定义一个狼的独有方法 狼嚎叫
    public void howl(){
        System.out.println("狼嚎叫");
    }
}
