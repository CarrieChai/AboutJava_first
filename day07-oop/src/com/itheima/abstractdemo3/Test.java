package com.itheima.abstractdemo3;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的应用场景二：模版方法的设计模式
        // 需求：学生和老师都要写一篇作文《我的爸爸》
        //          第一段是一样的：我的爸爸是一个好人
        //          第二段不一样：学生写的是：我的爸爸是一个学生
        //          第二段不一样：老师写的是：我的爸爸是一个老师
        //          第三段是一样的：我的爸爸真好

        People student = new Student();
        student.write();
        System.out.println("===========");
        People teacher = new Teacher();
        teacher.write();
    }
}
