package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标 掌握逻辑运算符
        find(96,50);
        System.out.println("=========================");
        find2(96,50);
        System.out.println("=========================");
        print();
    }

    //需求：我要找一个语文成绩大于95且数学成绩大于88的同学
    public static void find(int a, int b) {
        System.out.println(a>=95 & b>=88); //逻辑与 & 两个条件同时成立为真，否则为假
    }
    //需求：我要找一个语文成绩大于95或数学成绩大于88的同学
    public static void find2(int a, int b) {
        System.out.println(a>=95 | b>=88); //逻辑或 | 两个条件有一个成立为真，否则为假
    }



    public static void print() {
        int a = 111;
        int b = 2;
        //System.out.println(a>1000 && b++>1); //false && 表示逻辑与，如果左边为假，右边不执行，如果左边为真，右边执行
        System.out.println(a>1000 & b++>1);//false & 表示逻辑与，如果左边为假，右边执行，如果左边为真，右边执行
        System.out.println(b);


    }
}
