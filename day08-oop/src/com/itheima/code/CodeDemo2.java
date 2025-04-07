package com.itheima.code;

public class CodeDemo2 {
    // 实例代码块：无static修饰，属于对象，每次创建对象时都会优先执行一次。
    // 基本作用：初始化对象的实例资源
    {
        System.out.println("实例代码块");
        // 可以在实例代码块中记录每次运行创建类对象的当前时间
        System.out.println(System.currentTimeMillis());
    }
    public static void main(String[] args) {
        // 目标：认识代码块，示例代码块。
        System.out.println("main方法"); // 直接运行的时候实例代码块没有运行  new 类名();之后实例代码块运行  new一次运行一次

        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
