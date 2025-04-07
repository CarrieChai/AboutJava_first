package com.itheima.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的应用场景。
        Animal dog = new Dog();
        dog.howl();
        Animal cat = new Cat();
        cat.howl();
    }
}
