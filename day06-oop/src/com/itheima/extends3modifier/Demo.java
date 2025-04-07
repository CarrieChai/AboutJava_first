package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Father;

public class Demo {
    public static void main(String[] args) {
        System.out.println("不同的包 不同的类 即任意位置");
        Father father = new Father();
        father.publicMethod3();
//        father.protectedMethod2(); // 不可以访问
//        father.defaultMethod1(); // 不可以访问
//        father.privateMethod(); // 不可以访问

    }
}
