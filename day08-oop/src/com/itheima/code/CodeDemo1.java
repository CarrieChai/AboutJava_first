package com.itheima.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String [] cards = new String[54];  // 这个静态变量可以在任意位置初始化，但是放在静态代码块中更适合
    // 静态代码块：静态代码块在类加载的时候执行，只执行一次
    // 使用static修饰，属于类，与类一起优先加载
    // 基本作用：可以完成对类的静态资源的初始化
    static {
        System.out.println("静态代码块");
        cards[0] = "大王";
        cards[1] = "小王";
        // ...
    } // 无论这个代码块放哪里都会先执行

    public static void main(String[] args) {
        // 目标：认识代码块，搞清楚代码块的基本作用
        System.out.println("main方法");
        System.out.println(Arrays.toString(cards));
    }
}
