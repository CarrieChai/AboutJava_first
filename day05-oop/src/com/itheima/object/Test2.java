package com.itheima.object;

public class Test2 {
    public static void main(String[] args) {
        //目标 掌握构造器知识点
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese_score = 100.0;
        s1.math_score = 100.0;
        s1.printSumScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "波仔";
        s2.math_score = 100.0;
        s2.chinese_score = 50.0;
        s2.printSumScore();
        s2.printAverageScore();

        // 有参构造器
        Student s3 = new Student("小帅",95.5,98.0);
        s3.printSumScore();


    }
}




