package com.itheima.hello;

public class HelloWorld {
    public static void main(String[] args) {
        // 目标：编写第一个程序
        System.out.println("111Hello,world!");
        System.out.println("222Hello,world!");
        System.out.println("________________");
        printPoetryLine();
        System.out.println("________________");
        printPoetry();


//        System.out.println(getVerifyCode());
    }

    //定义一个方法，帮我生成一个验证码返回
    public static String getVerifyCode() {
        //生成随机数
        int num = (int) (Math.random() * 9999);
        //将随机数变成4位数
        String code = String.format("%04d", num);
        return code;
    }

    // 定义一个方法，打印一行诗句
    public static void printPoetryLine() {
        System.out.println("床前明月光，疑是地上霜。");
    }

//    定义一个方法，打印多行诗句
    public static void printPoetry() {
        System.out.println("床前明月光，疑是地上霜。");
        System.out.println("举头望明月，低头思故乡。");
    }
}




