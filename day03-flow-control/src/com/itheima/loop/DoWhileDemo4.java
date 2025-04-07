package com.itheima.loop;

public class DoWhileDemo4 {
    public static void main(String[] args) {
        // 目标：理解do...while循环
        test1();
    }

    public static void test1() {
        int i = 0;
        do {
            System.out.println("hello world");
            i++;
        } while (i < 3);
    }
}
