package com.itheima.polymorphism3;

public class Test {
    public static void main(String[] args) {
        // 目标 多态下的强制类型转换
        Animal a1 = new Wolf();
        go(a1);
        Animal a2 = new Fish();
        go(a2);


    }

    public static void go(Animal a1) {
        System.out.println("go");
        a1.run();

        if (a1 instanceof Wolf) {
            Wolf w1 = (Wolf) a1;
            w1.howl();
        } else if (a1 instanceof Fish) {
            Fish f1 = (Fish) a1;
            f1.bubble();
        } else {
            System.out.println("error");
        }
    }
}
