package com.itheima.extends1demo;

public class People {
    private String name;
    private int age;
    private String sex;

    public People()
    {
        System.out.println("父类无参构造方法");
    }
    public People(String name,int age,String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
}
