package com.itheima.extends6constructor;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        // 这里我们需要初始化三个参数，使得最后一个参数选择默认值
        // 就可以使用this关键字
        this(name, age, sex, "清华大学");
    }

    public Student(String name, int age, String sex, String schoolName) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.schoolName = schoolName;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
