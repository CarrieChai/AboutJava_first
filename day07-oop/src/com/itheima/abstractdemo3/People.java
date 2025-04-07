package com.itheima.abstractdemo3;

public abstract class People {
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我的爸爸是一个好人");
        writeMain();
        System.out.println("\t我的爸爸真好");
    }

    public abstract void writeMain();
}
