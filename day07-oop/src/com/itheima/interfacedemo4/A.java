package com.itheima.interfacedemo4;

public interface A {
    /*
    * 1、默认方法（实例方法）：使用default修饰，默认会被加上public修饰符，只能使用接口的实现类对象来调用(接口的私有方法也可以调用）
    * 2、静态方法：使用static修饰，默认会被加上public修饰符，只能接口名来调用
    * 3、私有方法：使用private修饰，默认会被加上private修饰符，只能由接口中的其他实例方法来调用
    * */
    public default void defaultMethod(){
        System.out.println("A接口的默认方法");
        System.out.println("使用接口实现类对象调用");
        privateMethod();
    }

    public static void staticMethod(){
        System.out.println("A接口的静态方法");
        System.out.println("使用接口类名调用");
    }

    private void privateMethod(){
        System.out.println("A接口的私有方法");
        System.out.println("只能由接口中的其他实例方法调用");
        defaultMethodTest();
    }

    public default void defaultMethodTest(){
        System.out.println();
        System.out.println("A接口的默认方法2");

    }

}
