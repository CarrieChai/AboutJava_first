package com.itheima.method;

public class MethodDemo02 {
    public static void main(String[] args) {
        //目标：掌握方法重载
        printNumber(10,20);
        printNumber(10.5,20.5);
        printNumber('a','b');
    }
    //定义一个方法，打印输入的两个整数
    public static void printNumber(int a,int b) {
        System.out.println(a);
        System.out.println(b);
    }
    //定义一个重载的方法，打印输入的两个小数
    public static void printNumber(double a,double b) {
        System.out.println(a);
        System.out.println(b);
    }
    //定义一个重载的方法，打印输入的两个字符
    public static void printNumber(char a,char b) {
        System.out.println(a);
        System.out.println(b);
    }


}
