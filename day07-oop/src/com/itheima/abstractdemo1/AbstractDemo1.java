package com.itheima.abstractdemo1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        // 目标：认识抽象类、抽象方法、搞清楚他们的特点
        // 抽象类的核心特点：有抽象方法 不能创建对象
        // A a = new A();  // 报错 'A' 为 abstract；无法实例化

        // 抽象类的使命就是被继承，不能直接使用，所以不能创建对象
        // 抽象类的子类可以创建对象，并且可以调用父类中的抽象方法
        B b = new B();
        b.show();
        b.setName("张三");
        b.setAge(18);
        System.out.println(b.getName());
        System.out.println(b.getAge());
    }
}
