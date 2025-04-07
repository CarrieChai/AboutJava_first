package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        // 目标 学习面向对象编程  从类开始
        Star s1 = new Star();
        s1.name = "abc";
        s1.age = 18;
        s1.gender = "male";
        s1.height = 165.5;
        s1.weight = 48.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);

    }
}
