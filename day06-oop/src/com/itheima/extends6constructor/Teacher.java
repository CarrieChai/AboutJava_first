package com.itheima.extends6constructor;

public class Teacher extends People{
    private String major;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String major) {
        super(name, age);
        System.out.println("子类构造器");
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", major='" + major + '\'' +
                '}';
    }
}
