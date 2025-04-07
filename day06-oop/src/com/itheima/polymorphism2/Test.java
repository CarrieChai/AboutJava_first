package com.itheima.polymorphism2;

public class Test {
    public static void main(String[] args) {
        // 目标 认识多态代码
        // 多态优点1 右边对象是解耦合的
        Animal a1 = new Wolf();
        a1.run();

        // 多态优点2 左边的父类类型可以接受一个子类对象
        Wolf w1 = new Wolf();
        go(w1);
        Fish f1 = new Fish();
        go(f1);

    }

    public static void go(Animal a1) {
        System.out.println("go");
        a1.run();
    }
}
