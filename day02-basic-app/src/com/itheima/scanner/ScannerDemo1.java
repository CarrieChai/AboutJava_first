package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 目标：认识Scanner类
        printUserInfo();
    }
    // 需求：请帮我写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void printUserInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input username:");
        String name = sc.next();
        System.out.println("input age:");
        int age = sc.nextInt();

        System.out.println("username:" + name + ",age:" + age);
    }


}
