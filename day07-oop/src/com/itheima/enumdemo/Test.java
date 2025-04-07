package com.itheima.enumdemo;

public class Test {
    public static void main(String[] args) {
        // 目标：理解枚举类型的使用
        A a1 = A.X;
        System.out.println(a1); // X
        A a2 = A.Y;
        System.out.println(a2);  // Y

        System.out.println(a1.name());  // X
        System.out.println(a1.ordinal());  // 0
        System.out.println(a1.compareTo(a2));  // -1
        System.out.println(a1.equals(a2));  // false
        System.out.println(a1.toString());  // X
    }
}
