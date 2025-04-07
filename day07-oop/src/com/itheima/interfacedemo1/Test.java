package com.itheima.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        // 目标：认识接口，搞清楚接口的特点和基本使用
        System.out.println(A.NUM);
        // 接口不能创建对象
//        A a = new A();  // 'A' 为 abstract；无法实例化

        // 接口是用来被实现的
        Cimpl c = new Cimpl();
        c.go();
        c.show();
    }
}
