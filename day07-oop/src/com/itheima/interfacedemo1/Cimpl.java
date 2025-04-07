package com.itheima.interfacedemo1;

public class Cimpl implements A, B{
    @Override
    public void show() {
        System.out.println("Cimpl show...");
    }
    @Override
    public void go() {
        System.out.println("Cimpl go...");
    }
}
