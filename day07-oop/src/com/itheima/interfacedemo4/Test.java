package com.itheima.interfacedemo4;

public class Test {
    public static void main(String[] args) {
        // 目标：接口新增的三种方法
        A.staticMethod();
//        A.defaultMethod(); // 报错


        A a = new AImpl();
        a.defaultMethod();


    }
}

class AImpl implements A {
}
