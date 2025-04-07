package com.itheima.staticfield;

public class Student {
    static int count = 0;
    String name;
    int age;

    public Student() {
//        this.count++;
        Student.count++;
        //在类中访问自己的类变量，可以省略类名不写
//        count++;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

}
