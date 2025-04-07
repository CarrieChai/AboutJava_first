package com.itheima.javabean;

public class Student {
    private String name;
    private int age;
    private double chinese_score;
    private double math_score;

    public Student() {
    }
    public Student(String name, int age, double chinese_score, double math_score) {
        this.name = name;
        this.age = age;
        this.chinese_score = chinese_score;
        this.math_score = math_score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChinese_score() {
        return chinese_score;
    }

    public void setChinese_score(double chinese_score) {
        this.chinese_score = chinese_score;
    }

    public double getMath_score() {
        return math_score;
    }

    public void setMath_score(double math_score) {
        this.math_score = math_score;
    }
}
