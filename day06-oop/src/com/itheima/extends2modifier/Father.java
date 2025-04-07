package com.itheima.extends2modifier;

public class Father {
    private void privateMethod(){
        System.out.println("private.method");
    }
    void defaultMethod1(){
        System.out.println("default.method");
    }
    protected void protectedMethod2(){
        System.out.println("protected.method");
    }
    public void publicMethod3(){
        System.out.println("public.method");
    }

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("同一个包 同一个类");
        // private protected public 缺省
        father.privateMethod(); // 可以访问
        father.defaultMethod1();  // 可以访问
        father.protectedMethod2(); // 可以访问
        father.publicMethod3(); // 可以访问
    }
}
