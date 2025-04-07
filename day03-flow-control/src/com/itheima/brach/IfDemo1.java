package com.itheima.brach;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标 掌握If的基本使用
        test();
        test2();
        test3();
    }

    public static void test() {
        int age = 2;
        if (age>=18){
            System.out.println("can play");
        }
        System.out.println("go to bed");
    }

    public static void test2(){
        int money = 100000;
        if(money>50000){
            System.out.println("buy a car");
        }else {
            System.out.println("buy a pee");
        }
    }

    public static void test3(){
        int score = 78;
        if(score>=90&&score<=100){
            System.out.println("A");
        }else if(score>=80&&score<90){
            System.out.println("B");
        }else if(score>=70&&score<80){
            System.out.println("C");
        }else if(score>=60&&score<70){
            System.out.println("D");
        }else if (score>=0&&score<60){
            System.out.println("E");
        }else {
            System.out.println("error");
        }
    }
}
