package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标 掌握自增和自减运算符
        print();
    }

    public static void print() {
        int a = 10;
        System.out.println(a++); // 10
        System.out.println(a); //11
        System.out.println(++a); //12
        System.out.println(a);   //12

        int b = 10;
        System.out.println(b--); //10
        System.out.println(b);    //9
        System.out.println(--b);//8
        System.out.println(b);//8
    }



}
