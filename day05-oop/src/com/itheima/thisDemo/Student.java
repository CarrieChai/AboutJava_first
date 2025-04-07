package com.itheima.thisDemo;

public class Student {
    String name;
    double score;

    public Student(){}

    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.score);
    }
}
