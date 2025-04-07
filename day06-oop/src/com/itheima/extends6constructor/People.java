package com.itheima.extends6constructor;

public class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        System.out.println("父类构造器");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
