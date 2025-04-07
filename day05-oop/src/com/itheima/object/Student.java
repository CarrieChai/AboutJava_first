package com.itheima.object;

// 学生类
// 封装：把数据和对数据的处理放到一个类中
public class Student {
    String name;
    Double chinese_score;
    Double math_score;

    public Student() {}

    public Student(String n,Double c,Double m) {
        name = n;
        chinese_score = c;
        math_score = m;
        System.out.println("有参构造器被调用");
    }

    public void  printSumScore(){
        System.out.println(name+"的总成绩是："+(chinese_score+math_score));
    }

    public void printAverageScore(){
        System.out.println(name+"的平均分是："+(chinese_score+math_score)/2);
    }
}
