package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目标 掌握基本的算术运算符
        print(10,3);
        System.out.println("=========================");
        print2();
    }

    public static void print(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println((double)a/b);
        System.out.println(1.0*a/b);
        System.out.println(a%b);
    }

    // 需求：研究+符号做连接符还是运算符
    public static void print2(){
        int a = 5;
        System.out.println("abc"+a);
        System.out.println(a+5);
        System.out.println("yigezifuchuan"+a+'a'); // "yigezifuchuan"+5(目前为止已经不能运算了 所以连在一起形成一个新的字符串
        System.out.println(a+'a'+"yigezifuchuan"); // 5+97(a的ASCII码)+"yigezifuchuan"
    }

}
