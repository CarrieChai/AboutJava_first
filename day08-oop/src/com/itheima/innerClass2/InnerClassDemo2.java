package com.itheima.innerClass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 目标：搞清楚静态内部类的语法。
        Outer.Inner oi = new Outer.Inner();
        oi.show();
    }
}
