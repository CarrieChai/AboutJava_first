package com.itheima.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        // 目标：理解接口的好处和应用
        // 接口弥补了类单继承的不足，可以让类实现多个接口
        // 接口可以实现面向接口编程，减少耦合度
        People p = new Man();
        Boyfriend b = new Man();
        Driver d = new Man();

    }
}

interface Driver{}
interface Boyfriend{}
class People{}
class Man extends People implements Driver, Boyfriend{}