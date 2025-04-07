package com.itheima.extends4feature;

public class Test1 {
    public static void main(String[] args) {
        // 目标：继承的注意事项
        // Java只支持单继承或多层继承 不支持多继承
        Son son = new Son();
        son.FatherMethod();
    }
}

class FatherA {
    public void FatherMethod() {
        System.out.println("FatherA  Method");
    }
}

class FatherB extends FatherA {
    public void FatherMethod() {
        System.out.println("FatherB  Method");

    }
}

class Son extends FatherB  {
    public void SonMethod() {
        FatherMethod();  // B
    }
}
