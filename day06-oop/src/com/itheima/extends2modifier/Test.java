package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        System.out.println("同一个包 不同的类");
        Father f = new Father();
        f.publicMethod3(); // 可以访问
        f.defaultMethod1(); // 可以访问
        f.protectedMethod2(); // 可以访问
//        f.privateMethod(); // 不能访问  私有方法不能被继承

    }
}
