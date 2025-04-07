package com.itheima.loop;

public class ForForDemo6 {
    public static void main(String[] args) {
        // 目标 掌握循环嵌套的基本语法
        test();
        test2();
    }

    // 打印一个五行四列的星号
    public static void test(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 打印一个九九乘法表
    public static void test2(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
