package com.itheima.innerClass2;

public class Outer {
    public static String NAME = "外部类静态成员变量";
    private String info; // 外部类的实例成员变量
    public static class Inner{
        private String name;

        public void show(){
            System.out.println("show...");

            // 静态内部类能否访问外部类的静态成员？可以！
            System.out.println(NAME);

            // 静态内部类能否访问外部类的实例成员？不可以！
//            System.out.println(info); //无法从 static 上下文引用非 static 字段 'info'

        }
    }
}
