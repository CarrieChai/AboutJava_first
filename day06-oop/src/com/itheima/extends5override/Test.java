package com.itheima.extends5override;

public class Test {
    public static void main(String[] args) {
        // 目标 认识重写的相关知识点
        Dog dog = new Dog();
        dog.eat();
        dog.cry();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }
    public static void cry(){
        System.out.println("Animal cry");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
//    可以另外写一个静态方法  但是不能重写静态方法
    public static void cry() {
        System.out.println("Dog cry");
    }
}
