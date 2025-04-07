package com.itheima.staticmethod;

public class Student {
    private double score;

    //静态方法 有static修饰 属于类持有
    public static void print() {
        System.out.println("你好，我是静态方法");
    }

    //实例方法 没有static修饰 属于对象持有
    public void printPass(){
        System.out.println(score>=60?"通过":"不通过");
    }

    public void setScore(double score) {
        this.score = score;
    }
}
