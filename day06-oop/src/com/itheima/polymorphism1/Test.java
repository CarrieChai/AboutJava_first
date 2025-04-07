package com.itheima.polymorphism1;

public class Test {
    public static void main(String[] args) {
        // 目标 认识多态性 对象多态、行为多态，（属性）成员变量不谈多态
        Animal a1 = new Wolf();
        a1.run(); // 🐺 Wolf is running
        System.out.println(a1.name); // animal

        Animal a2 = new Fish();
        a2.run(); //🐟 fish is running
        System.out.println(a2.name); // animal
    }
}
