package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目标 掌握条件运算符
        print();
    }

    public static void print() {
        int a = 10;
        int b = 20;

        // 条件运算符
        // 条件表达式 ? 表达式1 : 表达式2
        // 如果条件表达式为真，则返回表达式1的值，否则返回表达式2的值
        int max = a > b ? a : b;
        System.out.println("max number: "+max);
    }
}
