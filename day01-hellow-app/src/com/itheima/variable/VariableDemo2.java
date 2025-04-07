package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args){
        // 目标 认识变量
        printVariable();
    }
    //请帮我设计一个方法，打印出八种基本数据类型定义的变量
    public static void printVariable(){
        //1 整型
        byte b = 10;
//        byte b1 = 128; //byte类型范围是-128~127,越界了
        short s = 20;
        int i = 30;
        //注意 随便写一个整数默认是int类型的，3326456543254这个数虽然没有超过long的范围，但是超过了int的范围 所以报错
        // 如果要定义long类型，需要加L
        //long l1 = 3326456543254;
        long l1 = 3326456543254L;
        long l = 40;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        //2 浮点型
        //注意 随便写一个小数字面量默认是double类型的，如果希望1.1是float类型，需要加f或者F
        //float f1 = 1.1;
        float f1 = 1.1f;
        float f = 50.0f;
        double d = 60.0;
        System.out.println(f);
        System.out.println(d);

        //3 字符型
        char c = 'a';
        System.out.println(c);

        //4 布尔型
        boolean bb = true;
        System.out.println(bb);

    }
}
