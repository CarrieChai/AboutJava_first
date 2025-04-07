package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标 掌握关系运算符
        print();
        System.out.println("=========================");
        print2();
    }

    public static void print() {
        int a = 10;
        int b = 20;

        System.out.println(a > b); //false
        System.out.println(a < b); //true
        System.out.println(a >= b); //false  大于或等于
        System.out.println(a <= b); //true  小于或等于
        System.out.println(a == b); //false
        System.out.println(a != b); //true
    }

    public static void print2() {
        int a = 10;
        int b = 10;

        System.out.println(a > b); // false
        System.out.println(a < b); // false
        System.out.println(a >= b); // true  大于或等于
        System.out.println(a <= b); // true 小于或等于
        System.out.println(a == b); // true
        System.out.println(a != b); // false
    }

}
