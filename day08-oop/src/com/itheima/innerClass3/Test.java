package com.itheima.innerClass3;

public class Test {
    public static void main(String[] args) {
        // 目标：认识匿名内部类。搞清楚其基本作用。
        // 匿名内部类：没有名字的内部类，只能使用一次。
        // 匿名内部类实际上是有名字：外部类名$编号.class
        // 匿名内部类本质是一个子类，同时会立即构建一个子类对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("狗叫...");
            }
        };
        a.cry();
    }
}
