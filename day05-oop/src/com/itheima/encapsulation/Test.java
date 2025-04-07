package com.itheima.encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标 掌握封装的基本知识 合理隐藏 合理暴露
        Student s1 = new Student();
        s1.setName("小美");
        s1.setAge(18);
        s1.setGender("女");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());

        Scanner sc = new Scanner(System.in);

    }
}
