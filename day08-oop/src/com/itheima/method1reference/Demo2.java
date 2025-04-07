package com.itheima.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：实例方法引用
        Student[] students = new Student[3];
        students[0] = new Student("小明", 25,181.5, "男");
        students[1] = new Student("小红", 18, 165.5, "女");
        students[2] = new Student("小花", 22, 170.5, "女");

        Student s = new Student();
//        Arrays.sort(students,(o1,o2)->s.compareByHeight(o1,o2));
        // 实例方法引用  对象名::实例方法
        // 前提是箭头前后参数形式一致，才可以使用实例方法引用
        Arrays.sort(students,s::compareByHeight);



        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
