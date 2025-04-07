package com.itheima.innerclass;
// 外部类
public class Outer {
    public static String NAME = "外部类静态成员变量";
    public String name = "外部类实例成员变量";

    public static void method() {
        System.out.println("外部类静态静态方法");
    }
    public void method2() {
        System.out.println("外部类实例方法");
    }

    // 成员内部类：无static修饰，属于外部类对象持有
    public class Inner {
        // 内部类可以有构造函数 成员变量 get set方法等 普通类有的他都有
        public Inner(){
            System.out.println("Inner...");
        }
        public void show() {
            System.out.println("show...");
            // 成员内部类可以直接访问外部类的静态成员
            System.out.println(NAME);
            method();
            // 成员内部类可以直接访问外部类的实例成员
            System.out.println(name);
            method2();
            System.out.println(this);  // 内部类对象this
            System.out.println(Outer.this); // 寄生的外部类对象this
        }
    }
}
