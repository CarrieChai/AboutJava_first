package com.itheima.singleinstance;
// 设计成单例设计模式
public class A {
    // 1.私有化构造器：避免外部创建多个对象
    private A(){}
    // 2.创建一个私有的静态变量，保存唯一对象
    private static A instance = new A();
    // 3.提供一个共有的静态方法，返回唯一对象
    public static A getInstance(){
        return instance;
    }

}
