package com.itheima.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 目标：认识Lambda表达式，搞清楚其基本作用
    MyInterface mi = new MyInterface() {
        @Override
        public void method() {
            System.out.println("匿名内部类方法");
        }
    };
    mi.method();

    MyInterface mi2 = ()->{
        System.out.println("Lambda表达式方法");
    };
    mi2.method();


    }
}

// 函数式接口：只有一个抽象方法的接口
@FunctionalInterface // 函数式接口注解
interface MyInterface {
    public void method();
}