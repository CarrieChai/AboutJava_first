package com.itheima.staticfield;

public class Test {
    public static void main(String[] args) {
        // 目标：认识静态变量的使用。
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(Student.count);  // 3
        s2.count = 10;
        System.out.println(s1.count);// 10
        System.out.println(Student.count);// 10

    }
}
