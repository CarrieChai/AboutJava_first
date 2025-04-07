package com.itheima.interfacedemo1;
// 接口：定义了若干个方法，但是方法没有具体的实现，使用interface关键字定义
public interface A {
    // JDK8之前，接口中只能定义常量和抽象方法
    // 1. 常量：public static final可以省略不写，但是建议写上
//    public static final int NUM = 10;
    int NUM = 10;  // 这两个的效果是等价的

    // 2. 抽象方法：public abstract可以省略不写，但是建议写上
//    public abstract void show();  // 这两个的效果是等价的
    void show();


}
