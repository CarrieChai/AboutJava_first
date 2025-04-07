package com.itheima.polymorphism1;

public class Fish extends Animal{
    String name = "fish";
    @Override
    public void run() {
        System.out.println("🐟 fish is running");
    }
}
