package com.itheima.loop;

public class BreakAndContinueDemo7 {
    public static void main(String[] args) {
        // 目标：理解break和continue的用法
        test();

    }

    public static void test(){
        System.out.println("========break=========");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }
        System.out.println("========continue=========");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                continue;
            }
        }
    }
}
