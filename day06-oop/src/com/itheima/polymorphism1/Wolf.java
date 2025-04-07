package com.itheima.polymorphism1;

public class Wolf extends Animal{
    String name = "Wolf";
    @Override
    public void run(){
        System.out.println("🐺 Wolf is running");
    }
}
