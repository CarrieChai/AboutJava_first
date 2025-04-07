package com.itheima.extends4feature;

public class Test2 {
    public static void main(String[] args) {
        // 目标：理解继承的几种特性
        // 在子类中访问成员是就近原则
        // 即子类找到的成员优先级高，子类没有找到的成员才会去父类找，父类没有找到的成员才会报错
        // 如果子父类中出现了重名的成员 默认是子类  想找父类中的 需要使用super.成员名

        Son2 s = new Son2();
        s.show();

    }
}

class Father {
    public int age = 100;
    public void show() {
        System.out.println("Father show...");
    }
}

class Son2 extends Father {
    public int age = 10;
    public void show() {
        System.out.println("Son show...");
        System.out.println(this.age);
        System.out.println(super.age);
        super.show();
    }

}
