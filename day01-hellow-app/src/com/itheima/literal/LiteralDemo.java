package com.itheima.literal;

/**
 * 目标：掌握常见字面量的书写格式
 * */
public class LiteralDemo {
    public static void main(String[] args) {
        // 目标：掌握常见字面量的书写格式
        printLiteral();

    }

//    帮我直接输出常见字面量
    public static void printLiteral(){
//        字符串类型 需要用双引号引起来，内部可为任意个字符（0个也可以）
        System.out.println("hello,world");

//        单个字符 需要用单引号引起来，内部只能有一个字符
        System.out.println('a');

//        整数 直接写纯数字即可
        System.out.println(100);

//        浮点数 直接写纯数字即可，可以带小数点，也可以带E
        System.out.println(3.14);

//        布尔值 只有两个值 true false
        System.out.println(true);
        System.out.println(false);

//        空值 只有一种值 null 不能输出
//        System.out.println(null);

//        特殊字符 \t 表示一个空格  \n 表示换行
        System.out.println("hello\tWorld");
        System.out.println("hello\nWorld");

    }

}
