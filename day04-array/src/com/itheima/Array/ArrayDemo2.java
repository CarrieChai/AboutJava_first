package com.itheima.Array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标 掌握动态初始化数组
        String arr[] = new String[8];
        System.out.println("输出动态初始化数组的默认值");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数：");
            arr[i] = sc.next();
        }
        System.out.println("数组内容：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
