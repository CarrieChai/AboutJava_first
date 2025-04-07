package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        // 目标 认识子类构造器的特点和应用场景
        // 子类构造器都会优先调用父类的构造器 再执行自己的构造器

        Son s = new Son();

    }
}

class Father {
    public Father() {
        System.out.println("Father()");
    }

    public Father(int i) {
        System.out.println("Father(int i)");
    }
}

class Son extends Father {
    public Son() {
//        super(1);
        super();  // 写不写都默认存在
        System.out.println("Son()");

    }
}


