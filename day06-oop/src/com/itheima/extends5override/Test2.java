package com.itheima.extends5override;

public class Test2 {
    public static void main(String[] args) {
        // 目标 方法重写的常见应用场景 子类重写object中的toString方法 以便于打印对象信息
        Student s = new Student("小明", "男", 18);
        System.out.println(s);

    }
}

class Student extends Object {
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}



