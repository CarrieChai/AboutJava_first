package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args){
//        目标 认识变量
        printPoetryLine();
        System.out.println("==============");
        printChar();
        System.out.println("==============");
        printNumber();
    }
//    定义一个方法,来学习变量的意义
    public static void printPoetryLine(){
//        定义一个变量,用来存储诗句
        int age = 18;
        System.out.println(age);

//        定义一个小数变量，存储一个学生的成绩
        double score = 99.5;
        System.out.println(score);

//        定义一个变量 存储剩余零钱
        double money = 0.01;
//        零钱多了5
        money = money + 5;
        System.out.println(money);
    }
//    定义一个方法，用来学习字符的二进制存储
    public static void printChar(){
//        定义一个变量，用来存储字符
        char ch = 'a'; //a 97
        System.out.println(ch);// a
        System.out.println(ch + 1); //98

        char ch2 = 'A';// A 65
        System.out.println(ch2);// A
        System.out.println(ch2 + 1);// 66

    }
//    定义一个方法，用来学习二进制、八进制、十六进制
    public static void printNumber(){
        int i1 = 0B01100001; // 97的二进制  二进制必须以0B开头
        System.out.println(i1);

        int i2 = 0141;// 97的八进制  八进制必须以0开头
        System.out.println(i2);

        int i3 = 0X61;// 97的十六进制  十六进制必须以0X开头
        System.out.println(i3);

        int i4 = 0xFA;// 250的十六进制  十六进制必须以0X开头
        System.out.println(i4);



    }

}
