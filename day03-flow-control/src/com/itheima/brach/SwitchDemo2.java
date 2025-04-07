package com.itheima.brach;

public class SwitchDemo2 {
    public static void main(String[] args) {
        // 目标 学习switch的基本用法
        test();

    }

    public static void test(){
        int day = 3;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("error");
        }
    }
}
