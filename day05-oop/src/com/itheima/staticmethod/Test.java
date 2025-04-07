package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        // 目标：认识静态方法
        // 静态方法：不需要创建对象，直接通过类名.方法名调用
        Student.print();

        //对象.静态方法（不推荐）
        Student s = new Student();
        s.print();

        // 静态方法不能访问非静态成员变量和方法
//        Student.printPass();//报错
        //实例方法访问  对象名.实例方法名()
        s.setScore(59);
        s.printPass();
    }
}
