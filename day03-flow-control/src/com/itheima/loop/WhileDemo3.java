package com.itheima.loop;

public class WhileDemo3 {
    public static void main(String[] args) {
        // While循环的几个案例
        System.out.println(test1());
        System.out.println("===============");
        System.out.println(test2());
        System.out.println("===============");
        System.out.println(test3());
    }

    // 1. 10万，年利率17%，求多少年可以存够20万
    public static int test1(){
        int year = 0;
        double money = 100000;
        double rate = 0.017;
        while(money < 200000){
            money=money*(1+rate);
            year++;
        }
        return year;
    }

    // 2. 纸张0.1mm，求多少张纸摞在一起可以达到珠穆朗玛峰的高度
    public static int test2(){
        double h_mount = 8848860;
        double h_paper = 0.1;
        double h = 0;
        int i = 0;
        while(h<h_mount){
            h=h_paper*i;
            i++;
        }
        return i;
    }

    // 3. 纸张0.1mm，求多少次翻倍可以达到珠穆朗玛峰的高度
    public static int test3(){
        double h_mount = 8848860;
        double h_paper = 0.1;
        int count = 0;
        while (h_paper<h_mount){
            h_paper = h_paper*2;
            count++;
        }

        return count;
    }




}
