package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 目标 掌握扩展赋值运算符
        print();
        receiveRedPacket(10);
    }
    public static void print() {
        int a = 10;
        a += 5;
        System.out.println(a); //15

        int b = 10;
        b -= 5;
        System.out.println(b);//5

        int c = 10;
        c *= 5;
        System.out.println(c); //50

        int d = 10;
        d /= 5;
        System.out.println(d);//2

        int e = 10;
        e %= 5;//0
    }

    // 需求：收红包
    public static void receiveRedPacket(int b){
        //得到自己的红包金额
        int a = 100;
        a+=b;
        System.out.println("after receive red packet,my money is "+a);

        byte b1 = 10;
        byte b2 = 20;
        b1+=b2; //等价于 b1 = (byte)(b1+b2);
        System.out.println(b1);

        //需求：帮我演示一下其他几个扩展赋值运算符
        int i = 10;
        i-=5;//等价于 i = （i的类型)(i-5);
        System.out.println(i);

        int j = 10;
        j*=5;//等价于 j = (j的类型)(j*5);
        System.out.println(j);

        int k = 10;
        k/=5;//等价于 k = (k的类型)(k/5);
        System.out.println(k);

        int m = 11;
        m%=5;//等价于 m = (m的类型)(m%5);
        System.out.println(m);

    }
}
