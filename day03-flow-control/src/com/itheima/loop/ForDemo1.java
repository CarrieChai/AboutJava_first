package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        // 目标 学习for循环的用法
        test();
    }

    public static void test() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }
        System.out.println("=================");
        for (int i = 0; i < 9; i+=2) {
            System.out.println(i);// 0 2 4 6 8
        }
    }
}
