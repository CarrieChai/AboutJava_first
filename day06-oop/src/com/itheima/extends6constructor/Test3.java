package com.itheima.extends6constructor;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, "男");
        System.out.println(s1);
        Student s2 = new Student("小红", 18, "女", "北京大学");
        System.out.println(s2);

    }
}
