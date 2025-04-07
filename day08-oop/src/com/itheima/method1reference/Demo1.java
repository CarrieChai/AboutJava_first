package com.itheima.method1reference;


import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：静态方法引用
        test();
    }
    public static void test(){
        Student[] students = new Student[3];
        students[0] = new Student("小明", 25,181.5, "男");
        students[1] = new Student("小红", 18, 165.5, "女");
        students[2] = new Student("小花", 22, 170.5, "女");

        // （形参列表）->{方法体}
//        Arrays.sort(students,(Student o1, Student o2)->{
//            return o1.getAge() - o2.getAge(); // 按照年龄升序
//        });

//        Arrays.sort(students,( o1,  o2)->{
//            return o1.getAge() - o2.getAge(); // 按照年龄升序
//        });

//        Arrays.sort(students,(o1, o2)-> o1.getAge() - o2.getAge()); // 按照年龄升序

//        Arrays.sort(students,(o1, o2)-> Student.compareByAge(o1, o2)); // 按照年龄升序
        // 只调用一个静态方法，箭头前后参数的形式一致，静态方法引用
        // 前提是箭头前后参数形式一致，才可以使用静态方法引用
        Arrays.sort(students,Student::compareByAge); // 按照年龄升序


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
