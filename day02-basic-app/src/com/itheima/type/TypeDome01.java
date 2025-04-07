package com.itheima.type;

public class TypeDome01 {
    public static void main(String[] args) {
        // 目标：掌握自动类型转换和强制类型转换
        byte b = 10;
        printInt(b); // 范围小的变量可以直接赋值给范围大的变量  byte可以直接赋值给int
        double d = b;// 范围小的变量可以直接赋值给范围大的变量  int可以直接赋值给double
        printDouble(d);

        int i = 100;
        // byte b1 = i; // 范围大的变量不可以直接赋值给范围小的变量
        byte b1 = (byte)i;// 强制转换
        System.out.println(b1);

        int i1 = 130;
        byte b2 = (byte)i1;
        System.out.println(b2); //-126  数据溢出了

        double d1 = 100.99;
        int i2 = (int)d1;
        System.out.println(i2);// 100  double直接赋值给int只保留整数部分
    }
    public static void printInt(int a) {
        System.out.println(a);
    }

    public static void printDouble(Double d) {
        System.out.println(d);
    }
}
