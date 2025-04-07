package com.itheima.finaldemo;

public class FinalDemo1 {
    // final修饰静态成员变量
    // final修饰静态变量，这个变量称为常量，可以记住一个固定值，并且在程序中不能修改
    // 通常把这个值作为系统的配置信息，比如数据库连接地址，用户名，密码等
    // 常量的名称建议全部大写，多个单词用下划线连接
    public static final String schoolname = "itheima";
    public static void main(String[] args) {
        // 目标 认识final关键字的作用
        // 3 final修饰变量，变量不能被修改。
        /*
        * 变量有哪些呢？
        * 2.成员变量
        * 3.局部变量
        * */
        // final修饰成员变量，成员变量不能被修改。

        final double pai = 3.14;
        //pai = 3.14159;// 报错

        method(0.7);

        //schoolname = "itcast";// 报错

        // final修饰实例变量一般没有意义

        //final修饰引用类型变量
        // 数据可以改变  地址不能改变
        final int [] arr = {1,2,3};
        arr[0] = 2; //没有报错

    }

    public static void method(final double z) {
//        z = 0.8; // 报错
        System.out.println(z);
    }
}


// 1 final修饰类，类不能被继承。
final class A { }
//class B extends A { } // 报错
// 2 final修饰方法，方法不能被重写。
class C {
    final void method() {
        System.out.println("C.method()");
    }
}
class D extends C {
//    @Override
//     void method() {        // 报错
//        System.out.println("C.method()");
//    }
}